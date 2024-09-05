package ClassTaskMeneger;

// Director.java
public class Director extends Manager {
    private double bonus;

    // Constructor
    public Director(int employeeId, String name, int yearJoined, String department, String departmentManaged, double bonus) {
        super(employeeId, name, yearJoined, department, departmentManaged);
        this.bonus = bonus;
    }

    // Getter and setter
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    // Method to calculate salary for Director
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + (int) bonus;
    }
    @Override
    public void work() {
        System.out.println("Director " + getName() + " is overseeing operations and making strategic decisions.");
    }

}

