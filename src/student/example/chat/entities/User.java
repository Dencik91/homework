package student.example.chat.entities;

import java.util.Date;
import java.util.UUID;

public class User extends Entity {
    private String userName = "";
    private String password = "";
    Date dob = new Date();
    Character gender = 'm';
    String email = "";

    public User() {}

    public User(UUID id, String userName, String password, Date dob, Character gender, String email) {
        super(id);
        this.userName = userName;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }

    public void setEmail(String email) {
        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,5}$";
        if (email != null) {
            if (!email.equals("")) {
                if (email.matches(regex)) {
                    email = email.toLowerCase();
                    this.email = email;
                    System.out.println(email + " is a valid email address");
                } else {
                    System.out.println(email + " is not a valid email address");
                }
            } else {
                System.out.println("Email is empty");
            }
        } else {
            System.out.println("Email Null");
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName=" + userName + '\n' +
                ", password=" + password + '\n' +
                ", dob=" + dob + '\n' +
                ", gender=" + gender + '\n' +
                ", email='" + email + '\n' +
                '}' + "\n\n";
    }
}
