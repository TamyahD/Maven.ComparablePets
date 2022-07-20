package io.zipcoder;

public abstract class Pet implements Comparable<Pet> {
    String name;
    String petType;

    Pet(String name, String type) {
        this.name = name;
        this.petType = type;
    }

    Pet() {
       this.name = "";
       this.petType = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }


    @Override
    public String toString() {
        return "Pet Type: " +this.getPetType() +
                "\nPet Name: " +this.getName() +
                "\nGuess what sound " +this.getName() + " makes..." + this.speak();
    }



    public abstract String speak();
}
