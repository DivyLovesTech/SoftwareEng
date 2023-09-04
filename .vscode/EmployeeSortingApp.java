import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String employeeID;
    private String name;
    private int age;
    private double salary;

    public Employee(String employeeID, String name, int age, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return employeeID + " " + name + " " + age + " " + salary;
    }
}

public class EmployeeSortingApp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("161E90", "Raman", 41, 56000));
        employeeList.add(new Employee("161F91", "Himadri", 38, 67500));
        employeeList.add(new Employee("161F99", "Jaya", 51, 82100));
        employeeList.add(new Employee("171E20", "Tejas", 30, 55000));
        employeeList.add(new Employee("171G30", "Ajay", 45, 44000));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a sorting parameter:");
        System.out.println("1. Age");
        System.out.println("2. Name");
        System.out.println("3. Salary");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(employeeList, Comparator.comparingInt(Employee::getAge));
                break;
            case 2:
                Collections.sort(employeeList, Comparator.comparing(Employee::getName));
                break;
            case 3:
                Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Sorted Employee Data:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }
}
  

