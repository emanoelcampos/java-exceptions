package exception.extra.module.error.test;

//Error é algo que acontece com a JVM e não é possível recuperar em tempo de execução
//A solução é consertar seu código

public class StackOverFlowTest01 {

    public static void recursividade() {
        System.out.println("Estou chamando a mim mesmo!");
        recursividade();
    }

    public static void main(String[] args) {

        recursividade();
    }
}
