package utils;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:localProject.properties",
        "system:env"
})
public interface AppConfig extends Config {
    @Key("url")
    String url();
    @Key("admin_api_token_id")
    String adminApiKey();
    @Key("admin_api_token_secret")
    String adminApiSecretKey();
    @Key("web_admin_login")
    String webAdminLogin();
    @Key("web_admin_password")
    String webAdminPassword();


}
