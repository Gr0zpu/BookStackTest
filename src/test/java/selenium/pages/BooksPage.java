package selenium.pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.asserts.BooksPageAsserts;
import selenium.base.BasePage;
import selenium.components.Header;
import selenium.services.WaitService;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends BasePage {
    private Header header;
    private By createNewBookBtn = By.xpath("//div//a[@data-shortcut='new']");
    private By booksTitleList = By.xpath("//h2");
    private By pagination = By.xpath("//a[@class='page-link' and not(contains(text(), '›'))]");
    private By nextPageBtn = By.xpath("//a[@rel='next']");
    @Getter
    private List<String> booksTitle;

    public BooksPage(WebDriver driver) {
        super(driver);
        header = new Header(getDriver());
    }
    @Step
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
    @Step
    public BooksPage getAllBooksTitles() {
        booksTitle = new ArrayList<>();
        List<WebElement> paginationWebElements = getDriver().findElements(pagination);
        if(paginationWebElements.size() > 0){
            for (WebElement pagination : paginationWebElements) {
                addTitlesFromMainPAge();
                getDriver().findElement(nextPageBtn).click();
            }
        } else {
            addTitlesFromMainPAge();
        }
        return this;
    }

    public void addTitlesFromMainPAge() {
        for (WebElement bookTitle : getDriver().findElements(booksTitleList)){
            booksTitle.add(bookTitle.getText());
        }
    }
}
