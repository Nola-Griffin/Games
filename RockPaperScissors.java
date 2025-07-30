
/**
 * Write a description of class RockPaperScissors here.
 *
 * @author Nola Griffin
 * @version 07/29/2025 (Version 1)
 */
public class RockPaperScissors extends ParentClass
{
    /**
     * This method acts as the main method for the rock paper scissors game
     */
    public static void mainRockPaperScissors()
    {
        //method calls
        printIntro();
        String userChoice = userInput();
        String computerChoice = computerChoice();
        String winner = winnerDeclaration(userChoice, computerChoice);
        printOutro(computerChoice, winner);
        System.out.println("----------------------------------------------------------------------------------------------------");
        playAgain("D");
    }
    
    /**
     * This method prints the introduction to the rock paper scissors game
     */
    public static void printIntro()
    {
        System.out.println("Welcome to the rock paper scissors game!");
        System.out.println("Please choose between three options: Rock, Paper, or Scissors");
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    
    /**
     * This accepts the user's input in the rock paper scissors game
     */ 
    public static String userInput()
    {
        System.out.println();
        System.out.print("\t" + "You chose: ");
        String userInput = in.next();
        String firstCharacter = "";
        userInput = userInput.toLowerCase();
        firstCharacter = userInput.substring(0,1);
        firstCharacter = firstCharacter.toUpperCase();
        userInput = firstCharacter + userInput.substring(1);
        
        return userInput;
    }
    
    /**
     * This method randomizes which choice the computer will go with
     */
    public static String computerChoice()
    {
        String computerChoice = "";
        double randomNumber = Math.random();
        
        if(randomNumber < 0.3)
        {
            computerChoice = "Rock";
        }
        else if(randomNumber < 0.6)
        {
            computerChoice = "Paper";
        }
        else
        {
            computerChoice = "Scissors";
        }
        
        return computerChoice;
    }
    
    /**
     * This method determines who the winner is
     */
    public static String winnerDeclaration(String userInput, String computerChoice)
    {
        String winner = "";
        if(userInput.equals(computerChoice))
        {
            winner = "You tied with the computer!";
        }
        else if(userInput.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Paper"))
        {
            winner = "The computer won!";
        }
        else if(userInput.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors"))
        {
            winner = "Yo won!";
        }
        else if(userInput.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
        {
            winner = "you won!";
        }
        else if(userInput.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Scissors"))
        {
            winner = "The computer won!";
        }
        else if(userInput.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Rock"))
        {
            winner = "The computer won!";
        }
        else if(userInput.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))
        {
            winner = "You won!";
        }
        return winner;
    }
    
    /**
     * This method prints out the winner and the outro
     */
    public static void printOutro(String computerChoice, String winner)
    {
        System.out.println("\t" + "The computer chose: " + computerChoice);
        System.out.println("\t" + winner);
    }
}
