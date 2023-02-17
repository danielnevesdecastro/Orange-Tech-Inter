package desafio.intermediario;

import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        for (int i = 0; i < array.length; i++) {
            array = frase.split("/");
        }

        System.out.print("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
    }

}
