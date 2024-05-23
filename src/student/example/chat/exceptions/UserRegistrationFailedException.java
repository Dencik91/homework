package student.example.chat.exceptions;

public class UserRegistrationFailedException extends Exception {
    public UserRegistrationFailedException(String message) {
        super(message);
    }
}
