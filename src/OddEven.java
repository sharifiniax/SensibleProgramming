import java.util.Scanner;

public class OddEven {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();


        long sillyStartTime = System.nanoTime();
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
        long sillyEndTime = System.nanoTime();
        long sillyTime = sillyEndTime - sillyStartTime;
        System.out.println("silly programming time : " + (sillyTime) / 1000000.00 + " ms");
        System.out.println("-----------------------------------------------");


        long sensibleStartTime = System.nanoTime();
        if ((number / 2) == (number / 2.00)) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        long sensibleEndTime = System.nanoTime();
        long sensibleTime = sensibleEndTime - sensibleStartTime;

        System.out.println("sensible programming time : " + (sensibleTime) / 1000000.00 + " ms");
        System.out.println("-----------------------------------------------");

        if ((sensibleTime) < (sillyTime)) {
            System.out.println("sensible programming is " + (sillyTime / sensibleTime) + " times faster");
        } else {
            System.out.println("silly programming is" + (sensibleTime / sillyTime) + " times faster");
        }


    }


}