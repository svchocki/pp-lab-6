import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000.0, 1);
        Worker worker2 = new Worker("Alice", 2200.0, 2);
        Worker worker3 = new Worker("Bob", 1900.0, 3);
        Worker worker4 = new Worker("Eve", 2100.0, 4);

        Manager manager = new Manager("Michael", 5000.0, 5);

        System.out.println("Manager's salary: " + manager.getSalary());

        manager.work();

        System.out.println("Worker 1's salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker 2's salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker 3's salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker 4's salary: " + worker4.getSalary());
        worker4.work();
    }
}
