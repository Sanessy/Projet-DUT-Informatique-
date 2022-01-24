package projet;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Echiquier echec = new Echiquier();
		echec.affichage();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir les coordonnées");
		int xOrig = scanner.nextInt();
		int yOrig = scanner.nextInt();
		int xDest = scanner.nextInt();
		int yDest = scanner.nextInt();
		
		while (xOrig >=0) {
			
			if (! echec.moveTo(xOrig,yOrig,xDest,yDest)) {
				System.out.println("Pas possible");
			}
			
			echec.affichage();
			
			System.out.println("Saisir les coordonnées");
			xOrig = scanner.nextInt();
			yOrig = scanner.nextInt();
			xDest = scanner.nextInt();
			yDest = scanner.nextInt();
			
			
	}
	
		
	}
}

