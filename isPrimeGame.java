
/**
 * This class is one of the games listed for the user to play. This game takes a positive user integer
 * and outputs whether the integer is a prime number.
 *
 * @author Nola Griffin
 * @version 07/19/2025 (Version 2)
 */
import java.util.Scanner;
public class isPrimeGame
{
    /**
     * 
     */
    public static void mainPrimeGame()
    {
        //initializing local variables
        int integer;
        boolean isPrime;
        boolean playAnother;
        
        printInstructions();
        integer = acceptInput();
        isPrime = isPrime(integer);
        outputResult(isPrime);
        playAgain();
        
    }
    public static void printInstructions()
    {
        //introductory print statements
        System.out.println("Welcome to the prime number checker!"); 
        System.out.println("The computer will check to see if the numer you entered is prime or not.");
        System.out.print("Please enter a positive integer number (number without decimals): ");
    }
    public static int acceptInput()
    {
        //initializing scanner variable
        Scanner in = new Scanner(System.in);
        
        //initialize variables to accept user Input
        String strInteger = in.next();
        
        //checks is user input is okay
        int integer = Integer.parseInt(strInteger);
        
        //return integer
        return integer;
    }
    public static boolean isPrime(int integer)
    {
        boolean isPrime = true;
        if(integer <= 1)
        {
            isPrime = false;
        }
        else if(integer == 2)
        {
            isPrime = true;
        }
        else if(integer % 2 == 0)
        {
            isPrime = false;
        }
        
        for(int i = 3; i < Math.sqrt(integer); i += 2)
        {
            if(integer % i == 0)
            {
                isPrime = false;
            }
        }
        
        //return statement
        return isPrime;
    }
    
    public static void outputResult(boolean isPrime)
    {
        if(isPrime)
        {
            System.out.println("Congradulations, you have found a prime number!");
        }
        else 
        {
            System.out.println("The number is not prime.");
        }
    }
    
    public static void playAgain()
    {
        //initialize local variable
        boolean playAnother;
        
        //print statemnt
        System.out.print("Do you want to play this game again? (Y/N): ");
        
        //method call to reusable method :)
        playAnother = OutputsInputs.askAnother();
        
        //if statement deciding if the user wants to play again
        if(playAnother)
        {
            System.out.println("----------------------------------------------------------------------------------------------------");
            mainPrimeGame();
        }
        else
        {
            System.out.println("Thank you for playing the Prime number game!");
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
    }
    
}
