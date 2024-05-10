package Student.example.chat.entities;

import java.util.Date;

public class Message {
    int id;
    String body;
    // Student.example.chat.entities.User sender;
    Date sentAt;
    Date receivedAt;
    Date seenAt;

    public Message() {}

    public Message(int id, String body) {
        this.setId(id);
        this.body = body;
        // this.sentAt = sentAt;
        // this.receivedAt = receivedAt;
        // this.seenAt = seenAt;
    }

    public void setId(int id) {
        if (id >= 1 && id <= 1000000) {
            this.id = id;
        } else {
            System.out.println("ID incorrect");
        }
    }


}
