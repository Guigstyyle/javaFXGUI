package com.example.partie2;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class EXO4event implements EventHandler<Event> {
    private Label topLabel;
    private Button bouton;
    private int cpt;

    private Pane pane;
    public EXO4event(Label helloLabel, Button bouton, int cpt, Pane pane) {
        this.topLabel = helloLabel;
        this.bouton = bouton;
        this.cpt = cpt;
        this.pane = pane;

    }

    @Override
    public void handle(Event event) {
        // Utiliser le Label récupéré
        ++cpt;
        topLabel.setText(bouton.getText()+" choisi "+ cpt +" fois");
        if(bouton.getText() == "Vert"){
            pane.setStyle("-fx-background-color: #52c478;");
        }
        if(bouton.getText() == "Bleu"){
            pane.setStyle("-fx-background-color: #00ffff;");
        }
        if(bouton.getText() == "Rouge"){
            pane.setStyle("-fx-background-color: red;");
        }
    }
}
