import java.util.Scanner;

public class LineCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            double m = lineEquation[0];
            double b = lineEquation[1];
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", m, b);
        } else {
            System.out.println("The line is vertical; slope is undefined.");
        }
    }

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            return null;  // Vertical line, undefined slope
        }

        double m = (y2 - y1) / (x2 - x1);       // slope
        double b = y1 - m * x1;                 // y-intercept
        return new double[]{m, b};
    }
}
