package com.example.lab32;

import MenuAmelioration.MenuAmelioration;
import MenuPrincipale.MenuPrincipale;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Stack;

public class HelloApplication extends Application {

    MenuPrincipale menuPrincipale = new MenuPrincipale(this);
    MenuAmelioration menuAmelioration = new MenuAmelioration(menuPrincipale,this);
    Scene sceneAmelioration;
    Scene scenePrincipale;
    Stack<Scene> pileDeScene = new Stack<>();

    int nbDeBiscuits;
    Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scenePrincipale = new Scene(menuPrincipale);
        sceneAmelioration = new Scene(menuAmelioration);
        pileDeScene.add(scenePrincipale);
        stage.setTitle("CookieClicker");
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setScene(scenePrincipale);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void changerPourAmelioration() {
        stage.setScene(sceneAmelioration);
    }

    public void changerPourPrincipale() {
        stage.setScene(scenePrincipale);
    }

    public MenuPrincipale getMenuPrincipale() {
        return menuPrincipale;
    }
}