package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class EXERCICE1 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Création du conteneur principal
        VBox vbox = new VBox();

        // Création des élément de sous menu
        // Sous menu File
        MenuItem fileNew = new MenuItem("New");
        MenuItem fileOpen = new MenuItem("Open");
        MenuItem fileSave = new MenuItem("Save");
        MenuItem fileClose = new MenuItem("Close");

        // Sous menu Edit
        MenuItem editCut = new MenuItem("Cut");
        MenuItem editCopy = new MenuItem("Copy");
        MenuItem editPaste = new MenuItem("Paste");

        // Création du menu en haut
        Menu file = new Menu("File");
        file.getItems().addAll(fileNew,fileOpen,fileSave,fileClose);

        Menu edit = new Menu("Edit");
        edit.getItems().addAll(editCut,editCopy,editPaste);

        Menu help = new Menu("Help");
        MenuBar menuTopControl = new MenuBar(file,edit,help);



        //Création du milieu de la page
        HBox controlMilieu = new HBox();

        // Creation de l'espace pour les bouton
        VBox espaceBouton = new VBox();

        Label boutonLabel = new Label("Boutons :");
        Button bouton1 = new Button("Bouton1");
        Button bouton2 = new Button("Bouton2");
        Button bouton3 = new Button("Bouton3");

        espaceBouton.getChildren().addAll(boutonLabel,bouton1,bouton2,bouton3);

        //Creation de l'espace pour le texte
        GridPane formulaire = new GridPane();

        Label nameLabel = new Label("Name :");
        TextField nameTextField = new TextField();

        formulaire.add(nameLabel,0,0);
        formulaire.add(nameTextField,1,0);


        Label emailLabel = new Label("Email :");
        TextField emailTextField = new TextField();

        formulaire.add(emailLabel,0,1);
        formulaire.add(emailTextField,1,1);


        Label passwordLabel = new Label("Password :");
        TextField passwordTextField = new TextField();

        formulaire.add(passwordLabel,0,2);
        formulaire.add(passwordTextField,1,2);


        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");

        HBox submitCancel = new HBox();
        submitCancel.getChildren().addAll(submit,cancel);

        VBox vFormulaire = new VBox();
        vFormulaire.getChildren().addAll(formulaire,submitCancel);

        formulaire.getColumnConstraints().add(new ColumnConstraints(100));
        vFormulaire.setAlignment(Pos.CENTER);
        formulaire.setAlignment(Pos.CENTER);
        submit.setAlignment(Pos.CENTER);
        cancel.setAlignment(Pos.CENTER);
        submitCancel.setAlignment(Pos.CENTER);
        //ajout des elements à contolMilieu

        Separator bf = new Separator(Orientation.VERTICAL);


        controlMilieu.getChildren().addAll(espaceBouton,bf,vFormulaire);

        // création de controlBas
        HBox controlBas = new HBox();
        Label basPage = new Label("Ceci est un bas de page");
        controlBas.getChildren().add(basPage);

        //Positionnement des éléments

        controlBas.setAlignment(Pos.BOTTOM_CENTER );

        VBox.setVgrow(controlMilieu, Priority.ALWAYS );
        VBox.setVgrow(vFormulaire,Priority.ALWAYS);
        HBox.setHgrow(vFormulaire, Priority.ALWAYS );

        VBox.setVgrow(espaceBouton, Priority.ALWAYS);
        espaceBouton.setAlignment(Pos.CENTER);
        espaceBouton.setSpacing(10.0d);

        formulaire.setVgap(10);
        submitCancel.setSpacing(15);
        submitCancel.setPadding(new Insets(5.0d));
        // Ajout des contrôleurs au conteneur principal

        Separator bas = new Separator (Orientation.HORIZONTAL);
        vbox.getChildren().addAll(
                menuTopControl,
                controlMilieu,
                bas,
                controlBas
        );
        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premeier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
