//import java.io.*;
public class calc {
    public static void main(String[] args) {
        try {
//        InputStreamReader reader = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(reader);
//        System.out.println("Input first number:");
//        int num1 = Integer.parseInt(br.readLine());
//        System.out.println("Input second number:");
//        int num2 = Integer.parseInt(br.readLine());
          int num1 = Integer.parseInt(args[0]);
          int num2 = Integer.parseInt(args[1]);

            System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
            System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
            System.out.println(num1 + "x" + num2 + " = " + (num1 * num2));
            if (num1 > 0 && num2 > 0)
            {
                float div = num1/num2;
                System.out.println(num1 + "/" + num2 + " = " + div);
                float reminder = num1%num2;
                System.out.println(num1 + "%" + num2 + " = " + reminder);
        }
        else
                System.out.println("Please enter a non zero number");

            }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter command line arguments");
        }
    }
 }
