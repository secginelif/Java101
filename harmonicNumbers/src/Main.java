import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double result=0;

        //Harmonic series formula: 1+(1/2)+(1/3)...+(1/n)
        for(double i=1;i<n;i++){
            result += (1/i);
        }

        System.out.print("Harmonic series: "+result);
    }
}
