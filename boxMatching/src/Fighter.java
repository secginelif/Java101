public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    //punch damage
    int hit(Fighter fgh){
        System.out.println(this.name + " => " + fgh.name + " " + this.damage + " hit the damage");

        if(fgh.isDodge()){
            System.out.println(fgh.name + " blocked incoming damage");
            return fgh.health;
        }
        if(fgh.health - this.damage <= 0 ){
            return 0;
        }
        return fgh.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
