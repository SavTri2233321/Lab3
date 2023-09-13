package MenuAmelioration;

import MenuPrincipale.MenuPrincipale;
import javafx.scene.control.Button;

public class BoutonAmelioration2 extends Button {


    public BoutonAmelioration2(double coordonnéX, double coordonnéY, double grosseurX, double grosseurY) {
        super("Ajouter un clic auto par 60 secondes");
        this.setTranslateX(coordonnéX);
        this.setTranslateY(coordonnéY);
        this.setScaleX(grosseurX);
        this.setScaleY(grosseurY);


    }
}

