package escape.rooms;

import escape.Room;

public class LoganRoom extends Room {

	/**
	 * Creates the room
	 */
	public LoganRoom() {
		super("Logan's Room");
	}
	
	// ****************** Override Functions *************************
	
	/**
	 * My custom exploration room.
	 */
	
	@Override
	public void exploreRoom() {
		
		System.out.println("you enter a dark room");
		System.out.print ("press enter to continue...");
		
		_in.nextLine();
		
	}
	
}
