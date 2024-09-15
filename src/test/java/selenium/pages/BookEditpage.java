package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import selenium.base.BasePage;

public class BookEditpage extends BasePage {
    By nameInput = By.id("name");
    By descriptionIframe = By.id("description_html_ifr");
    By descriptionTextArea = By.id("tinymce");
    By saveBookBtn = By.xpath("//button[text()='Save Book']");

    public BookEditpage(WebDriver driver) {
        super(driver);
    }

    public BookEditpage editName(String newName) {
        getDriver().findElement(nameInput).click();
        getDriver().findElement(nameInput).clear();
        getDriver().findElement(nameInput).sendKeys(newName);

        return this;
    }

    public BookEditpage editDescription(String newDescription) {
        getDriver().switchTo().frame(getDriver().findElement(descriptionIframe));
        getDriver().findElement(descriptionTextArea).click();
        getDriver().findElement(descriptionTextArea).clear();
        getDriver().findElement(descriptionTextArea).sendKeys(newDescription);
        getDriver().switchTo().defaultContent();

        return this;
    }

    public BookProfilePage saveBook() {
        getDriver().findElement(saveBookBtn).click();
        return new BookProfilePage(getDriver());
    }
}
