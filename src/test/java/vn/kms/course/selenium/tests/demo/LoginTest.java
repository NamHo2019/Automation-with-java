package vn.kms.course.selenium.tests.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import vn.kms.course.selenium.bases.BaseTest;
import vn.kms.course.selenium.demo.LoginPage;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class LoginTest extends BaseTest {
    WebDriver driver;
    LoginPage loginpge1;
    String[] expLoginedItem = {"DASHBOARD","YOUR ACCOUNT","LOG OUT"};
    String[] expLogoutedItem = {"REGISTER","LOG IN"};

    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        driver = new ChromeDriver();
        loginpge1 = new vn.kms.course.selenium.demo.LoginPage(driver);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void loginSuccessfullyPageFactory(){
        String userName = "admin@example.com";
        String passWord = "admin";
        loginpge1.OpenPage();
        loginpge1.Guestlogin(userName, passWord);
        verifyTheTopRightElement(expLoginedItem);
        Assertions.assertEquals("https://demo.getsaleor.com/en/", driver.getCurrentUrl());
        loginpge1.logout();
        Assertions.assertEquals("https://demo.getsaleor.com/en/", driver.getCurrentUrl());
        verifyTheTopRightElement(expLogoutedItem);
        Assertions.assertEquals("You have been successfully logged out.", getTheBaseTestofNotifi(loginpge1.secNoti.getText()));
    }

    public void verifyTheTopRightElement(String[]expItem){
        ArrayList<String> acutalItem = new ArrayList<String>();
        loginpge1.ListElementToText(acutalItem);
        Assertions.assertArrayEquals(acutalItem.toArray(), expItem, "These 2 list is not equal");
    }

    public String getTheBaseTestofNotifi(String secNotiText){
        String[] split = secNotiText.split("\n");
        return secNotiText = split[1];
    }
}
