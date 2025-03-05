import java.util.Arrays;

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
    public static int[] generateFibonacci(int n) {
        if(n == 0) {
            int[] arr = new int[1];
            arr[0] = 0;
            return arr;
        } else if(n == 1) {
            int[] arr = new int[2];
            arr[0] = 0;
            arr[1] = 1;
            return arr;
        } else {
            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;

            for(int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr;
        }

    }
    public static void tc01(int n) {
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for(int i = 0; i <= n; i++) {
            if(isFibo(i)) {
                System.out.println( findFiboIndex(i) + ": " + i);
            } else {
//                System.out.println(i + " is not a Fibonacci number");
            }
        }
    }
    public static void tc02(int n) {
        int[] arr = new int[n + 1];
        int[] fiboArr = generateFibonacci(n);
        int[] idx = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(fiboArr));
        for(int i = 0; i < n + 1; i++) {
            idx[i] = findFiboIndex(fiboArr[i]);

        }
        System.out.println(Arrays.toString(idx));
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int n = 10;
        tc02(n);
    }
}
