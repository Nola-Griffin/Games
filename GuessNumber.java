
/**
 * Write a description of class guessNumber here.
 *
 * @author Nola Griffin
 * @version 07/21/2025 (Version 1)
 */
public class GuessNumber extends ParentClass
{
    //creates a minimum and maximum class variable.
    /**\
     * This method acts as a mini main method responsible for controlling the method calls within the guess the number game portion of the program.
     */
    public static void mainGuessNumber()
    {
        //initialize local variables
        int lowerBound;
        int upperBound;
        int randNum;
        
        //method calls
        printIntro();
        lowerBound = getLowerBound();
        upperBound = getUpperBound();
        randNum = generateNumber(lowerBound, upperBound);
        takeUserInput(lowerBound, upperBound, randNum);
    }
    
    /**
     * This method prints out the introduction to the game Guess the Number.
     */
    public static void printIntro()
    {
        System.out.println("Welcome to the guess the number game!");
        System.out.println("In this game, the computer will generate an integer number based on your chosen upper and lower bounds.");
    }
    
    /**
     * This program accepts the user's lower bound for the randomely generated number.
     */
    public static int getLowerBound()
    {
        //initialize local variables
        String strInteger;
        int integer;
        
        while(true)
        {
            //print out instructions
            System.out.print("Please input the lower bound of the number: ");
            
            //accept input
            strInteger = in.next();
            
            //if statement to determine proper input
            if(strInteger.matches("-?\\d+"))
            {
                integer = Integer.parseInt(strInteger);
                break;
            }
            else
            {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        
        //return statement
        return integer;
    }
    
    /**
     * This method accepts the user's chosen upper bound for the random generated number
     */
    public static int getUpperBound()
    {
        //initialize local variables
        String strInteger;
        int integer;
        
        while(true)
        {
            //print out instructions
            System.out.print("Please input the upper bound of the number: ");
            
            //accept input
            strInteger = in.next();
            
            //if statement to determine proper input
            if(strInteger.matches("-?\\d+"))
            {
                integer = Integer.parseInt(strInteger);
                break;
            }
            else
            {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        
        //return statement
        return integer;
    }
    
    /**
     * This method generates the number from the  inputted lower and upper bounds.
     */
    public static int generateNumber(int lowerBound, int upperBound)
    {
        //initialize local variable'
        int randNum, range;
        
        while(lowerBound > upperBound)
        {
            System.out.println("Your lower bound is higher than your upper bound.");
            lowerBound = getLowerBound();
            upperBound = getUpperBound();
        }
        
        range = upperBound - lowerBound + 1;
        randNum = (int)(Math.random() * range) + lowerBound;
        
        return randNum;
    }
    
    /**
     * This method takes the user's input and makes sure that the input is valid.
     */
    public static void takeUserInput(int lowerBound, int upperBound, int randNum)
    {
        //initialize local variables
        String strUserInput;
        int userInput;
        
        //series of checks to determine if user input is valid. If not, accept a new input.
        while(true)
        {
            //print out instructions
            System.out.print("Please input your guess: ");
            
            //accept input
            strUserInput = in.next();
            
            //if statement to determine proper input
            if(strUserInput.matches("-?\\d+"))
            {
                userInput = Integer.parseInt(strUserInput);
                if(userInput >= lowerBound && userInput <= upperBound)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        
        //method call to determineGuess
        determineGuess(lowerBound, upperBound, randNum, userInput);
    }
    
    /**
     * This method determines if the user correctly guessed the number. If the uder did not guess the number, a message will tell the user if their number is too high or too low.
     */
    public static void determineGuess(int lowerBound, int upperBound, int randNum, int userInput)
    {
        if(userInput == randNum)
        {
            System.out.println("You have found the right answer!");
            System.out.println("----------------------------------------------------------------------------------------------------");
            ParentClass.playAgain("C");
        }
        else if(userInput < randNum)
        {
            System.out.println("Your number is less than the computer generated number, try again.");
            takeUserInput(lowerBound, upperBound, randNum);
        }
        else
        {
            System.out.println("Your number is more than the computer generated number, try again.");
            takeUserInput(lowerBound, upperBound, randNum);
        }
    }
}
