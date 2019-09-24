public class Arrays {

	public static void main(String[] args) {
		
		String [] friends = {"Jim", "Karen", "Kevin"};
		
		System.out.println(friends);
		System.out.println(friends[0]);
		System.out.println(friends[1]);
		System.out.println(friends[2]);
		System.out.println(friends.length);
		
		friends[0] = "Mike";
		
		System.out.println(friends[0]);
		
		String [] friends1 = new  String[3];
		
		friends1[0] = "Mike";
		friends1[1] = "Karen";
		friends1[2] = "Kevin";
		
		System.out.println(friends1[0]);
		System.out.println(friends1[1]);
		System.out.println(friends1[2]);
	}
}