package io.zipcoder;


import java.util.*;

public class Application {
    Scanner sc = new Scanner(System.in);
    Integer count =0;
    Integer howManyPets;
    String typeOfPet;
    String petName;

    Dog d = new Dog();
    List<Dog> dogList = new ArrayList<>();
    Cat c = new Cat();
    List<Cat> catList = new ArrayList<>();
    GuineaPig gp = new GuineaPig();
    List<GuineaPig> guineaPigList = new ArrayList<>();
    List<Pet> petList = new ArrayList<>();

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    public void run() {
        Integer num = getNumOfPets();
        if (num == 1) {
            String name = getPetName();
            String type = getTypeOfPet();

            switch (type) {
                case "dog":
                    d.setName(name);
                    d.setPetType(type.substring(0, 1).toUpperCase() + type.substring(1));
                    dogList.add(d);
                    petList.add(d);
//                    System.out.println(dogList.get(0));
                    break;
                case "cat":
                    c.setName(name);
                    c.setPetType(type.substring(0, 1).toUpperCase() + type.substring(1));
                    catList.add(c);
                    petList.add(c);
//                    System.out.println(catList.get(0));
                    break;
                case "guinea pig":
                    gp.setName(name);
                    gp.setPetType(type.substring(0, 1).toUpperCase() + type.substring(1));
                    guineaPigList.add(gp);
                    petList.add(gp);
//                    System.out.println(guineaPigList.get(0));
                    break;
            }
        }
        else if (num > 1) {
            for (int count = 1; count <= num; count++) {
                String names = getPetNames();
                String types = getTypeOfPets();

                switch (types) {
                    case "dog":
                        d.setName(names);
                        d.setPetType(types.substring(0, 1).toUpperCase() + types.substring(1));
                        dogList.add(d);
                        petList.add(d);
//                        System.out.println(dogList.get(0));
                        break;
                    case "cat":
                        c.setName(names);
                        c.setPetType(types.substring(0, 1).toUpperCase() + types.substring(1));
                        catList.add(c);
                        petList.add(c);
//                        System.out.println(catList.get(0));
                        break;
                    case "guinea pig":
                        gp.setName(names);
                        gp.setPetType(types.substring(0, 1).toUpperCase() + types.substring(1));
                        guineaPigList.add(gp);
                        petList.add(gp);
//                        System.out.println(guineaPigList);
                        break;
                }
            }
        }
//        System.out.println("Dog List: " +dogList);
//        System.out.println("Cat List: " +catList);
//        System.out.println("Guinea Pig List: " +guineaPigList);
        Collections.sort(petList);
    }

    public Integer getNumOfPets() {
        System.out.println("How many pets do you have? ");
        howManyPets = sc.nextInt();
        sc.nextLine();

        return howManyPets;
    }

    public String getPetName() {
        System.out.print("What is your pet's name: ");
        petName = sc.nextLine();

        return petName;
    }
    public String getPetNames() {
        count++;
        System.out.print("What is pet#" +count +"'s name: ");
        petName = sc.nextLine();

        return petName;
    }
    public String getTypeOfPet() {
        System.out.print("What kind of pet is " + petName + ": ");
        typeOfPet = sc.nextLine();

        return typeOfPet;
    }
    public String getTypeOfPets() {
        System.out.print("What kind of pet is " + petName + ": ");
        typeOfPet = sc.nextLine();

        return typeOfPet;
    }
}