package Q1_University;

public class Q1_Test {
    public static void main(String[] args) {
        System.out.println("Graduate Student");
        Graduate_Student obj1 = new Graduate_Student("Himanshu Sharma","B.Tech",18,"Science",80.4);
        obj1.display_student_info();
        System.out.println("");
        System.out.println("Research Student");
        Research_Student obj2 = new Research_Student("Himanshu Sharma","B.Tech",18,"AIML",1);
        obj2.display_student_info();
    }
}
