package desafio.intermediario;

import java.util.Scanner;

public class SalvandoMusicas {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        // TODO: Crie a condição necessária para verificar o formato do arquivo de entrada
        String acao;
        if (arquivoDoPc.endsWith(".mp3")){//endsWitch , verifica os caracteres no final da string , retorna boolean
            acao = "Salvar";
        }else{
            acao = "Deletar";
        }
        System.out.println(acao);

    }

}

