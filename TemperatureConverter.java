import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user choice of conversion
    
        System.out.println("1. convert from Celsius to Fahrenheit");
        System.out.println("2. convert from Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        if (choice == 1) {
            //Celsius to Fahrenheit
            System.out.println("enter the degree of Celsius");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("the degree is " + celsius + " Celsius"+ ", which is " + fahrenheit + " Fahrenheit");
        }
        else if (choice == 2) {
            //Fahrenheit to Celsius
            System.out.println("enter the degree of Fahrenheit");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("the degree is " + fahrenheit + " Fahrenheit"+ ", which is " + celsius + " Celsius");
        }
        else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}