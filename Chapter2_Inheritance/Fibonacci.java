import java.util.Arrays;

public class Fibonacci {
    // Determine if a number is Fibonacci and find it's order
    public static boolean isPerfectSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }
    public static boolean isFibo(int n) {
        if(n < 0) return false;
        if(n == 0 || n == 1) return true;
        int a = 0, b = 1;
        while(b < n) {
            int temp = b;
            b += a;
            a = temp;
        }
        return b == n;
    }
    public static int findFiboIndex(int n) {
        if(n < 0) return -1;
        if(n == 0) return 0;
        if(n == 1) return 1;
        int a = 0, b = 1, idx = 1;
        while(b < n) {
            int temp = b;
            b += a;
            a = temp;
            idx++;
        }
        return (b == n) ? idx : -1;
    }
    public static int[] generateFibonacci(int n) {
        if(n == 0) {
            return new int[]{0};
        } else if(n == 1) {
            return new int[] {0, 1};
        } else {
            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i < n; i++) {
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
        int[] fiboArr = generateFibonacci(n);
        boolean[] checkArr = new boolean[n];
        int[] idxArr = new int[n];
        System.out.println(Arrays.toString(fiboArr));
        for(int i = 0; i < n; i++) {
            checkArr[i] = isFibo(fiboArr[i]);
            idxArr[i] = findFiboIndex(fiboArr[i]);
        }
        System.out.println(Arrays.toString(checkArr));
        System.out.println(Arrays.toString(idxArr));
    }

    public static void main(String[] args) {
        int n = 50;
        tc02(n);
    }
}
