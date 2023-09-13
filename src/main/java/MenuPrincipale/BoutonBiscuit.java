package MenuPrincipale;
import com.example.lab32.HelloApplication;
import javafx.scene.control.Button;


public class BoutonBiscuit extends Button{

    int valeurAjouter = 1;
        public BoutonBiscuit(double coordonnéX, double coordonnéY, double grosseurX, double grosseurY, MenuPrincipale menuPricipalne) {
            super("Biscuit");
            this.setTranslateX(coordonnéX);
            this.setTranslateY(coordonnéY);
            this.setScaleX(grosseurX);
            this.setScaleY(grosseurY);
            this.setOnAction(event -> menuPricipalne.setNbDePoint((menuPricipalne.getNbDeBiscuit()) + valeurAjouter));
        }

    public void setValeurAjouter(int valeurAjouter) {
        this.valeurAjouter = valeurAjouter;
    }

    public int getValeurAjouter() {
        return valeurAjouter;
    }
}
