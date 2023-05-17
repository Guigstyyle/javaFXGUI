package com.example.partie2;

import java.util.ArrayList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class EXO6event implements EventHandler<Event> {
    private Label labelNbVie;
    private Label reponseCachee;
    private TextField proposition;
    private String mot;
    private int nbVie;

    private ImageView pendu;


    public EXO6event(Label labelNbVie, Label reponseCachee, TextField proposition, String mot, int nbVie,ImageView pendu) {
        this.labelNbVie = labelNbVie;
        this.reponseCachee = reponseCachee;
        this.proposition = proposition;
        this.mot = mot;
        this.nbVie = nbVie;
        this.pendu = pendu;

    }

    ArrayList<Integer> getPositions(char lettre, String mot){
        ArrayList<Integer> emplacements = new ArrayList<Integer>();
        for (int i = 0; i < mot.length();++i){
            if (mot.charAt(i) == lettre){
                emplacements.add(i);
            }
        }
        return emplacements;
    }

    @Override
    public void handle(Event event) {
        ArrayList<Integer> emplacement= getPositions(proposition.getCharacters().charAt(0), mot);
        if (emplacement.isEmpty()){
            nbVie = nbVie -1;
            labelNbVie.setText("Nombre de vies : "+nbVie);
            if(nbVie == 6){
                pendu.setImage(new Image(EXO6.class.getResourceAsStream("pendu6.png")));
            }
            else if (nbVie == 5) {
                pendu.setImage(new Image(EXO6.class.getResourceAsStream("pendu5.png")));
            }
            else if (nbVie == 4) {
                pendu.setImage(new Image(EXO6.class.getResourceAsStream("pendu4.png")));
            }
            else if (nbVie == 3) {
                pendu.setImage(new Image(EXO6.class.getResourceAsStream("pendu3.png")));
            }
            else if (nbVie == 2) {
                pendu.setImage(new Image(EXO6.class.getResourceAsStream("pendu2.png")));
            }
            else if (nbVie == 1) {
                pendu.setImage(new Image(EXO6.class.getResourceAsStream("pendu1.png")));
            }
            else {
                pendu.setImage(new Image(EXO6.class.getResourceAsStream("pendu0.png")));
            }
        }
        else {
            StringBuilder aReveler = new StringBuilder(reponseCachee.getText());
            for ( int i : emplacement) {
                aReveler.setCharAt(i,mot.charAt(i));

            }
            reponseCachee.setText(String.valueOf(aReveler));
        }
    }
    }
