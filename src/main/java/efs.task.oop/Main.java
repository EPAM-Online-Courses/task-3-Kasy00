package efs.task.oop;


public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();
        while (Monsters.monstersHealth > 0) {
            if (kashya.getHealth() > 0) {
                kashya.attack(Monsters.andariel);
                Monsters.andariel.attack(kashya);
            }

            if (akara.getHealth() > 0) {
                akara.attack(Monsters.blacksmith);
                Monsters.blacksmith.attack(akara);
            }

            if (gheed.getHealth() > 0) {
                gheed.attack(Monsters.andariel);
                Monsters.andariel.attack(gheed);
            }

            if (deckardCain.getHealth() > 0) {
                deckardCain.attack(Monsters.blacksmith);
                Monsters.blacksmith.attack(deckardCain);
            }

            if (warriv.getHealth() > 0) {
                warriv.attack(Monsters.andariel);
                Monsters.andariel.attack(warriv);
            }

            if (flawia.getHealth() > 0) {
                flawia.attack(Monsters.blacksmith);
                Monsters.blacksmith.attack(flawia);
            }
            System.out.println("\nPotwory posiadaja jeszcze "+Monsters.monstersHealth+" punkty zycia");
        }
        System.out.println("\nObozowisko ocalone!");

        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara = (ExtraordinaryVillager) objectAkara;
    }
}
