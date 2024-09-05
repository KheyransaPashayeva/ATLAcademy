package ClassTaskMeneger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create company
        List<Employee> employees = new ArrayList<>();

        // Add employees
        Employee employee1 = new Employee(1, "John Doe", 2020, "HR");
        Manager manager1 = new Manager(2, "Jane Smith", 2018, "Finance", "Finance");
        Director director1 = new Director(3, "David Brown", 2015, "Operations", "Operations", 10000);

        employees.add(employee1);
        employees.add(manager1);
        employees.add(director1);

        // Show who is working
        System.out.println("Employees at work:");
        showWhoIsWorking(employees);
        System.out.println(employee1.getName()+" base salary "+employee1.calculateSalary());
        System.out.println(manager1.getName()+" salary "+manager1.calculateSalary());
        System.out.println(director1.getName()+" salary "+director1.calculateSalary());
    }

    // Method to show who is working
    public static void showWhoIsWorking(List<Employee> employees) {
        for (Employee employee : employees) {
            employee.work();
        }
    }
}