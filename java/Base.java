import java.io.*;
public class Base {
    public static String numberToSymbol(int number) {
        switch (number)
        {
            case -1:
                return "";
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return String.valueOf(number);
        }
    }
    public static void convert (int decimal, int base){
        int result = -1;
        if (decimal>0)
        {
            result = (decimal%base);
            convert((decimal/=base),base);
        }
        System.out.println(numberToSymbol(result));
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter the Integer");
        int dec = Integer.parseInt(br.readLine());
        System.out.println("\nBinary ");
        convert(dec,2);
        System.out.println("\nOctal ");
        convert(dec,8);
        System.out.println("\nHexadecimal ");
        convert(dec,16);
    }
}