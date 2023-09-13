package MenuPrincipale;

import com.example.lab32.HelloApplication;
import javafx.scene.Group;
import javafx.scene.control.Label;

public class MenuPrincipale extends Group {
    private int nbDeBiscuit;
    private final BoutonBiscuit boutonBiscuit = new BoutonBiscuit(150,90, 3,3,this);
    private final Label texteNbBiscuit = new Label("Biscuit : " + this.nbDeBiscuit);
    public MenuPrincipale(HelloApplication application) {
        super();
        this.getChildren().add(boutonBiscuit);
        this.getChildren().add(texteNbBiscuit);
        this.getChildren().add(new BoutonMenuAmelioration(400,500,2,2,application));
    }
    public void setNbDePoint(int nbDeBiscuit) {
        this.nbDeBiscuit = nbDeBiscuit;
        this.texteNbBiscuit.setText("Biscuit : " + this.nbDeBiscuit);
    }

    public int getNbDeBiscuit() {
        return nbDeBiscuit;
    }

    public BoutonBiscuit getBoutonBiscuit() {
        return boutonBiscuit;
    }
}
