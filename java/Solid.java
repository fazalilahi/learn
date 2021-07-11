import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Solid {
	
	private final double PI = 3.14;
	
	public double getVolume(double edge) {
		return Math.pow(edge, 3);
	}
	
	public double getVolume(double height, double breadth, double depth) {
		return (height * breadth * depth);
	}
	
	public double getVolume(double radius, double height) {
		return (PI * Math.pow(radius, 2) * height);
	}
	
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		double volume;
		System.out.println("Voulume of \n1. Cube \n2. Rectangular Box \n3. Cylinder"
						+ "\n Enter an Option: ");
		String option = br.readLine();
		switch(option) {
			case "1": System.out.println("Enter the edge: ");
				Solid cube = new Solid();
				volume = cube.getVolume(Double.parseDouble(br.readLine()));
				break;
				
			case "2": System.out.println("Enter the height, breadth, depth: ");
				Solid box = new Solid();
				volume = box.getVolume(Double.parseDouble(br.readLine()),
							Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
				break;
				
			case "3": System.out.println("Enter the radius, height: ");
				Solid cylinder = new Solid();
				volume = cylinder.getVolume(Double.parseDouble(br.readLine()),
							Double.parseDouble(br.readLine()));
				break;
			
			default: return;
		}
		System.out.println("Volume = " + volume);
	}
}
