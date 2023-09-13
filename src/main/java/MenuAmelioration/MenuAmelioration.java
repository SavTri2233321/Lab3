package MenuAmelioration;

import MenuPrincipale.BoutonBiscuit;
import MenuPrincipale.MenuPrincipale;
import com.example.lab32.HelloApplication;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MenuAmelioration extends Group {

    private Label texteNbBiscuit = new Label("Biscuit : " + this.nbDeBiscuit);
    public MenuAmelioration(MenuPrincipale menuPrincipale, HelloApplication helloApplication){
        super();
        BouttonAmelioration1 bouttonAmelioration1 = new BouttonAmelioration1(50,40,2,2, menuPrincipale,helloApplication );
        this.getChildren().add(bouttonAmelioration1);
        this.getChildren().add(new BoutonAmelioration2(200,90,2,2));
        this.getChildren().add(new BoutonMenuPrincipale(400,400,2,2,helloApplication));
        this.getChildren().add(bouttonAmelioration1.getLabePrixPourPouvoirAmeliorer());
        texteNbBiscuit = new Label("Biscuit : " + menuPrincipale.getNbDeBiscuit());

    }

}
