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
            if (kashya.getIsDead() != true) {
                kashya.attack(Monsters.andariel);
                Monsters.andariel.attack(kashya);
            }

            if (akara.getIsDead() != true) {
                akara.attack(Monsters.blacksmith);
                Monsters.blacksmith.attack(akara);
            }

            if (gheed.getIsDead() != true) {
                gheed.attack(Monsters.andariel);
                Monsters.andariel.attack(gheed);
            }

            if (deckardCain.getIsDead() != true) {
                deckardCain.attack(Monsters.blacksmith);
                Monsters.blacksmith.attack(deckardCain);
            }

            if (warriv.getIsDead() != true) {
                warriv.attack(Monsters.andariel);
                Monsters.andariel.attack(warriv);
            }

            if (flawia.getIsDead() != true) {
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
