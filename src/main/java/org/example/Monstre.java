package org.example;

public class Monstre extends Personnage {

    public Monstre(String name, int HP) {
        super(name, HP);
    }

    public void attaquer(Personnage p){
        if (this.isDead())return ;
        int coup = this.getHP()/2;
        this.addHP(- p.subitFrappe(coup));
    }

    public int subitFrappe(int coup) {
        this.addHP(-coup);
        if  (this.isDead()){
            System.out.println(this);
            return 0;
        }
        return this.getHP()/2;
    }

    public int subitCharme(int coup) {
        this.addHP(-coup);
        if  (this.isDead()){
            System.out.println(this);
            return 0;
        }
        return this.getHP()/2;
    }

}
