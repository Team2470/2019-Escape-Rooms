package escape.rooms;

import escape.Room;

import java.util.Arrays;
import java.util.ArrayList;

public class ReneesRoom extends Room{
	
	//Create my room
	public ReneesRoom() {
		super("Renee's Room");
	}

	//.....Override Functions .......
	//Renee's custom exploration room
	
	@Override
	
	public void exploreRoom() {
		/* -----------------Fancy Introduction to Game ------------*/
		String command = "BEEP BEEEP BOOOOP BOOOP\n";
		for(int i = 0; i < command.length(); i++) {
			System.out.print(command.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// If we interrupt this thread, we don't care, so continue
			}
		}
		
		System.out.println("Welcome to the Stock Market!");
		System.out.println("You have 10,000 dollars! Your goal is to become a billionare.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// If we interrupt this thread, we don't care, so continue
		}
		String silk = "Good Luck!\n\n";
		for(int i = 0; i < silk.length(); i++) {
			System.out.print(silk.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// If we interrupt this thread, we don't care, so continue
			}
		}
		/*------------------------------Game Begins -----------------------------*/
		boolean playing = true;

		while(playing) {
			/*------------Create Each Stock Market-----------------*/
			StockMarkets RT = new StockMarkets("Rich Tycoon", "RT");
			StockMarkets ME = new StockMarkets("Monopoly Encorporated", "ME");
			StockMarkets ZVE = new StockMarkets("Zach's Vision Electronics", "ZVE");
			StockMarkets MSE = new StockMarkets("Marc's Salon Empire", "MSE");
			StockMarkets KR = new StockMarkets("King Renee", "KR");
			
			/*---------------Formatting ---------------------*/
			StockMarkets stockmarkets[] = {RT, ME, ZVE, MSE, KR};
			
			System.out.println(String.format("%-30s | %-5s | %-15s", "STOCK NAME", "INITI", "PRICE"));
			for(int i= 0; i < 5; i++) {
				StockMarkets sm = stockmarkets[i];
				System.out.println(sm.getString());
			}
			/*----------------Player Interaction ------------------*/
			int money = 100000;
			ArrayList<String> ssm = new ArrayList<>(Arrays.asList("RT", "ME", "ZVE","MSE","KR"));
			boolean player = true;
			while(player) {
			System.out.println("Your Money: " + money);
			System.out.println("\n Would you like to buy a stock? If yes, type stocks initials. If no, press n.");
			String answer_B = _in.next();
			if (answer_B != "n") {
				int index = ssm.indexOf(answer_B);
				
				money = stockmarkets[index].buyStock(money);
				System.out.println(money);
			}
			
			System.out.println("\n Would you like to sell a stock? If yes, type stocks initials. If no, press n.");
			String answer_S = _in.next();
			if (answer_S != "n") {
				int index = ssm.indexOf(answer_S);
				
				money = stockmarkets[index].sellStock(money);
			}
			
			System.out.println("Are you finished?(y/n)");
			String answer = _in.next();
			if(answer == "y") {
				player = false;
			}
			
			}
		playing = false;
		}
		
		/*-----------------Closure ------------------*/
		System.out.println("Press Enter to Continue.....");
		
		_in.nextLine();
		}
}
