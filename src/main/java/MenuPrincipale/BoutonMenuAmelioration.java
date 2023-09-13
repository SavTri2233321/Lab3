package MenuPrincipale;

import MenuAmelioration.MenuAmelioration;
import com.example.lab32.HelloApplication;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BoutonMenuAmelioration extends Button{

    public BoutonMenuAmelioration(double coordonnéX, double coordonnéY, double grosseurX, double grosseurY, HelloApplication application) {
        super("Amelioration");
        this.setTranslateX(coordonnéX);
        this.setTranslateY(coordonnéY);
        this.setScaleX(grosseurX);
        this.setScaleY(grosseurY);
        this.setOnAction(event -> application.changerPourAmelioration());
    }


}
