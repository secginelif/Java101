import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int com1=1;   //first combination
        int com2=1;   //second combination
        int com3=1;   //first numbers with second number combination
       //n!=1*2*3*4....*n
        Scanner sc = new Scanner(System.in);

        //first combination
        System.out.print("Enter a number for first combination: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            com1 *= i;
        }

        //second combination
        System.out.print("Enter a number for secon combination: ");
        int r = sc.nextInt();
        for(int j=1;j<=r;j++){
            com2 *=j;
        }

        //third combination
        for(int k=1;k<=(n-r);k++){
            com3 *=k;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        int combination = (com1)/(com2 * com3);
        System.out.print("Combination value: "+ combination);



    }
}
