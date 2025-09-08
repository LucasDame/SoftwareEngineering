package org.example;

public class Sorcier extends Personnage {

    float power = (float) Math.random();

    public Sorcier(String name, int HP) {
        super(name, HP);
    }



    public void attaquer(Personnage p){
        if (this.isDead())return ;
        int coup = (int) (this.getHP()*this.power);
        this.addHP(p.subitCharme(coup));
    }

    public int subitFrappe(int coup) {
        this.addHP(-coup);
        if  (this.isDead()){
            System.out.println(this);
        }
        return (int) (this.getHP()*this.power);
    }

    public int subitCharme(int coup) {
        this.addHP(-coup);
        if  (this.isDead()){
            System.out.println(this);
            return 0;
        }
        return  0;
    }

}
