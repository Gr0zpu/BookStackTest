package selenium.pages;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.asserts.BookProfileAsserts;
import selenium.base.BasePage;
import selenium.components.Header;

import java.util.ArrayList;
import java.util.List;

public class BookProfilePage extends BasePage {
    @Getter
    private Header header;
    private By bookTitleH1 = By.xpath("//h1");
    private By bookDescriptionP = By.xpath("//div[@class='book-content']//div[@class='text-muted break-text']/p");
    private By deleteBtn = By.xpath("//a[@data-shortcut='delete']");
    private By editBtn = By.xpath("//div//a[@data-shortcut='edit']");
    private By copyBtn = By.xpath("//div//a[@data-shortcut='copy']");
    private By addPageBtn = By.xpath("//a[@data-shortcut='new']//span[text()='New Page']" );
    private By allPageAndChapterNames = By.xpath("//h4");
    private By getAllPageAndChapterDescription = By.xpath("//p[@class='text-muted break-text']");
    public BookProfilePage(WebDriver driver) {
        super(driver);
        header = new Header(getDriver());
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

    @Step
    public BookCopyPage copyBook() {
        getDriver().findElement(copyBtn).click();
        return new BookCopyPage(getDriver());
    }

    @Step
    public PageCreatePage createPage() {
        getDriver().findElement(addPageBtn).click();
        return new PageCreatePage(getDriver());
    }
    @Step
    public List<String> getAllPageAndChapterNames() {
        List<String> names = new ArrayList<>();
        getDriver().findElements(allPageAndChapterNames).forEach(x -> names.add(x.getText()));

        return names;
    }
    public List<String> getAllPageAndChapterDescription() {
        List<String> description = new ArrayList<>();
        getDriver().findElements(getAllPageAndChapterDescription).forEach(x -> description.add(x.getText()));

        return description;
    }
}
