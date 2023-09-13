package MenuAmelioration;

import MenuPrincipale.MenuPrincipale;
import com.example.lab32.HelloApplication;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BouttonAmelioration1 extends Button {

    int prixPourPouvoirAmeliorer= 1;
    Label labePrixPourPouvoirAmeliorer;

    public BouttonAmelioration1(double coordonnéX, double coordonnéY, double grosseurX, double grosseurY,MenuPrincipale menuPrincipale, HelloApplication helloApplication) {
        super("Augmenter de + 1");
        this.setTranslateX(coordonnéX);
        this.setTranslateY(coordonnéY);
        this.setScaleX(grosseurX);
        this.setScaleY(grosseurY);
        this.setOnAction(actionEvent -> { if(prixPourPouvoirAmeliorer <= menuPrincipale.getNbDeBiscuit()) {
            menuPrincipale.getBoutonBiscuit().setValeurAjouter(menuPrincipale.getBoutonBiscuit().getValeurAjouter() + 1);
            menuPrincipale.setNbDePoint((menuPrincipale.getNbDeBiscuit() - prixPourPouvoirAmeliorer));
            prixPourPouvoirAmeliorer*=4;
            labePrixPourPouvoirAmeliorer = new Label("Prix Amelioration" + this.prixPourPouvoirAmeliorer);
            helloApplication.changerPourAmelioration();


        }});
        this.labePrixPourPouvoirAmeliorer = new Label("Prix Amelioration" + this.prixPourPouvoirAmeliorer);
        labePrixPourPouvoirAmeliorer.setTranslateX(coordonnéX + 250);
        labePrixPourPouvoirAmeliorer.setTranslateY(coordonnéY);
        labePrixPourPouvoirAmeliorer.setScaleX(grosseurX);
        labePrixPourPouvoirAmeliorer.setScaleY(grosseurY);
    }

    public Label getLabePrixPourPouvoirAmeliorer() {
        return labePrixPourPouvoirAmeliorer;
    }

}


