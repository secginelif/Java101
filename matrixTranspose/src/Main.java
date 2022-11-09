import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a row for matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter a column for matris: ");
        int mat = sc.nextInt();
        //creating a matrix
        int[][] matrix = new int[n][mat];
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat; j++) {
                System.out.print((i + 1) + ". row  " + (j + 1) + ".colomn ");
                //creating another matrix to store transpose of a matrix
                matrix[i][j] = sc.nextInt();
            }
            //new line
        }
        System.out.println("Matrix: ");
        //Code to transpose a matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat; j++) {
                System.out.println(" " + matrix[i][j]);
            }
            System.out.println();//new line    
        }

        System.out.println("Transpose: ");
        for (int i = 0; i < mat; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[j][i]);
            }
            System.out.println();//new line
        }
    }

}
