package io.zipcoder;

public class Cat extends Pet{
    Cat(String name, String type) {
        super(name, type);
    }
    Cat() {
        super();
    }

    @Override
    public String speak() {
        return "meow...meow";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
