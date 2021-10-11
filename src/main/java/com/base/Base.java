package com.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

    public static WebDriver driver;
    public static Properties prop;
    public static String reportPath;

    public Base() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("./src/main/java/com/config/config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!!!");
        } catch (IOException e) {
            System.out.println("Unable to read the file!!!");
        }
    }

    public void initialization() {
        String browser = prop.getProperty("browser");
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
    }

    public void getPage(String URL) {
        driver.get(URL);
    }

    public void tearDown() {
        driver.quit();
    }
}
