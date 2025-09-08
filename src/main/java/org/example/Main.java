package org.example;

public class Main {
    public static void main(String[] args) {

        //Variables
        int[] living = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] names = new String[]{"Hazem", "Guillaume", "Tom", "Golliot", "Jules",
                "Mae-Ly", "Pauline", "Balleret", "Basler", "Nadim"};
        Personnage[] persos = new Personnage[living.length];

        //Initialisation
        for (int i = 0; i < living.length / 2; i++) {
            persos[i] = new Monstre(names[i], (int) (Math.random() * 100));
        }
        for (int i = living.length / 2; i < living.length; i++) {
            persos[i] = new Sorcier(names[i], (int) (Math.random() * 100));
        }

        //Déroulement
        int n = 0;
        int taille = living.length;
        int[] r = new int[2];

        while (n < 100 && taille > 1) {
            // choisir deux personnages différents
            r[0] = (int) (Math.random() * taille);
            r[1] = (int) (Math.random() * taille);
            while (r[1] == r[0]) {
                r[1] = (int) (Math.random() * taille);
            }

            Personnage attaquant = persos[living[r[0]]];
            Personnage victime = persos[living[r[1]]];

            // attaque
            attaquant.attaquer(victime);
            System.out.println(attaquant.getName() + " attaque " + victime.getName());

            // vérifier si la victime est morte
            if (victime.isDead()) {
                System.out.println(victime.getName() + " est mort, tué par " + attaquant.getName() + " !");
                // supprimer la victime du tableau living
                for (int i = r[1]; i < taille - 1; i++) {
                    living[i] = living[i + 1];
                }
                taille--;
            }

            // vérifier si l’attaquant est mort après la riposte
            if (attaquant.isDead()) {
                System.out.println(attaquant.getName() + " est mort suite à la riposte de " + victime.getName() + " !");
                // supprimer l’attaquant
                for (int i = r[0]; i < taille - 1; i++) {
                    living[i] = living[i + 1];
                }
                taille--;
            }

            n++;
        }

        // Fin du jeu
        if (taille == 1) {
            System.out.println("Le vainqueur est " + persos[living[0]].getName() + " !");
        } else {
            System.out.println("Match nul après 100 tours !");
        }
    }
}
