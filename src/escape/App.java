package escape;

import java.util.ArrayList;

import escape.rooms.*;

public class App {
	
	/**
	 * Main application loop.
	 */
	public static void main(String args[]) {
		boolean escaped = false;
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		
		addStudentRooms(rooms);
		rooms.add(new ExitRoom());
		
		// Loop up to the second to last room, linking rooms as we go
		for (int i = 0; i < (rooms.size() - 1); i++) {
			rooms.get(i).setExit(rooms.get(i+1));
		}
		
		// Set the starting room
		Room currentRoom = rooms.get(0);
		
		// Keep going through rooms until we hit the final room
		// The final room doesn't have an exit, so quit.
		do {
			// This shouldn't return until the room is done
			System.out.println("\n----- Welcome to " + currentRoom.getRoomName() + " -----\n");
			currentRoom.exploreRoom();
			
			// Did we escape?
			if (currentRoom.isFinalRoom()) {
				escaped = true;
			} else {
				currentRoom = currentRoom.getNextRoom();
			}
			
			System.out.println("\n------------------------------------------------------------\n");
		} while (!escaped);

		System.out.println("Exiting...");
	}
	
	/**
	 * Adds student generated rooms to the list of rooms to explore.
	 * 
	 * MODIFY THIS FUNCTION TO ADD ROOMS
	 * 
	 * @param rooms The array of rooms to add to
	 */
	public static void addStudentRooms(ArrayList<Room> rooms) {
		// ****************************************************
		// * ADD YOUR ROOMS HERE
		// ****************************************************
		// Use: rooms.add(new [Your Class]());
		// Example:
		rooms.add(new ReneesRoom());
	}
}
