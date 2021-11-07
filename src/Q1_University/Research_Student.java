package Q1_University;

class Research_Student extends Student {
    String specialization;
    int years_of_experience;

    public Research_Student(String name, String program, int age, String specialization, int years_of_experience) {
        super(name, program, age);
        this.specialization = specialization;
        this.years_of_experience = years_of_experience;
    }

    @Override
    void display_student_info() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
        System.out.println("Years of Experience: " + years_of_experience);
    }
}
