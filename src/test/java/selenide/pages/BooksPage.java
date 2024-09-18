package selenide.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenide.asserts.BooksPageAsserts;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BooksPage {
    private SelenideElement createNewBookBtn = $x("//div//a[@data-shortcut='new']");
    private ElementsCollection booksTitleList = $$x("//div[@class='grid-card-content']//h2");
    private ElementsCollection paginationPages = $$x("//a[@class='page-link' and not(contains(text(), '›'))and not(contains(text(), '‹'))]");
    private SelenideElement nextPageBtn = $x("//a[@rel='next']");
    @Getter
    private List<String> booksTitles;

    public BookCreatePage createNewBook() {
        createNewBookBtn.click();
        return Selenide.page(BookCreatePage.class);
    }

    public BooksPage getAllBooksTitles() {
        booksTitles = new ArrayList<>();
        if (!paginationPages.isEmpty()){
            for (SelenideElement pagination : paginationPages){
                addTitlesFromMainPAge();
                nextPageBtn.click();
            }
        }else {
            addTitlesFromMainPAge();
        }
        return this;
    }

    public BooksPageAsserts should() {
        return new BooksPageAsserts(this);
    }

    public void addTitlesFromMainPAge() {
        for (SelenideElement title: booksTitleList){
            booksTitles.add(title.getText());
        }
    }
}
