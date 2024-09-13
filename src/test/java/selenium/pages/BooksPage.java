package selenium.pages;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.asserts.BooksPageAsserts;
import selenium.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends BasePage {
    private By createNewBookBtn = By.xpath("//div//a[@data-shortcut='new']");
    private By booksTitleList = By.xpath("//div[@class='grid-card-content']//h2");
    private By pagination = By.xpath("//a[@class='page-link' and not(contains(text(), '›'))]");
    private By nextPageBtn = By.xpath("//a[@rel='next']");
    @Getter
    private List<String> booksTitle;

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    public BookCreatePage createNewBook() {
        getDriver().findElement(createNewBookBtn).click();
        return new BookCreatePage(getDriver());
    }

    public BooksPageAsserts should() {
        return new BooksPageAsserts(this);
    }

    public BooksPage pagination() {
        List<WebElement> paginationWebElements = getDriver().findElements(pagination);
        for (WebElement pagination : paginationWebElements) {

        }
        return this;
    }
    public BooksPage getAllBooksTitles() {
        booksTitle = new ArrayList<>();
        List<WebElement> paginationWebElements = getDriver().findElements(pagination);
        for (WebElement pagination : paginationWebElements) {

            for (WebElement bookTitle : getDriver().findElements(booksTitleList)){
                booksTitle.add(bookTitle.getText());
            }
            getDriver().findElement(nextPageBtn).click();
        }
        return this;
    }
}
