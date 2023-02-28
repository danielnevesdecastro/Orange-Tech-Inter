package exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 3, 2, 8};

        try {
            for (int i = 0; i < denominador.length; i++) {
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
                try {
                    if (numerador[i] % 2 != 0) {
                        throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);
                    }
                }catch (DivisaoNaoExataException e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Impossível dividir por zero:\nErro:" + e.getCause());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("índice maior que o array\nErro:" + e.getCause());
        } finally {
            System.out.println("Chegou no Finnaly");
        }


        System.out.println("O programa continua ...");
    }
}
