package ClassTaskMeneger;

public class Employee {
    private int employeeId;
    private String name;
    private int yearJoined;
    private String department;
    public static final int BASE_SALARY = 500;
    // Constructor
    public Employee(int employeeId, String name, int yearJoined, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearJoined = yearJoined;
        this.department = department;
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int calculateSalary() {
        return yearJoined * BASE_SALARY;
    }
    // Method to perform work
    public void work() {
        System.out.println("Employee " + name + " is performing regular duties.");
    }
}
