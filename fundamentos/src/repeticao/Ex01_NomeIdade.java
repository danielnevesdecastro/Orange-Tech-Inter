package repeticao;

import java.util.Scanner;
//EX01
public class Ex01_NomeIdade {
    /*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        boolean cont= true ;

        while (cont){
            System.out.println("Seu Nome: ");
            nome = scan.next();
            if (nome.equals("0") ) break; // equals comparação de strings
            System.out.println("Sua idade: ");
            idade = scan.nextInt();
            System.out.println("Identificação: " + nome + ", " + idade);
        }
        System.out.println(" 0 pressionado... encerrado");



    }
}