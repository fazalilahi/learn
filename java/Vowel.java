import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Vowel {
	
	private String string;
	private final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	
	public Vowel(String string) {
		this.string = string;
	}
	
	public void removeVowels() {
		for (char letter : string.toCharArray()) {
			boolean isVowel = false;
			for (char vowel : VOWELS) {
				if ((letter == vowel)){
					isVowel = true;
				}
			}
			if (!isVowel)
				System.out.print(letter);
		}
	}
	
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		System.out.println("Enter the String: ");
		Vowel str = new Vowel(br.readLine());
		str.removeVowels();
	}
}