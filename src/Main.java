import Student.example.chat.entities.Entity;
import Student.example.chat.entities.Message;
import Student.example.chat.entities.MessagingService;
import Student.example.chat.entities.User;
import Student.example.chat.services.AuthService;
import Student.example.chat.validation.Validator;

import java.util.Date;
import java.util.Scanner;

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
        System.out.println(authService.serchUser(user3));
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
        authService.dropOut(new User(5, "johny5", "123", new Date(), 'm',
                "jh5@e.h"));
        for (int i = 0; i < authService.getUsers().length; i++) {
            System.out.println(authService.getUsers()[i]);
        }

    }
}