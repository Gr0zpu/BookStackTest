package selenide.pages;

import api.models.page.Page;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class PageCreatePage {
    private SelenideElement nameInput = $x("//input[@id='name']");
    private SelenideElement textInputIframe = $x("//iframe[@id='html-editor_ifr']");
    private SelenideElement pageDescriptionTextArea = $x("//body[@id='tinymce']");
    private SelenideElement savePageBtn = $x("//div[@class='inline block']//button[@type='submit']");

    @Step
    public PageCreatePage setPageName(Page page) {
        nameInput.click();
        nameInput.clear();
        nameInput.sendKeys(page.getName());
        return this;
    }

    @Step
    public PageCreatePage setPageContent(Page page) {
        switchTo().frame(textInputIframe);
        pageDescriptionTextArea.click();
        pageDescriptionTextArea.sendKeys(page.getHtml());
        switchTo().defaultContent();
        return this;
    }

    @Step
    public PageProfilePage savePage() {
        savePageBtn.click();
        return Selenide.page(PageProfilePage.class);
    }

}
