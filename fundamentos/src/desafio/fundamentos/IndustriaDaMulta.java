package desafio.fundamentos;

import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        String multado;
        if (velocidadeAtual > 60) {
            multado = "Foi multado";
        } else {
            multado = "Nao foi multado";
        }

        System.out.println(multado);

    }
}