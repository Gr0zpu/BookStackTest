package selenium.services;

import api.models.book.Book;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import selenium.base.BasePage;
import selenium.pages.BookProfilePage;
import selenium.pages.MainPage;

public class DataService extends BasePage {
    @Step
    public BookProfilePage createNewBook(Book book) {
        return new MainPage(getDriver()).getHeader().openBooksPage()
                .createNewBook()
                .enterBookName(book.getName())
                .enterDescription(book.getDescription())
                .addCover()
                .addTags(book.getTags())
                .saveBook();
    }
    public DataService(WebDriver driver) {
        super(driver);
    }
}

