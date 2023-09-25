public abstract class Piece {

	private Couleur couleur;
	private int numpiece;

	public Piece(Couleur color, int numpiece){
		this.couleur = color;
		this.numpiece = numpiece;
	}

	public Couleur getCouleur(){
		return this.couleur;
	}

	public int getNumpiece(){
		return this.numpiece;
	}

	public abstract boolean canMove(String choixcase, String coup, Plateau plat);

	public static int recupNumcase(String casedo, Plateau plat){
		for(int i=0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getNomcase().equals(casedo)){
				return plat.getCases().get(i).getNumcase();
			}
		}
		return 0;
	}

	public static String recupNomcase(int casedo, Plateau plat){
		for(int i=0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getNumcase()==casedo){
				return plat.getCases().get(i).getNomcase();
			}
		}
		return "";
	}

	public static int recupUnite(int chiffre){
		if(chiffre>=81){
			return chiffre-80;
		}
		else if(chiffre>=71){
			return chiffre-70;
		}
		else if(chiffre>=61){
			return chiffre-60;
		}
		else if(chiffre>=51){
			return chiffre-50;
		}
		else if(chiffre>=41){
			return chiffre-40;
		}
		else if(chiffre>=31){
			return chiffre-30;
		}
		else if(chiffre>=21){
			return chiffre-20;
		}
		else{
			return chiffre-10;
		}
	}

	public abstract boolean bloque(String choixcase, Plateau plat, Joueur inverseJ);

	public boolean equals(Piece piece){
		if(piece.getClass().equals(this.getClass()) && this.numpiece == piece.getNumpiece() && this.couleur.getColor().equals(piece.getCouleur().getColor())){
			return true;
		}
		else{
			return false;
		}
	}
}
 
