class Contact {
    private String phone;
    private String email;

    public Contact(String phone,String email){
        this.phone=phone;
        this.email
    }

    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}

class Student {
    private String name;
    private Contact contact;

    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public void showStudent() {
        System.out.println("Student name:" + name);
        System.out.println("Contact Info:" + contact);
    }
}

class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfStudents];
    }

    public void addStudent(Student s) {
        if (count < student.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Cannot add more students to" + schoolName);
        }
    }

    public void showAllStudents() {
        System.out.println("School:" + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            students[i].showStudent();
            System.out.println();
        }
    }
}

public class SchoolRelationship {
    public static void main(String[] args) {
        School school = new School("A High School", 3);
        school.addStudent(new Student("X", new Contact("...........", "x@mail.com")));
        school.addStudent(new Student("Y", new Contact("017xxxxxxxx", "y@mail.com")));
        school.addStudent(new Student("Z", new Contact("018xxxxxxxx", "z@mail.com")));
        school.showAllStudents();
    }
}