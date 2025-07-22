
/**
 * This class is a parent class for all of the other game classes in this program.
 *
 * @author Nola Griffin
 * @version 07/21/2025 (version 2)
 */
import java.util.*;
public class ParentClass
{
    //inherited scanner variable in for all classes
    public static Scanner in = new Scanner(System.in);
    
    //inherited methods intended for classes that code for the actual games
    /**
     * This method asks if the user wants to play the prime game again. If hte user wants to play the game again,
     * it will restart the mthod calls. If the user does not want to play the game again, a "thank you" message appears.
     */
    public static void playAgain(String gameLetter)
    {
        //initialize local variable
        boolean playAnother;
        
        //print statemnt
        System.out.print("Do you want to play this game again? (Y/N): ");
        
        //method call to reusable method :)
        playAnother = askAnother();
        
        //if statement deciding if the user wants to play again
        if(playAnother)
        {
            if(gameLetter.equals("B"))
                {
                //keeping track of boolean variables 
                PrimeGame.mainPrimeGame();
                }
            else if(gameLetter.equals("C"))
                {
                GuessNumber.mainGuessNumber();
                }
            else
            {
                System.out.println("Thank you for playing this game!");
                System.out.println("----------------------------------------------------------------------------------------------------");
            }   
        }
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
}
