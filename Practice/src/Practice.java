public class Practice {

	public static void main(String[] args) {
		System.out.println(convert(1));
		System.out.println(convert(2));
		System.out.println(convert(3));
	}
	
	public static String convert(int number) {
		if(number == 1) {
			return "Monday";
		}
		else if(number == 2) {
			return "Tuesday";
		}
		else {
			return "Wednesday";
		}
	}
}