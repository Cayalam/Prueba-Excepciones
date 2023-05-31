package explicación;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExepciónVerificada {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("hola.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no pudo ser encontrado.");
            e.printStackTrace();
        }
    }
}