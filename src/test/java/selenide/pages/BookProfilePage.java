package selenide.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;
import selenide.asserts.BookProfileAsserts;
import selenide.components.Header;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BookProfilePage {
    @Getter
    private Header header = new Header();
    private SelenideElement bookTitleH1 = $x("//h1");
    private SelenideElement bookDescriptionP = $x("//div[@class='book-content']//div[@class='text-muted break-text']/p");
    private SelenideElement deleteBtn = $x("//a[@data-shortcut='delete']");
    private SelenideElement editBtn = $x("//div//a[@data-shortcut='edit']");
    private SelenideElement copyBtn = $x("//div//a[@data-shortcut='copy']");
    private SelenideElement addPageBtn = $x("//a[@data-shortcut='new']//span[text()='New Page']");
    private ElementsCollection getAllPageAndChapterNames = $$x("//h4");
    private ElementsCollection getAllPageAndChapterDescription = $$x("//p[@class='text-muted break-text']");

    public String getBookTitle() {
        return bookTitleH1.getText();
    }
    public String getBookDescription() {
        return bookDescriptionP.getText();
    }

    public BookProfileAsserts should() {
        return new BookProfileAsserts(this);
    }
    @Step("Choice 'delete book'")
    public BookDeletePage deleteBook() {
        deleteBtn.click();
        return Selenide.page(BookDeletePage.class);
    }
    @Step("Choice 'edit book'")
    public BookEditPage editBook() {
        editBtn.click();
        return Selenide.page(BookEditPage.class);
    }

    @Step("Choice 'copy book'")
    public BookCopyPage copyBook() {
        copyBtn.click();
        return Selenide.page(BookCopyPage.class);
    }
    @Step
    public PageCreatePage createNewPage() {
        addPageBtn.click();
        return Selenide.page(PageCreatePage.class);
    }

    public List<String> getAllPageAndChapterNames() {
        List<String> names = new ArrayList<>();
        getAllPageAndChapterNames.forEach(x -> names.add(x.getText()));
        return names;
    }

    public List<String> getAllPageAndChapterDescription() {
        List<String> description = new ArrayList<>();
        getAllPageAndChapterDescription.forEach(x -> description.add(x.getText()));
        return description;
    }
}
