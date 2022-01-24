package projet;

public class Roi extends piece {

	public Roi(char couleur) {
		super('R', couleur) ;
	}
	
	public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
		boolean valid = false;
		
		int x = xDest - xOrig;
		if (x<0) x = -x;
		int y = yDest - yOrig;
		if (y<0) y=-y;
		
				
		if (x>=0 && x<=1 && y>=0 && y<=1) {
			valid = true;
		}
		return valid;
	}
	
	
}
