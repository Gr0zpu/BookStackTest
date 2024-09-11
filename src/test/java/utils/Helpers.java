package utils;

import org.openqa.selenium.chrome.ChromeOptions;

public class Helpers {
    public static ChromeOptions getChromeOption() {
        String chromeOptionsEnv = System.getenv("CHROME_OPTIONS");
        ChromeOptions options = new ChromeOptions();
        if (chromeOptionsEnv != null) {
            String[] args = chromeOptionsEnv.split(" ");
            options.addArguments(args);
            return options;
        }
        return options;
    }
}
