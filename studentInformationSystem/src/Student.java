public class Student {
    //all students information
    Course mathematics;
    Course physics;
    Course english;
    String name;
    String studentNumber;
    int classes;
    double average;
    boolean isPass;

    Student(String name, String studentNumber, int classes, Course mathematics, Course physics, Course english) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.average = 0;
        this.isPass = false;
        this.mathematics = mathematics;
        this.physics = physics;
        this.english = english;
    }

    //courses points
    public void addMidtermNote(int mathematics, int physics, int english) {
        if (0 <= mathematics && mathematics <= 100) {
            this.mathematics.midTermExam = mathematics;
        }
        if (0 <= physics && physics <= 100) {
            this.physics.midTermExam = physics;
        }
        if (0 <= english && english <= 100) {
            this.english.midTermExam = english;
        }
    }

    //final points
    public void addFinalNote(int mathematics, int physics, int english) {
        if (0 <= mathematics && mathematics <= 100) {
            this.mathematics.finalExam = mathematics;
        }
        if (0 <= physics && physics <= 100) {
            this.physics.finalExam = physics;
        }
        if (0 <= english && english <= 100) {
            this.english.finalExam = english;
        }
    }

    //calculating average points
    public void calcAverage() {
        this.average = ((this.mathematics.midTermExam * 0.2 + this.mathematics.finalExam * 0.8) +
                (this.physics.midTermExam * 0.2 + this.physics.finalExam * 0.8) +
                (this.english.midTermExam * 0.2 + this.english.finalExam * 0.8)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    //if average>55 => its passed
    public void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Your average: " + this.average);
        if (this.isPass) {
            System.out.println(this.name + " passed the class");
        } else {
            System.out.println(this.name + " didnt pass the class");
        }
    }

    public void printNote() {
        System.out.println("******************************");
        System.out.println("Student is name: " + this.name);
        System.out.println("Mathematics mid term grade: " + this.mathematics.midTermExam);
        System.out.println("Mathematics final grade: " + this.mathematics.finalExam);
        System.out.println("Physics mid term grade: " + this.physics.midTermExam);
        System.out.println("Physics final grade: " + this.physics.finalExam);
        System.out.println("English mid term grade: " + this.english.midTermExam);
        System.out.println("English final grade: " + this.english.finalExam);

    }
}
