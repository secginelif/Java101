import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,i;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a limit number: ");
        number = sc.nextInt();
        //Numbers multiple of 4
        for(i=1;i<number;i*=4){
            System.out.println("Numbers multiple of 4: "+i);
        }
        //Numbers multiple of 5
        for(i=1;i<number;i*=5){
            System.out.println("Numbers multiple of 5: "+i);

        }

    }
}
