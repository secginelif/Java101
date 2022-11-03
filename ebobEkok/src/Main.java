import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,i=1;
        int ebob=1;
        int ekok=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        //ebob
        while(i <= num1 && i <=num2) {
            if (num1 % i == 0 && num2 % i ==0) {
                ebob =i;


            }
            i++;
        }
        System.out.println("Ebob: "+ebob);

        i=1;

        //ekok
        while(i <= (num1 * num2)){
            if(i % num1 == 0 && i % num2 ==0){
                ekok = i;
                System.out.println("Ekok : "+ekok);
                break;
            }
            i++;
        }

    }
}
