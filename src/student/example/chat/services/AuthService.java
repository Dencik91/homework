package student.example.chat.services;
import java.security.MessageDigest;
import java.util.Arrays;
import student.example.chat.entities.User;
import student.example.chat.exceptions.UserRegistrationFailedException;

public class AuthService {

    final int MAX_USERS = 10000;
    private int size = 0;
    private User[] users = new User[0]; //class load
//  ############OOP####################
    public AuthService() {}

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    //  ############ Service ####################
    //  check user unicallity of username, throw exception DONE!
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


    // Refactor pentru acasa cu ajutorul la un masiv mai mic. DONE!
    public void dropOut(User user) {
        int i = searchUser(user);
        if ((i < 0)||(size<1)||(i>=size)) {
            System.out.println("User not found");
            return;
        }
        User[] newUsers = new User[--size];
        for (int j=0; j<users.length; j++) {
            if (j<i) {
                newUsers[j] = users[j];
            } else if (j==i) {
                continue;
            } else {
                newUsers[j-1] = users[j];
            }
        }
        users = newUsers;

//        for (int z=0, j=0; z<users.length; z++, j++) {
//            if (z == i) {
//                z++;
//            }
//            newUsers[j] = users[z];
//        }
    }


    //  ############ HELPERS ####################
    public int searchUser(User user) {
        if (users == null) {return -1;}
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

    public String encryptUserPassword(User user) {
        byte[] hashedPassword = new byte[0];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            hashedPassword = messageDigest.digest(
                    user.getPassword().getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String hex = "";
        for (byte i : hashedPassword) {
            hex += String.format("%02X", i);
        }
        return hex;
    }
}