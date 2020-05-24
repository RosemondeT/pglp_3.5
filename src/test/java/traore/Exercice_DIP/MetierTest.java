package traore.Exercice_DIP;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetierTest {


    @Test
    public void displays() {    	
    	Metier m = new Metier();
    	Logger l = new Affichage();
    	m.affichage(l);
    }
}
