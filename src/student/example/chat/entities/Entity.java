package student.example.chat.entities;

public abstract class Entity {
    private int id;

    public Entity() {}

    public Entity(int id) {
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 1 && id <= 1000000) {
            this.id = id;
        } else {
            System.out.println("ID incorrect");
        }
    }
}
