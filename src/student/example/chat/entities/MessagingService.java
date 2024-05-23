package student.example.chat.entities;

public class MessagingService {
    private Message[] messages = new Message[5];
    private int counter = 0;

    public MessagingService() {}

    public Message[] getMessages() {
        return messages;
    }

    public void sent(Message message) {
        if (counter < messages.length) {
            messages[counter] = message;
            counter++;
            System.out.println("Message sent: " + message);
        }
        else {
            System.out.println("Message stack is overloaded! " + message);
        }
    }


}
