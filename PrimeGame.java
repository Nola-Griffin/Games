
/**
 * This class is one of the games listed for the user to play. This game takes a positive user integer
 * and outputs whether the integer is a prime number.
 *
 * @author Nola Griffin
 * @version 07/19/2025 (Version 2)
 */
public class PrimeGame extends ParentClass
{
    /**
     * This method acts like a smaller main method, calling and coordinating method calls for the Prime game program section.
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
        playAgain("B");
        
    }
    
    /**
     * This method prints the introduction and the first instructions to the user
     */
    public static void printInstructions()
    {
        //introductory print statements
        System.out.println("Welcome to the prime number checker!"); 
        System.out.println("The computer will check to see if the numer you entered is prime or not.");
    }
    
    /**
     * This method accepts the user's input and turns the string into an int
     */
    public static int acceptInput()
    {
        //initialize integer value;
        int integer;
        
        while(true)
        {
            //outputs instructions
            System.out.print("Please enter a positive integer number (number without decimals): ");
        
            //initialize variables to accept user Input
            String strInteger = in.next();
            
            if(strInteger.matches("\\d+"))
            {
                integer = Integer.parseInt(strInteger);
                break;
            }
            else
            {
                System.out.println("Invalid input. Please enter a positive whole number.");
            }
        }        
        
        //return integer
        return integer;
    }
    
    /**
     * This method determines if the user's chosen number is prime or not
     */
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
    
    /**
     * This method notifies the user if the number that the user picked is prime.
     */
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
    
}
