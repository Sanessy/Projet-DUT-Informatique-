package projet;

public class Fou extends piece{
	public Fou(char couleur) {
		super('F', couleur);
	}
	
	public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
		boolean valid = false;		
		
		for(int i=0;i<8;i++) {
		if(xDest == xOrig+i && yDest==yOrig+i || xDest == xOrig-i && yDest==yOrig+i || xDest == xOrig+i && yDest==yOrig-i || xDest == xOrig-i && yDest==yOrig-i) {
			valid =true;
			}
		
		}
		return valid;
	}
	

}
