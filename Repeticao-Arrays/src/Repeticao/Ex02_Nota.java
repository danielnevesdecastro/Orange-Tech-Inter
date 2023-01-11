package Repeticao;

import java.util.Scanner;
//EX02
public class Ex02_Nota {
    /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido
    e continue pedindo
    até que o usuário informe um valor válido.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        /*Minha forma,
        do {
            System.out.println("Nota de 0 a 10 ");
            nota = scan.nextInt();
        } while (nota <= 10);

        System.out.println("Nota inválido !! ");*/

        //Correção instrutora

        System.out.println("Nota de 0 a 10 ");
        nota = scan.nextInt();
        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida!!! Digite Novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota Válida!!");



    }
}
