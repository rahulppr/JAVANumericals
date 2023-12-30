import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        //How to convert Fahrenheit to Celsius
        //Program in java

        System.out.println("Enter the temperature in Fahrenheit");
        Scanner sc = new Scanner(System.in);
        float temperature;
        temperature = sc.nextFloat();
        temperature = (((temperature-32)*5)/9);
        System.out.println("Temperature in Celcius is "+temperature);
    }
}
