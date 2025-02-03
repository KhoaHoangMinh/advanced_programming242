// TODO: convert assignmentOperator.cpp to Java
public class CppToJava {
    public static class A {
        protected int a;
        public A() {
            a = 10;
        }
        public int f() {
            return ++a;
        }
        public int getA() {
            return a;
        }
    }
    public static class B extends A {
        @Override
        public int f() {
            return --a;
        }
    }
    public static void main(String[] args) {
        int n;
        A a = new A();
        A a2 = new A();
        B b = new B();

        a.f();
        b.f();
        a2 = b;
        a2.f();

        System.out.println(a.getA() + " " + b.getA() + " " + a2.getA());

        // Ouput 11 8 8
    }
}
