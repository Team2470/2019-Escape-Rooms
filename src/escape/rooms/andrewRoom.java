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
    }

}