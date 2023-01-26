package arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Exe01_OrdemInversa {
    public static void main(String[] args) {
        int[] valores = new int[6];
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;
        valores[5] = 6;
        System.out.println("Contando vetores  de trás pra frente");
        //for(int i = (valores.length - 1); i >= 0; i --) opção
        for(int i = 5; i >=0 ; i-- ){
            System.out.println("Nº"+valores[i]);
        }

        System.out.println("Contando vetores  de frente para trás");
        int count = 0 ;
        while (count < valores.length){
            System.out.println("Nº "+ valores[count]);
            count++;
        }
    }
}
