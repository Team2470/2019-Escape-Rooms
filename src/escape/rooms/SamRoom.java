package escape.rooms;

import escape.Room;
import java.util.Random;     // Random number generator class
import java.util.Scanner;    // reads user inputs

public class SamRoom extends Room {
	
	public SamRoom() {
		super("Sam's Room");
	}
	
	//override functions
	
	@Override
	public void exploreRoom() {
		
		System.out.println("Your enter a light room...");
		System.out.println("Press enter to continue...");
		_in.nextLine();
	}
	

	


{
	
	{
		//declare variables
		final int MAX = 100;
		int answer, guess;
		int numberOfTries = 0 ;
		String again;

		Scanner Keyboard = new Scanner(System.in);

		do

		{
			System.out.print (" I'm thinking of a number between 0 and "
			+ MAX + ". Guess what it is: ");
			guess = Keyboard.nextInt();
			//guess
			Random generator = new Random(); //Random  number generator. 0 to 100.
			answer = generator.nextInt(MAX) +1;

			if (guess > 100)//if guess is bigger than 100 then error message
			{
			System.out.println ("ERROR – Your guess is out of the range 0 to 100.");
			}
			if (guess < 0)//if guess is smaller than 00 then error message
			{
		    System.out.println ("ERROR – Your guess is out of the range 0 to 100.");
			}

			while (guess != answer )//If guess is not the answer
			{

			if (guess > answer )//If guess is more than the answer
			{
			System.out.println ("You guessed too high! \nTry again:");
			guess = Keyboard.nextInt();
			}

			if (guess < answer )//If guess is less than the answer
			{
			System.out.println ("Too Low! \nTry again:");
			guess = Keyboard.nextInt();
			}

			numberOfTries=numberOfTries+1;

			}//end of the loop

			// display result
			if ( guess == answer)
			{
			numberOfTries += 1;
			System.out.println ("YOU WIN!");
			System.out.println("It took you " + numberOfTries + " tries!") ;
			System.out.println();
			System.out.print( "Do you want to play again(Y/N)?");
			}


			Keyboard.nextLine(); // skip over enter key
			again = Keyboard.nextLine();

			numberOfTries=0;



		}while (again.equalsIgnoreCase ("Y") );



	} // end of class

} //end of main
}