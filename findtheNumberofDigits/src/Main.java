import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //value
        int a;
        int digit=0;
        int counter=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        //find the number digits
        // 1234/10=123
        // 123/10=12
        // 12/10=1
        // 1/10=0
        // 0/10=0
        while (a!=0){
            a/=10;
            counter++;

        }
        System.out.print("The number of digit: "+counter);

    }
}
