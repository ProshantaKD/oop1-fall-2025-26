import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius : ");
        double cel = sc.nextDouble();
        double fah = (cel * 9.0 / 5.0) + 32;
        System.out.println("Fahrenheit : " + fah);
    }

}
