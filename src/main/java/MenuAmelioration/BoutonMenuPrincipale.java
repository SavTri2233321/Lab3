package MenuAmelioration;

import MenuPrincipale.BoutonMenuAmelioration;
import com.example.lab32.HelloApplication;
import javafx.scene.control.Button;

public class BoutonMenuPrincipale extends Button {

    public BoutonMenuPrincipale(double coordonnéX, double coordonnéY, double grosseurX, double grosseurY, HelloApplication application) {
        super("Principale");
        this.setTranslateX(coordonnéX);
        this.setTranslateY(coordonnéY);
        this.setScaleX(grosseurX);
        this.setScaleY(grosseurY);
        this.setOnAction(actionEvent -> application.changerPourPrincipale());
    }
}
