import java.util.Scanner;
import  java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guess = rand.nextInt(100);
        int number;
        int[] isWrongs = new int[5];// total right
        //remaining rights
        for (int right=4;right>=0;right--){
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            //need to be between 0 to 100
            while (number<0 || number>99){
                System.out.print("You should enter a number between 0 to 100\n Enter a number: ");
                number = sc.nextInt();
            }
            isWrongs[right]=number;
            if (number==guess){
                System.out.println("***Congratulations***");
                break;
            }else if (number>guess){
                System.out.println(number+" is wrong and bigger \n Remaining right: "+ right);
            }else {
                System.out.println(number+" is wrong and smaller \n Remaining right: "+ right);
            }
        }
        if (isWrongs[0]!=0){
            System.out.println("Entered numbers : "+Arrays.toString(isWrongs));
            System.out.println("Correct number: "+guess);
        }
    }
}
