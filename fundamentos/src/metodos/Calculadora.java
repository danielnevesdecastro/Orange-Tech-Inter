package metodos;

public class Calculadora {

    public static void soma(double a, double b) {
        double resultado = a + b;
        System.out.println("SOMA:"+resultado);
    }

    public static void subtrair(double a, double b) {
        double resultado = a - b;
        System.out.println("SUBTRAIR:"+resultado);
    }

    public static void multiplicar(double a, double b) {
        double resultado = a * b;
        System.out.println("MULTIPLICAR:"+resultado);
    }

    public static void dividir(double a, double b) {
        double resultado = a / b;
        System.out.println("DIVIDIR:"+resultado);
    }
}
