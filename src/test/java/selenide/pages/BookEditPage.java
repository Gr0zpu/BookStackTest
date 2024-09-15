package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BookEditPage {
    private SelenideElement nameInput = $(By.id("name"));
    private SelenideElement descriptionIframe = $x("//iframe[@id='description_html_ifr']");
    private SelenideElement descriptionInput = $x("//body[@id='tinymce']");
    private SelenideElement saveBookBtn = $x("//button[text()='Save Book']");
    public BookEditPage editName(String newName) {
        nameInput.click();
        nameInput.clear();
        nameInput.sendKeys(newName);
        return this;
    }
    public BookEditPage editDescription(String newDescription) {
        switchTo().frame(descriptionIframe);
        descriptionInput.click();
        descriptionInput.clear();
        descriptionInput.sendKeys(newDescription);
        switchTo().defaultContent();
        return this;
    }
    public BookProfilePage saveBook() {
       saveBookBtn.click();
       return Selenide.page(BookProfilePage.class);
    }
}
