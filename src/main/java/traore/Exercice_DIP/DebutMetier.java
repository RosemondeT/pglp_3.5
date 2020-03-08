package traore.Exercice_DIP;

import java.time.LocalDateTime;

/*
 * Classe DebutMetier qui implemente l'interface ClasseMetier
 */
public class DebutMetier implements ClasseMetier {
	public void MethodeMetier() {
		System.out.println(LocalDateTime.now() + ": Début de uneMethodeMetier");
		}
}
