package Student.example.chat.services;

import Student.example.chat.entities.User;
import Student.example.chat.exceptions.UserRegistrationFailedException;

public class AuthService {

    private User[] users; //class load

    public AuthService() {
        users = new User[5]; //constructor load
    }

    public void signUp(User user) throws UserRegistrationFailedException {

        try {
            int i;
            // 1. search for next available
            for (i = 0; i < users.length; i++) {
                if (users[i] == null) break;
            }
            users[i] = user;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new UserRegistrationFailedException("User list full");
        }

        // 2. insert the user

    }
    public void signIn() {}
    public void signOut() {}
    public void dropOut() {}

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
