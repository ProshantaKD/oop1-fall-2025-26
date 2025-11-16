import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score a :");
        double a = sc.nextDouble();
        System.out.println("Enter score b :");
        double b = sc.nextDouble();
        System.out.println("Enter score c :");
        double c = sc.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("Average scoreis :" + average);
    }

}
