public class UnitConverter1 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to test the conversion methods
    public static void main(String[] args) {
        System.out.println("5 yards = " + convertYardsToFeet(5) + " feet");
        System.out.println("9 feet = " + convertFeetToYards(9) + " yards");
        System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
        System.out.println("40 inches = " + convertInchesToMeters(40) + " meters");
        System.out.println("12 inches = " + convertInchesToCentimeters(12) + " cm");
    }
}
