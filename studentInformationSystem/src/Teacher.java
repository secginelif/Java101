public class Teacher {
    //all teacher information
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    public void print() {
        System.out.println("**********************");
        System.out.println("The teacher added to the system");
        System.out.println("The teacher's name: " + this.name);
        System.out.println("The teacher's number: " + this.phoneNumber);
        System.out.println("The teacher's branch: " + this.branch);
    }
}
