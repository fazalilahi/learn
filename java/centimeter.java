import java.io.*;
public class centimeter{
    public static void main (String[] args) throws IOException {
        double cm, m, km, in;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter length in centimeter ");
        cm = Double.parseDouble(br.readLine());
        in = cm/2.54;
        m = cm/100;
        km = cm/100000;
        System.out.println("Length in inch = "+in);
        System.out.println("Length in meter = "+m);
        System.out.println("Length in kilometer = "+km);
    }
}