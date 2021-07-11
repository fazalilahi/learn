import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Length {
		public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		System.out.println("Enter a the unit in Centimeters: ");
		double cm = Double.parseDouble(br.readLine());
		System.out.println(cm + "cm = "
						+ "\n" + (cm/2.54) + "inches"
						+ "\n" + (cm/100) + "meters"
						+ "\n" + (cm/100000) + "kilometers");
	}
}