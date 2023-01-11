package Repeticao;

import java.util.Scanner;
//Exe 05
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("Tabuada de Nº ? ");
        num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mult = i * num;
            System.out.println(num + " X " + i + " = " + mult);
        }
        scan.close();

        // Forma da Professora
        // for(int i = 1; i <= 10; i = i + 1) {
        //            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
    }
}
