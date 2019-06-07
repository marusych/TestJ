package pages.BaseTest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.stackoverflowMapping.LoginPage;
import pages.stackoverflowMapping.MainPageStack;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static MainPageStack mainPageStack;
    public LoginPage loginPage;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriverLin");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://stackoverflow.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPageStack = new MainPageStack(driver);
    }
    @Before
    public void Start() {
        driver.get("http://stackoverflow.com/");
    }
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
