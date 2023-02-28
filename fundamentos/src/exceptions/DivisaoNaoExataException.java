package exceptions;

//Exception Customizada
public class DivisaoNaoExataException extends Exception {
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String msg, int numerador, int denominador) {
        super(msg);
        this.numerador = numerador;
        this.denominador = denominador;
    }


}
