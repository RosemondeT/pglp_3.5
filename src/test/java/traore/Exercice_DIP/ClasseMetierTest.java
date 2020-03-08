package traore.Exercice_DIP;



import org.junit.Before;


import junit.framework.TestCase;

public class ClasseMetierTest extends TestCase {
	ClasseMetier informaticen;
	DebutMetier debut;
	FinMetier fin;
	
	
	@Before
	  public void setup() {
		 debut = new DebutMetier();
		 fin = new FinMetier();
		
	
}
}
