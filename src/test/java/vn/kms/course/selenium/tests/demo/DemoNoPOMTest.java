package vn.kms.course.selenium.tests.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import vn.kms.course.selenium.bases.BaseTest;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoNoPOMTest extends BaseTest{
    WebDriver driver;
    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        driver = new ChromeDriver();
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.safari());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void loginSuccessfully(){
        driver.get("http://192.168.74.25/patest");
        driver.findElement(By.xpath("//*[@id='tabs']//a[normalize-space(.)='Login By Credentials']")).click();
        driver.findElement(By.id("username")).sendKeys(
                "thaovo");
        driver.findElement(By.id("password")).sendKeys("kms");
        driver.findElement(By.id("btnSubmit")).click();

        Assertions.assertEquals("Home | PA Tool", driver.getTitle());
    }



}
