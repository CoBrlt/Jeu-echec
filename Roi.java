public class Roi extends Piece {

	public Roi(Couleur color, int numpiece){
		super(color, numpiece);
	}

	public String toString(){
		if(this.getCouleur().getColor() == "noir"){
			return "\u265A";
		}
	return "\u2654";
	}

	public boolean canMove(String choixcase, String coup, Plateau plat){
		//Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);

		if((casea+1 == caseb && unitecasea<8) || (casea+11 == caseb && unitecasea<8 && casea<80) || (casea+1 == caseb && casea<80) || (casea+9 == caseb && casea<80 && unitecasea>1) || (casea-1 == caseb && unitecasea>1) || (casea-11 == caseb && unitecasea>1 && casea>20) || (casea-10 == caseb && casea>20) || (casea-9 == caseb && casea>20 && unitecasea<8) || (casea+10 == caseb && casea<80)){
			return true;
		}
		else{
			return false;
		}

	}

	public boolean bloque(String choixcase, Plateau plat, Joueur inverseJ){
		return false;
	}

}