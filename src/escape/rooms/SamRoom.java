package escape.rooms;

import escape.Room;

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
}
