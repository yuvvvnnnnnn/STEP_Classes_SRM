import java.util.Scanner;
class VotingEligibility {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] ages = new int[10];
       for (int i = 0; i < ages.length; i++) {
          System.out.print("Enter age of student " + (i + 1) + ": ");
          ages[i] = input.nextInt();
       }
       for (int age : ages) {
          if (age < 0) {
             System.out.println("Invalid age");
          } else if (age >= 18) {
             System.out.println("The student with age " + age + " can vote.");
          } else {
             System.out.println("The student with age " + age + " cannot vote.");
          }
       }
       input.close();
    }
 }
 
 