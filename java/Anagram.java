import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;


public class Anagram {
	
	private String s1;
	private String s2;

	public Anagram(String s1,  String s2) {
		this.s1 = s1;
		this.s2 = s2;	
	}
	
	private String sortString(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
	public boolean isAnagram() {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		s1 = sortString(s1);
		s2 = sortString(s2);
		
		s1 = s1.trim();
		s2 = s2.trim();
		
		return s1.equals(s2);
	}
	
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		System.out.println("Enter the two Strings: ");
		Anagram pair = new Anagram(br.readLine(), br.readLine());
		System.out.println("Anagram?: " + pair.isAnagram());
	}
}