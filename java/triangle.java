import java.io.*;
class triangle {
    public static void main (String[] args) throws IOException{
        int s1, s2, s3;
        double s, area;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter the sides :");
        s1 = Integer.parseInt(br.readLine());
        s2 = Integer.parseInt(br.readLine());
        s3 = Integer.parseInt(br.readLine());
        if (s1==s2 && s2==s3)
            System.out.println("Equilateral triangle");
        else if (s1==s2 || s2==s3 || s3==s1)
            System.out.println("Isocale triangle");
        else
            System.out.println("Scalene triangle");

        s = (s1+s2+s3)/2.0;
        area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("Area is "+area);

    }
}