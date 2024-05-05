import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000.0, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Alice", 2200.0, 2, "2021-12-15", "Senior Developer");
        Worker worker3 = new Worker("Bob", 1900.0, 1, "2023-03-20", "Intern");
        Worker worker4 = new Worker("Eve", 2100.0, 4, "2020-09-10", "Project Manager");
        Worker worker5 = new Worker("Michael", 2300.0, 5, "2024-05-10", "Senior Engineer");

        Manager manager1 = new Manager("Michael", 5000.0, 4, "2019-05-01", "Head of Department");
        Manager manager2 = new Manager("Alice", 5500.0, 5, "2020-01-01", "Director");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

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
