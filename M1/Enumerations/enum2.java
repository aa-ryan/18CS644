enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
	public static void main(String[] args) {
		Apple ap;
		System.out.println("list of all apples: ");

		// use of values()
		Apple allapples[] = Apple.values();
		for (Apple a: allapples)
			System.out.println(a);
		System.out.println();

		// better implementation
		// for (Apple a: Apple.values())
		// 	System.out.println(a);

		// use of valueOf
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains: " + ap);
	}	
}
