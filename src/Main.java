import student.example.chat.entities.User;
import student.example.chat.services.AuthService;
import student.example.chat.services.IdentificationService;

import java.util.Date;

public class Main {
    public static void main(String[] args)throws Exception {
        // Create 10 user account
        User user = new User(new IdentificationService().getID(),
                "Den", "123", new Date(), 'M', "den@gmail.com");
        AuthService authService = new AuthService();
        System.out.println(authService.encryptUserPassword(user));
        System.out.println(user.getId());

    }
}