package desafio;

import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();

        int doce = 2;
        int qtd = dinheiro * doce;
        System.out.println("O cliente obteve "+qtd+" doces");
    }
}