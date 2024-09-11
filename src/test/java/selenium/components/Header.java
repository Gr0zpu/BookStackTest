package selenium.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;
import selenium.pages.BooksPage;

public class Header extends BasePage {
    private By  logoBtn = By.xpath("//a[@class='logo']");
    private By  searchInput = By.id("header-search-box-input");
    private By  shelvesBtn = By.xpath("//a[@data-shortcut='shelves_view']");
    private By  booksBtn = By.xpath("//a[@data-shortcut='books_view']");
    private By  settingsBtn = By.xpath("//a[@data-shortcut='settings_view']");
    private By  menuDropDown = By.xpath("//div[@class='dropdown-container']");
    public Header(WebDriver driver) {
        super(driver);
    }

    public BooksPage openBooksPage() {
        getDriver().findElement(booksBtn).click();
        return new BooksPage(getDriver());
    }
}
