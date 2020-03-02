package traore.Exercice_DIP;

import java.time.LocalDateTime;

public class FinMetier implements ClasseMetier{
	public void MethodeMetier() {
		System.out.println(LocalDateTime.now() + ": fin de uneMethodeMetier");
		}
}
