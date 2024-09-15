package selenide.services;

import api.models.book.Book;
import io.qameta.allure.Step;
import selenide.base.BaseTest;
import selenide.pages.BookProfilePage;
import selenide.pages.MainPage;

public class DataService extends BaseTest {
    @Step("Create new book")
    public BookProfilePage createNewBook(Book book) {
        return new MainPage().getHeader().openBooksPage()
                .createNewBook()
                .enterBookName(book.getName())
                .enterDescription(book.getDescription())
                .addCover()
                .addTags(book.getTags())
                .saveBook();
    }
}
