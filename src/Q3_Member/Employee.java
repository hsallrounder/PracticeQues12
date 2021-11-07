package Q3_Member;

public class Employee extends Member{
    String specialization;

    public Employee(String name, int age, int phone_number, String address, int salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
}