import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int digit;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a digit: ");
        digit=sc.nextInt();

        for (int i=digit; i >0 ; i--){

            for (int j=digit-i; j>0; j--){
                System.out.print(" ");
            }

            for (int k=(2*i)-1; k>0; k--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
