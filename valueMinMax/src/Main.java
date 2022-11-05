import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,number,maxNumber=0,minNumber=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers to enter: ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Please enter "+i+". number: ");
            number = sc.nextInt();
            if(i==1){
                maxNumber = number;
                minNumber = number;
            }else{
                if(number>maxNumber){
                    maxNumber = number;
                }else if(number<minNumber){
                    minNumber = number;
                }
            }
        }
        System.out.println("The largest nummber: "+maxNumber);
        System.out.println("The smallest number: "+minNumber);
    }
}
