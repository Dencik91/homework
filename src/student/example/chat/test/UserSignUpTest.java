package student.example.chat.test;

import student.example.chat.entities.User;
import student.example.chat.exceptions.UserRegistrationFailedException;
import student.example.chat.services.AuthService;
import com.github.javafaker.Faker;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class UserSignUpTest {

    private User[] users;
    private final int MAX_USERS = 100;
    private AuthService authService;
    private int successTests = 0;
    private int failedTests = 0;

    public UserSignUpTest() {
        users = new User[MAX_USERS];
    }

    public int getMAX_USERS() {
        return MAX_USERS;
    }

    public User[] getUsers() {
        return users;
    }

    public AuthService getAuthService() {
        return authService;
    }

    // Setup
    public void before() {
        //Service
        authService = new AuthService();

        // data
        int id = 1;
        char[] gender = new char[]{'m', 'w'};
        Random random = new Random();
        Faker faker = new Faker(new Locale("md"));

        // Ciclu
        for (int i = 0; i < MAX_USERS; i++) {
            int randomGender = random.nextInt(gender.length);
            users[i] = new User(id++,
                    faker.name().username(),
                    faker.internet().password(),
                    faker.date().between(new Date(80, Calendar.JANUARY,1),
                            new Date(123, Calendar.JANUARY, 1)),
                    gender[randomGender],
                    faker.internet().emailAddress());
        }
    }
    // modify test with logic that try 100 same user to sign up Done!

    public void test() {

        for (int i = 0; i < MAX_USERS; i++) {
            try {
                authService.signUp(users[i]);
                successTests++;
                System.out.println(users[i] + " signed up");
            } catch (UserRegistrationFailedException e) {
                System.out.println("User already exists");
                failedTests++;
            } catch (Exception e) {
                System.out.println("Unexpected exception");
            }
        }
        System.out.println("Tests passed: " + successTests);
        System.out.println("Tests failed: " + failedTests);
    }
    public void negativeTest() {

        for (int i = 0; i < MAX_USERS; i++) {
            try {
                authService.signUp(users[i]);
                failedTests++;
                System.out.println(users[i] + " signed up");
            } catch (Exception e) {
                System.out.println("User already exists");
                successTests++;
            }
        }
        System.out.println("Tests passed: " + successTests);
        System.out.println("Tests failed: " + failedTests);
    }
    // Teardown
    public void after() {    }
}
