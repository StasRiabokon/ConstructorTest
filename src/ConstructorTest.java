import static java.lang.System.*;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee el : staff) {
            out.println("name = " + el.getName() + ", id = " + el.getId() +
                    ", salary = " + el.getSalary());
        }

    }
}
