package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class PageProfilePage{
    private SelenideElement openBookBreadcrumbsLink = $x("//a[@class='text-book icon-list-item outline-hover']//span[2][not(contains(text(), 'Book'))]");
    @Step
    public BookProfilePage openBookPage() {
        openBookBreadcrumbsLink.click();
        return Selenide.page(BookProfilePage.class);
    }
}
