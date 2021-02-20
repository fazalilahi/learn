import java.io.*;
public class Merge {
    public static void main (String[] args)throws IOException{
        int first, i, j, second;
        int a1[] = new int [50];
        int a2[] = new int [50];
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter length of 1st array :");
        first = Integer.parseInt(br.readLine());
        System.out.println("Enter array elements");
        for (i=0; i<first; i++) {
            a1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter length of 2nd array");
        second = Integer.parseInt(br.readLine());
        System.out.println("Enter array elements");
        for(j=0; j<second; j++)
            a2[j] = Integer.parseInt(br.readLine());

        int merged[] = new int[50];
        for(i=0; i<first; i++)
            merged[i] = a1[i];

        for(j=0; j<second; j++)
            merged[j+first] = a2[j];

        System.out.println("merged array: ");
        for (i=0; i<(first+second); i++)
            System.out.println(merged[i]);

    }
}