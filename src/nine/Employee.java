package nine;

public class Employee {
    private String name;
    Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
