package efs.task.oop;


abstract class Monster implements Fighter{
    private int health;
    private int damage;
    public Monster(int health, int damage){
        this.health = health;
        this.damage = damage;
    }
    public int getHealth(){
        return this.health;
    }

    public int getDamage(){
        return this.damage;
    }

    public void attack(Fighter victim){
        if (health > 0){
            victim.takeHit(damage);
        }
    }
    public void takeHit(int damage){
        this.health -= damage;
        if (this.health <= 0){
            this.health = 0;
        }
    }
}
