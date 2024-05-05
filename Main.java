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
        Manager manager = new Manager("Michael", 5000.0, 5, "2019-05-01", "Head of Department");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        Worker workerToCompare = worker1;
        for (Employee employee : List.of(worker1, worker2, worker3, manager)) {
            if (employee.equals(workerToCompare)) {
                System.out.println(workerToCompare.getName() + " is equal to " + employee.getName());
            }
        }
    }
}
