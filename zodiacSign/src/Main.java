import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //values
        int day, month;
        String zodiac="";
        boolean isError = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Your birth month: ");
        month = sc.nextInt();
        System.out.print("Your birthday: ");
        day = sc.nextInt();

        if (month == 1) {
            if (day > 0 && day <= 21) {
                zodiac = "Capricorn";
            } else if (day > 0 && day <= 31) {
                zodiac = "Aquarius";
            } else
                isError = true;
        }else if(month == 2){
            if (day > 0 && day <= 19) {
                zodiac= "Aquarius";
            } else if (day > 0 && day <= 29) {
                zodiac= "Pisces";
            } else
                isError = true;
        }else if(month == 3){
            if (day > 0 && day <= 20) {
                zodiac= "Pisces";
            } else if (day > 0 && day <= 31) {
                zodiac= "Aries";
            } else
                isError = true;

        }else if(month == 4){
            if (day > 0 && day <= 20) {
                zodiac= "Aries";
            } else if (day > 0 && day <= 30) {
                zodiac= "Taurus";
            } else
                isError = true;
        }else if(month == 5){
            if (day > 0 && day <= 21) {
                zodiac= "Taurus";
            } else if (day > 0 && day <= 31) {
                zodiac= "Gemini";
            } else
                isError = true;
        }else if(month == 6){
            if (day > 0 && day <= 22) {
                zodiac= "Gemini";
            } else if (day > 0 && day <= 30) {
               zodiac= "Cancer";
            } else
                isError = true;
        }else if(month == 7){
            if (day > 0 && day <= 22) {
                zodiac= "Cancer";
            } else if (day > 0 && day <= 31) {
                zodiac= "Leo";
            } else
                isError = true;
        }else if(month == 8){
            if (day > 0 && day <= 22) {
                zodiac= "Leo";
            } else if (day > 0 && day <= 31) {
                zodiac= "Virgo";
            } else
                isError = true;
        }else if(month == 9){
            if (day > 0 && day <= 22) {
                zodiac= "Virgo";
            } else if (day > 0 && day <= 30) {
                zodiac= "Libra";
            } else
                isError = true;
        }else if(month == 10){
            if (day > 0 && day <= 22) {
                zodiac= "Libra";
            } else if (day > 0 && day <= 31) {
                zodiac= "Scorpio";
            } else
                isError = true;
        }else if(month == 11){
            if (day > 0 && day <= 21) {
                zodiac= "Scorpio";
            } else if (day > 0 && day <= 30) {
                zodiac= "Sagittarius";
            } else
                isError = true;
        }else if(month == 12){
            if (day > 0 && day <= 21) {
                zodiac= "Sagittarius";
            } else if (day > 0 && day <= 31) {
                zodiac= "Capricorn";
                System.out.println("Your Sign : " + zodiac);
            } else
                isError = true;
        }
        if (isError) {
            System.out.println("Incorrect entry please try again");
        } else {
            System.out.println("Your Sign : " + zodiac);
        }

    }
}