//www.patika.dev
import java.util.Scanner;

public class Main {
    static void pattern(int number,int rec,int n){
        if(number > 0 && n == 0){
            System.out.print(number + " ");
            number -=5;
            pattern(number,rec,0);
        }
        else if (number <= 0) {
            System.out.print(number + " ");
            number +=5;
            pattern(number,rec,1);
        }
        else if(number > 0 && number <= rec && n == 1){
            System.out.print(number + " ");
            number  +=5;
            pattern(number,rec,1);
        }
        //type of design pattern comes under
        // creational pattern as this pattern provides one of the best ways to create an object.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = input.nextInt();

        pattern(x,x,0);
    }
}
