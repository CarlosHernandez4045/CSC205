package W5.DemoObject.src;

public class App {
    public static void main(String[] args) throws Exception {
        testObjectComparison1();
        testObjectComparison2();
        testObjectComparison3();
    }

    private static void testObjectComparison1() {
        double x = 123.45555D;
        long y = 9887544L;

        System.out.println("Objects are not equal, hence it returns " + (x == y));
        System.out.println("Objects are equal, hence it returns " + (x ==123.45555D));
    }

    private static void testObjectComparison2() {
        Double x = 123.45555D;
        Long y = 9887544L;

        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));
    }

    private static void testObjectComparison3() {
        Double x = 123D;
        Long y = 123L;

        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));
    }
}
