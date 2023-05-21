package efs.task.oop;

public class ExtraordinaryVillager extends Villager{
    private boolean isDead=false;
    public enum Skill{
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private final String description;

        Skill(String description){
            this.description = description;
        }

        public String getDescription(){
            return this.description;
        }
    }

    private Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill){
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm "+getName()+" and I'm "+getAge()+" years old. "+skill.getDescription());
    }

    @Override
    public void attack(Fighter victim){
        if (isDead != true) {
            System.out.println("\nAktualnie walczacy osadnik to " + getName());
            victim.takeHit(0);
        }
    }

    @Override
    public void takeHit(int damage){
        if(isDead == false) {
            super.takeHit(100);
            isDead = true;
            System.out.println(getName() + " polegl w walce");
        }
    }
}
