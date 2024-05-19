import Student.example.chat.entities.Entity;
import Student.example.chat.entities.Message;
import Student.example.chat.entities.MessagingService;
import Student.example.chat.entities.User;
import Student.example.chat.services.AuthService;
import Student.example.chat.validation.Validator;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        User user1 = new User(1,"User1", "12345678", new Date(), 'm', "abc@gmail.com");
        User [] blackListUsers = {null, null, null};
        User blackUser = new User(2,"User2", "12345678", new Date(), 'm', "abc@gmail.com");
        blackListUsers[1] = blackUser;

        AuthService authService = new AuthService();
        authService.signUp(user1);
        User user2 = user1;
        authService.setUsers(blackListUsers);
        user2.setUserName("User2");
        authService.getUsers()[1].setUserName("Marry");

        // Cache
        User[] users = authService.getUsers();

        for(int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        MessagingService messagingService = new MessagingService();
        Message message1 = new Message(1, "Hello World");
        messagingService.sent(message1);
        Message message2 = new Message(2, "Mesaj classnii");
        messagingService.sent(message2);
        Message message3 = new Message(3, "Mesaj pizdos");
        messagingService.sent(message3);
        Message message4 = new Message(4, "Mesaj imbovii");
        messagingService.sent(message4);
        Message message5 = new Message(5, "Mesaj ciotkos");
        messagingService.sent(message5);
        Message message6 = new Message(6, "Mesaj outsider");
        messagingService.sent(message6);
    }
}