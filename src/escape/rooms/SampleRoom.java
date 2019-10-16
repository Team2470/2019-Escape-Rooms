package escape.rooms;

import escape.Room;

public class SampleRoom extends Room {
	// ********************* Private Variables ***********************
	String password = "the password";
	
	// ********************* Override Variables **********************
	public SampleRoom() {
		super("The Test");
	}
	
	// ********************* Override Functions **********************
	
	/**
	 * Enter the correct password to escape the room
	 */
	@Override
	public void exploreRoom() {
		boolean correct = false;
		
		System.out.println("You come across a blinking terminal with a single line:");
		System.out.println();
		
		do {
			System.out.println("To escape, enter the password");
			System.out.print("> ");
			String input = _in.nextLine();
			
			if (input.equalsIgnoreCase(password)) {
				correct = true;
			} else {
				System.out.println();
				System.out.println("INCORRECT!!!!");
				System.out.println();
			}
			
			
		} while (!correct);

		System.out.println("\nThe terminal goes dark and the door opens...");

		return;
	}
}
