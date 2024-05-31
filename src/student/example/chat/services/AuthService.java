package student.example.chat.services;
import java.security.MessageDigest;
import java.util.ArrayList;

import student.example.chat.entities.User;
import student.example.chat.exceptions.UserRegistrationFailedException;

public class AuthService {

    final int MAX_USERS = 10000;
    private int size = 0;
    private ArrayList<User> users = new ArrayList<>(); //class load
//  ############OOP####################
    public AuthService() {}

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    //  ############ Service ####################
    //  check user unicallity of username, throw exception DONE!
    public void signUp(User user) throws UserRegistrationFailedException {
        if (searchUser(user)!=-1) {
            throw new UserRegistrationFailedException("User " + user + "already exists");
        } else {
            users.add(user);
        }
    }

    public User authenticate (String userName, String password) {
        // search user by name
        int index = searchUser(userName);
        if (index == -1) {
            return null;
        }
        // obtain password hash
        String passwordHash = users.get(index).getId().toString().substring(0,8)+ getHash256(password);
        // compare password with user password hash
        if (users.get(index).getPassword().equals(passwordHash)) {
            return users.get(index);
        }
        return null;
    }

    public void signIn() {}
    public void signOut() {}
    public void dropOut() {}

    // Refactor pentru acasa cu ajutorul la un masiv mai mic. DONE!
    public void dropOut(User user) {
        int i = searchUser(user);
        if (i < 0) {
            System.out.println("User not found");
            return;
        } else {
            users.remove(i);
        }
    }

    //  ############ HELPERS ####################
    public int searchUser(String username) {
        if (users == null) {return -1;}
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(username)) return i;
        }
        return -1; // Not found
    }

    public int searchUser(User user) {
        if (users == null) {return -1;}
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(user.getUserName())) return i;
        }
        return -1; // Not found
    }

    public String encryptUserPassword(User user) {
        // Append to hexPassword first 8 characters from user id at start of password
        StringBuilder hexPassword = new StringBuilder(user.getId().toString().substring(0,8));
        hexPassword.append(getHash256(user.getPassword()));

        return hexPassword.toString();
    }

    public String getHash256(String value) {
        StringBuilder valuehash = new StringBuilder();
        ArrayList<Byte> hashedPassword = new ArrayList<>();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for(byte b : messageDigest.digest(value.getBytes("UTF-8"))) {
                hashedPassword.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (byte i : hashedPassword) {
            valuehash.append(String.format("%02X", i));
        }
        return valuehash.toString();
    }
}
