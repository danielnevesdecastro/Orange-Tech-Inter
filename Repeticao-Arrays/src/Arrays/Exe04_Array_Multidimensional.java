package Arrays;

import java.util.Random;

public class Exe04_Array_Multidimensional {
    public static void main(String[] args) {
        //Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
        Random random = new Random();
        int[][] arrayMulti = new int[4][4];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti.length; j++) {
               //coloquei até o 10 , pq até o 9 ele não gerava o número máximo (9)
                arrayMulti[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz:");
        for (int[] base : arrayMulti) {
            for (int num : base) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
    }

}

