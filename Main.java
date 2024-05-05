import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000.0, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Alice", 2200.0, 2, "2021-12-15", "Senior Developer");
        Worker worker3 = new Worker("Bob", 1900.0, 3, "2023-03-20", "Intern");
        Worker worker4 = new Worker("Eve", 2100.0, 4, "2020-09-10", "Project Manager");

        Manager manager = new Manager("Michael", 5000.0, 5, "2019-05-01", "Head of Department");

        List<Employee> employees = new ArrayList<>();

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }
    }
}
