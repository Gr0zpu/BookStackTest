package selenium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;

public class PageCreatePage extends BasePage {
    private By nameInput = By.xpath("//input[@id='name']");
    private By textInputIframe = By.xpath("//iframe[@id='html-editor_ifr']");
    private By pageDescriptionTextArea = By.xpath("//body[@id='tinymce']");
    private By savePageBtn = By.xpath("//div[@class='inline block']//button[@type='submit']");

    public PageCreatePage(WebDriver driver) {
        super(driver);
    }
    @Step
    public PageCreatePage setPageName(String pageName) {
        getDriver().findElement(nameInput).click();
        getDriver().findElement(nameInput).clear();
        getDriver().findElement(nameInput).sendKeys(pageName);

        return this;
    }
    @Step
    public PageCreatePage enterPageContent(String pageContent) {
        getDriver().switchTo().frame(getDriver().findElement(textInputIframe));
        getDriver().findElement(pageDescriptionTextArea).click();
        getDriver().findElement(pageDescriptionTextArea).sendKeys(pageContent);
        getDriver().switchTo().defaultContent();

        return this;
    }
    @Step
    public PageProfilePage savePage() {
        getDriver().findElement(savePageBtn).click();
        return new PageProfilePage(getDriver());
    }
}
