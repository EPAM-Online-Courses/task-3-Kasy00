package efs.task.oop;

abstract class Monster implements Fighter{
    private int health;
    private int damage;
    private Boolean isDead=false;

    protected Monster(int health, int damage){
        this.health = health;
        this.damage = damage;
    }
    public int getHealth(){
        return this.health;
    }

    public int getDamage(){
        return this.damage;
    }

    public Boolean getIsDead(){
        return this.isDead;
    }
    public void attack(Fighter victim){
        if (isDead != true){
            victim.takeHit(damage);
        }
    }
    public void takeHit(int damage){
        this.health -= damage;
        if (this.health <= 0){
            isDead = true;
        }
    }
}
