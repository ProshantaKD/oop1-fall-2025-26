abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showDetails() {
        System.out.println("Employee Name:" + name);
        System.out.println("Salary:" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Alison", 50000);
        emp.showDetails();
    }

}
