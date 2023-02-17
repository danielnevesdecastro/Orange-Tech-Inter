package desafio.intermediario;

import java.util.Scanner;

public class CamarotedoBlueColdIceCubes {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.


        for(int i = 0; i <=tamanhoDaFila ; i++){
            if ( i%2 == 1){
                pessoasNoCamarote++;
            }
        }
        String msg = " pessoas no camarote";
        System.out.println(pessoasNoCamarote+msg);




    }
}
