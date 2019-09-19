
public class Strings {

	public static void main(String[] args) {
		String phrase = "Giraffe Academy";
		
		System.out.println("Giraffe \nAcademy");
		System.out.println("Giraffe \"Academy\"");
		System.out.println("Giraffe \\ Academy");
		System.out.println("Giraffe "
				+ "\\ Academy");
		
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase.length());
		System.out.println(phrase.contains("dog"));
	}
}