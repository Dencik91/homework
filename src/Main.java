import Student.example.chat.entities.User;
import Student.example.chat.services.AuthService;

import java.util.Date;

public class Main {
    public static void main(String[] args)throws Exception {
        // Create 10 user account
        AuthService authService = new AuthService();
        int userCount = 0;
        while(userCount < 10) {
            User user = new User(userCount+1, "johny"+userCount,
                    "123", new Date(), 'm', "jh"+userCount+"@e.h");
            authService.signUp(user);
            userCount++;
        }


        System.out.println("===================Delete with dropOut johny5===================");
        authService.dropOut(5);
        for (int i = 0; i < authService.getUsers().length; i++) {
            System.out.println(authService.getUsers()[i]);
        }

    }
}