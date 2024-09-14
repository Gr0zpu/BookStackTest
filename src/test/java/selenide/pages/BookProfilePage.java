package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenide.asserts.BookProfileAsserts;

import static com.codeborne.selenide.Selenide.$x;

public class BookProfilePage {
    private SelenideElement bookTitleH1 = $x("//h1");
    private SelenideElement bookDescriptionP = $x("//div[@class='book-content']//div[@class='text-muted break-text']/p");
    private SelenideElement deleteBtn = $x("//a[@data-shortcut='delete']");

    public String getBookTitle() {
        return bookTitleH1.getText();
    }
    public String getBookDescription() {
        return bookDescriptionP.getText();
    }

    public BookProfileAsserts should() {
        return new BookProfileAsserts(this);
    }

    public BookDeletePage deleteBook() {
        deleteBtn.click();
        return Selenide.page(BookDeletePage.class);
    }
}
