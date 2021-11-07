package Q3_Member;

public class Manager extends Member{
    String department;

    public Manager(String name, int age, int phone_number, String address, int salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
}
