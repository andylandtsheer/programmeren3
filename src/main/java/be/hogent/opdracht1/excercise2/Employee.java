package be.hogent.opdracht1.excercise2;

public class Employee {
    private static int EMPLOYEE_ID_COUNTER = 1;

    private final String foreName;
    private final String name;
    private final String employeeID;

    public Employee(String foreName, String name) {
        this.foreName = foreName;
        this.name = name;
        this.employeeID = String.valueOf(EMPLOYEE_ID_COUNTER);
        EMPLOYEE_ID_COUNTER++;
    }

    public String getFullName() {
        return String.format("%s %s", foreName, name);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return String.format("EmployeeID %s : %s %s", employeeID, foreName, name);
    }
}
