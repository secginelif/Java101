import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, nOfRange;


        System.out.print("Enter a number adding the array: ");
        nOfRange = scan.nextInt();
        int[] arr = new int[nOfRange];

        System.out.println("Enter a number of arrays: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". digit: ");
            arr[i] = scan.nextInt();
        }
        //sorting array list
        Arrays.sort(arr);
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Which number do you wanna check: ");
        n = scan.nextInt();

        int min = arr[0];
        int max = arr[0];

        for (int k : arr) {
            if (k < n) {
                min = k;
            }
            if (k > n) {
                max = k;
                break;
            }
        }
        //prints nearest number smaller and nearest number greater
        System.out.println("The nearest number smaller than the entered number: " + min);
        System.out.println("The nearest number greater than the entered number: " + max);
        scan.close();
    }

}
