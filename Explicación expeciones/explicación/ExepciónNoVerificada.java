package explicación;

public class ExepciónNoVerificada {
   
        public static void main(String[] args) {
            int[] numeros = { 1, 2, 3 };
            try {
                int result = numeros[5];
                System.out.println("El resultado es: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Se produjo una excepción: índice no encontrado!!!!.");
                e.printStackTrace();
            }
    }
}

