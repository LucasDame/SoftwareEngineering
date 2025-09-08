package org.example;

public abstract class Personnage {

    String name;
    int HP;

    public Personnage(String name, int HP) {
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

    public void addHP(int HP) {
        this.HP += HP;
    }

    public abstract void attaquer(Personnage p);
    public abstract int subitFrappe(int coup);
    public abstract int subitCharme(int coup);
}
