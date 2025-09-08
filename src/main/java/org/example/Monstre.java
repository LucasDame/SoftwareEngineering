package org.example;

public class Monstre extends Personnages {

    public Monstre(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    private Void attaquer(Personnages p){
        if (this.isDead())return null ;
        int coup = this.getHP()/2;
        p.subitFrappe(coup);
        return null;
    }

    public Void subitFrappe(int coup) {
        this.addHP(-coup);
        if  (this.isDead())return null;
        blessure(this.getHP()/2);
        return null;
    }


}
