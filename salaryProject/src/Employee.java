public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    //salary tax
    public double tax(){
        if(salary <= 1000){
            return 0;
        } else {
            return salary * 0.03;
        }
    }
    //bonus => if work hours > 40 every times * 30
    public int bonus(){
        if(workHours > 40){
            return (workHours - 40) * 30;
        }else {
            return 0;
        }
    }

    //experience<5 salary *0.05
    //9<experience<20 salary *0.10
    //experience>19 salary *0.15
    public double raiseSalary(){
        if(hireYear <=0 || hireYear > 2021){
            System.out.println("Wrong value, Please try again.");
        }else{
            int experience = 2021 - hireYear;
            if(experience < 5) return salary * 0.05;
            if(experience > 9 && experience < 20) return salary * 0.10;
            if(experience > 19) return salary * 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        //salary +bonus +raiseSalary -tax
        double totalSalary = salary - tax() + bonus() + raiseSalary();
        double total       = salary - tax() + bonus();

        return  "Name: " + name + '\n' +
                "Salary: " + salary + '\n' +
                "Work Hours: " + workHours + '\n' +
                "Hire Year: " + hireYear + '\n' +
                "Tax: " + tax() + '\n' +
                "Bonus: " + bonus() + '\n' +
                "Raise Salary: " + raiseSalary() + '\n' +
                "Tax and Bonus + Salary: " + total + '\n' +
                "Total salary: " + totalSalary;
    }
}
