package vn.kms.course.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vn.kms.course.selenium.bases.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Accessories')]")
    WebElement accessoriesLink;

    @FindBy(xpath = "//a[contains(text(),'GroceriesPage')]")
    WebElement groceriesLink;

    @FindBy(xpath = "//a[contains(text(),'Apparel')]")
    WebElement apparel;

    @FindBy(xpath = "//a[@class='cart__icon']")
    WebElement yourCartLink;

    public HomePage(WebDriver driver) {
        super(driver, "/");
        PageFactory.initElements(driver, this);
    }

    public void OpenAccessoriesPage(){
        accessoriesLink.click();
    }

    public void OpenGroceriesPage(){
        groceriesLink.click();
    }

    public void OpenApprelPage(){apparel.click();}

    public void OpenCartPage(){
        yourCartLink.click();
    }
}
