package org.example;

public class Sorcier extends Personnage {

    int power;

    public Sorcier(String name, int HP, int power) {
        super(name, HP);
        this.power = power;
    }



    public void attaquer(Personnage p){
        if (this.isDead())return ;
        int coup = this.getHP()*this.power;
        this.addHP(p.subitCharme(coup));
    }

    public int subitFrappe(int coup) {
        this.addHP(-coup);
        return 0;
    }

    public int subitCharme(int coup) {
        this.addHP(-coup);
        if  (this.isDead())return 0;
        return  this.getHP()/2;
    }

}
