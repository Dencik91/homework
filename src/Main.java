import Student.example.chat.entities.User;
import Student.example.chat.services.AuthService;

import java.util.Date;

public class Main {
    public static void main(String[] args)throws Exception {
        AuthService authService = new AuthService();
        int userCount = 0;
        while(userCount < 10) {
            User user = new User(userCount+1, "johny"+userCount,
                    "123", new Date(), 'm', "jh"+userCount+"@e.h");
            authService.signUp(user);
            userCount++;
        }
        User user3 = new User(3, "johny3",
                "123", new Date(), 'm', "jh3@e.h");
        System.out.println(authService.searchUser(user3));
        System.out.println("========================================================");
        for (int i = 0; i < authService.getUsers().length; i++) {
            System.out.println(authService.getUsers()[i]);
        }
        authService.deleteUser(3);
        System.out.println("========================================================");
        for (int i = 0; i < authService.getUsers().length; i++) {
            System.out.println(authService.getUsers()[i]);
        }
        authService.shiftUsersLeft(3);
        System.out.println("========================================================");
        for (int i = 0; i < authService.getUsers().length; i++) {
            System.out.println(authService.getUsers()[i]);
        }
        System.out.println("===================Delete with drpOut johny5===================");
        authService.dropOut(5);
        for (int i = 0; i < authService.getUsers().length; i++) {
            System.out.println(authService.getUsers()[i]);
        }

    }
}