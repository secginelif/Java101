public class Main {
    public static void main(String[] args) {

        //employees salaries
        Employee worker1 = new Employee("Ahmet Lavik",2000,45,1994);
        Employee worker2 = new Employee("Ekin Sezer",2000,45,2003);
        Employee worker3 = new Employee("Davut Kor",2000,45,2011);

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(worker3.toString());
    }
}
