package traore.Exercice_DIP;

import java.time.LocalDateTime;

public class DebutMetier implements ClasseMetier {
	public void MethodeMetier() {
		System.out.println(LocalDateTime.now() + ": Début de uneMethodeMetier");
		}
}
