package projet;

public class Pion extends piece{
	
	public Pion(char couleur) {
		super('P', couleur);
	}

	public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
		boolean valid = false;
		
		
		int x = xDest - xOrig;
		if (x<0) x = -x;
		int y = yDest - yOrig;
		if (y<0) y=-y;
		
		
		
		if (x==1 && y==0) {
			if(this.getCouleur()=='b' && xOrig-xDest!=1 ) {
				return false;
			}
			
			if(this.getCouleur()=='n' && xOrig-xDest!=-1) {
				return false;
			}
			valid = true;
		}
		
		if (x==2 && y==0) {
			if(this.getCouleur()=='b' && xOrig==6) {
				valid = true;
			}
			if(this.getCouleur()=='n' && xOrig==1) {
				valid = true;
			}
		}
		
		return valid;
	}
	
}
