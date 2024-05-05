public class Manager extends Employee {
    public Manager(String name, double salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}
