package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;

public class BookDeletePage extends BasePage {
    private By confirmBtn = By.xpath("//form[@method='POST']//button[@type='submit']");
    private By cancelBtn = By.xpath("//form[@method='POST']//a[@class='button outline']");
    public BookDeletePage(WebDriver driver) {
        super(driver);
    }
    public BooksPage confirmDelete() {
        getDriver().findElement(confirmBtn).click();
        return new BooksPage(getDriver());
    }
}
