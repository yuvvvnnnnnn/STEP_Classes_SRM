import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
       
        System.out.println("Input: celsius");
       
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        input.close();
    }
}


