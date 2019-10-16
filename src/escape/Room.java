package escape;
import java.util.Scanner;

/**
 * The base class for a room that should be inherited by every room in the 
 * sequence.  The exploreRoom() method should be overridden.
 * 
 * @author Zach
 *
 */
public class Room {

	// *********************** Protected Variables **************************** 
	protected String _roomName = "The Null";
	public static final Scanner _in = new Scanner(System.in);
	
	// ************************ Private Variables ***************************** 
	private Room _exitRoom = null;
	
	// ************************* Public Get/Set ******************************* 
	/**
	 * @return Returns the full name of the room
	 */
	public String getRoomName() {
		return _roomName;
	}
	
	/**
	 * Gets a reference to the next room to explore
	 * @return The room to enter after exiting this room
	 */
	public Room getNextRoom() {
		return _exitRoom;
	}
	
	/**
	 * Indicates this is the final room and won't return a next room.
	 * @return True if this is the final room.
	 */
	public boolean isFinalRoom()
	{
		return (_exitRoom == null);
	}
	
	// *********************** Public Functions ******************************* 
	/**
	 * Sets the room to go to after this room is complete
	 * @param room The room to enter next
	 */
	public void setExit(Room room) {
		_exitRoom = room;
	}
	
	// *********************** Override These *********************************
	
	/**
	 * This is meant to be over riden and ONLY exit when the room is completely
	 * explored.
	 */
	public void exploreRoom() {
		
		// ********************************************************************
		// Override this method to create your own room.  This can be anything
		// that you want.  The only restriction is when the room is 'complete'
		// you must return from this function.
		// ********************************************************************
		
		System.out.println("You enter a bleak grey room.");
		System.out.println("There is nothing here, you might as well exit.");
	}

}
