package escape.rooms;

import java.util.Random;
public class StockMarkets {
	Random rand = new Random();
	public StockMarkets( String name, String initials) {
		_name = name;
		_initials = initials;
		_price = rand.nextInt(100) + 1 * 100;
	}
	
	public String getString() {
		return String.format("%-30s | %-5s | %-15d", _name, _initials, _price);
	}
	
	public int buyStock(int money) {
		return money-_price;
	}
	
	public int sellStock(int money) {
		return money+_price;
	}

	private String _name = "Null";
	private String _initials = "NA";
	private int _price = -1;

}
