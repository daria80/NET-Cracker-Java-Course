package Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee = new EmployeeImpl();
        Employee manager = new EmployeeImpl();
        Employee topManager = new EmployeeImpl();

        employee.setFirstName("Daria");
        employee.setLastName("Smirnova");
        employee.increaseSalary(5);

        manager.setFirstName("Дарья");
        manager.setLastName("Смирнова");
        manager.increaseSalary(100);

        employee.setManager(manager);

        topManager.setFirstName("DARYA");
        topManager.setLastName("SMIRNOVA");
        topManager.increaseSalary(1000);

        manager.setManager(topManager);

        System.out.println(employee.getFullName());
        System.out.println(employee.getSalary());

        System.out.println(manager.getFullName());
        System.out.println(manager.getSalary());

        System.out.println(topManager.getFullName());
        System.out.println(topManager.getSalary());

        System.out.println(employee.getTopManager().getFullName());
        System.out.println(manager.getTopManager().getFullName());
        System.out.println(topManager.getTopManager().getFullName());

    }
}
