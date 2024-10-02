import java.util.Scanner;

public class DriverSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Choose One:");
        System.out.println("1. Student\n2. Teacher");
        int pilihan = s.nextInt();
        s.nextLine();

        if (pilihan == 1) {
            System.out.println("--Student--");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Major :");
            String major = s.nextLine();
            System.out.println("Age :");
            int age = s.nextInt();
            System.out.println("Student Number :");
            int studentNumber = s.nextInt();
            System.out.println("Score :");
            int score = s.nextInt();
            Student s1 = new Student(name, age, studentNumber, score, major);
            s1.print();
        } else if (pilihan == 2) {
            System.out.println("Choose One:");
            System.out.println("1. Full Time\n2. Part Time");
            int pilihan2 = s.nextInt();
            s.nextLine();
            if (pilihan2 == 1) {
                System.out.println("--Full Time Teacher--");
                System.out.println("Name :");
                String name = s.nextLine();
                System.out.println("Subject :");
                String subject = s.nextLine();
                System.out.println("Unit :");
                String unit = s.nextLine();
                System.out.println("Age :");
                int age = s.nextInt();
                System.out.println("Annual Salary :");
                int annualSalary = s.nextInt();
                FullTime f1 = new FullTime(name, age, subject, annualSalary, unit);
                f1.print();
            } else if (pilihan2 == 2) {
                System.out.println("--Part Time Teacher--");
                System.out.println("Name :");
                String name = s.nextLine();
                System.out.println("Subject :");
                String subject = s.nextLine();
                System.out.println("Age :");
                int age = s.nextInt();
                System.out.println("Hours Worked :");
                int hoursworked = s.nextInt();
                PartTime p1 = new PartTime(name, age, subject, hoursworked);
                p1.print();
            } else {
                System.out.println("Your Input is Invalid.");
            }
        } else {
            System.out.println("Your Input is Invalid.");
        }
        s.close();
    }
}