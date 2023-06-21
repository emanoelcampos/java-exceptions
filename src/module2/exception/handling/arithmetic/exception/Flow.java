package module2.exception.handling.arithmetic.exception;

public class Flow {
    public static void main(String[] args) {
        System.out.println("start of the main");
        try {
            method1();
        } catch (ArithmeticException arithmeticException) {
            //String mesage = e.getMessage();
            //System.out.println("ArithmeticException " + mesage);
            arithmeticException.printStackTrace();
        }
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

            int a = i / 0;
        }
        System.out.println("end of the method 2");
    }

}
