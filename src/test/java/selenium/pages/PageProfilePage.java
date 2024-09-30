package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;

public class PageProfilePage extends BasePage {
    private By openBookBreadcrumbsLink = By.xpath("//a[@class='text-book icon-list-item outline-hover']//span[2][not(contains(text(), 'Book'))]");
    public PageProfilePage(WebDriver driver) {
        super(driver);
    }

    public BookProfilePage openBookPage() {
        getDriver().findElement(openBookBreadcrumbsLink).click();

        return new BookProfilePage(getDriver());
    }
}
