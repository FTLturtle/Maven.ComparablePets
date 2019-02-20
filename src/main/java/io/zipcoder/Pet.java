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

//    public int compareTo(Pet o) {
//        int result;
//        if (this.name.compareTo(o.name) == 0) {
//            result = compareTypes(this, o);
//        } else {
//            result = this.name.compareTo(o.name);
//        return result;
//    }

    public int compareTo(Pet otherPet) {
        int result = compareTypes(this, otherPet);

        if (result == 0) {
            result = this.name.compareTo(otherPet.name);
        }
        return result;
    }

    private int compareTypes(Pet firstPet, Pet secondPet) {
        int result = 0;

        if (firstPet instanceof Dog) {
            if (!(secondPet instanceof Dog)) {
                result = -1;
            }
        } else if (firstPet instanceof Cat) {
            if (secondPet instanceof Dog) {
                result = 1;
            } else if (secondPet instanceof Mouse) {
                result = -1;
            }
        } else if (firstPet instanceof Mouse) {
            if (!(secondPet instanceof Mouse)) {
                result = 1;
            }
        }

        return result;
    }
}
