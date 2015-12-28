package jeuMenhir;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by morgane on 07/11/15.
 */
public class Main{		//variables pour menhir et graine dans le main ou dans cartes????
        public static void main (String[] args){
            // TODO Auto-generated method stub
            //Lampe l= new Lampe();
            // Commutateur c= new Commutateur(l);
            InterfaceGraphique vueFenetre=new InterfaceGraphique();
            vueFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vueFenetre.pack();
            vueFenetre.setVisible(true);
            int nbrJoueur , nbrJoueurOrdi, typePartie, nbrJoueurReel ;
            boolean estPartieRapide, isEntier = true ;
            Partie partie;
            Scanner sc;
            nbrJoueur = FonctionScan.recuperEntierEntrerCla("Nombre de joueur participant ? :");
            while (nbrJoueur <= 1 || nbrJoueur > 8){
                nbrJoueur = FonctionScan.recuperEntierEntrerCla("Nombre de joueur participant ? :( doit être inferieur à 8 et supèrieur à 1)");
            }
            System.out.println("Vous avez saisi : " + nbrJoueur);
            nbrJoueurOrdi = FonctionScan.recuperEntierEntrerCla("Combien de joueur ordinateur? ( il est possible de faire une partie qu'avec des robots )");
            while (nbrJoueurOrdi > nbrJoueur){
                nbrJoueurOrdi = FonctionScan.recuperEntierEntrerCla("Combien de joueur ordinateur? ( il ne peux pas y avoir plus de joueurs ordinateurs que de joueur au total )");
            }
            nbrJoueurReel = nbrJoueur-nbrJoueurOrdi;
            System.out.println("Cette parti aura donc : " + nbrJoueurOrdi + "joueur ordinateur et " + nbrJoueurReel + " joueur reel ");
            System.out.println("Voulez vous faire une partie rapide ou une partie avancée ? ");
            typePartie = FonctionScan.recuperEntierEntrerCla("taper 1 pour faire une partie rapide et 2 pour faire une partie avancée");
            while (!(typePartie==1 || typePartie ==2)){
                typePartie = FonctionScan.recuperEntierEntrerCla("taper 1 pour faire une partie rapide et 2 pour faire une partie avancée");
            }
            if(typePartie == 1){
               estPartieRapide = true;
            }else{
               estPartieRapide = false;
            }
            partie = new Partie(nbrJoueurReel,nbrJoueurOrdi, estPartieRapide);



        }


}
