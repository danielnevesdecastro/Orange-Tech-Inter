package Collection;

import java.util.*;

//Collection - List
public class List01 {
    public static void main(String[] args) {

        System.out.println("Cria uma lista e adiciona 6 notas");
        List<Double> notas = new ArrayList<Double>();//generics
        notas.add(7d);//d = tipo double
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());//imprime lista
        System.out.println(notas.indexOf(5.0));//posição do valor buscado
        notas.add(4 , 8d);//adiciona elemento no indice informado
        System.out.println(notas.indexOf(8d));
        System.out.println(notas.toString());
        notas.set(notas.indexOf(5d),6.0);//procura posicao do valor e substitui
        System.out.println("tem nota 5.0 ? "+notas.contains(5d));
        System.out.println(notas);

        for (Double nota : notas ){
            System.out.println(nota);
        }

        System.out.println("\n\n\nTerceira nota adicionada: "+ notas.get(2));// recebe indice retorna nota
        System.out.println(Collections.max(notas));//recebe maior valor
        System.out.println(Collections.min(notas));//recebe menor valor
        //Soma de valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma do valores:"+soma);



    }
}
