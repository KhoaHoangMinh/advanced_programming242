public class Fibonanci {
    // Determine if a number is Fibonan and find it's order
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
    public static void main(String[] args) {
        int n = 21;
        System.out.println(findFiboIndex(n));
    }
}
