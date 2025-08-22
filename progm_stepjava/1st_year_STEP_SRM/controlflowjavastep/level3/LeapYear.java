import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close();
        
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println(year + " is not within the Gregorian calendar period.");
        }
    }
}