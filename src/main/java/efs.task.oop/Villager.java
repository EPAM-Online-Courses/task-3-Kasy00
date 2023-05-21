package efs.task.oop;


public class Villager implements Fighter{
    private String name;
    private int age;
    private int health=100;

    public Villager(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Greetings traveler... I'm "+this.name+" and I'm "+this.age+" years old");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getHealth(){
        return this.health;
    }

    private int calcDamage(){
        double dmg = (100 - age * 0.5) / 10;
        return (int) dmg;
    }
    @Override
    public void attack(Fighter victim){
        if(this.health > 0) {
            System.out.println("\nAktualnie walczacy osadnik to "+getName());
            int damage_v = calcDamage();
            victim.takeHit(damage_v);
        }
    }

    @Override
    public void takeHit(int damage){
        this.health -= damage;
        if (this.health <= 0){
            this.health = 0;
            System.out.println(getName()+" polegl w walce");
        }
    }
}

