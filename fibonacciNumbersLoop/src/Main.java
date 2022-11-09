import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,b=0,c=1,d;
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter number of digit: ");
        n=scr.nextInt();
        //The Fibonacci numbers are the numbers in the following integer sequence.
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….
        //
        //In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
        for (int i=1;i<=n;i++){
            d=b+c;
            System.out.println(b+"+"+c+"="+d);
            b=c;
            c=d;

            System.out.println(" ");
        }
    }
}
