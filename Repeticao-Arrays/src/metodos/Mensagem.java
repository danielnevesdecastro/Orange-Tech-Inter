package metodos;

public class Mensagem {

    public static void obterMensagem (int a ){
        if (a >=1 & a < 12  ){
            System.out.println("BOM DIA !!!");
        }else if (a >=12 & a<18 ){
            System.out.println("BOA TARDE !!!");
        }else if( a >= 18 & a< 24){
            System.out.println("BOA NOITE !!!");
        }else {
            System.out.println("HORA INVÁLIDA");
        }
    }
}

