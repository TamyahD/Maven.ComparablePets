package io.zipcoder;


import java.util.*;

public class Application {
//    List<String> pets = new ArrayList<String>();
    Map<String, String> pets = new HashMap<>();
    Integer howManyPets;
    String typeOfPet;
    String petName;

    public static void main(String[] args) {
        Application app = new Application();
        app.getUserInput();
    }


    public void getUserInput() {
//        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have? ");
        howManyPets = sc.nextInt();
        sc.nextLine();
//
        if (howManyPets.equals(1)) {
            System.out.print("What is your pet's name: ");
            petName = sc.nextLine();

            System.out.print("What kind of pet is " +petName +": ");
            typeOfPet = sc.nextLine();

            pets.computeIfAbsent(petName,k -> typeOfPet);
        }
        else if (howManyPets>1) {
            for (int count=1; count<=howManyPets; count++) {
                System.out.print("What is pet#" +count +"'s name: ");
                petName = sc.nextLine();

                System.out.print("What kind of pet is " +petName +": ");
                typeOfPet = sc.nextLine();

                pets.computeIfAbsent(petName,k -> typeOfPet);
            }
        }

        System.out.println(pets.toString());


//                "\nseparate by comma if you have more than 1 kind of pet.");
//        while (loop) {
//            pets.add(typeOfPet);
//
//            if (howManyPets>1) {
//                System.out.println("Do you have any other kinds of pets? (Y/N) ");
//                sc.hasNextLine();
//                String response = sc.next();
//
//                if (response.equals("N")) {
//                    loop = false;
//                }
//                else if (response.equals("Y")) {
//                    continue;
//                }
//            }
//            System.out.println(pets.size() +"\n" +pets);

//        }


    }
}

