
//Randolph Evanshill
//10/24/2020
package bot;
import java.util.Scanner;

public class SimpleBot {
    //initialize  Scanner to allow input
    final static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Theo", "2020");
        remindName();
        guessAge();
        count();
        test();

    }

    //Bot introduction
    static void greet(String botName, String birthYear) {
        System.out.println("Hello! My name is " + botName);
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name. ");
    }

    static void remindName() {
        String name = scnr.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
    //Method to get users age
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders after dividing your age by 3, 5, and 7.");
        int remainder3 = scnr.nextInt();
        int remainder5 = scnr.nextInt();
        int remainder7 = scnr.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scnr.nextInt();
        int i = 1;
        while(i <= num) {
            System.out.printf("%d!\n", i);
            ++i;
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int testAnswer = scnr.nextInt();
        if (testAnswer != 1) {
            System.out.println("Please, try again");
            test();
        }
        else {
            end();
        }


    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
