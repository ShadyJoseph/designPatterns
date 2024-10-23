package prototype;
public class Main {
    public static void main(String[] args) {
        Employee originalEmployee = new Employee("Alice", "Developer");
        Employee clonedEmployee = (Employee) originalEmployee.clone();

        System.out.println("Original Employee: " + originalEmployee);
        System.out.println("Cloned Employee: " + clonedEmployee);

        clonedEmployee = new Employee("Bob", "Manager");
        System.out.println("After modification - Cloned Employee: " + clonedEmployee);
        System.out.println("Original Employee remains unchanged: " + originalEmployee);
    }
}
