import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //numbers list
        int[] list = {2, 11, 4, 7, 7, 4, 2, 10, 22, 32, 22, 2, 67, 22, 4};
        StringBuilder print = new StringBuilder("Repeating even numbers: ");
        Arrays.sort(list);//sorting list
        int repeat = 0;
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            //if repeat is min and even numbers => repeat = min;
            if (list[i] == min) {
                if (!(repeat == min) && (list[i] % 2 == 0)) {
                    repeat = min;
                    print.append(" ").append(repeat);
                }
            }
            min = list[i];
        }
        System.out.println(print);
    }

}
