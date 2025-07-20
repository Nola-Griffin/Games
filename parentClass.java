
/**
 * This class is a parent class for all of the other game classes in this program.
 *
 * @author Nola Griffin
 * @version 07/20/2025 (version 1)
 */
import java.util.*;
public class parentClass
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
        playAnother = OutputsInputs.askAnother();
        
        //if statement deciding if the user wants to play again
        if(playAnother)
        {
            if(gameLetter.equals("B"))
                {
                //keeping track of boolean variables 
                primeGame.mainPrimeGame();
                }
            else if(gameLetter.equals("C"))
                {
                guessNumber.mainGuessNumber();
                }
            else
            {
                System.out.println("Thank you for playing this game!");
                System.out.println("----------------------------------------------------------------------------------------------------");
            }   
        }
    }   
}
