public class DynamicBinding {
    class A {
        public int n;
        public int f1() {
            n += 4;
            int m = f2();
            return n + m + 1;
        }
        public int f2() {
            n += 1;
            return n;
        }
        public int f3() {
            f1();
            return n;
        }
    }
    class B extends A {
        public int f1() {
            n -= 4;
            int m = f2();
            return n - m;
        }
        public int f2() {
            n += n;
            return n;
        }
        public int f3() {
            f2();
            return n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Dynamic Binding: ");
        A b =;
        b.n = 4;
        System.out.println(b.f3());
    }
}
