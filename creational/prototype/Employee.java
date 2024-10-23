package prototype;

public class Employee implements Prototype {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public Prototype clone() {
        return new Employee(name, position);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "'}";
    }
}
