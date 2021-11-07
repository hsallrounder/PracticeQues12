package Q3_Member;

public class Member {
    String Name;
    int Age;
    int Phone_number;
    String Address;
    int Salary;

    void printSalary(){
        System.out.println("Salary: "+Salary);
    }
    void details(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Phone number: "+Phone_number);
        System.out.println("Address: "+Address);
    }
    public Member(String name, int age, int phone_number, String address, int salary) {
        Name = name;
        Age = age;
        Phone_number = phone_number;
        Address = address;
        Salary = salary;
    }
}
