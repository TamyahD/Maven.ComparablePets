package io.zipcoder;


public class GuineaPig extends Pet{


    GuineaPig(String name, String type) {
        super(name, type);
    }
    GuineaPig() {
        super();
    }

    @Override
    public String speak() {
        return "wee, wEEeee, weee";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
