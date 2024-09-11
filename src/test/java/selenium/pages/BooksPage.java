package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;

public class BooksPage extends BasePage {
    private By createNewBookBtn = By.xpath("//div//a[@data-shortcut='new']");

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    public BookCreatePage createNewBook() {
        getDriver().findElement(createNewBookBtn).click();
        return new BookCreatePage(getDriver());
    }
}
