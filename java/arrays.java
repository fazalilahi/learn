import java.io.*;
public class arrays {
    public static void main(String[] args) throws IOException {
        int i, j, length, temp;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        System.out.println("Enter length of array :");
        length = Integer.parseInt(br.readLine());
        int arr[] = new int [length];
        System.out.println("Enter the elements");
        for (i=0; i<length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (i=0; i<length; i++) {
            for (j=i+1; j<length; j++) {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Smallest : "+arr[0]);
        System.out.println("Largest : "+arr[length-1]);
        System.out.println("Second largest : "+arr[length-2]);
    }
}