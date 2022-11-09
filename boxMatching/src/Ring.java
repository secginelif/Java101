public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            int i=1;
            while (f1.health >0 && f2.health >0){
                System.out.println("---- ROUND "+i+"---- ");
                i++;

                int chance  = (int)(Math.random() * 2); //

                if(chance == 0){
                    f2.health = f1.hit(f2);
                    if(isWin()) break;
                    f1.health = f2.hit(f1);
                    if(isWin()) break;
                }
                if(chance == 1){
                    f2.health = f1.hit(f2);
                    if(isWin()) break;
                    f1.health = f2.hit(f1);
                    if(isWin()) break;
                }
                printScore();
            }
        }else {
            System.out.println("Wrong matching");
        }
    }

    public boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight<= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin(){
        if(f1.health == 0){
            System.out.println(f2.name + " **WON** ");
            return true;
        }
        if(f2.health == 0){
            System.out.println(f1.name + " **WON** ");
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("----------------------");
        System.out.println(f1.name + " remaining life: " + f1.health);
        System.out.println(f2.name + " remaining life:  " + f2.health);
    }
}
