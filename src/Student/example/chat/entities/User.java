package Student.example.chat.entities;

import java.util.Date;

public class User {
    String userName = "";
    String password = "";
    Date dob = new Date();
    Character gender = 'm';
    String email = "";

    public User() {}

    public User(String userName, String password, Date dob, Character gender, String email) {
        this.userName = userName;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }

    public void setEmail(String email) {
        // TODO: de adaugat validare cu @ si .
        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,5}$";
        if (email != null) {
            if (!email.equals("")) {
                if (email.matches(regex)) {
                    email = email.toLowerCase();
                    this.email = email;
                }
            } else {
                System.out.println("Email is empty");
            }
        } else {
            System.out.println("Email Null");
        }

    }
}
