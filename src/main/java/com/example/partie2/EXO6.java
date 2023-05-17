package com.example.partie2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.ArrayList;

public class EXO6 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        int nbVie = 7;
        Label labelNbVie = new Label("Nombre de vies : "+ nbVie);

        TextField proposition = new TextField("Enter une lettre");

        String reponse = new Dico().getMot();

        String reponseCachee = "";
        for (Character c: reponse.toCharArray()) {
            reponseCachee = reponseCachee+"*";
        }
        Image pendu = new Image(EXO6.class.getResourceAsStream("pendu7.png"));
        ImageView vuePendu = new ImageView(pendu);
        Label labelReponseCachee = new Label(reponseCachee);
        proposition.addEventHandler(ActionEvent.ACTION, new EXO6event(labelNbVie,labelReponseCachee,proposition,reponse,nbVie,vuePendu));

        FlowPane lettres = new FlowPane();
        for ( char c: "azertyuiopqsdfghjklmwxcvbn".toCharArray()) {
            lettres.getChildren().add(new Button( String.valueOf(c)));
        }
        VBox vbox = new VBox();
        vbox.setStyle("-fx-background-color: #a6fff8;");
        Scene scene = new Scene(vbox);

        vbox.getChildren().addAll(vuePendu,labelReponseCachee,labelNbVie,proposition,lettres);
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Le pendu (moi)");

        // Affichage de la fenêtre
        primaryStage.show();

    }
}
