import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Capital:");
        Scanner cap = new Scanner(System.in);
        double capval = cap.nextDouble();
        System.out.print("Annual Intrest Rate:");
        Scanner air = new Scanner(System.in);
        double airval = air.nextDouble();
        System.out.print("Period (Years):");
        Scanner period = new Scanner(System.in);
        double periodval = period.nextDouble();

        double r = (airval/(double)100)/(double)12;
        double a = (double)1+r;
        double mval = (r * Math.pow(a, periodval)) / ((Math.pow(a, periodval)) - (double)1);
        System.out.println("Mortgage:" + mval);
    }
}
