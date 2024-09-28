import java.util.Scanner;

// Class Person (sebelumnya Person)
class Person {
    String name;
    int age;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Class Student
class Student extends Person {
    int studentNumber;
    int score;
    String major;

    @Override
    public void print() {
        super.print();
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Score: " + score);
        System.out.println("Major: " + major);
    }
}

// Class Teacher (subclass of Person)
class Teacher extends Person {
    String subject;

    @Override
    public void print() {
        super.print();
        System.out.println("Subject: " + subject);
    }
}

// Class FullTime
class FullTime extends Teacher {
    int annualSalary;
    String unit;

    @Override
    public void print() {
        super.print();
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Unit: " + unit);
    }
}

// Class PartTime
class PartTime extends Teacher {
    int hoursWorked;

    public int setSalary() {
        return hoursWorked;
    }

    @Override
    public void print() {
        super.print();
        hoursWorked = hoursWorked * 4 * 20000;
        System.out.println("Salary : " + setSalary());
    }
}

public class TesteSteacher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Student / 2. Teacher");
        String pilihan = s.next();

        if (pilihan.equals("1")) {
            // Input untuk Student
            Student s1 = new Student();
            System.out.println("Name : ");
            s1.name = s.next();
            System.out.println("Age : ");
            s1.age = s.nextInt();
            System.out.println("Student number : ");
            s1.studentNumber = s.nextInt();
            System.out.println("Score : ");
            s1.score = s.nextInt();
            System.out.println("Major : ");
            s1.major = s.next();
            System.out.println("--------------------------------");
            System.out.println("          DATA STUDENT");
            System.out.println("--------------------------------");
            s1.print();
        } else if (pilihan.equals("2")) {
            // Input untuk Teacher
            System.out.println("1. FullTime / 2. PartTime");
            String pilihanTeacher = s.next();

            if (pilihanTeacher.equals("1")) {
                // Input untuk FullTime Teacher
                FullTime ft = new FullTime();
                System.out.println("Anual Salary : ");
                ft.annualSalary = s.nextInt();
                System.out.println("Unit : ");
                ft.unit = s.next();
                System.out.println("--------------------------------");
                System.out.println("     DATA TEACHER, FULL TIME");
                System.out.println("--------------------------------");
                ft.print();
            } else if (pilihanTeacher.equals("2")) {
                // Input untuk PartTime Teacher
                PartTime pt = new PartTime();
                System.out.println("Hours Worked : ");
                pt.hoursWorked = s.nextInt();
                System.out.println("--------------------------------");
                System.out.println("     DATA TEACHER, PART TIME");
                System.out.println("--------------------------------");
                pt.print();
            } else {
                System.out.println("Input Salah.");
            }
        } else {
            System.out.println("Input Salah.");
        }
        s.close();
    }
}
