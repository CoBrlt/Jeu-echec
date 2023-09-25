public class Reine extends Piece {
		
	public Reine(Couleur color, int numpiece){
		super(color, numpiece);
	}

	public String toString(){
		if(this.getCouleur().getColor() == "noir"){
			return "\u265B";
		}
	return "\u2655";
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
			return versBas(choixcase, coup, plat) || versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versDroite(choixcase, coup, plat) || versHautGauche(choixcase, coup, plat) || versBasGauche(choixcase, coup, plat) || versHautDroite(choixcase, coup, plat) || versBasDroite(choixcase, coup, plat);
			//return a && b && c && d;
		}
		else if(casea<80 && casea>20 && unitecasea>1 && unitecasea == 8){
			return versBas(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versDroite(choixcase, coup, plat) || versBasDroite(choixcase, coup, plat) || versBasGauche(choixcase, coup, plat);
			//return a && c && d;
		}
		else if(casea<80 && casea>20 && unitecasea == 1 && unitecasea<8){
			return versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versDroite(choixcase, coup, plat) || versHautDroite(choixcase, coup, plat) || versHautGauche(choixcase, coup, plat);
			//return a && b && c;
		}
		else if(casea<88 && casea>80 && unitecasea>1 && unitecasea<8){
			return versBas(choixcase, coup, plat) || versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versHautGauche(choixcase, coup, plat) || versBasGauche(choixcase, coup, plat);
			//return b && c && d;
		}
		else if(casea<18 && casea>11 && unitecasea>1 && unitecasea<8){
			return versBas(choixcase, coup, plat) || versHaut(choixcase, coup, plat) || versDroite(choixcase, coup, plat) || versHautDroite(choixcase, coup, plat) || versBasDroite(choixcase, coup, plat);
			//return a && b && d;
		}
		else if(casea == 81){
			return versHaut(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versHautGauche(choixcase, coup, plat);
			//return b && c;
		}
		else if(casea == 88){
			return versBas(choixcase, coup, plat) || versGauche(choixcase, coup, plat) || versBasGauche(choixcase, coup, plat);
			//return c && d;
		}
		else if(casea == 18){
			return versBas(choixcase, coup, plat) || versDroite(choixcase, coup, plat) || versBasDroite(choixcase, coup, plat);
			//return a && d;
		}
		else if(casea == 11){
			return versHaut(choixcase, coup, plat) || versDroite(choixcase, coup, plat) || versHautDroite(choixcase, coup, plat);
			//return a && b;
		}
		else{
			return false;
		}
	}

		//////////////////////////////////////////////////////////////////Partie de Tour

		/*if(unitecasea == unitecaseb && casea<caseb){
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

		else if(unitecasea == unitecaseb && casea>caseb){
			for(int i = casea-10; i>=11; i=i-10){
				System.out.println("C2A");
				if(i == caseb){
					System.out.println("C2B");
					for(int j = casea-10; j<caseb; j=j-10){
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

		else if(unitecasea != unitecaseb && casea>caseb){
			for(int i = unitecasea-1; i>=1; i=i-1){
				System.out.println(i);
				if(i == unitecaseb && casea-unitecasea == caseb-unitecaseb){
					System.out.println("C3B");
					for(int j = casea-1; j<caseb; j=j-1){
						String nom = recupNomcase(j, plat);
						Piece y = x.recupPiece(plat, nom);
						if(y != null){
							return false;
						}
					}
					return true;
				}
			}
			/*for(int i = casea-1; i>caseb; i=i-1){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					return false;
				}
			}
			return true;*/
		/*}

		else if(unitecasea != unitecaseb && casea<caseb){
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
			}*/
			/*for(int i = casea+1; i<caseb; i=i+1){
				String nom = recupNomcase(i, plat);
				Piece y = x.recupPiece(plat, nom);
				if(y != null){
					return false;
				}
			}
			return true;
		}
		//////////////////////////////////////////////////////////////////////////////Partie du fou
		else if(casea<caseb){
			for(int i = casea+11; i<=88; i=i+11){
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

			for(int i = casea+9; i<=88; i=i+9){
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
			for(int i = casea-11; i>=11; i=i-11){
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

			for(int i = casea-9; i>=11; i=i-9){
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
			System.out.println("Eeeet meeerde");
			return false;
		}
		System.out.println("Encoore mais wtf");
		return false;
	}*/

	public boolean bloque(String choixcase, Plateau plat, Joueur joueur){
		return bloqueFou(choixcase, plat, joueur) && bloqueTour(choixcase, plat, joueur);
	}

	public boolean bloqueFou(String choixcase, Plateau plat, Joueur joueur){
		int casea = recupNumcase(choixcase, plat);
		int unitecasea = recupUnite(casea);
		boolean a = !Verif.verifcoup(choixcase, recupNomcase(casea-9, plat), plat, joueur);
		boolean b = !Verif.verifcoup(choixcase, recupNomcase(casea+11, plat), plat, joueur);
		boolean c = !Verif.verifcoup(choixcase, recupNomcase(casea+9, plat), plat, joueur);
		boolean d = !Verif.verifcoup(choixcase, recupNomcase(casea-11, plat), plat, joueur);

		if(casea<80 && casea>20 && unitecasea>1 && unitecasea<8){
			return a && b && c && d;
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

	public boolean bloqueTour(String choixcase, Plateau plat, Joueur joueur){
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