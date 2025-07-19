
/**
 * The purpose of this class is to contain the main method and coordinate additional method calls.
 *
 * @author Nola Griffin
 * @version 07/19/2025 (Version 3)
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
        boolean anotherGame = true;
        boolean isAcceptable = false;
        String userInput;
        
        //calling of methods
        userInput = OutputsInputs.intro();
        while(anotherGame)
        {   
            while(!isAcceptable)
            {
                 isAcceptable = playGames(userInput);   
            }
            
            //ask the user if they want to play another game
            System.out.println("Would you like to play a different game?");
            anotherGame = OutputsInputs.askAnother();
        }
        
        OutputsInputs.printOutro();
        in.close();
    }
    
    //additional methods that help with method calls
    /**
     * Method that takes what the user input and calls the methods to start the corrosponding game.
     */
    public static boolean playGames(String userInput)
    {
        //eliminate capital lowercase differences
        userInput = userInput.toUpperCase();
        
        //if statements to determine which game to play
        if(userInput.equals("A"))
            {
            System.out.println("Thank you for using the gaming program! Have a nice day!");
            return true;
            }
        else if(userInput.equals("B"))
            {
            //keeping track of boolean variables 
            isPrimeGame.mainPrimeGame();
            return true;
            }
        else if(userInput.equals("C"))
            {
            System.out.println("I have not added this feature, I am glad that you are excited! It will be added soon ;)");
            return true;
            }
        else if(userInput.equals("D"))
            {
            System.out.println("I have not added this feature, I am glad that you are excited! It will be added soon ;)");
            return true;
            }
        else if(userInput.equals("E"))
            {
            System.out.println("I have not added this feature, I am glad that you are excited! It will be added soon ;)");
            return true;
            }
        else
            {
            System.out.println("There seems to have been a mistake when inputting, please try again.");
            return false;
            }
        }
    }

