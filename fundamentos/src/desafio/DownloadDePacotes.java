package desafio;

import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        // TODO: Crie a condição necessária para que, de acordo com o tamanho,
        //  seja printado no console barras representando o download

        String porcentagem = "/" ;

        for (int i = 0 ; i < tamanho; i++)
        System.out.print(porcentagem);
    }
}
