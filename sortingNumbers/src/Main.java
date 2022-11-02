import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);
        //inputs
        System.out.print("First number: ");
        a =sc.nextInt();

        System.out.print("Second number: ");
        b =sc.nextInt();

        System.out.print("Third number: ");
        c =sc.nextInt();
        //sorting 3 numbers big to small
        if((a>b) && (a>c)){
            if(b>c){
                System.out.print("a>b>c");
            }else{
                System.out.print("a>c>b");
            }
        }else if((b>a) && (b>c)){
            if(a>c){
                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }
        }else {
            if(a>b){
                System.out.print("c>a>b");
            }else{
                System.out.print("c>b>a");
            }
        }
    }
}
