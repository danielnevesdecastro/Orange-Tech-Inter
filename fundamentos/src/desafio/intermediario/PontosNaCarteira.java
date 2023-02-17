package desafio.intermediario;

import java.util.Scanner;

public class PontosNaCarteira {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        //TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        if (velocidade > 80 ) {
            multas++;
        }

        //TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
        boolean multado = multas >= 3 ? true : false;
        String msgMulta= multado == true ? " multas. Levou pontos na carteira": " multas. Nao levou pontos na carteira";

        System.out.println(multas + msgMulta);

    }
}
