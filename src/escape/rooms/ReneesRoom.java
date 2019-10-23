package escape.rooms;

import escape.Room;

public class ReneesRoom extends Room{
	
	//Create my room
	public ReneesRoom() {
		super("Renee's Room");
	}

	//.....Override Functions .......
	//Renee's custom exploration room
	
	@Override
	
	public void exploreRoom() {
		
		System.out.println("You enter a room full of dumplings");
		System.out.println("Press Enter to Continue.....");
		
		_in.nextLine();
		}
}
