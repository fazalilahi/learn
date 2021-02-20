import java.io.*;

class distance {
    public static void main (String[] args) {
        int x1, x2, y1, y2;
        double dist, distance;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter x1 cordinate of point 1");
        x1 = Integer.parseInt(br.readLine());
        System.out.println("Enter x2 cordinate of point 2");
        x2 = Integer.parseInt(br.readLine());
        System.out.println("Enter y1 cordinate of point 1");
        y1 = Integer.parseInt(br.readLine());
        System.out.println("Enter y2 cordinate of point2");
        y2= Integer.parseInt(br.readLine());

        distance = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        dist = Math.sqrt(distance);

        System.out.println("Distance = "+dist);

    }
}
