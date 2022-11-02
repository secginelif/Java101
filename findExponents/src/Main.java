import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,j;
        Scanner sc =new Scanner(System.in);

        System.out.print("First exponent number: ");
        n = sc.nextInt();

        System.out.print("Second exponent number: ");
        j = sc.nextInt();

        int total=1;

        // n*n...*n => j times
        for(int i=1;i<=j;i++){
            total *=n;
        }
        System.out.print(total);
    }
}
