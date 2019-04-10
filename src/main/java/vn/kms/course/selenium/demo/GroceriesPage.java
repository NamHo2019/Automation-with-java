package vn.kms.course.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import vn.kms.course.selenium.bases.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroceriesPage extends BasePage {
    Random rand = new Random();
    public ArrayList<String> productInfo = new ArrayList<String>();
    int productQuantity;

    @FindBy(xpath = "//button[@class='btn btn-primary mt-3']")
    WebElement updateButton;

    @FindBy(xpath = "//div[@class='col-md-8 col-lg-9 category-list']//div[@class='row']//a")
    List<WebElement> productList;

    @FindBy(className = "product__info__name")
    WebElement productName;

    @FindBy(xpath = "//h2[@class='product__info__price']/span")
    WebElement productPrice;

    @FindBy(id = "id_quantity")
    WebElement quantity;

    @FindBy(xpath = "//div[@class='form-group product__info__button']/button")
    WebElement addToCartButton;

    public GroceriesPage(WebDriver driver) {
        super(driver, "/products/category/groceries-8/");
        PageFactory.initElements(driver, this);
    }

    public void SelectARandomProduct() throws InterruptedException {
        this.WaitForPage(updateButton,10);
        int productPosition = rand.nextInt(productList.size());
        productList.get(productPosition).click();
        GetProductInfo();
        this.WaitForPage(addToCartButton,10);
        productQuantity = rand.nextInt(21)+10;
        quantity.clear();
        quantity.sendKeys(""+productQuantity);
        addToCartButton.click();
    }

    private List<String> GetProductInfo() {
        productInfo.add(productName.getText());
        productInfo.add(productPrice.getText());
        productInfo.add(quantity.getAttribute("value"));
        return productInfo;
    }
}
