package Q3_Member;

public class Q3_Test {
    public static void main(String[] args) {
        Employee emp = new Employee("Himanshu",18,1111111111,"Vrindavan",30000,"AIML");
        Manager mng = new Manager("Himanshu",18,1111111111,"Vrindavan",60000,"AIML");
        System.out.println("Employee:");
        emp.details();
        emp.printSalary();
        System.out.println("");
        System.out.println("Manager:");
        mng.details();
        mng.printSalary();
    }
}
