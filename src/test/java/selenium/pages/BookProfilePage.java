package selenium.pages;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.asserts.BookProfileAsserts;
import selenium.base.BasePage;

public class BookProfilePage extends BasePage {
    private By bookTitleH1 = By.xpath("//h1");
    private By bookDescriptionP = By.xpath("//div[@class='book-content']//div[@class='text-muted break-text']/p");
    private By deleteBtn = By.xpath("//a[@data-shortcut='delete']");
    private By editBtn = By.xpath("//div//a[@data-shortcut='edit']");
    public BookProfilePage(WebDriver driver) {
        super(driver);
    }
    public BookProfileAsserts should(){
        return new BookProfileAsserts(this);
    }
    @Step
    public String getBookTitle() {
        return getDriver().findElement(bookTitleH1).getText();
    }
    @Step
    public String getBookDescription() {
        return getDriver().findElement(bookDescriptionP).getText();
    }
    @Step
    public BookDeletePage deleteBook() {
        getDriver().findElement(deleteBtn).click();
        return new BookDeletePage(getDriver());
    }
    @Step
    public BookEditpage editBook() {
        getDriver().findElement(editBtn).click();
        return new BookEditpage(getDriver());
    }





}
