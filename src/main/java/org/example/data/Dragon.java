package org.example.data;

import java.time.LocalDateTime;
import org.example.a.IdGenerator;

public class Dragon {
    private final long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long age; //Значение поля должно быть больше 0
    private int weight; //Значение поля должно быть больше 0
    private Boolean speaking; //Поле может быть null
    private DragonType type; //Поле не может быть null
    private DragonCave cave; //Поле не может быть null

    public Dragon(long id, String name, Coordinates coordinates, LocalDateTime creationDate, long age, int weight, Boolean speaking, DragonType type, DragonCave cave) throws IllegalArgumentException {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("id must be больше 0");
        }
        this.setName(name);
        this.setCoordinates(coordinates);
        this.creationDate = creationDate;
        this.setAge(age);
        this.setWeight(weight);
        this.setSpeaking(speaking);
        this.setType(type);
        this.setCave(cave);
    }

    // сеттер имени ; не может быть null, не может быть пустой
    public void setName(String name) {
        if (name != null && name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    // сеттер координат ; не могут быть null
    public void setCoordinates(Coordinates coordinates) {
        if (coordinates != null) {
            this.coordinates = coordinates;
        } else {
            throw new IllegalArgumentException("");
        }
    }


    public void setAge(long age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public void setSpeaking(Boolean speaking) {
        if (speaking != null) {
            this.speaking = speaking;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public void setType(DragonType type) {
        if (type != null) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public void setCave(DragonCave cave) {
        if (cave != null) {
            this.cave = cave;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public long getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public long getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public Boolean getSpeaking() {
        return speaking;
    }

    public DragonType getType() {
        return type;
    }

    public DragonCave getCave() {
        return cave;
    }
}
