public class Tour extends Piece {

	public Tour(Couleur color, int numpiece){
		super(color, numpiece);
	}

	public String toString(){
		if(this.getCouleur().getColor() == "noir"){
			return "\u265C";
		}
		return "\u2656";
	}

	public boolean versBas(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		int unitecasea = recupUnite(casea);
		int unitecaseb = recupUnite(caseb);
		for(int i = unitecasea-1; i>=1; i=i-1){
			if(i == unitecaseb && casea-unitecasea == caseb-unitecaseb){
				for(int j = casea-1; j>caseb; j=j-1){
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

	public boolean versHaut(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		int unitecasea = recupUnite(casea);
		int unitecaseb = recupUnite(caseb);
		for(int i = unitecasea+1; i<=8; i=i+1){
			if(i == unitecaseb && casea-unitecasea == caseb-unitecaseb){
				for(int j = casea+1; j<caseb; j=j+1){
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

	public boolean versGauche(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		//int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);
		for(int i = casea-10; i>=11; i=i-10){
			if(i == caseb){
				for(int j = casea-10; j>caseb; j=j-10){
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

	public boolean versDroite(String choixcase, String coup, Plateau plat){
		Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		//int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);
		for(int i = casea+10; i<=88; i=i+10){
			if(i == caseb){
				for(int j = casea+10; j<caseb; j=j+10){
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
			return versBas(choixcase, coup, plat) || versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versDroite(choixcase, coup, plat);
			//return a && b && c && d;
		}
		else if(casea<80 && casea>20 && unitecasea>1 && unitecasea == 8){
			return versBas(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versDroite(choixcase, coup, plat);
			//return a && c && d;
		}
		else if(casea<80 && casea>20 && unitecasea == 1 && unitecasea<8){
			return versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versDroite(choixcase, coup, plat);
			//return a && b && c;
		}
		else if(casea<88 && casea>80 && unitecasea>1 && unitecasea<8){
			return versBas(choixcase, coup, plat) || versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat);
			//return b && c && d;
		}
		else if(casea<18 && casea>11 && unitecasea>1 && unitecasea<8){
			return versBas(choixcase, coup, plat) || versHaut(choixcase, coup, plat) || versDroite(choixcase, coup, plat);
			//return a && b && d;
		}
		else if(casea == 81){
			return versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat);
			//return b && c;
		}
		else if(casea == 88){
			return versBas(choixcase, coup, plat) || versGauche(choixcase, coup, plat);
			//return c && d;
		}
		else if(casea == 18){
			return versBas(choixcase, coup, plat) || versDroite(choixcase, coup, plat);
			//return a && d;
		}
		else if(casea == 11){
			return versHaut(choixcase, coup, plat) || versDroite(choixcase, coup, plat);
			//return a && b;
		}
		else{
			return false;
		}

		/*if(unitecasea == unitecaseb && casea<caseb){
			for(int i = casea+10; i<caseb; i=i+10){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					System.out.println("Cancel de la tour 1");
					return false;
				}
			}
			return true;
		}

		else if(unitecasea == unitecaseb && casea>caseb){
			for(int i = casea-10; i>caseb; i=i-10){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					System.out.println("Cancel de la tour 2");
					return false;
				}
			}
			return true;
		}

		else if(unitecasea != unitecaseb && casea>caseb){
			for(int i = casea-1; i>caseb; i=i-1){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					System.out.println("Cancel de la tour 3");
					return false;
				}
			}
			return true;
		}

		else if(unitecasea != unitecaseb && casea<caseb){
			for(int i = casea+1; i<caseb; i=i+1){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					System.out.println("Cancel de la tour 4");
					return false;
				}
			}
			return true;
		}
		if(unitecasea == unitecaseb && casea<caseb){//vers droite
			for(int i = casea+10; i<=88; i=i+10){
				System.out.println("C1A");
				if(i == caseb){
					System.out.println("C1B");
					for(int j = casea+10; j<caseb; j=j+10){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}
			/*for(int i = casea+10; i<caseb; i=i+10){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					return false;
				}
			}
			return true;*/
		/*}

		else if(unitecasea == unitecaseb && casea>caseb){//vers gauche
			for(int i = casea-10; i>=11; i=i-10){
				System.out.println("C2A");
				if(i == caseb){
					System.out.println("C2B");
					for(int j = casea-10; j>caseb; j=j-10){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}*/
			/*for(int i = casea-10; i>caseb; i=i-10){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					return false;
				}
			}
			return true;*/
		/*}

		else if(unitecasea != unitecaseb && casea>caseb){//vers bas
			for(int i = unitecasea-1; i>=1; i=i-1){
				System.out.println("C3A == " + i);
				if(i == unitecaseb && casea-unitecasea == caseb-unitecaseb){
					System.out.println("C3B");
					for(int j = casea-1; j>caseb; j=j-1){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}*/
			/*for(int i = casea-1; i>caseb; i=i-1){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					return false;
				}
			}
			return true;*/
		/*}

		else if(unitecasea != unitecaseb && casea<caseb){//vers haut
			for(int i = unitecasea+1; i<=8; i=i+1){
				System.out.println("C4A");
				if(i == unitecaseb && casea-unitecasea == caseb-unitecaseb){
					System.out.println("C4B");
					for(int j = casea+1; j<caseb; j=j+1){
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
			System.out.println("Cancel de la tour 5");
			return false;
		}
		System.out.println("si on pas par le je pu un peu le seum");
		return false;*/
	}

	public boolean bloque(String choixcase, Plateau plat, Joueur joueur){
		int casea = recupNumcase(choixcase, plat);
		int unitecasea = recupUnite(casea);
		boolean a = !Verif.verifcoup(choixcase, recupNomcase(casea+10, plat), plat, joueur);
		boolean b = !Verif.verifcoup(choixcase, recupNomcase(casea+1, plat), plat, joueur);
		boolean c = !Verif.verifcoup(choixcase, recupNomcase(casea-10, plat), plat, joueur);
		boolean d = !Verif.verifcoup(choixcase, recupNomcase(casea-1, plat), plat, joueur);

		if(casea<80 && casea>20 && unitecasea>1 && unitecasea<8){
			return a && b && c && d;
		}
		else if(casea<80 && casea>20 && unitecasea>1 && unitecasea == 8){
			return a && c && d;
		}
		else if(casea<80 && casea>20 && unitecasea == 1 && unitecasea<8){
			return a && b && c;
		}
		else if(casea<88 && casea>80 && unitecasea>1 && unitecasea<8){
			return b && c && d;
		}
		else if(casea<18 && casea>11 && unitecasea>1 && unitecasea<8){
			return a && b && d;
		}
		else if(casea == 81){
			return b && c;
		}
		else if(casea == 88){
			return c && d;
		}
		else if(casea == 18){
			return a && d;
		}
		else{
			return a && b;
		}
	}
}