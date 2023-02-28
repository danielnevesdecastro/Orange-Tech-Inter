package exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        // pela lógica de negócio, pedir reinserção dos dados;
        do {

            String a = JOptionPane.showInputDialog("Numerador:");
            String b = JOptionPane.showInputDialog("Denominador:");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));//casting pra numero inteiro
                System.out.println("Resutado: " + resultado);
                continueLooping = false;//caso o código chegue até aqui sem erro, sair do while
            } catch (NumberFormatException e) {//E = OBJETO, herda os métodos da exception
                //e.printStackTrace();//imprime exception
                JOptionPane.showMessageDialog(null, "Input inválido!\nInforme um número int!"
                        + e.getMessage());//get message : informa o erro

            } catch (ArithmeticException e) {//tipo da exeption;
                JOptionPane.showMessageDialog(null, "Impossivel dividir por 0 ! ");

            } finally {
                System.out.println("Chegou no finally");
            }
        } while (continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}

