package MenuAmelioration;

import MenuPrincipale.MenuPrincipale;
import com.example.lab32.HelloApplication;
import javafx.scene.control.Label;

public class NbDeBiscuitPossede extends Label {

    public NbDeBiscuitPossede(MenuPrincipale menuPrincipale) {
        super("Nombre de biscuit" + menuPrincipale.getNbDeBiscuit());
    }

}
