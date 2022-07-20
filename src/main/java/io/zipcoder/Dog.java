package io.zipcoder;

public class Dog extends Pet{
    Dog(String name, String type) {
        super(name, type);
    }
    Dog() {
        super();
    }

    @Override
    public String speak() {
        return "Woof woof!";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
