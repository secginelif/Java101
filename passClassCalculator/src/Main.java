import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //values
        int mat,ph,ch,tur,mus,total=0,count=0 ;
        double average;

        //Scanner
        Scanner sc = new Scanner(System.in);

        //inputs
        //if points in 0 t0 100 else not valid
        System.out.print("Math's point: ");
        mat = sc.nextInt();
        if(mat<0 || mat>100){
            System.out.print("Not valid grade\n");
        }else{
            total += mat;
            count++;
        }

        System.out.print("physics's point: ");
        ph = sc.nextInt();
        if(ph<0 || ph>100){
            System.out.print("Not valid grade\n");
        }else{
            total += ph;
            count++;
        }

        System.out.print("Chemistry's point: ");
        ch = sc.nextInt();
        if(ch<0 || ch>100){
            System.out.print("Not valid grade\n");
        }else{
            total += ch;
            count++;
        }

        System.out.print("Turkish's point: ");
        tur = sc.nextInt();
        if(tur<0 || tur>100){
            System.out.print("Not valid grade\n");
        }else{
            total += tur;
            count++;
        }

        System.out.print("Music's point: ");
        mus = sc.nextInt();
        if(mus<0 || mus>100){
            System.out.print("Not valid grade\n");
        }else{
            total += mus;
            count++;
        }

        //total = all points
        //count = all lecture
        average = total / count ;
        if(average >= 55 ){
            System.out.print("You passed...");
        }else{
            System.out.print("You didn't pass...");
        }
        System.out.print("average: " + average);



    }
}
