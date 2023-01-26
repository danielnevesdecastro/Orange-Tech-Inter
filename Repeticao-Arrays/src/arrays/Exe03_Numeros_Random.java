package arrays;

import java.util.Random;

public class Exe03_Numeros_Random {
    public static void main(String[] args) {
        /*
         *Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
         *Ao final mostre os números e seus sucessores.
         */
        // Classe que gera numeros aleatorios
        Random random = new Random();
        int[] numRandom = new int[20];


        for (int i = 0; i < numRandom.length; i++) {
            //bound = nº maximo para geração aleatorio ( no caso 0 a 100)
            int numero = random.nextInt(100);
            numRandom[i] = numero;
            //para exibição teste
            int j = i;
            j++;
            System.out.println("N" + j++ + ":" + numRandom[i]);
        }

        System.out.println("____________");
        System.out.println("Nº Random: ");
        for (int numero : numRandom){
            System.out.print(numero + " ");
        }

        System.out.println("\n____________");
        System.out.println("Nº Sucessores:");
        for (int numero : numRandom){
            int sucessor = numero;
            sucessor++;
            System.out.println(numero+" - Sucessor:"+sucessor);

        }

        System.out.println("\n____________");
        System.out.println("Nº Antecessores:");
        for (int num : numRandom){
            int antecessor = num;
            System.out.println(num + " - Antecessor: "+ (--antecessor) );
        }

    }
}
