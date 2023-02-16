package metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Desafio Calculadora
        System.out.println("Calculadora");
        System.out.println("Nº1:");
        double a = scan.nextDouble();
        System.out.println("Nº2:");
        double b = scan.nextDouble();
        Calculadora.soma(a, b);
        Calculadora.subtrair(a, b);
        Calculadora.dividir(a, b);
        Calculadora.multiplicar(a, b);

        //Mensagem
        System.out.println("\nInforme a Hora:");
        int hora = scan.nextInt();
        Mensagem.obterMensagem(hora);


        //Empréstimo
        System.out.println("Informe o Valor do empréstimo");
        double valor = scan.nextDouble();
        System.out.println("Nº de Parcelas");
        int parcelas= scan.nextInt();
        Emprestimo.calcular(valor, parcelas);
        scan.close();
    }
}
