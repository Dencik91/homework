package student.example.chat.entities;

import java.util.Date;

public class Message extends Entity {
    String body;
    // Student.example.chat.entities.User sender;
    Date sentAt;
    Date receivedAt;
    Date seenAt;

    public Message() {}

    public Message(int id, String body) {
        super(id);
        this.body = body;
        // this.sentAt = sentAt;
        // this.receivedAt = receivedAt;
        // this.seenAt = seenAt;
    }

    @Override
    public String toString() {
        return body  ;
    }
}
