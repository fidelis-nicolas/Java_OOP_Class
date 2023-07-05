package humanproject;

public class Human {
    // A class is blueprint of an Object

     //Access specifiers default, public, private and protected.

    // A class have properties/state/fields e.g human have properties like height, age, color, legs, hair style, nationality

    // Modifiers, static, final, synchronise.........
    public String name;
    public int age;
    public double height;
    public String color;

    // Human leg is constant
    public final int leg = 2;

    // Behaviours of the class i.e Methods of the class
    /*
        public return-type method-name(arguements){
        }
     */

    public void eat(String food){
        System.out.println("Eating...." + food);
    }
    public void move(int distance){
        System.out.println("Moved for " + distance + "Km");
    }

    public void printPersonDetails(){
        //String name = "Example"; //Local variable
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
        System.out.println("Color: " + this.color);
        System.out.println("Legs: " + this.leg);
        System.out.println();
    }

    public String playMusic(String track){
        return "Playing...." + track;
    }
    public boolean checkGender(String gender){
        if(gender.equals("male")){
            return true;
        }
        else {
            return false;
        }
    }

    public double calCulateTax(double rent, double power, double carPayment, double insurance){
        double totalTax = rent+power+carPayment+insurance;
        return totalTax;
    }

    // Methods with array
    // Arrays of objects
}
