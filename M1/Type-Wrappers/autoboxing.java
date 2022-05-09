import java.util.ArrayList;
class Autoboxing {
	public static void main(String[] args) {
		char ch = 'a';
 
		// Autoboxing primitive to Character object coversion
		Character a = ch;
		System.out.println(a);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		// Autoboxing because arraylist stores only objects
		arr.add(25);

		System.out.println(arr.get(0));
	}
}
