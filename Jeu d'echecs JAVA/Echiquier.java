package projet;

public class Echiquier {

	/**
	 * Plateau
	 */
	

	private piece[][]plateau = new piece[8][8];
	
	private char tour = 'b';
	
	public Echiquier() {
		/**
		 * Placement des pieces
		 */
	
	this.plateau[0][0] = new Tour('n');
	this.plateau[0][1] = new Cavalier('n');
	this.plateau[0][2] = new Fou('n');
	this.plateau[0][3] = new Dame('n');
	this.plateau[0][4] = new Roi('n');
	this.plateau[0][5] = new Fou('n');
	this.plateau[0][6] = new Cavalier('n');
	this.plateau[0][7] = new Tour('n');
	
	this.plateau[7][0] = new Tour('b');
	this.plateau[7][1] = new Cavalier('b');
	this.plateau[7][2] = new Fou('b');
	this.plateau[7][3] = new Dame('b');
	this.plateau[7][4] = new Roi('b');
	this.plateau[7][5] = new Fou('b');
	this.plateau[7][6] = new Cavalier('b');
	this.plateau[7][7] = new Tour('b');
	
	/**
	 * Placement des pions
	 */
	
	this.plateau[1][0] = new Pion('n');
	this.plateau[1][1] = new Pion('n');
	this.plateau[1][2] = new Pion('n');
	this.plateau[1][3] = new Pion('n');
	this.plateau[1][4] = new Pion('n');
	this.plateau[1][5] = new Pion('n');
	this.plateau[1][6] = new Pion('n');
	this.plateau[1][7] = new Pion('n');
	
	
	this.plateau[6][0] = new Pion('b');
	this.plateau[6][1] = new Pion('b');
	this.plateau[6][2] = new Pion('b');
	this.plateau[6][3] = new Pion('b');
	this.plateau[6][4] = new Pion('b');
	this.plateau[6][5] = new Pion('b');
	this.plateau[6][6] = new Pion('b');
	this.plateau[6][7] = new Pion('b');
	
	
	
	}
	
	public void affichage() {
		System.out.println("      0    1    2    3    4    5    6    7    ");
		System.out.println("   -----------------------------------------");
		for (int i = 0 ; i<8; i++) {
			System.out.print(i+ "  ");
			for(int j =0 ; j<8;j++) {
				if (plateau [i][j]!= null) {
					System.out.print("| " + plateau[i][j].toString()+ " ");
				}
				else {
					System.out.print("|    ");
				}	
			}
			System.out.println("|  " + i);
			System.out.println("   -----------------------------------------");
		}
		System.out.println("      0    1    2    3    4    5    6    7    ");
	}
	
	public boolean moveTo(int xOrig, int yOrig, int xDest, int yDest){
		if(xOrig == xDest && yOrig == yDest) {
			return false;
		}
		if(xOrig < 0 || xOrig > 7 || xDest <0 || yDest >7) {
			return false;
		}
		if(plateau[xOrig][yOrig] == null) {
			return false;
		}
		if (plateau[xOrig][yOrig].getCouleur() != tour) {
			return false;
		}
		if(plateau[xDest][yDest] != null) {
			if(plateau[xDest][yDest].getCouleur() == plateau[xOrig][yOrig].getCouleur()) {
				return false;
			}
		}
		if (! plateau[xOrig][yOrig].isValid(xOrig, yOrig, xDest, yDest)) {
			return false;
		}
		
		if(plateau[xOrig][yOrig].surChem(xOrig,yOrig,xDest,yDest,plateau)) {
			return false;
		}
		
		
		plateau[xDest][yDest]=plateau[xOrig][yOrig];
		plateau[xOrig][yOrig] = null;
		
		if (tour == 'n') {
			tour = 'b';
			System.out.println("Au tour des blancs");
		}
		else {
			tour = 'n';
			System.out.println("Au tour des noirs");
		}
		
	return true;
	
	}
}

