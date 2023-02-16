package metodos;

public class Emprestimo {


    public static void calcular(double valor, int parcelas) {
        double taxa = 0.0;
        if (parcelas == 1) {
            taxa = 0.0;
        } else if (parcelas > 1 & parcelas <= 10) {
            taxa = 0.9;
        } else if (parcelas < 25) {
            taxa = 1.8;
        } else {
            taxa = 2.0;
        }

        if (taxa != 2.0) {
            double valorFinal = valor + (valor * taxa);
            System.out.println(valor + " de empréstimo em" + parcelas + "\nTotaliza :" + valorFinal);
        }else {
            System.out.println("Valor de Parcelas Inválido !!!");
        }
    }
}
