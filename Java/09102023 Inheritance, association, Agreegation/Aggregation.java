class College {
    private String name;
    private Department[] departs;

    public College(String name, Department[] departs) {
        this.name = name;
        this.departs = departs;
    }
}

class Department {
    private String name;
    private int capacity;

    @Override
    public String toString() {
        return "Department [name=" + name + ", capacity=" + capacity + "]";
    }

    public Department(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Department[] departments = {
                new Department("IT", 500),
                new Department("Civil", 120),
                new Department("Mechanical", 150),
                new Department("Chemical", 100),
                new Department("Electrical", 120),
        };

        College c = new College("YCCE", departments);

    }
}