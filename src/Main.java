public class Main {

    public static void main(String[] args) {
        C[] array = {new A(), new B(), new C(), new D()};
        for(C a: array) {
            foo(a);
        }
    }

    public static void foo(C e) {
        System.out.println(e.getClass()); //tells the actual (dynamic type) of object e
        System.out.println(e); //e.toString()
        e.method1(); //calls method1 of actual type of e (not necessarily C's method1)
        e.method2();
        System.out.println("-------");
    }
}
