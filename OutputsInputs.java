
/**
 * The purpose of this class is to print the intro to the method 
 *
 * @author Nola Griffin
 * @version 07/19/2025 (Version 3)
 */
import java.util.*;
public class OutputsInputs
{
    //create scanner class variable
    static Scanner in = new Scanner(System.in);

    //Print methods that start off the beginning of the program
    /**
     * This method prints the introduction to the program and instructs the user on how to choose a game.
     */
    public static String intro()
    {
        //initializing userinput variable
        String userInput;
        
        //print opening statements
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Thank you for using this program!");
        System.out.println("Below are a list of several available games to choose from: ");
        printMenu();
        System.out.print("Please input the letter of the game that you want to use: ");
        
        //accepting userInput
        userInput = acceptInput();
        
        //space for readability
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        //return statement
        return userInput;
    }
    
    /**
     * This method prints the menu for the user to view available games
     */
    public static void printMenu()
    {
        //print statements
        System.out.println();
        System.out.println("Quit [A]");
        System.out.println("Prime number game [B]");
        System.out.println("Guess the number [C]");
        System.out.println("Cesar Cipher Game [D]");
        System.out.println("Rock Paper Scissors [E]");
    }
    
    /**
     * This method just accepts the user input using in.next(). I dedicated a seperate
     * method for this operation to be able to reuse this method.
     */
    public static String acceptInput()
    {
        String userInput = in.next();
        return userInput;
    }
    /**
     * This method simply is a general method meant for all of the games asking the user
     * they want to play the game again.
     *     
     */
    public static boolean askAnother()
    {
        //initialize variables
        boolean acceptableInput = false;
        boolean another = false;
        String strAnother = "";
        
        //while loop to account for wrong answers
        while(acceptableInput == false)
        {
            //accept user input
            strAnother = in.next();
        
            //determine input
            if(strAnother.equalsIgnoreCase("Y"))
            {
                another = true;
                acceptableInput = true;
            }
            else if(strAnother.equalsIgnoreCase("N"))
            {
                another = false;
                acceptableInput = true;
            }
            else
            {
                acceptableInput = false;
                System.out.println("There might have been a mistake, please try to input your choice again.");
            }
        }
        return another;
    }
    public static void printOutro()
    {
        System.out.println("Thank you for using this gaming program!");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
