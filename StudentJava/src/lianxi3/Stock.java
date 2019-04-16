package lianxi3;

public class Stock {
  
	public String symbol;
	public String name;
	public double previousClosingPice;
	public double currentPice;
	
	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}

	public double getChanagePercent() {
		return previousClosingPice / currentPice;
	}
	
	public static void main(String[] args) {
 
		Stock sk = new Stock("ORCL", "Oracle Corporation");
		sk.previousClosingPice = 34.5;
		sk.currentPice = 34.35;
		System.out.println(sk.getChanagePercent());
	}

}
