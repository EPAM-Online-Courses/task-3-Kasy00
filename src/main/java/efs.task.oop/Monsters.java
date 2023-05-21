package efs.task.oop;


public class Monsters {
    static final Monster andariel = new Monster(10, 70){
        @Override
        public void attack(Fighter victim){
            if(andariel.getHealth() > 0) {
                victim.takeHit(getDamage());
            }
        }
        @Override
        public void takeHit(int damage){
            super.takeHit(damage);
            monstersHealth -= damage;
            if(monstersHealth <= 0){
                monstersHealth = 0;
            }
        }
    };
    static final Monster blacksmith = new Monster(100, 25){
        @Override
        public void attack(Fighter victim){
            if(blacksmith.getHealth() > 0) {
                victim.takeHit(getDamage());
            }
        }
        @Override
        public void takeHit(int damage){
            super.takeHit((5+damage));
            monstersHealth -= (5+damage);
            if(monstersHealth <= 0){
                monstersHealth = 0;
            }
        }
    };
    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();
}
