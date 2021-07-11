import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Digits {
	
	private int number;
	
	public Digits(int number) {
		this.number = number;
	}
	
	
	public int sum() {
		int num = number;
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}
	
	public int reverse() {
		int num = number;
		int reverse = 0;
		while(num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}
		return reverse;
	}
	
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		System.out.println("Enter the number: ");
		Digits number = new Digits(Integer.parseInt(br.readLine()));
		System.out.println("\nSum of Digits: " + number.sum()
						+ "\nReverse of Digits: " + number.reverse());
	}
}
