package selenide.pages;

import api.models.book.TagsItem;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.RandomTestData;

import java.util.List;
import java.util.stream.IntStream;

import static com.codeborne.selenide.Selenide.*;

public class BookCreatePage {
    private SelenideElement nameInput = $(By.id("name"));
    private SelenideElement descriptionIframe = $x("//iframe[@id='description_html_ifr']");
    private SelenideElement descriptionInput = $x("//body[@id='tinymce']");
    private SelenideElement coverImageCollapsible = $x("//div[@id='logo-control']");
    private SelenideElement selectImageInput = $x("//input[@type='file']");
    private SelenideElement bookTagsCollapsible = $x("//div[@id='tags-control']");
    private SelenideElement addAnotherTagBtn = $x("//button[text()='Add another tag']");
    private ElementsCollection tagsNameInputsList = $$x("//div[@class='card drag-card']//input[@placeholder='Tag Name']");
    private ElementsCollection tagsValueInputsList = $$x("//div[@class='card drag-card']//input[@placeholder='Tag Value (Optional)']");
    private SelenideElement saveBooksBtn = $x("//div//button[text()='Save Book']");

    public BookCreatePage enterBookName(String bookName) {
        nameInput.click();
        nameInput.sendKeys(bookName);
        return this;
    }
    public BookCreatePage enterDescription(String description) {
        switchTo().frame(descriptionIframe);
        descriptionInput.click();
        descriptionInput.sendKeys(description);
        switchTo().defaultContent();
        return this;
    }
    public BookCreatePage addCover() {
        coverImageCollapsible.click();
        selectImageInput.uploadFile(RandomTestData.getBookCover());

        return this;
    }

    public BookCreatePage addTags(List<TagsItem> tags) {
        bookTagsCollapsible.click();
        for (int i = 0; i < tags.size(); i++) {
            addAnotherTagBtn.click();
        }

        for (int i = 0; i < tags.size(); i++) {
            tagsNameInputsList.get(i).sendKeys(tags.get(i).getName());
            tagsValueInputsList.get(i).sendKeys(tags.get(i).getValue());
        }
        return this;
    }

    public BookProfilePage saveBook() {
        saveBooksBtn.click();

        return Selenide.page(BookProfilePage.class);
    }
}
