public class Fibonacci {
    // Determine if a number is Fibonacci and find it's order
    public static boolean isPerfectSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }
    public static boolean isFibo(int n) {
        return isPerfectSquare(5 * n * n + 4)
                || isPerfectSquare(5 * n * n - 4);
    }
    public static int findFiboIndex(int n) {
        double fibo = 2.078087 * Math.log(n) + 1.672276;
        return (int) Math.round(fibo);
    }
    public static void tc01(int n) {
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for(int i = 0; i < n; i++) {
            if(isFibo(i)) {
                System.out.println( findFiboIndex(i) + ": " + i);
            } else {
//                System.out.println(i + " is not a Fibonacci number");
            }
        }
    }
    public static void main(String[] args) {
        int n = 100;
        tc01(n);
    }
}
