package traore.Exercice_DIP;

import java.time.LocalDateTime;

/*
 * Classe FinMetier qui implémente l'interface ClasseMetier
 */

public class FinMetier implements ClasseMetier{
	public void MethodeMetier() {
		System.out.println(LocalDateTime.now() + ": fin de uneMethodeMetier");
		}
}
