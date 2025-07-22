
/**
 * The purpose of this class is to print the intro to the method 
 *
 * @author Nola Griffin
 * @version 07/21/2025 (Version 4)
 */
public class Outputs extends ParentClass
{
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
        userInput = in.next();
        
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
    
    public static void printOutro()
    {
        System.out.println("Thank you for using this gaming program!");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
