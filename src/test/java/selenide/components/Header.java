package selenide.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenide.pages.BooksPage;
import selenium.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class Header{
    private SelenideElement logoBtn = $x("//a[@class='logo']");
    private SelenideElement  searchInput = $x("header-search-box-input");
    private SelenideElement  shelvesBtn = $x("//a[@data-shortcut='shelves_view']");
    private SelenideElement  booksBtn = $x("//a[@data-shortcut='books_view']");
    private SelenideElement  settingsBtn = $x("//a[@data-shortcut='settings_view']");
    private SelenideElement  menuDropDown = $x("//div[@class='dropdown-container']");

    public BooksPage openBooksPage() {
        booksBtn.click();
        return Selenide.page(BooksPage.class);
    }
}
