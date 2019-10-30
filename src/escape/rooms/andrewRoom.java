package escape.rooms;

import escape.Room;

public class andrewRoom extends Room{

    /**
     * create room
     */
	//TODO set random positions for pit and wumpus
	 String [][] cavernMap = {
     		{"|","X","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","!","|"},
     		{"|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|"},
     		{"|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|"},
     		{"|","-","_","|","-","!","|","-","_","|","-","_","|","-","_","|","-","!","|","-","!","|","-","!","|"},
     		{"|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|","-","!","|","-","%","|","-","!","|"},
     		{"|","-","_","|","-","_","|","-","_","|","-","!","|","-","_","|","-","!","|","-","!","|","-","!","|"},
     		{"|","-","_","|","-","_","|","-","!","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|"},
     		{"|","-","#","|","-","#","|","-","#","|","-","!","|","-","_","|","-","_","|","-","_","|","-","_","|"},
     		{"|","-","#","|","-","*","|","-","#","|","-","_","|","-","_","|","-","_","|","-","_","|","-","_","|"},
     		{"|","-","#","|","-","#","|","-","#","|","-","_","|","-","_","|","-","_","|","-","!","|","-","_","|"}};
     
     String[][] shownMap = {
     		{"|","X"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"},
     		{"|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|","-"," ","|"}};

    public andrewRoom(){
        super("Wumpus caverns");
    }

    //*****************************Override Functions*******

    /**
     * custom exploration of room
     */

    @Override
    public void exploreRoom(){
    	
    	/*
        System.out.println("You enter a series of caverns");
        System.out.print("Press Enter...");

        _in.nextLine();
        
        System.out.println("You are in the first cavern");
        System.out.println("In one cavern resides a monster called a wumpus. To exit this area, you must hunt and defeat him");
        System.out.print("Press Enter...");

        _in.nextLine();
        
		
        System.out.println("The wumpus is surrounded by it's blood denoted with !. You can use these clues to find it, but avoid slime pits, which are surrounded by #");
        System.out.println("You are the X. Move with WASD");
        System.out.println("When you think you know where he is, press x to shoot your arrow. You will always shoot one cavern to the right.");
        System.out.print("Press Enter...");

        _in.nextLine();
        
        System.out.println("\n");
        System.out.println("If you miss, you lose.");
        System.out.println("If you walk into his cavern, you lose.");
        System.out.println("If you fall into a slime pit, you lose.");
        System.out.println("\n");
        System.out.print("Press Enter...");

        _in.nextLine();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Good Luck");
        */
        
        boolean end = false;
        boolean moveOn = false;
        int priorX = 1;
        int priorY = 0;
        
      while(!moveOn) {
    	  
    	  priorX = 1;
    	  priorY = 0;
    	  printArray(shownMap);
    	  
    	  while(!end) {
    		  
    		  System.out.println("Move or shoot (WASD/X)");
    		  
          	String move =  _in.nextLine();
          	
          	System.out.println(move);
          	
          	if(move == "W" ) {
          		if(priorY == 0) {
          			shownMap [priorX][priorY] = "-";
          			shownMap [priorX][9] = "X";
          			priorY = 9;

          		}else {
          			shownMap [priorX][priorY] = "-";
          			shownMap [priorX][priorY - 1] = "X";
          			priorY--;
          		}
          		if(cavernMap[priorX + 1][priorY] != " " ) {
          			shownMap[priorX + 1][priorY] = cavernMap[priorX + 1][priorY];
          		}
          	}
          	if(move == "A" ) {
          		
          		if(priorX == 0) {
          			shownMap [priorX][priorY] = "-";
          			shownMap [22][priorY] = "X";
          			priorX = 22;

          		}else {
          			shownMap [priorX][priorY] = "-";
              		shownMap [priorX - 3][priorY] = "X";
              		priorX -= 3;
          		}
          		if(cavernMap[priorX + 1][priorY] != " " ) {
          			shownMap[priorX + 1][priorY] = cavernMap[priorX + 1][priorY];
          		}
          	}
          	if(move == "S" ) {
          		
          		if(priorY == 9) {
          			shownMap [priorX][priorY] = "-";
          			shownMap [priorX][9] = "X";
          			priorY = 0;

          		}else {
          			shownMap [priorX][priorY] = "-";
              		shownMap [priorX][priorY + 1] = "X";
              		priorY++;
          		}
          		if(cavernMap[priorX + 1][priorY] != " " ) {
          			shownMap[priorX + 1][priorY] = cavernMap[priorX + 1][priorY];
          		}
          	}
          	if(move == "D" ) {
          		if(priorX == 22) {
          			shownMap [priorX][priorY] = "-";
          			shownMap [1][priorY] = "X";
          			priorX = 1;

          		}else {
          			shownMap [priorX][priorY] = "-";
              		shownMap [priorX + 3][priorY] = "X";
              		priorX += 3;
          		}
          		if(cavernMap[priorX + 1][priorY] != " " ) {
          			shownMap[priorX + 1][priorY] = cavernMap[priorX + 1][priorY];
          		}
          	}
          	if(move == "x") {
          		if(priorX == 19 && priorY == 4) {
          			System.out.println("You win and can move on to the next room");
          			moveOn = true;
          		}else {
          			System.out.println("You missed.");
          			System.out.println("Resetting room...");
          			 try {
          					Thread.sleep(5000);
          				} catch (InterruptedException e) {
          					// TODO Auto-generated catch block
          					e.printStackTrace();
          				}
          		        }
          		}
          		
          	printArray(shownMap);
          	}
          	
    	  
          	
          	if(priorX == 20 && priorY == 4) {
          		end = true;
          		System.out.println("The wumpus ate you");
          		System.out.println("Resetting room...");
          	}
          	if(priorX == 5 && priorY == 8) {
          		end = true;
          		System.out.println("You fell in a slime pit");
          		System.out.println("Resetting room...");
          	}
        		
          
          //Print full map
          	printArray(cavernMap);
    	  
      }
        
        
		
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    //not quite working
    //TODO fix printing Arrays
    public void printArray(String[][] array) {
    	int i,j;
    	for(i = 0; i < 9; i++) {
    		for(j = 0; j < 24; j++) {
    			if(array == cavernMap) {
    				System.out.println(cavernMap[j][i] + " ");
    			}else if(array == shownMap) {
    				System.out.println(shownMap[j][i] + " ");
    				
    			}
    		}
    		System.out.println("\n");
    	}
    	
    }
    
    }
