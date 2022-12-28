import javax.swing.plaf.synth.SynthToolBarUI;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA"; // concatenando strings
        System.out.println(nomeCompleto);
        
        int numero = 5;
        System.out.println(-numero); // tornei o número negativo 
        numero = + numero;
        System.out.println(numero); // tornei o número positivo 
        
        //incremento , decremento 
        int numero2 = 6;
        numero2++ ; // = numero + 1 
        System.out.println(numero2);

        //negar
        boolean sim = true;
        System.out.println(!sim);
        sim = !sim;
        System.out.println(sim);

        //ternários
        int a , b ;
        a = 5 ;
        b = 6 ;

        String resultado = a == b ? "VERDADE " : "MENTIRA";
        System.out.println(resultado);

        //Relacionais 
        boolean simNao = a == b ; // comparando 
        System.out.println(simNao);  
        boolean maiorQue = b > a; // b mairo que a ? 
        System.out.println(maiorQue); 
        //Lógicos 
        boolean condicao1, condicao2;
        condicao1 = true;
        condicao2 = false;
        if(condicao1 || condicao2){
            System.out.println("Condição Verdadeira");
        }else{
            System.out.println("Condição falsa ! ");
        }


        
    }
}
