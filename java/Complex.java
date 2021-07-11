import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Complex {
	public int a;
	public int b;
	
	public Complex(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void printNumber() {
		System.out.println(a + "+" + b + "i");
	}
	
	public Complex add(Complex num) {
		return new Complex((a + num.a),(b + num.b));
	}
	
	public static void main(String[] args) throws Exception{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		System.out.println("Enter a and b of first number: ");
		Complex num1 = new Complex(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
		System.out.println("Enter a and b of second number: ");
		Complex num2 = new Complex(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
		System.out.print("Sum:  ");
		(num1.add(num2)).printNumber();
	}
}