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
        Manager manager = new Manager("Michael", 5000.0, 4, "2019-05-01", "Head of Department");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        double totalSalaryAllEmployees = 0.0;
        double totalSalaryManagers = 0.0;
        double totalSalaryWorkers = 0.0;

        for (Employee emp1 : employees) {
            for (Employee emp2 : employees) {
                if (emp1 != emp2 && emp1.hashCode() == emp2.hashCode()) {
                    System.out.println(emp1.getName() + " has the same ID as " + emp2.getName());
                }
            }
        }

        for (Employee employee : employees) {
            totalSalaryAllEmployees += employee.getSalary();
            if (employee instanceof Manager) {
                totalSalaryManagers += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalSalaryWorkers += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalaryAllEmployees);
        System.out.println("Total salary of all managers: " + totalSalaryManagers);
        System.out.println("Total salary of all workers: " + totalSalaryWorkers);
    }
}
