enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
	public static void main(String[] args) {
		Apple ap;
		ap = Apple.RedDel;

		// Output enum value
		System.out.println("Valid of ap: " + ap);

		ap = Apple.GoldenDel;

		if (ap == Apple.GoldenDel) 
			System.out.println("ap contains GoldenDel");

		switch (ap) {
			case Jonathan:
				System.out.println("Jonathan is Red");
				break;

			case GoldenDel:
				System.out.println("GoldenDel is yellow");
				break;

			case RedDel:
				System.out.println("RedDel is delicious");
				break;

			case Winesap:
				System.out.println("Winesap red");
				break;

			case Cortland:
				System.out.println("Cortland is red");
				break;
		}
	}
}
