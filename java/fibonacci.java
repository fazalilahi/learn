class fibonacci {
    public static void main (String[] args) {
        int n = 10;
        int t1 = 0;
        int t2 = 1;
        int sum = 0;
        System.out.println("Upto "+n+" : ");
        while (sum <= n) {
            System.out.println(sum);
            sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
    }
}