package escape.rooms;

import escape.Room;

public class andrewRoom extends Room{

    /**
     * create room
     */

    public andrewRoom(){
        super("Cavern");
    }

    //*****************************Override Functions*******

    /**
     * custom exploration of room
     */

    @Override
    public void exploreRoom(){

        System.out.println("You enter a series of caverns");
        System.out.print("Press Enter...");

        _in.nextLine();
        
        System.out.println("You are in the first cavern");
        System.out.println("In one cavern resides a monster called a wumpus. To exit this area, you must hunt and defeat him");
        System.out.print("Press Enter...");

        _in.nextLine();
        
		
        System.out.println("The wumpus is surrounded by it's blood denoted with !. You can use these clues to find it, but avoid slime pits, which are surrounded by #");
        System.out.println("You are the X. Move with WASD");
        System.out.println("When you think you know where he is, press x to shoot your arrow. You will always shoot to the right.");
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
        
        boolean end = false;
        int priorX = 1;
        int priorY = 0;
        
      
        
        while(!end) {
        	
        	String move =  _in.nextLine();
        	if(move == "W" ) {
        		shownMap [priorX][priorY] = "_";
        		shownMap [priorX][priorY - 1] = "X";
        		priorY--;
        	}
        	if(move == "A" ) {
        		shownMap [priorX][priorY] = "_";
        		shownMap [priorX - 3][priorY] = "X";
        		priorX -= 3;
        	}
        	if(move == "S" ) {
        		shownMap [priorX][priorY] = "_";
        		shownMap [priorX][priorY + 1] = "X";
        		priorY++;
        	}
        	if(move == "D" ) {
        		shownMap [priorX][priorY] = "_";
        		shownMap [priorX + 3][priorY] = "X";
        		priorX += 3;
        	}
        	//TODO print array here
        	
        	if(priorX == 20 && priorY == 4) {
        		end = true;
        		System.out.println("The wumpus ate you");
        	}
        	if(priorX == 5 && priorY == 8) {
        		end = true;
        		System.out.println("You fell in a slime pit");
        	}
        }
        
        //TODO print full map
	
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    }
