import java.util.Scanner;

//EXE06
/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 *Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
 */
public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // usei o long pq o fatorial pode ficar mt grande, interferindo com int
        long multi = 1L;
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        System.out.println(fatorial + "!=");
        for (int i = fatorial; i >= 1; i--) {
            multi = multi * i;
        }

        System.out.println(multi);
        scan.close();
    }
}
