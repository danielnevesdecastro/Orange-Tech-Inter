import java.util.Scanner;
//Exe04

/*
 *Faça um programa que peça N números inteiros,
 *calcule e mostre a quantidade de números pares
 *e a quantidade de números impares.
 */
public class Ex04_ParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numQtd,num;
        int par = 0, impar = 0;


        System.out.println("Quantos números ? ");
        numQtd = scan.nextInt();

        for (int i = 0; i < numQtd; i++) {
            System.out.println("Nº : ");
            num = scan.nextInt();

            if( num % 2 == 0){
                par++;
            } else if ( num % 2 == 1){
                impar++;
            }
        }
        System.out.println("Foram informados " +numQtd+" números");
        System.out.println(par+ " Pares\n"+impar+" Impares");

        scan.close();

        // CORREÇÃO PROFESORA:
        // Scanner scan = new Scanner(System.in);
        //
        //        int quantNumeros;
        //        int numero;
        //        int quantPares = 0, quantImpares = 0;
        //
        //        System.out.println("Quantidade de números: ");
        //        quantNumeros = scan.nextInt();
        //
        //        int count = 0;
        //        do {
        //            System.out.println("Número: ");
        //            numero = scan.nextInt();
        //
        //            if (numero % 2 == 0 ) quantPares++;
        //            else quantImpares++;
        //
        //            count++;
        //        } while(count < quantNumeros);
        //
        //        System.out.println("Quantidade Par: " + quantPares);
        //        System.out.println("Quantidade Ímpar: " + quantImpares);
    }

}
