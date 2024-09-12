package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class BooksPage {
    private SelenideElement createNewBookBtn = $x("//div//a[@data-shortcut='new']");

    public BookCreatePage createNewBook() {
        createNewBookBtn.click();
        return Selenide.page(BookCreatePage.class);
    }
}
