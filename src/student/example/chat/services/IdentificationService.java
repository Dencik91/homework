package student.example.chat.services;
import java.util.UUID;

public class IdentificationService {

    public IdentificationService () {}

    public UUID getID(){
        // factory pattern
        return UUID.randomUUID();
    }
}
