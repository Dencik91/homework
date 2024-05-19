package Student.example.chat.services;

import Student.example.chat.entities.User;

public class AuthService {

    private User[] users; //class load

    public AuthService() {
        users = new User[5]; //constructor load
    }

    public void signUp(User user) {
        users[0] = user;
        users[1] = user;
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
