//PRACTICE PROBLEM 1: Classes and Objects (Car Example)
public class Car {
    // Instance variables
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;

    // Constructor
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
    }

    // Methods
    public void startEngine() {
        isRunning = true;
        System.out.println(brand + " " + model + " engine started.");
    }

    public void stopEngine() {
        isRunning = false;
        System.out.println(brand + " " + model + " engine stopped.");
    }

    public void displayInfo() {
        System.out.println("Car Info: " + brand + " " + model + ", Year: " + year + ", Color: " + color + ", Running: " + isRunning);
    }

    public int getAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - year;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 2018, "Black");
        Car c2 = new Car("Honda", "Civic", 2020, "Blue");
        Car c3 = new Car("Ford", "Mustang", 2015, "Red");

        c1.startEngine();
        c1.displayInfo();
        System.out.println("Car age: " + c1.getAge() + " years\n");

        c2.displayInfo();
        c2.startEngine();
        c2.stopEngine();
        System.out.println("Car age: " + c2.getAge() + " years\n");

        c3.displayInfo();
        System.out.println("Car age: " + c3.getAge() + " years\n");

        // Comment: Each car is like a real-world car (different brand, model, year, etc.)
    }
}
