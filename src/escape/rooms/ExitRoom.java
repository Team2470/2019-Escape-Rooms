package escape.rooms;

import escape.Room;

/**
 * My super 'interesting' maze exit.
 * 
 * @author Zach
 *
 */
public class ExitRoom extends Room {
	
	// ********************* Private Variables ***********************
	String command = "go east\n";
	
	
	// ********************* Override Variables **********************
	
	public ExitRoom() {
		super("The Dark");
	}
	
	// ********************* Override Functions **********************
	
	/**
	 * The final room
	 */
	@Override
	public void exploreRoom() {
		System.out.println("It is pitch black.");
		System.out.println("You are likely to be eaten by a grue.");
		System.out.println("");
		
		System.out.print("> ");
		for(int i = 0; i < command.length(); i++) {
			System.out.print(command.charAt(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// If we interrupt this thread, we don't care, so continue
			}
		}
		
		System.out.println("");
		System.out.println("Oh, no! You have walked into the slavering fangs of a lurking grue!");
		System.out.println("");
		System.out.println("---------------");
		System.out.println("   GAME OVER   ");
		System.out.println("---------------");
	}
}
