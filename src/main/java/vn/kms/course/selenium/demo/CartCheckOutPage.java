package vn.kms.course.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vn.kms.course.selenium.bases.BasePage;

import java.util.List;

public class CartCheckOutPage extends BasePage {

    @FindBy(xpath = "//div[@class='cart']//div//img/parent::a")
    List<WebElement> listOfProductName;

    @FindBy(xpath = "//div[@class='cart__line table__row']//a[@class='link--clean']")
    WebElement firstProductNameAndSize;


    @FindBy(xpath = "//div[@class='cart__line table__row']//input[@id='id_quantity']")
    WebElement firstProductQuantity;

    @FindBy(xpath = "//div[@class='cart__line table__row']//div[@class='col-5']//p[1]")
    WebElement firstProductprice;

    @FindBy(xpath = "//div[@class='cart__line last table__row']//a[@class='link--clean']")
    WebElement secondProductNameAndSize;

    @FindBy(xpath = "//div[@class='cart__line last table__row']//input[@id='id_quantity']")
    WebElement secondProductQuantity;

    @FindBy(xpath = "//div[@class='cart__line last table__row']//div[@class='col-5']//p[1]")
    WebElement secondProductprice;

    @FindBy(xpath = "//p[@class='cart__delivery-info__price']//span//span[contains(text(),'from ')]")
    WebElement shipPrices;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right cart__submit']")
    WebElement checkOutButton;

    public CartCheckOutPage(WebDriver driver) {
        super(driver, "/cart/");
        PageFactory.initElements(driver, this);
    }

    public void setListOfProduct() {
        this.WaitForPage(checkOutButton, 10);
        listOfProductName.remove(1);
        for (int i = 0; i < listOfProductName.size(); i++) {
            System.out.print("'" + listOfProductName.get(i).getText() + "', ");
        }
    }
}
