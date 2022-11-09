//www.patika.dev

public class Main {
    public static void main(String[] args) {
        // 1 to 100 numbers => finding prime numbers in 100
        for(int i=2; i<=100; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime)
                System.out.println("--Prime Numbers--");
                System.out.print(i+ ", ");
        }
    }
}
