public class Return {

	public static void main(String[] args) {
		int myNum = cube(3);
		System.out.println(cube(2));
		System.out.println(myNum);
		System.out.println();
		
		String myName = cube1(3);
		System.out.println(myName);
		System.out.println();
		
		boolean myBoolean = cube2(3);
		System.out.println(myBoolean);
	}
	
	public static int cube(int numberToCube) {
		System.out.println("Top");
		return numberToCube * numberToCube * numberToCube;
	}
	
	public static String cube1(int numberToCube1) {
		System.out.println("Top");
		return "Hello Jeremy!";
	}
	
	public static boolean cube2(int numberToCube2) {
		System.out.println("Top");
		return true;
	}
}