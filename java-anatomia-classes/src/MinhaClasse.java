public class MinhaClasse {
    public static void main (String[] args){
    
        System.out.print ("olá turma, sejam bem vindos! ");

        int ano = 2021;
        ano = 2023;

        //final garante que a variável não poderá ser alterada , imutável 
        final String BR = "BRASIL";
        

        System.out.println(BR);

        String meuNome = "Daniel";
        int anoFabricacao = 2023;
        boolean verdadeiro = true; 

        String primeiroNome = "Daniel";
        String segundoNome = "Neves";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);


        
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

