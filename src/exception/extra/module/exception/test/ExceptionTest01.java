package exception.extra.module.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    public static void main(String[] args) {

        //Exception = Checked
        criarNovoArquivo();

    }

    public static void criarNovoArquivo() {

        File file = new File("src/exception/extra/module/file\\exception.txt");

        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado na pasta file: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
