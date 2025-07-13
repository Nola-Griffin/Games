
/**
 * The purpose of this class is to print the intro to the method 
 *
 * @author Nola Griffin
 * @version 07/13/2025
 */
import java.util.*;
public class Outputs
{
    //create scanner class variable
    static Scanner in = new Scanner(System.in);
    
    
    //Print methods that start off the beginning of the program
    /**
     * This method prints the introduction to the program and instructs the user on how to choose a game.
     */
    public static void printIntro()
    {
        //print opening statements
        System.out.println("Thank you for using this program!");
        System.out.println("Below are a list of several available games to choose from: ");
        System.out.println("Please input the letter of the game that you want to use, have fun!");
        System.out.println();
    }
    /**
     * This method prints the menu for the user to view available games
     */
    public static String printMenu()
    {
        //print statements
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Quit [A]");
        System.out.println("Prime number game [B]");
        System.out.println("Guess the number [C]");
        System.out.println("Cesar Cipher Game [D]");
        System.out.println("Rock Paper Scissors [E]");
        
        //accept user choice of game from menu
        String userInput = in.next();
        return userInput;
    }
    
}
