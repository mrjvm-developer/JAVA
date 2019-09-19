
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
		System.out.println(phrase.charAt(4));
		System.out.println(phrase.indexOf("affe"));
		System.out.println(phrase.lastIndexOf("a"));
		System.out.println(phrase.substring(8));
		System.out.println(phrase.substring(8, 11));
		System.out.println(phrase.substring(0, phrase.indexOf(" ")));
	}
}