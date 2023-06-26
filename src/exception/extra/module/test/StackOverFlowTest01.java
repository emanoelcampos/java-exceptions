package exception.extra.module.test;

public class StackOverFlowTest01 {

    public static void recursividade() {
        System.out.println("Estou chamando a mim mesmo!");
        recursividade();
    }

    public static void main(String[] args) {

        recursividade();
    }
}
