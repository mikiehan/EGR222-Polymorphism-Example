public class D extends B{
    @Override
    public void method1() {
        System.out.println("d1");
        super.method2();
    }

    @Override
    public void method2() {
        System.out.println("d2");
    }
}
