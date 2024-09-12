package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import selenide.asserts.MainPageAsserts;
import selenide.components.Header;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class MainPage {
    private Header header = new Header();
    private SelenideElement changeThemeHover = $x("//div[@id='content']//span[contains(text(), 'Mode')]");

    public MainPageAsserts should(){
        return new MainPageAsserts(this);
    }
}
