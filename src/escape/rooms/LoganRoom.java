package escape.rooms;

import java.util.Arrays;

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
		
		//Tests if the placed ship fits by checking the max value, adding it to the ship length
		//and returning true if it fits
		
		if (Direction == 0) {
			if (y-shipLength<0) {
				fits = false;
			}
			else {
				for (int i = 0; i<shipLength; i++) {
					if (computerBoard[x][y-i]==1) {
						fits = false;
					}
				}
			}
		}
		if (Direction == 1) {
			if (x+shipLength>computerBoard.length) {
				fits = false;
			}
			else {
				for (int i = 0; i<shipLength; i++) {
					if (computerBoard[x+i][y]==1) {
						fits = false;
					}
				}
			}
		}
		if (Direction == 2) {
			if (y+shipLength>computerBoard[1].length) {
				fits = false;
			}
			else {
				for (int i = 0; i<shipLength; i++) {
					if (computerBoard[x][y+i]==1) {
						fits = false;
					}
				}
			}
		}
		if (Direction == 3) {
			if (x-shipLength<0) {
				fits = false;
			}
			else {
				for (int i = 0; i<shipLength; i++) {
					if (computerBoard[x-i][y]==1) {
						fits = false;
					}
				}
			}
		}
		
		return fits;
	}
	public int[][] placeShip (int [][] board, int x, int y, int direction, int shipLength) {
		
		for (int i = 0; i<shipLength; i++) {
			if (direction == 0) {
				board [x][y-i] = 1;
			}
			if (direction == 1) {
				board [x+i][y] = 1;
			}
			if (direction == 2) {
				board [x][y+i] = 1;
			}
			if (direction == 3) {
				board [x-i][y] = 1;
			}
		}
		return board;
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
		int [][] playerBoard = {
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
		int shipLength = 5;
		int x = 0;
		int y = 0;
		int direction = 0;
		String shipName = "";
		
		for (int i = 0; i<4; i++) {
			do {
				direction = (int)(Math.random()*4);
				x = (int)(Math.random()*computerBoard.length);
				y = (int)(Math.random()*computerBoard[1].length);
			} while(shipFits(computerBoard, x, y, direction, shipLength) == false);
			
			placeShip(computerBoard, x, y, direction, shipLength);
			
			shipLength--;
		}
		//places 4 of the five ships for the computer
		
		shipLength = 4;
		
		do {
			direction = (int)(Math.random()*4);
			x = (int)(Math.random()*computerBoard.length);
			y = (int)(Math.random()*computerBoard[1].length);
		} while(shipFits(computerBoard, x, y, direction, shipLength) == false);
		
		placeShip(computerBoard, x, y, direction, shipLength);
		
		//places the last ship. Has to be separate because there are 2 ships that are 3 units long
		
//		for (int i = 0; i<computerBoard.length; i++) {
//			for(int j = 0; j<computerBoard[1].length; j++) {
//				System.out.print(computerBoard[i][j]);
//			}
//			System.out.println();
//		}
		
		y=0;
		x = 0;
		direction = 0;
		shipLength = 5;
		//clears x for the player
		
		for (int z = 0; z<4; z++) {
			
			if (shipLength == 5) {
				shipName = "carrier";
			}
			if (shipLength == 4) {
				shipName = "battleship";
			}
			if (shipLength == 3) {
				shipName = "destroyer";
			}
			if (shipLength == 2) {
				shipName = "patrol boat";
			}
			
			for (int i = 0; i<playerBoard.length; i++) {
			for(int j = 0; j<playerBoard[1].length; j++) {
				if (playerBoard[i][j] == 1) {
					System.out.print("B  ");
				}
				else {
						System.out.print("X  ");
				}
			}
			System.out.println();
		}
			do {
					System.out.println("How many spaces from the right would you like your " + shipName + "? ");
					x  = _in.nextInt();
					System.out.println("How far down would you like your " + shipName + "? ");
					y = _in.nextInt();
					System.out.println("Would you like your " + shipName + " to go up, down, left, or right? ");
					String directionWord = _in.next();
		
					if (directionWord.equalsIgnoreCase("down")) {
						direction = 2;
					}
					if (directionWord.equalsIgnoreCase("right")) {
						direction = 3;
					}
					if (directionWord.equalsIgnoreCase("up")) {
						direction = 0;
					}
					if (directionWord.equalsIgnoreCase("left")) {
						direction = 1;
					}
			} while(shipFits(playerBoard, x, y, direction, shipLength) == false);
			
			System.out.println("placing ship");
			
			placeShip(playerBoard, x, y, direction, shipLength);
			
			shipLength--;
		}
		for (int i = 0; i<playerBoard.length; i++) {
		for(int j = 0; j<playerBoard[1].length; j++) {
			System.out.print(playerBoard[i][j]);
		}
		System.out.println();
	}
	}
	
}
