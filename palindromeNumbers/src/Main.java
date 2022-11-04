import java.util.Scanner;

public class Main {
    static boolean isPolindrome( int number) {
        int digit = number, lastNumber, reversNumber = 0;
        while (digit != 0) {
            System.out.println("Your number: "+digit);
            lastNumber = digit%10;
            System.out.println("The last digit: "+lastNumber);
            reversNumber = (reversNumber *10) + lastNumber;
            System.out.println("new number: "+ reversNumber);
            digit /= 10;
        }
        if(number==reversNumber){
            System.out.print(number +" :The number is Polindrome number ");
            return true;
        }else{
            System.out.print(number +" :The number is not Polindrome number ");
            return false;
        }
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            isPolindrome(number);
    }

}
