package vn.kms.course.selenium.bases;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;
import vn.kms.course.selenium.demo.LoginPage;

public class BaseTest {
    private static boolean firstRun = true;

    @BeforeAll
    public static void beforeAll(){
        if (firstRun){
            firstRun = false;
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver_mac_0.20.1");
            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/edgedriver_16299.exe");
        }
    }

    public void signInForUiTest(WebDriver driver){
        LoginPage lg = new LoginPage(driver);
        String userName = "admin@example.com";
        String passWord = "admin";
        lg.OpenPage();
        lg.Guestlogin(userName,passWord);
    }
}
