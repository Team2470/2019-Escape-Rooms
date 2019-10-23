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
	public boolean shipFits(int [][] computerBoard, int x, int y, int Direction, int shipLength) {
		boolean fits = true;
		
		if (Direction == 0) {
			if (y-shipLength<0) {
				fits = false;
			}
		}
		if (Direction == 1) {
			if (x+shipLength>computerBoard.length) {
				fits = false;
			}
		}
		if (Direction == 2) {
			if (y+shipLength>computerBoard[1].length) {
				fits = false;
			}
		}
		if (Direction == 3) {
			if (x-shipLength<0) {
				fits = false;
			}
		}
		
		return fits;
	}
	@Override
	public void exploreRoom() {
		//battleship

		int [][] computerBoard = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int shipLength = 2;
		int Direction = (int)(Math.random()*4);
		int x = (int)(Math.random()*computerBoard.length);
		int y = (int)(Math.random()*computerBoard[1].length);
		
		if (Direction == 0) {
			if (y-Shiplength<0) {
				
			}
		}
		
		_in.nextLine();
		
	}
	
}
