package escape.rooms;

import escape.Room;

public class ZachRoom extends Room {

	/**
	 * Create my room
	 */
	public ZachRoom() {
		super("Zach's Room");
	}
	
	// ********************* Override Functions **********************
	
	/**
	 * My custom exploration room.
	 */
	@Override
	public void exploreRoom() {
		
		System.out.println("You enter a dark room");
		System.out.print("Press Enter to Continue...");
		
		_in.nextLine();
	}
}
