import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    Scanner scanner = new Scanner(System.in);
    int age;
    int LOWER_BOUND = 0;
    int youngerAge;
    int olderAge;
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */

    public void runEventLoop() {
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                System.out.println(age);
                LOWER_BOUND= (age/ 2) + 7;
                if (age < LOWER_BOUND || age <18) {
                    System.out.println(age+" is too young!!");
                } else {
                    if (age >= 18) {
                        System.out.println(age+" good to go");
                    }
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
            }
        }
    }
    public int getYoungerAge(int age) {
        youngerAge = (age/ 2 ) + 7;
        return youngerAge;
    }
    public int getOlderAge(int age){
        olderAge = (age- 7) * 2;
        return olderAge;
    }
    
    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

