package module3.throwin.exceptions;

public class Flow {
    public static void main(String[] args) {
        System.out.println("start of the main");
        try {
            method1();
        } catch (ArithmeticException | NullPointerException exception) {
            String mesage = exception.getMessage();
            System.out.println("exception " + mesage);
            exception.printStackTrace();
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

        throw new ArithmeticException("arithmetic exception");

        //System.out.println("end of the method 2");
    }

}
