import java.util.Objects;

public class Employee {
    private static int idCounter;
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int salary;
    private int department;

    public Employee(String lastName, String firstName, String middleName, int salary, int department) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salary = salary;
        this.department = department;
        id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName, salary, department);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nФИО: " + lastName + " " + firstName + " " + lastName +
                "\nНомер отдела: " + department +
                "\nЗарплата: " + salary;
    }
}
