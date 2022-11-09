import java.util.Scanner;

public class Main {
    static void primeNumber(int num, int i) {
        //Prime number is a number that is greater than 1 and divided by 1 or itself only.
        // In other words,prime numbers can't be divided by other numbers than itself or 1.
        // For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

        if(i==num){
            System.out.print(num+ " is prime number.");
            return;
        }
        else if(num%i==0){
            System.out.print(num+ " is not prime number.");
            return;
        }
        primeNumber(num,i+1);

    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        primeNumber(num,2);

    }
}
