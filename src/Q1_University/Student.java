package Q1_University;

abstract class Student {
    String name;
    String program;
    int age;

    public Student(String name, String program, int age) {
        this.name = name;
        this.program = program;
        this.age = age;
    }

    abstract void display_student_info();

}
