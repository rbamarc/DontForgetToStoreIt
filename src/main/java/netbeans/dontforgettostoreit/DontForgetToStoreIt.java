package netbeans.dontforgettostoreit;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class DontForgetToStoreIt {

    public static void main(String[] args) {
        //initialized scanner object to read user input
        Scanner inputReader = new Scanner(System.in);
        
        //initialize variables to used and assign them values
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color; 
        
        System.out.println("Give me pi to the fifth decimal: ");
        pi = Double.parseDouble(inputReader.nextLine());
        
        //we used Double.parseDouble but meaningOfLifeAndEverything is an INT
        //so we'll have to use Integer.parseInt
        
        System.out.println("What is the meaning of life, the universe, and everything?");
        System.out.println("give a number");
        meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is your favorite cheese?");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more?");
        color = inputReader.nextLine();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
                
        //this exercise was to demonstrate that varibles can be reassigned
        //if an input is taken in without being assigned it will not be stored
        //next commit will have the fixes
    }
}
