package humanproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //An object is an instance of a class


        Human person1 = new Human();
        Human person2 = new Human();

        person1.age = 10;
        person1.name = "Fidelis";
        person1.color = "Black";
        person1.height = 1.92;
        //person1.printPersonDetails();
//        person1.eat("Rice");
//        person1.move(20);



        person2.age = 33;
        person2.name = "Leszek";
        person2.color = "White";
        person2.height = 1.86;
       // person2.printPersonDetails();
        //person2.eat("Apple");

        //You can assign a method with return type to a variable of the same type
//        String music = person1.playMusic("Westlife: Obvious");
//        System.out.println(music);
//
//        // Method to check gender
//
//        if (person1.checkGender("famale")){
//            System.out.println("You are a male");
//        }
//        else {
//            System.out.println("you are a female");
//        }
        // Method to calculate human tax
        //double tax = person2.calCulateTax(34444.000, 3333.444,56000.00,7688.0);
       // System.out.println(tax);


        Human [] humans = {person1, person2};
        for(int i =0; i< humans.length; i++){
            if(humans[i].age == 10){
                System.out.println(humans[i].humanDetails());
            }
        }
    }
}
