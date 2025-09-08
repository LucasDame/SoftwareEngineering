package org.example;

public class Personnages {

    String name;
    int HP;

    public Personnages(String name, int HP, String type) {
        this.name = name;
        this.HP = HP;
    }

    public String Affichage() {
        if (isDead()) {
            return name + " est mort.";
        }
        return "Je m'appelle " + name + " et j'ai " + HP + " points de vies.";
    }

    public Boolean isDead() {
        return HP <= 0;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public Void addHP(int HP) {
        this.HP += HP;
        return null;
    }

    public Void blessure(int coup) {
        this.addHP(-coup);
        return null;
    }

}
