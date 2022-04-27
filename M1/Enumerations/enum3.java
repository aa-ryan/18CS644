enum Apple {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price;

	// constructor
	Apple (int p) { price = p; }

	int getPrice() {return price;}
}

class EnumDemo3 {
	public static void main(String[] args) {

		System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents");

		System.out.println("All apple prices: ");
		for (Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
	}
}
