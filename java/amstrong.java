import java.io.*;
public class amstrong {
    public static void main (String[] args) throws IOException {
       int start, end = 0;
       InputStreamReader reader = new InputStreamReader (System.in);
       BufferedReader br = new BufferedReader (reader);
        System.out.println("Enter the starting number");
        start = Integer.parseInt(br.readLine());
        System.out.println("Enter the end number");
        end = Integer.parseInt(br.readLine());
        System.out.println("Amstrong numbers between "+start+" and "+end);

        for(int number = start + 1; number < end; number++) {
            int digits = 0;
            int result = 0;
            int temp = number;

            // number of digits calculation
            while (temp != 0) {
                temp /= 10;
                digits++;
            }

            temp = number;

            // result contains sum of nth power of its digits
            while (temp != 0) {
                int remainder = temp % 10;
                result += Math.pow(remainder, digits);
                temp /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
    }
}