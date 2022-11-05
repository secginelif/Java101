import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //values
        int number,total=0;
        //Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = sc.nextInt();

        //“Perfect numbers” are equal to the sum of their “proper” divisors
        // positive integers that divide a number evenly, not counting itself
        // example => 6 = 3 + 2 + 1, and 28 = 14 + 7 + 4 + 2 + 1.

        for(int i=1;i<number;i++){
            if(number %i==0){
                total += i;
            }
        }
        if(total == number){
            System.out.print("The number is=> Perfect number");
        }else{
            System.out.print("The number is not => Perfect number");
        }
    }

}
