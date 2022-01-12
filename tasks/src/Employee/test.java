package Employee;

public class test {

    public static void main(String[] args) {

        Employee employee = new EmployeeImpl();
        employee.setFirstName("Daria");
        employee.setLastName("Smirnova");
        employee.increaseSalary(5);
        System.out.println(employee.getFullName());
        System.out.println(employee.getSalary());
    }
}
