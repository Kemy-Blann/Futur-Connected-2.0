import java.util.Random;

public class Test {
	
	public String f(int i){
		String rep;
		if(i < 0) rep="Tamer";
		else if(i==1) rep="Cocksucker";
		else if(i==2) rep="Mons t'es nul";
		else if(i==3) rep="Tonyo le bg";
		else rep="Arretez bande de cons";
		
		return rep;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Ça marche pour moi !"); //Kemy
		/*
		 * 
		 * Test pour voir si les push marchent
		 * 30/09 - 18h03
		 * 
		 */
		for(int i = 1; i <= 10; i++){
			Thread.sleep(1000);
			System.out.println("Phrase n°"+i);
		}
		System.out.println("Fin du programme !");
		/*
		 * 
		 * 
		 * Voir si un push fonctionne avec mon PC portable
		 * 30/09 - 18h23
		 * 
		 */
		 for(int i = 65; i< 75; i++){
			 Thread.sleep(1000);
			 System.out.print((char) i+"\t");
		 }
		 
		 System.out.println("\nAlors, impressionnés ?");
		 System.out.println("\nTellement :O"); //Xoli
		 
		 System.out.println(new Test().f(new Random().nextInt(10)));
	}
}
