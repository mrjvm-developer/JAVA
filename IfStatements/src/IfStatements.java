public class IfStatements {

	public static void main(String[] args) {
		
		boolean isMale = true;
		boolean isTall = true;
		
		if(isMale && isTall) {
			System.out.println("You are a tall male");
		}
		
		else if(isMale && !isTall) {
			System.out.println("You are a short male");
			
		}
		
		else if(!isMale && isTall) {
			System.out.println("You are not male, but tall");
		}
		
		else {
			System.out.println("You are not male and not tall");
		}
	}
}