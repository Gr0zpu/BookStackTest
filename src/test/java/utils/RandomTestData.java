package utils;

import com.github.javafaker.Faker;
import api.models.user.User;

import java.util.Random;

public class RandomTestData {
    private static final Random random = new Random();
    private static final Faker faker = new Faker();

    public static User getRandomUser(){
        return User.builder()
                .name(faker.name().fullName())
                .email(faker.internet().emailAddress())
                .rolesInt(random.nextInt(3)+1)
                .language("Us")
                .password(faker.internet().password())
                .sendInvite(false)
                .build();

    }
}
