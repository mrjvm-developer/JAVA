public class WhileLoops {

	public static void main(String[] args) {
		int i = 1;
		while( i <= 10 ) {
			System.out.println(i);
			i = i + 1;
		}
		
		int j = 11;
		do {
			System.out.println(j);
			j = j + 1;
		}while (j <= 10);
	}
}