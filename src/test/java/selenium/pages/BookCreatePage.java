package selenium.pages;

import api.models.book.Book;
import api.models.book.TagsItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.BasePage;
import utils.RandomTestData;

import java.util.List;

public class BookCreatePage extends BasePage {
    private By nameInput = By.id("name");
    private By descriptionIframe = By.xpath("//iframe[@id='description_html_ifr']");
    private By descriptionInput = By.xpath("//body[@id='tinymce']");
    private By coverImageCollapsible = By.xpath("//div[@id='logo-control']");
    private By selectImageInput = By.xpath("//input[@type='file']");
    private By bookTagsCollapsible = By.xpath("//div[@id='tags-control']");
    private By addAnotherTagBtn = By.xpath("//button[text()='Add another tag']");
    private By tagsNameInputsList = By.xpath("//div[@class='card drag-card']//input[@placeholder='Tag Name']");
    private By tagsValueInputsList = By.xpath("//div[@class='card drag-card']//input[@placeholder='Tag Value (Optional)']");
    private By saveBooksBtn = By.xpath("//div//button[text()='Save Book']");

    public BookCreatePage(WebDriver driver) {
        super(driver);
    }

    public BookCreatePage enterBookName(String bookName) {
        getDriver().findElement(nameInput).click();
        getDriver().findElement(nameInput).sendKeys(bookName);

        return this;
    }
    public BookCreatePage enterDescription(String description) {
        getDriver().switchTo().frame(getDriver().findElement(descriptionIframe));
        getDriver().findElement(descriptionInput).click();
        getDriver().findElement(descriptionInput).sendKeys(description);
        getDriver().switchTo().defaultContent();
        return this;
    }
    public BookCreatePage addCover() {
        getDriver().findElement(coverImageCollapsible).click();
        getDriver().findElement(selectImageInput).sendKeys(RandomTestData.getBookCover().getAbsolutePath());

        return this;
    }
    public BookCreatePage addTags(List<TagsItem> tags) {
        getDriver().findElement(bookTagsCollapsible).click();
        for (int i = 0; i < tags.size(); i++) {
            getDriver().findElement(addAnotherTagBtn).click();
        }

        List<WebElement> tagsNameList = getDriver().findElements(tagsNameInputsList);
        List<WebElement> tagsValueList = getDriver().findElements(tagsValueInputsList);

        for (int i = 0; i < tagsNameList.size(); i++) {
            tagsNameList.get(i).sendKeys(tags.get(i).getName());
            tagsValueList.get(i).sendKeys(tags.get(i).getValue());
        }
    return this;
    }

    public BookProfilePage saveBook() {
        getDriver().findElement(saveBooksBtn).click();

        return new BookProfilePage(getDriver());
    }
}
