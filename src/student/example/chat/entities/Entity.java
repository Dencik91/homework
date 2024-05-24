package student.example.chat.entities;

import java.util.UUID;

public abstract class Entity {
    private UUID id;

    public Entity() {}

    public Entity(UUID id) {
        setId(id);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
