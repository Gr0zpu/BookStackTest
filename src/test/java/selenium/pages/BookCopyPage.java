package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;

public class BookCopyPage extends BasePage {
    private By  nameInput = By.id("name");
    private By copyBookBtn = By.xpath("//button[text()='Copy Book']");
    public BookCopyPage(WebDriver driver) {
        super(driver);
    }
    @Step
    public BookCopyPage setNewBookName(String newName) {
        getDriver().findElement(nameInput).click();
        getDriver().findElement(nameInput).clear();
        getDriver().findElement(nameInput).sendKeys(newName);
        return this;
    }
    @Step
    public BookProfilePage confirmCopyBook(){
        getDriver().findElement(copyBookBtn).click();
        return new BookProfilePage(getDriver());
    }
}
