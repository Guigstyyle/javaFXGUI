package com.example.partie2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EXO4 extends Application {

    private int cptRouge = 0;
    private int cptVert = 0;
    private int cptBleu = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Creatoin du borderPane
        BorderPane borderPane = new BorderPane();

        //TopLabel
        Label topLabel = new Label("test");
        HBox topHBox = new HBox(topLabel);
        topHBox.setAlignment(Pos.CENTER);
        borderPane.setTop(topHBox);
        Scene scene = new Scene(borderPane);



        //BottomButtons
        Button vert = new Button("Vert");
        Button rouge = new Button("Rouge");
        Button bleu = new Button("Bleu");
        //milieu

        Pane pane = new Pane();
        borderPane.setCenter(pane);
        //Button Events
        vert.addEventHandler(MouseEvent.MOUSE_CLICKED,  new EXO4event(topLabel ,vert,cptVert,pane ));
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED,  new EXO4event(topLabel ,rouge,cptRouge,pane ));
        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED,  new EXO4event(topLabel ,bleu,cptBleu,pane));

        HBox bottomHBox = new HBox(vert,rouge,bleu);
        bottomHBox.setAlignment(Pos.CENTER);
        bottomHBox.setSpacing(10);
        bottomHBox.setPadding(new Insets(5));
        borderPane.setBottom(bottomHBox);



        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 400 );
        primaryStage.setHeight( 200 );
        primaryStage.setTitle("Premeier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }
}
