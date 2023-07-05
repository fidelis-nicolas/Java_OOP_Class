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
        person1.printPersonDetails();
        person1.eat("Rice");
        person1.move();



        person2.age = 33;
        person2.name = "Leszek";
        person2.color = "White";
        person2.height = 1.86;
        person2.printPersonDetails();
        person2.eat("Apple");

    }
}
