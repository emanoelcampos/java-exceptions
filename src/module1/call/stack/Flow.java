package module1.call.stack;

public class Flow {
    public static void main(String[] args) {
        System.out.println("start of the main");
        method1();
        System.out.println("end of the main");
    }

    public static void method1() {
        System.out.println("start of the method 1");
        method2();
        System.out.println("end of the method 1");
    }

    public static void method2() {
        System.out.println("start of the method 2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("end of the method 2");
    }

}
