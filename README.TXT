
Author(s): Nola Griffin
Project name: Games
Purpose of project: I decided to make this program for recreational purposes while also retaining my codeing knowledge from my recent
                    AP Computer Science A class that I took. These games are supposed to me small and simple to motivate me to later create
                    bigger projects. 
Important Information: This program was made off of the BlueJ Software so it is not runnable on it's own as an application.
`                      I am not familiar with other softwares yet so I have no idea how the print statements work on other
                       softwares. (If a window where the print statements can print appears)                    

Additional Notes: 
- Seperate Programming log detailing all of the different changes for each of the classes.
- Each log is ordered from most recent to oldest.
-----------------------------------------------------------------------------------------------------------------------------
Purpose: To add "clean up" some of my messey programming some more before I added another game and fix a minor bug
VERSION or DATE: 07/20/2025 (Version 4)
                       
Changes: 
 - got rid of the issue of the program asking the user if they wanted to play another game despite the initial quit input when choosing A in the menu.
 - Changed the name of the class from isPrimeGame to just primeGame for simplicity
 - added some documentary within the prime number game methods to better understand what each individual method does.
 - added a parent class so that I would not have to copy and paste every common method between the different games and make multiple Scanner variables
 - added guess the number game class for setup but no code is in it.
 
Additional Notes: 
 - There is still the bug where the program will crash if you do not enter an integer for the prime number game. I am trying to figure
   out how to get the computer to check if the inputted string is parsable to an int.
 - I had less time to code for this program so I could not get my goal of adding the guess the number game. I settled on code clean up
   to make making subsequent games easier.
 - Even though I have the class guessNumber posted, you will still get a message notifying the user that the game isn't available yet
   because there is not code in the actual guess the number game.
-----------------------------------------------------------------------------------------------------------------------------
Purpose: To add the first game to my gaming program. this game is a prime number game where the user inputs numbers and the computer
         tells the user if the number is prime or not.
VERSION or DATE: 07/19/2025 (Version 3)
                       
Changes: 
 - got rid of while statements to simplify code
 - allows the user to play the prime number game as many times as they want
 - allows the user the option to switch to a different game
 - I added an outro for the program thanking the user
 - I reformatted the intro for readability.
 - I added the class with the prime number game and all of its methods.
 
Additional Notes: 
 - There is a bug where the program will crash if you do not enter an integer for the prime number game. I am trying to figure
   out how to get the computer to check if the inputted string is parsable to an int.
-----------------------------------------------------------------------------------------------------------------------------
Purpose: To create the baseline to later build the program for adding mutliple games. Setting up the methods and introduction.
PURPOSE OF PROJECT: To continue making the Games program for fun, mainly added the ability for the user to input their choice of game.
VERSION or DATE: 07/14/2025 (Version 2)
                       
Changes: 
 - I created a userInput variable in both classes to accept the user inputs for their game of choice.
 - I added a while loop that checks if the user input is appropriate, if not then the program loops through neted if-else-if statements
   until the user inputs a valid response.
 - I added (temporary) output print statements explaining that none of the games have actually been programmed in yet.
 - I decided to change the Outputs Class name to OutputsInputs because the class can also accept userInputs.
 - I created a reusable method acceptInput() dedicated soley to accepting user inputs.
 - I slightly changed the printMenu() method to account for the new acceptInput() method.
 
Additional Notes: 
 
-----------------------------------------------------------------------------------------------------------------------------
PROJECT TITLE: Games
PURPOSE OF PROJECT: To create a fun personal coding project by making traditional easy to code games for fun.
VERSION or DATE: 07/13/2025 (Version 1)
AUTHOR: Nola Griffin
                       
Changes: 
 - I provided the skeleton for the program, making a Main Class and an Outputs Class
 - I made the main method in the Main Class
 - I added introductory print statements in the Outputs Class
 - I brainstormed and created a list to output in the printMenu() method of the Outputs Class.
 - I imported the full util package for the Scanner class. I just decided to import the whole package.
 - I create class scanner variables for both classes.
 
 Additional Notes: 
 
-----------------------------------------------------------------------------------------------------------------------------

