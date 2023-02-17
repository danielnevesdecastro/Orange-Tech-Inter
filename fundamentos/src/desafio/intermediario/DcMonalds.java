package desafio.intermediario;

import java.util.Scanner;

public class DcMonalds {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            String ingredientes = leitor.next();
            String listaIngredientes[] = new String[3];

            // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
            for (int i = 0; i<=ingredientes.length(); i++) {
                listaIngredientes = ingredientes.split(";");//split separa a string ao encontrar um carcatete definido e atribui a um array
            }

            for (String msg : listaIngredientes){
                System.out.println(msg);
            }
        }
    }
