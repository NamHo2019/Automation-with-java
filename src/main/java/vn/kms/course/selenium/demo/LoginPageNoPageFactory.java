package vn.kms.course.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNoPageFactory {
    WebElement loginCredentialsTab;
    WebElement loginAccessKeyTab;
    WebElement usernameTxtFld;
    WebElement passwordTxtFld;
    WebElement loginBtn;
    WebDriver driver;



    public LoginPageNoPageFactory(WebDriver driver){
        this.driver = driver;
        loginCredentialsTab = driver.findElement(By.xpath("//*[@id='tabs']//a[normalize-space(.)='Login By Credentials']"));
        loginAccessKeyTab = driver.findElement(By.xpath("//*[@id='tabs']//a[normalize-space(.)='Login By Access Key']"));
        usernameTxtFld = driver.findElement(By.id("username"));
        passwordTxtFld = driver.findElement(By.id("password"));
        loginBtn = driver.findElement(By.id("btnSubmit"));
    }

    public void login(String username, String password){
        loginCredentialsTab.click();
        usernameTxtFld.sendKeys(username);
        passwordTxtFld.sendKeys(password);
        loginBtn.click();
    }
}
