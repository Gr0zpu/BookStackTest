package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import selenide.asserts.BookProfileAsserts;

import static com.codeborne.selenide.Selenide.$x;

public class BookProfilePage {
    private SelenideElement bookTitleH1 = $x("//h1");
    private SelenideElement bookDescriptionP = $x("//div[@class='book-content']//div[@class='text-muted break-text']/p");
    private SelenideElement deleteBtn = $x("//a[@data-shortcut='delete']");
    private SelenideElement editBtn = $x("//div//a[@data-shortcut='edit']");

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
}
