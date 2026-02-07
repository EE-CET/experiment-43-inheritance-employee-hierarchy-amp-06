import java.util.Scanner;

class Employee
{
    String name;
    int age;
    long phoneNumber;
    String address;
    int salary;

    void printSalary()
    {
        System.out.println(salary);
    }

    void printDetails()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(address);
        System.out.println(salary);
    }
}

class Officer extends Employee
{
    String specialization;

    void printOfficer()
    {
        printDetails();
        System.out.println(specialization);
    }
}

class Manager extends Employee
{
    String department;

    void printManager()
    {
        printDetails();
        System.out.println(department);
    }
}

public class EmployeeInheritance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Officer o = new Officer();
        o.name = sc.nextLine();
        o.age = sc.nextInt();
        o.phoneNumber = sc.nextLong();
        sc.nextLine();
        o.address = sc.nextLine();
        o.salary = sc.nextInt();
        sc.nextLine();
        o.specialization = sc.nextLine();

        Manager m = new Manager();
        m.name = sc.nextLine();
        m.age = sc.nextInt();
        m.phoneNumber = sc.nextLong();
        sc.nextLine();
        m.address = sc.nextLine();
        m.salary = sc.nextInt();
        sc.nextLine();
        m.department = sc.nextLine();

        System.out.println("Officer:");
        o.printOfficer();

        System.out.println("Manager:");
        m.printManager();
    }
}
