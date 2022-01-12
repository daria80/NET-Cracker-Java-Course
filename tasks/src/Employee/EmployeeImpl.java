package Employee;

import java.util.Objects;

public class EmployeeImpl implements Employee {

    private int salary;
    private String firstName;
    private String lastName;
    private Employee manager;

    public EmployeeImpl() {
        salary = 1000;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void increaseSalary(int value) {
        salary += value;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getManagerName() {
        if (manager != null) {
            return manager.getFullName();
        }
        return "No manager";
    }

    @Override
    public Employee getTopManager() {
        if (manager == null) {
            return this;
        }
        return manager.getTopManager();
    }

    @Override
    public void setManager(Employee manager) {
        this.manager = manager;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmployeeImpl employee = (EmployeeImpl) o;
//        return salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(manager, employee.manager);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(salary, firstName, lastName, manager);
//    }
//
//    @Override
//    public String toString() {
//        return "EmployeeImpl{" +
//                "salary=" + salary +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", manager=" + manager +
//                '}';
//    }
}
