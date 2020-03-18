package traore.Exercice_DIP;

import java.time.LocalDateTime;

/**
 * 
 * Classe Affichage
 *
 */

public class Affichage implements Logger{
	public void affichage()
	{
		System.out.println(LocalDateTime.now() + ": Début de uneMethodeMetier");
		System.out.println(LocalDateTime.now() + ": fin de uneMethodeMetier");
	}
}
