package io.zipcoder;

public abstract class Pet implements Comparable<Pet>{
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String speak(){
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Pet o) {
        if (this.name.compareTo(o.name) == 0) {
            return compareTypes(this, o);
        } else {
            return this.name.compareTo(o.name);
        }
    }

    private int compareTypes(Pet firstPet, Pet secondPet) {
        int result = 0;

        if (firstPet instanceof Dog) {
            result = -1;
        } else if (firstPet instanceof Cat) {
            if (secondPet instanceof Dog) {
                result = 1;
            } else if (secondPet instanceof Mouse) {
                result = -1;
            }
        } else if (firstPet instanceof Mouse) {
            result = 1;
        }

        return result;
    }
}
