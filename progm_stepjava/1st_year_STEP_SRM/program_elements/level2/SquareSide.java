import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        double side = perimeter / 4;
        
        System.out.println("The length of the side is: " + side);
        input.close();
    }
}

