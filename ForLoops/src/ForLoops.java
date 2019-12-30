public class ForLoops {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("While Loop");
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		System.out.println("Foor Loop");
		for(int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		System.out.println();
		
		String [] friends = {"Walter", "Starr", "Jerrard", "Jeremy"};
		for(int k = 0; k < friends.length; k++) {
			System.out.println(friends[k]);
		}
	}
}