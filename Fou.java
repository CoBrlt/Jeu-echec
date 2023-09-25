public class Fou extends Piece {
	
	public Fou(Couleur color, int numpiece){
		super(color, numpiece);
	}

	public String toString(){
		if(this.getCouleur().getColor() == "noir"){
			return "\u265D";
		}
	return "\u2657";
	}

	public boolean versHautDroite(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		//int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);
		for(int i = casea+11; i<=88; i=i+11){//vers haut droite
			if(i == caseb){
				for(int j = casea+11; j<caseb; j=j+11){
					String nom = recupNomcase(j, plat);
					Piece y = x.recupPiece(plat, nom);
					if(y != null){
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean versBasDroite(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		int unitecasea = recupUnite(casea);
		int unitecasei = unitecasea;
		//int unitecaseb = recupUnite(caseb);
		for(int i = casea+9; i<=88 && unitecasei>1; i=i+9){//vers bas droit
			unitecasei = recupUnite(i);
			if(i == caseb){
				for(int j = casea+9; j<caseb; j=j+9){
					String nom = recupNomcase(j, plat);
					Piece y = x.recupPiece(plat, nom);
					if(y != null){
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean versBasGauche(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		//int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);
		for(int i = casea-11; i>=11; i=i-11){//vers bas gauche
			if(i == caseb){
				for(int j = casea-11; j>caseb; j=j-11){
					String nom = recupNomcase(j, plat);
					Piece y = x.recupPiece(plat, nom);
					if(y != null){
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean versHautGauche(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		//int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);
		for(int i = casea-9; i>=11; i=i-9){//vers haut gauche
			if(i == caseb){
				for(int j = casea-9; j>caseb; j=j-9){
					String nom = recupNomcase(j, plat);
					Piece y = x.recupPiece(plat, nom);
					if(y != null){
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean canMove(String choixcase, String coup, Plateau plat){
		//Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		//int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);
		

		if(casea<80 && casea>20 && unitecasea>1 && unitecasea<8){
			return versHautGauche(choixcase, coup, plat) || versBasGauche(choixcase, coup, plat) || versHautDroite(choixcase, coup, plat) || versBasDroite(choixcase, coup, plat);
			//return a && b && c && d;
		}
		else if(casea<80 && casea>20 && unitecasea>1 && unitecasea == 8){
			return versBasDroite(choixcase, coup, plat) || versBasGauche(choixcase, coup, plat);
			//return c && d;
		}
		else if(casea<80 && casea>20 && unitecasea == 1 && unitecasea<8){
			return versHautDroite(choixcase, coup, plat) || versHautGauche(choixcase, coup, plat);
			//return a && b;
		}
		else if(casea<88 && casea>80 && unitecasea>1 && unitecasea<8){
			return versHautGauche(choixcase, coup, plat) || versBasGauche(choixcase, coup, plat);
			//return a && d;
		}
		else if(casea<18 && casea>11 && unitecasea>1 && unitecasea<8){
			return versHautDroite(choixcase, coup, plat) || versBasDroite(choixcase, coup, plat);
			//return b && c;
		}
		else if(casea == 81){
			return versHautGauche(choixcase, coup, plat);
			//return a;
		}
		else if(casea == 88){
			return versBasGauche(choixcase, coup, plat);
			//return d;
		}
		else if(casea == 18){
			return versBasDroite(choixcase, coup, plat);
			//return c;
		}
		else if(casea == 11){
			return versHautDroite(choixcase, coup, plat);
			//return b;
		}
		else{
			return false;
		}
		/*if(casea<caseb){
			for(int i = casea+11; i<=88; i=i+11){//vers haut droite
				System.out.println("1A");
				if(i == caseb){
					System.out.println("1B");
					for(int j = casea+11; j<caseb; j=j+11){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}

			for(int i = casea+9; i<=88 && unitecasea>1; i=i+9){//vers bas droit
				System.out.println("2A");
				if(i == caseb){
					System.out.println("2B");
					for(int j = casea+9; j<caseb; j=j+9){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}
		}
		else if(casea>caseb){
			for(int i = casea-11; i>=11; i=i-11){//vers bas gauche
				System.out.println("3A");
				if(i == caseb){
					System.out.println("3B");
					for(int j = casea-11; j>caseb; j=j-11){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}

			for(int i = casea-9; i>=11; i=i-9){//vers haut gauche
				System.out.println("4A");
				if(i == caseb){
					System.out.println("4B");
					for(int j = casea-9; j>caseb; j=j-9){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}
		}
		else{
			System.out.println("Cancel num1 du fou");
			return false;
		}
		System.out.println("Cancel num2 du Fou");
		return false;*/
	}


	public boolean bloque(String choixcase, Plateau plat, Joueur joueur){
		int casea = recupNumcase(choixcase, plat);
		int unitecasea = recupUnite(casea);
		boolean a = !Verif.verifcoup(choixcase, recupNomcase(casea-9, plat), plat, joueur);//à tester mais les points d'exclamation sont pour mettre des true qui le piece est bloqué
		boolean b = !Verif.verifcoup(choixcase, recupNomcase(casea+11, plat), plat, joueur);//avec les && ça fait 1 && 1 && 1 = 1 donc on renvoit true si la piece est bloqué
		boolean c = !Verif.verifcoup(choixcase, recupNomcase(casea+9, plat), plat, joueur);
		boolean d = !Verif.verifcoup(choixcase, recupNomcase(casea-11, plat), plat, joueur);

		if(casea<80 && casea>20 && unitecasea>1 && unitecasea<8){
			return a && b && c && d; //il faut que tout les coups soit à false
		}
		else if(casea<80 && casea>20 && unitecasea>1 && unitecasea == 8){
			return c && d;
		}
		else if(casea<80 && casea>20 && unitecasea == 1 && unitecasea<8){
			return a && b;
		}
		else if(casea<88 && casea>80 && unitecasea>1 && unitecasea<8){
			return a && d;
		}
		else if(casea<18 && casea>11 && unitecasea>1 && unitecasea<8){
			return b && c;
		}
		else if(casea == 81){
			return a;
		}
		else if(casea == 88){
			return d;
		}
		else if(casea == 18){
			return c;
		}
		else{
			return b;
		}
	}
}