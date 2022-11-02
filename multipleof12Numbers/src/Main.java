import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,total=0;
        double number, average,count=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for(i=1;i<=number;i++){
            if((i%3==0) && (i%4==0)){
                System.out.print(i);
                total += i;
                count++;
            }

        }

        // average
        average = total / count;
        System.out.print(average);
    }
}
