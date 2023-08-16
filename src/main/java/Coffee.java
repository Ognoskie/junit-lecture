public class Coffee {

	private String name;
	private String roast;
	private double price;

	public Coffee () {}

	public Coffee (String name, String roast, double price) {
		this.name = name;
		this.roast = roast;
		this.price = price;
	}


	public String getName() {
		return this.name;
	}

	public String getRoast() {
		return this.roast;
	}

	public double getPrice() {
		return price;
	}
}
