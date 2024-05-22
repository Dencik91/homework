package Student.example.chat.services;

import Student.example.chat.entities.User;
import Student.example.chat.exceptions.UserRegistrationFailedException;

public class AuthService {

    final int MAX_USERS = 10000;
    private int size = 0;
    private User[] users; //class load
//  ############OOP####################
    public AuthService() {

    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
    //  ############ Service ####################
    public void signUp(User user) throws UserRegistrationFailedException {

        if(users == null) {
            users = new User[1];
            size++;
            users[size-1] = user;
        } else {
            User[] newUsers = new User[++size];
            for(int i = 0; i < size-1; i++) {
                newUsers[i] = users[i];
            }
            newUsers[size-1] = user;
            users = newUsers;
        }
        // 2. insert the user

    }
    public void signIn() {}
    public void signOut() {}
    public void dropOut() {}



    public void dropOut(User user) {
        // 1. Search
        int i = serchUser(user);
        if (i < 0) {
            System.out.println("User" + user + " not found");
            return;
        }
        // 2. Delete
        deleteUser(i);
        // 3. Shift left
        shiftUsersLeft(i);
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
