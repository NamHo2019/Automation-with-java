package vn.kms.course.selenium.bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    private static final String BASE_URL="https://demo.getsaleor.com/en";
    protected String path;
    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver, String path){
        this.webDriver = webDriver;
        this.path = this.BASE_URL.concat(path);
        PageFactory.initElements(this.webDriver, this);
    }

    public void OpenPage(){
        this.webDriver.get(this.path);
    }

    public String getTitle(){
        return this.webDriver.getTitle();
    }
    public void goTo(String link){
        this.webDriver.get(link);
    }

    public void WaitForPage(WebElement element, int timeout){
        WebDriverWait wait = new WebDriverWait(webDriver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
