import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            double Celsius, Fahrenheit, Kelvin;
            System.out.println("Enter the Temperature");
            int temp = in.nextInt();
            System.out.println("Choose the measuring unit: ");
            System.out.println("1.Celsius \n2.Fahrenheit \n3.Kelvin");
            int unit = in.nextInt();


            if (unit == 1) {
                Fahrenheit = temp * 9.0 / 5.0 + 32;
                Kelvin = temp + 273.15;
                System.out.println("Temperature in Fahrenheit= " + Fahrenheit);
                System.out.println("Temperature in Kelvin= " + Kelvin);
            } else if (unit == 2) {
                Celsius = (temp - 32) * 5.0 / 9;
                Kelvin = (temp - 32) * 5.0 / 9 + 273.15;
                System.out.println("Temperature in Celsius= " + Celsius);
                System.out.println("Temperature in Kelvin= " + Kelvin);
            } else {
                Celsius = temp - 273.15;
                Fahrenheit = (temp - 273.15) * 9 / 5 + 32;
                System.out.println("Temperature in Celsius= " + Celsius);
                System.out.println("Temperature in Fahrenheit= " + Fahrenheit);
            }
        }













    }
}