import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //number of array elements
        System.out.print("Enter number of array elements: ");
        int length=sc.nextInt();
        int[] list=new int[length];

        System.out.println("Enter the elements of array: ");
        //Create array
        for (int i = 0; i < list.length ; i++){
            System.out.print((i+1)+".elements: ");
            list[i]=sc.nextInt();
        }
        System.out.print("Entered array: ");
        System.out.println("Entered array: "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sorted array: ");// sorting array list
        System.out.println(Arrays.toString(list));
        sc.close();
    }
}
