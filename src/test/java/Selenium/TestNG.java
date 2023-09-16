package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	public WebDriver driver;
	public WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver configuration
       // System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver", "Resources/chromedriver_linux");
    	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
    	options.addArguments("headless");
    	driver=new ChromeDriver(options);
       wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void T1_Launch() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        System.out.println("Launch complete");
    }
    @Test
    public void T2_Login() throws InterruptedException {
    	 Thread.sleep(3000);
    	System.out.println("Login complete");
    }
    @Test
    public void T3_LandingPage() throws InterruptedException {
    	 Thread.sleep(3000);
    	System.out.println("Landing Page complete");
    }
    @Test
    public void T4_MainTransaction() throws InterruptedException {
    	 Thread.sleep(3000);
    	System.out.println("Main Transaction complete");
    }
    @Test
    public void T5_Logout() throws InterruptedException {
    	 Thread.sleep(3000);
    	System.out.println("Logout complete");
    }
    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        driver.quit();
    }
}

