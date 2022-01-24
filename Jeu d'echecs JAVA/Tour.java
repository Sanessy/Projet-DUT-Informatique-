package projet;

public class Tour extends piece {

	public Tour(char couleur) {
		super('T', couleur);
	}
	
	public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
		boolean valid = false;
		
		if((xOrig == xDest && yOrig != yDest) || (xOrig != xDest && yOrig == yDest)) {
			valid = true;
		}
		
		return valid;
		}
	public boolean surChem(int xOrig, int yOrig, int xDest, int yDest,piece[][] plateau) {

	boolean chemin = false;
	
	int xStart = xOrig;
	int xEnd = xDest;
	int yStart = yOrig;
	int yEnd = yDest;
	
	if(xOrig > xDest) {
		xStart = xDest+1;
		xEnd = xOrig-1;
	}
	else if (xDest > xOrig) {
		xStart = xOrig+1;
		xEnd = xDest-1;
	}
	
	if(yOrig > yDest) {
		yStart = yDest+1;
		yEnd = yOrig-1;
	}
	
	else if (yDest > yOrig) {
		yStart = yOrig+1;
		yEnd = yDest-1;
	}
	
	for(int i = xStart ; i<= xEnd ; i++) {
		for(int j = yStart ; j<= yEnd ; j++) {
			
		
			if(plateau[i][j]!= null) {
				chemin = true;
			}
			}
		
		}
	return chemin;
	}
}
