package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import selenium.base.BasePage;

public class BookEditpage extends BasePage {
   private By nameInput = By.id("name");
    private By descriptionIframe = By.id("description_html_ifr");
    private By descriptionTextArea = By.id("tinymce");
    private By saveBookBtn = By.xpath("//button[text()='Save Book']");

    public BookEditpage(WebDriver driver) {
        super(driver);
    }

    @Step
    public BookEditpage editName(String newName) {
        getDriver().findElement(nameInput).click();
        getDriver().findElement(nameInput).clear();
        getDriver().findElement(nameInput).sendKeys(newName);

        return this;
    }
    @Step
    public BookEditpage editDescription(String newDescription) {
        getDriver().switchTo().frame(getDriver().findElement(descriptionIframe));
        getDriver().findElement(descriptionTextArea).click();
        getDriver().findElement(descriptionTextArea).clear();
        getDriver().findElement(descriptionTextArea).sendKeys(newDescription);
        getDriver().switchTo().defaultContent();

        return this;
    }
    @Step
    public BookProfilePage saveBook() {
        getDriver().findElement(saveBookBtn).click();
        return new BookProfilePage(getDriver());
    }
}
