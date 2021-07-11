import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Item {
	
	public static int count = 0;
	
	public Item() {
		count++;
	}
	
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		String option;
		do {
			Item obj = new Item();
			System.out.println("Objects Created: " + count 
							+ "\nCreate another Object? (Y/N): ");
			option = br.readLine();
		}while(option.equalsIgnoreCase("Y"));
	}
}