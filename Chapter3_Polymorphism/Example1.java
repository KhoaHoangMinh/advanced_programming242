public class Example1 {
    // Demonstrates the concept of dynamic binding in Java
    static class A{
        protected int n;
        public int getN() {
            return n;
        }
        public void setN(int n){
            this.n = n;
        }
        public int f() {
            return ++n;
        }
        public int f2() {
            return f();
        }
    }
    static class B extends A{
        public int f() {
            return --n;
        }
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setN(2);
        b.setN(2);

        a.f2();
        b.f2();
        System.out.println(a.getN() + " " + b.getN());
    }
}
