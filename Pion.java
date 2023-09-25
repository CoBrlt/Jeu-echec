public class Pion extends Piece {

	public Pion(Couleur color, int numpiece){
		super(color, numpiece);
	}

	public String toString(){
		if(this.getCouleur().getColor() == "noir"){
			return "\u265F";
		}
	return "\u2659";
	}

	public boolean canMove(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		Piece pchoixcase = x.recupPiece(plat, choixcase);
		Piece pcoup = x.recupPiece(plat, coup);
		int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);

		int caseasuiv = recupNumcase(choixcase, plat);
		String caseasuivNom = recupNomcase(caseasuiv+1, plat);
		Piece caseasuivP = x.recupPiece(plat, caseasuivNom);

		int caseapreced = recupNumcase(choixcase, plat);
		String caseaprecedNom = recupNomcase(caseapreced-1, plat);
		Piece caseaprecedP = x.recupPiece(plat, caseaprecedNom);

		if(pchoixcase.getCouleur().getColor().equals("noir")){
			if((casea-1 == caseb && pcoup == null && unitecasea != 1) || (casea-2 == caseb && pcoup == null && unitecasea == 7 && caseaprecedP == null) || (((casea+9 == caseb && casea<80) || (casea-11 == caseb && casea>20)) && pcoup != null && unitecasea != 1)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if((casea+1 == caseb && pcoup == null && unitecasea != 8) || (casea+2 == caseb && pcoup == null && unitecasea == 2 && caseasuivP == null) || (((casea+11 == caseb && casea<80) || (casea-9 == caseb && casea>20)) && pcoup != null && unitecasea != 8)){
				return true;
			}
			else{
				return false;
			}
		}
	}

	public boolean bloque(String choixcase, Plateau plat, Joueur joueur){
		int casea = recupNumcase(choixcase, plat);
		if(joueur.getJcouleur().getColor() == "noir"){
			boolean a = !Verif.verifcoup(choixcase, recupNomcase(casea-1, plat), plat, joueur);
			boolean b = !Verif.verifcoup(choixcase, recupNomcase(casea-11, plat), plat, joueur);
			boolean c = !Verif.verifcoup(choixcase, recupNomcase(casea+9, plat), plat, joueur);
			return a && b && c;
		}

		else{
			boolean a = !Verif.verifcoup(choixcase, recupNomcase(casea+1, plat), plat, joueur);
			boolean b = !Verif.verifcoup(choixcase, recupNomcase(casea+11, plat), plat, joueur);
			boolean c = !Verif.verifcoup(choixcase, recupNomcase(casea-9, plat), plat, joueur);
			return a && b && c;
			
		}
	}
}
