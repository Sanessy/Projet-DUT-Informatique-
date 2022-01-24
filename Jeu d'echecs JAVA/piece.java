package projet;

public class piece {
	
	/**type de la piece**/
	
	private char type ;
	
	/**couleur de la piece
	 * **/
	private char couleur ;
	
	
	
	public piece(char type, char couleur) {
		this.type = type ;
		this.couleur = couleur ;
	}
	
	public String toString() {
		String res =""+ this.type + this.couleur ; 
		return res ;
	}
	
	public char getCouleur() {
		return this.couleur ; 
	}

	
	public boolean isValid(int xOrig, int yOrig, int xDest, int yDest) {
		return false;
	}
	
	public boolean surChem(int xOrig, int yOrig, int xDest, int yDest,piece[][] plateau) {
		return false;
		}	
	
}
