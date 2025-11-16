import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastname = sc.nextLine();
        String fullname = firstname + " " + lastname;
        System.out.println("Full Name: " + fullname);

    }

}
