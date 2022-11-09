public class Main {
    public static void main(String[] args) {

        Course mathematics = new Course("Mathematics", "405", "MATH");
        Course physics = new Course("Physics", "203", "PHYSICS");
        Course english = new Course("English", "502", "ENGLISH");

        Teacher teacher1 = new Teacher("Arzu", "765", "MATH");
        Teacher teacher2 = new Teacher("Ali", "347", "PHYSICS");
        Teacher teacher3 = new Teacher("Manya", "950", "ENGLISH");

        mathematics.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        english.addTeacher(teacher3);

        Student student1 = new Student("Karen", "632", 12, mathematics, physics, english);
        student1.addMidtermNote(74,70,81);
        student1.addFinalNote(80,80,98);
        student1.isPass();

        Student student2 = new Student("Zeki", "631", 12, mathematics, physics, english);
        student2.addMidtermNote(72, 64, 65);
        student2.addFinalNote(74, 77, 76);
        student2.isPass();

        Student student3 = new Student("Rabia", "625", 12, mathematics, physics, english);
        student3.addMidtermNote(45,43,67);
        student3.addFinalNote(54, 43, 75);
        student3.isPass();


    }
}
