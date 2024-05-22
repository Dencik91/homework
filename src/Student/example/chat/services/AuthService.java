package Student.example.chat.services;
import java.util.Arrays;
import Student.example.chat.entities.User;
import Student.example.chat.exceptions.UserRegistrationFailedException;

public class AuthService {

    final int MAX_USERS = 10000;
    private int size = 0;
    private User[] users = new User[0]; //class load
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
    // TODO check user unicallity of username, throw exception
    public void signUp(User user) throws UserRegistrationFailedException {
        if (searchUser(user)!=-1) {
            throw new UserRegistrationFailedException("User " + user + "already exists");
        }
        User[] newUsers = Arrays.copyOf(users, ++size);
        newUsers[size-1] = user;
        users = newUsers;
    }
    public void signIn() {}
    public void signOut() {}
    public void dropOut() {}


    // TODO Refactor pentru acasa cu ajutorul la un masiv mai mic.
    public void dropOut(int i) {
        if (i < 0) {
            System.out.println("User not found");
            return;
        }
        // 2. Delete
        deleteUser(i);
        // 3. Shift left
        shiftUsersLeft(i);
    }

    //  ############ HELPERS ####################
    public int searchUser(User user) {
        if (users == null) {
            return -1;
        }
        for (int i = 0; i < users.length; i++) {
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
