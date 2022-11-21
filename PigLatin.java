
public class PigLatin {
	//helper method to check for vowels.
	public static boolean isVowel (char ch) {
		return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u');
	}
	//main method to do the whole translation.
	public static String translate(String str) {
		int index = 0;
	for (int i = 0; i < str.length(); i++) {
		if (isVowel(str.charAt(i))) {
			index = i;
			break;
		}else {continue;}
	}
	if (index == 0) {
		String result = (str.toLowerCase().substring(index)) + (str.toLowerCase().substring(0, index) + "way");
		return result;
	}else {
		String result = (str.toLowerCase().substring(index)) + (str.toLowerCase().substring(0, index) + "ay");
		return result;
	}
	}
	public static void main(String[] args) {
		String testWord = "yellow";      //word to pass to the method for testing while writing.
		System.out.println(translate(testWord)); // calling the method (and passing a word to it) in the main just to test it here.
	}
}