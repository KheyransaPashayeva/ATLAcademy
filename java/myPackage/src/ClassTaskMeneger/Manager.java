package ClassTaskMeneger;

public class Manager extends Employee {
    private String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 5000; // Management payment for managers

    // Constructor
    public Manager(int employeeId, String name, int yearJoined, String department, String departmentManaged) {
        super(employeeId, name, yearJoined, department);
        this.departmentManaged = departmentManaged;
    }

    // Getter and setter
    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }
    // Method to calculate salary for Manager
    @Override
    public int calculateSalary() {
        return getYearJoined() * BASE_SALARY + MANAGEMENT_PAYMENT;
    }
    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing their department and handling tasks.");
    }
}
