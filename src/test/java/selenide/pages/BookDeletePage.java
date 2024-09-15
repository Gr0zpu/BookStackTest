package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class BookDeletePage {
    private SelenideElement confirmBtn = $x("//form[@method='POST']//button[@type='submit']");
    private SelenideElement cancelBtn = $x("//form[@method='POST']//a[@class='button outline']");

    @Step("Confirm delete")
    public BooksPage confirmDelete() {
        confirmBtn.click();
        return Selenide.page(BooksPage.class);
    }
}
