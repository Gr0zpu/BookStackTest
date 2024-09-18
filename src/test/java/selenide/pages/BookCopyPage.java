package selenide.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BookCopyPage {
    private SelenideElement nameInput = $x("//input[@id='name']");
    private SelenideElement copyBookBtn = $x("//button[text()='Copy Book']");
    @Step("Set new name")
    public BookCopyPage setNewBookName(String newName) {
        nameInput.click();
        nameInput.clear();
        nameInput.sendKeys(newName);
        return this;
    }
    @Step
    public BookProfilePage confirmBookCopy() {
        copyBookBtn.click();
        return Selenide.page(BookProfilePage.class);
    }
}
