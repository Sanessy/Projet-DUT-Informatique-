package projet;

public class Cavalier extends piece {
	public Cavalier(char couleur) {
		super('C', couleur);
	}
	
	
	public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
		boolean valid = false;
		
		int calcul = (xDest-xOrig)*(xDest-xOrig) + (yDest-yOrig)*(yDest-yOrig);
		if(calcul == 5) {
			valid = true;
		}
		
		return valid;
	}
}
