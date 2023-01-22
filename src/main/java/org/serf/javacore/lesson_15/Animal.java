package org.serf.javacore.lesson_15;

import java.util.Objects;

public class Animal {

    private String type;
    private String petName;

    public Animal(String type, String name) {
        this.type = type;
        this.petName = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pet name " + this.petName + ", pet type " + this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(type, animal.type) && Objects.equals(petName, animal.petName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, petName);
    }
}
