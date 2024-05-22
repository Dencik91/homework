package Student.example.chat.test;

import Student.example.chat.entities.User;
import Student.example.chat.exceptions.UserRegistrationFailedException;
import Student.example.chat.services.AuthService;

import java.util.Date;

public class dropOutTest {
    public static void main(String[] args) throws UserRegistrationFailedException {
        AuthService authService = new AuthService();
        int userCount = 0;
        while(userCount < 10) {
            User user = new User(userCount+1, "johny"+userCount,
                    "123", new Date(), 'm', "jh"+userCount+"@e.h");
            authService.signUp(user);
            userCount++;
        }
        System.out.println(authService.getUsers().length);
        System.out.println("================Names===================");
        for(User user : authService.getUsers()) {
            System.out.println(user.getUserName());
        }
        System.out.println("================Delete id 5=============");
        authService.dropOut(5);
        System.out.println(authService.getUsers().length);
        System.out.println("================Names===================");
        for(User user : authService.getUsers()) {
            System.out.println(user.getUserName());
        }
    }
}
