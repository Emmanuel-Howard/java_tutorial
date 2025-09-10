import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

// PRINT STATEMENTS
/*
        System.out.print("Hello World!\n");
        System.out.print("I like pizza, it's good\n");
        System.out.print("Especially peperoni"); 
*/
/*
        // VARIABLES (Primitive & Reference)
        // 2 Steps to create a variable
        // 1. Declare the variable
        // 2. Assign the variable a value
        // Data types: int, double, char, String, boolean

// Int
        int age = 25;
        int year = 2024;
        System.out.println(age);
        System.out.println("The year is " + year);
// Double
        double price = 19.99;
        double gpa = 3.5;
        double temp = -12.4;

        System.out.println("$" + price);
// Char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
// Boolean
        boolean isStudent = true;
        boolean ishappy = false;

        System.out.println(isStudent);
        if(isStudent != true){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

// REFERENCE DATA TYPES
// STRING
        String name = "Emmanuel";
        String food = "Apples";

        System.out.print("Hello " + name);
*/

// USER INPUT
/*
        // Scanner class
        // 1. Import the Scanner class
        // 2. Create a Scanner object
        // 3. Use the Scanner object to get input

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");

        System.out.print("What is your GPA?");
        double gpa = scanner.nextDouble();
        System.out.println("You're GPA is: " + gpa);

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent){
                System.out.println(name + " is a student");
        }
        else{
                System.out.println(name + " is not a student");
        }


        scanner.close(); // Good practice to close it at program end

*/
// RECTANGLE AREA EXERCISE
/*
        Scanner scanner = new Scanner (System.in);

        System.out.println("WELCOME!");
        System.out.println("Let's calculate a rectangle's area\n");

        System.out.print("Enter the rectangle's length:");
        double length = scanner.nextDouble();
        System.out.print("Enter the rectangle's width:");
        double width = scanner.nextDouble();

        System.out.print("With a length of " + length + " and a width of " + width + ", the total area is: " + (length * width));

        scanner.close();
*/
// SHOPPING CART EXERCISE
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();
        System.out.print("What is the price of each?: ");
        double price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        int quantity = scanner.nextInt();
        System.out.println();

        System.out.print("You have bought " + quantity + " " + item + "/s\n");
        System.out.print("Your total is $" + (price * quantity));

        scanner.close();
*/

// RANDOM NUMBER GENERATOR
/*
       Random random = new Random();

       int number;
       number = random.nextInt(1, 7);

       System.out.print(number);
*/

/* NESTED IF STATEMENTS */
/*
boolean isStudent = false;
boolean isSenior = true;
double price = 9.99;

if(isStudent){
        if(isSenior){
                System.out.print("You get a senior discount of 20%");
                System.out.println("You get a student discount! of 10%");
                price *= 0.7;
        }
        else{
                System.out.println("You get a student discount! of 10%");
                price *= 0.9;
        }
}
else{
        if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
        }
        else{
                System.out.println("You don't get any discount");
                price = price;
        }
}

System.out.printf("The price is $%.2f" , price);
*/

// 

    }
}