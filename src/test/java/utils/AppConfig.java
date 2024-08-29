package utils;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:project.properties")
public interface AppConfig extends Config {
    @Key("url")
    String url();
    @Key("admin_api_token_id")
    String adminApiKey();
    @Key("admin_api_token_secret")
    String adminApiSecretKey();
}
