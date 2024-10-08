package utils;

import api.models.book.Book;
import api.models.book.TagsItem;
import api.models.page.Page;
import api.models.shelve.Shelve;
import com.github.javafaker.Faker;
import api.models.user.User;
import lombok.Setter;

import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class RandomTestData {
    private static final Random random = new Random();
    private static final Faker faker = new Faker();
    @Setter
    private static Integer tagQuantity = 3;

    public static User getRandomUser() {
        return User.builder()
                .name(faker.name().fullName())
                .email(faker.internet().emailAddress())
                .rolesInt(random.nextInt(3)+1)
                .language("Us")
                .password(faker.internet().password())
                .sendInvite(false)
                .build();

    }
    public static Book getRandomBook() {
        return Book.builder()
                .name(faker.book().title())
                .description(faker.lorem().sentence())
                .descriptionHtml("<p>" + faker.lorem().sentence() + "</p>")
                .tags(getRandomTagList(tagQuantity))
                .build();
    }
    public static List<TagsItem> getRandomTagList(Integer tags) {
        List<TagsItem> tagList = new ArrayList<>();
        for (int i = 0; i < tags; i++) {
            tagList.add(getRandomTagItem());
        }

        return tagList;
    }

    public static File getBookCover(){
        return new File(faker.options().option(
                System.getProperty("user.dir") + "/src/test/resources/bookCovers/cover1.jpg",
                System.getProperty("user.dir") + "/src/test/resources/bookCovers/cover2.jpg",
                System.getProperty("user.dir") + "/src/test/resources/bookCovers/cover3.jpg")
        );
    }

    public static TagsItem getRandomTagItem() {
        return TagsItem.builder()
                .name(faker.commerce().department())
                .value(faker.options().option("Highest", "Medium", "Lowest"))
                .build();
    }

    public static Shelve getRandomShelve() {
        return Shelve.builder()
                .name(faker.book().genre())
                .descriptionHtml("<p>" + faker.lorem().sentence(20) + "</p>")
                .tags(getRandomTagList(3))
                .books(Arrays.asList(7,5,6))
                .build();
    }

    public static Page getRandomPage(Integer bookId) {
        return Page.builder()
                .name(faker.lordOfTheRings().character())
                .html(getRandomDescription())
                .bookId(bookId)
                .build();
    }

    public static String getUniqString(String string) {
        return string + new SimpleDateFormat("HHmmssSS").format(new Date());
    }

    public static String getHtmlDescription() {
        String html =
                "<h1>" + faker.book().title() + "</h1>\n" +
                "<p>" + faker.lorem().paragraph() + "</p>\n" +
                "<p>" + faker.lorem().sentence() + "</p>\n" +
                "<p>" + faker.lorem().sentence() + "</p>\n";
        return html;
    }

    public static String getRandomDescription() {
        String text =
                faker.book().title() +"\n" +
                faker.lorem().paragraph() +"\n" +
                faker.lorem().paragraph() +"\n" +
                faker.lorem().paragraph() +"\n";
        return text;
    }
}
