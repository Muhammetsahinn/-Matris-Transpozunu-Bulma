import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int number = 1;
        int[][] matris = new int[2][3];
        int[][] tran = new int[matris[0].length][matris.length];
        System.out.println("Matris : ");
        for(int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = number++;
                System.out.print(matris[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Matris trans : ");
        for(int i = 0; i < tran.length; i++) {
            for (int j = 0; j < tran[i].length; j++) {
                tran[i][j] = matris[j][i];
                System.out.print(tran[i][j] + " ");
            }
            System.out.println();
        }
    }
}