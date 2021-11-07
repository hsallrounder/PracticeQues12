package Q1_University;

class Graduate_Student extends Student {
    String stream;
    double percentage_marks_in_12th;

    public Graduate_Student(String name, String program, int age, String stream, double percentage_marks_in_12th) {
        super(name, program, age);
        this.stream = stream;
        this.percentage_marks_in_12th = percentage_marks_in_12th;
    }

    @Override
    void display_student_info() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Age: " + age);
        System.out.println("Stream: " + stream);
        System.out.println("%Marks in 12th: " + percentage_marks_in_12th);
    }
}
