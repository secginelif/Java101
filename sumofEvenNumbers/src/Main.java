import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        //Scanner
        Scanner sc = new Scanner(System.in);

        //all numbers sum of evens and all numbers multiple of 4
        do {
            System.out.print("Please enter a number: ");
            n = sc.nextInt();
            if ((n % 2 == 0) && (n % 4 == 0)) {
                total += n;
            }

        }  while(n>0);
        //print result
        System.out.print("Total numbers: "+ total);



    }
}
