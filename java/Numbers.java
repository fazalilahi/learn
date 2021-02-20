import java.io.*;
public class Numbers {
    public static void main(String[] args) throws IOException {
        int temp1, temp2, num1, num2, hcf, lcm, temp = 0;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter First Number");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter Second Number");
        num2 = Integer.parseInt(br.readLine());
        temp1 = num1;
        temp2 = num2;
        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        hcf = temp;
        lcm = (num1* num2)/hcf;
        System.out.println("HCF of numbers: "+hcf);
        System.out.println("LCM of numbers: "+lcm);
    }
}