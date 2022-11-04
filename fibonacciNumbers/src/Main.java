import java.util.Scanner;

public class Main {
    static  int fibo(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print(fibo(n));
        //f(n) = f(n-1) + f(n-2)
    }
}
