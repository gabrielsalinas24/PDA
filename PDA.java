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
        boolean shouldContinue = true;
        while (shouldContinue){
            System.out.println("How old are you?");
            System.out.println("Enter 0 to exit");
            try {
                age = scanner.nextInt();
                System.out.println(age);
                LOWER_BOUND= (int)Math.ceil((age/ 2.0) + 7);
                int olderAge = (int)Math.ceil((age- 7) * 2);
                if (age == 0) {
                    shouldContinue = false;
                } else if (age < LOWER_BOUND){
                    System.out.println(age+" is too young!!");
                } else if (age >= 14) {
                        System.out.println("youngest age " + LOWER_BOUND + " oldest age " + olderAge);
                    }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
            }
            if (age <= -1 || age <= 100 && age > 99) {
                System.out.println("Please enter a proper age");
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
