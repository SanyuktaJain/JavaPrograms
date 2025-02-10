package Jan2125;

public class SeparateAlphabeats {
	public static void main(String[] args) {
		
	
	String input="Sanyukta2345";
	
	String alphabets=input.replaceAll("[^a-zA-Z]", " ");
	String number=input.replaceAll("[^0-9]", " ");
	
	
	System.out.println("Alphabets: " + alphabets);
	System.out.println("numbers" + number);

	
	
	}
}
