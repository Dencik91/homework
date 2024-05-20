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

//        MessagingService messagingService = new MessagingService();
//        Message message1 = new Message(1, "Hello World");
//        messagingService.sent(message1);
//        Message message2 = new Message(2, "Mesaj classnii");
//        messagingService.sent(message2);
//        Message message3 = new Message(3, "Mesaj pizdos");
//        messagingService.sent(message3);
//        Message message4 = new Message(4, "Mesaj imbovii");
//        messagingService.sent(message4);
//        Message message5 = new Message(5, "Mesaj ciotkos");
//        messagingService.sent(message5);
//        Message message6 = new Message(6, "Mesaj outsider");
//        messagingService.sent(message6);

    }
}