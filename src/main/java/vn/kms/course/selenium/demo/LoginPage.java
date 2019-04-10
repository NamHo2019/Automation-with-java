package vn.kms.course.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vn.kms.course.selenium.bases.BasePage;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//ul[@class='float-right']/li/a")
    List<WebElement> elementList;

    @FindBy(id = "id_username")
    WebElement userName;

    @FindBy(id = "id_password")
    WebElement passWord;

    @FindBy(xpath = "//button[@class='btn btn-primary narrow']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@class ='alert alert-success']")
    public WebElement secNoti;

    public LoginPage(WebDriver driver){
        super(driver, "/account/login/");
        PageFactory.initElements(driver, this);
    }


    public void Guestlogin(String username, String password){
        userName.clear();
        userName.sendKeys(username);
        passWord.clear();
        passWord.sendKeys(password);
        loginBtn.click();
    }

    public void logout(){
        elementList.get(2).click();
    }

    public ArrayList<String> ListElementToText(ArrayList<String> ItemList){
        for (int i = 0; i < elementList.size(); i++) {
            ItemList.add(elementList.get(i).getText());
        }
        return ItemList;
    }
}