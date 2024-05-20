package Student.example.chat.services;

import Student.example.chat.entities.User;
import Student.example.chat.exceptions.UserRegistrationFailedException;

public class AuthService {

    private User[] users; //class load
//  ############OOP####################
    public AuthService() {
        users = new User[10]; //constructor load
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
    //  ############ Service ####################
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



    public void dropOut(User user) {
        // 1. Search
        // 2. Delete
        // 3. Shift left
    }

    //  ############ HELPERS ####################
    public int serchUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) return -1;
            if (users[i].getUserName().equals(user.getUserName())) return i;
        }
        return -1; // Not found
    }

    public void deleteUser(int i) {
        users[i] = null;
    }

    public void shiftUsersLeft(int i) {
        for (int j =i+1; j < users.length; j++) {
            users[j-1] = users[j];
        }
        users[users.length-1] = null;
    }
}
