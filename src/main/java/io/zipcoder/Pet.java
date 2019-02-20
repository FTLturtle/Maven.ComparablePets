package io.zipcoder;

public abstract class Pet implements Comparable<Pet> {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Pet otherPet) {
        int result = this.name.compareTo(otherPet.name);

        if (result == 0) {
            result = compareTypes(this, otherPet);
        }

        return result;
    }

    @SuppressWarnings("Duplicates")
    private int compareTypes(Pet thisPet, Pet otherPet) {
        int result = 0;

        if (thisPet instanceof Dog) {
            if (!(otherPet instanceof Dog)) {
                result = -1;
            }
        } else if (thisPet instanceof Cat) {
            if (otherPet instanceof Dog) {
                result = 1;
            } else if (otherPet instanceof Mouse) {
                result = -1;
            }
        } else if (thisPet instanceof Mouse) {
            if (!(otherPet instanceof Mouse)) {
                result = 1;
            }
        }

        return result;
    }
}