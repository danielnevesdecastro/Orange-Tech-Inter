package desafio.fundamentos;

import java.util.Scanner;

public class MesadaDoSobrinho {
    /*
     Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês
     ele quer saber quanto terá se juntartodo o dinheiro, sem gastar nada, durante alguns meses.
     E você, como um bom tio com habilidades de programação, vai criar um programa que com as entradas
     do seu sobrinho vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.
    */
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         int entrada = leitor.nextInt();
         int mesada = 50;


         int mesadaFinal = entrada * mesada;


         System.out.println(mesadaFinal);

    }

}

