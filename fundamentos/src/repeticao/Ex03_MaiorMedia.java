package repeticao;

import java.util.Scanner;

//EX03
public class Ex03_MaiorMedia {
    /*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, media;
        int cont = 0, soma = 0;
        int maior = 0;

        System.out.println("Informe 5 Números ... ");

        do {
            System.out.println("Nº");
            num = scan.nextInt();

            soma += num;

            if (num > maior) {
                maior = num;
            }

            cont++;
        } while (cont < 5);

        media = soma / 5;

        System.out.println("Mario Nº: " + maior +
                " Média: " + media);
        scan.close();
    }
}
