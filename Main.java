
/**
 * The purpose of this class is to contain the main method and coordinate additional method calls.
 *
 * @author Nola Griffin
 * @version 07/13/2025
 */
import java.util.*;
public class Main
{
    //initializing class scanner variable
    static Scanner in = new Scanner (System.in);
    
    /**
     * Main Method
     */
    public static void main(String [] args)
    {
        //initializing variables
        String userInput;
        
        //calling of methods
        OutputsInputs.printIntro(); 
        userInput = OutputsInputs.printMenu();
        
    }
    
    //additional methods that help with method calls
    /**
     * Method that takes what the user input and calls the methods to start the corrosponding game.
     */
    public static void playGames(String userInput)
    {
        //initializing local boolean variable
        boolean isAcceptable = false;
        
        //while loop to determine if the input is acceptable
        while(isAcceptable == false)
        {
            //eliminate capital lowercase differences
            userInput = userInput.toUpperCase();
        
            //if statements to determine which game to play
            if(userInput.equals("A"))
            {
                isAcceptable = true;
                System.out.println("Thank you for using the gaming program! Have a nice day!");
            }
            else if(userInput.equals("B"))
            {
                isAcceptable = true;
                System.out.println("I have not added this feature, I am glad that you are excited! It will be added soon ;)");
            }
            else if(userInput.equals("C"))
            {
                isAcceptable = true;
                System.out.println("I have not added this feature, I am glad that you are excited! It will be added soon ;)");

            }
            else if(userInput.equals("D"))
            {
                isAcceptable = true;
                System.out.println("I have not added this feature, I am glad that you are excited! It will be added soon ;)");

            }
            else if(userInput.equals("E"))
            {
                isAcceptable = true;
                System.out.println("I have not added this feature, I am glad that you are excited! It will be added soon ;)");
            }
            else
            {
                System.out.println("There seems to have been a mistake when inputting, please try again.");
                userInput = OutputsInputs.printMenu();
            }
        }
    }
}
