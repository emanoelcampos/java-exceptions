package exception.extra.module.runtime.test;

public class RuntimeExceptionTest01 {

    //Checked e Unchecked
    public static void main(String[] args) {

        //RuntimeException = Unchecked

        //NullPointerException
        Object object = null;
        System.out.println(object.toString());

        //ArrayOutOfBoundsException
        int[] numeros = {7, 3, 4, 9, 11};
        System.out.println(numeros[5]);

    }
}
