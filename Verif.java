public class Verif{

	public Verif(){}

	/*public static String verifTout(Plateau plat, String choixcase){
		Partie x = new Partie();
		Piece pjoueur = x.recupPiece(plat, choixcase);
		Joueur joueur = new Joueur(pjoueur.getCouleur());
		String result = "";
		for(int i=0; i<plat.getCases().size();i++){
			if(verifcoup(choixcase, plat.getCases().get(i).getNomcase(), plat, joueur) == true){
				result = result + "|||" +plat.getCases().get(i).getNomcase() + "|||";
			}
		}
		return result;
	}*/

	public static boolean verifcoup(String choixcase, String coup, Plateau plat, Joueur joueur){
		Partie x = new Partie();
		Piece pjouer = x.recupPiece(plat, choixcase);
		Piece pcoup = x.recupPiece(plat, coup);
		if(pjouer == null){
			//System.out.println("1");
			return false;
		}
		else if(pcoup != null && pcoup.getCouleur().getColor().equals(pjouer.getCouleur().getColor())){
			//System.out.println("3");
			return false;
		}
		else if(joueur.getJcouleur().getColor().equals(pjouer.getCouleur().getColor())){
			//System.out.println("4");
				return pjouer.canMove(choixcase, coup, plat);}
		else{
			//System.out.println("5");
			return false;
		}
	}

	public static boolean verifEchecPourAdversaire(Plateau plat, Joueur joueur){
		//Couleur coulduJ = joueur.getJcouleur();
		Couleur invJ = inverseCouleur(joueur);
		//Joueur inv = new Joueur(invJ); 
		for(int i = 0; i<plat.getCases().size(); i++){
			//System.out.println("On rentre dans le for c'est déja ça");
			if(plat.getCases().get(i).getPiece() != null){
				//System.out.println("tu passes dans le if que je viens de créer ?");
				if(plat.getCases().get(i).getPiece().equals(new Roi(invJ, 1))){
					//System.out.println("Il a trouver le roi");
					String coup = plat.getCases().get(i).getNomcase();
					//System.out.println("Le deuxieme if est passé");
					for(int j = 0; j<plat.getCases().size(); j++){
						//System.out.println("on rentre dans le for");
						if(verifcoup(plat.getCases().get(j).getNomcase(), coup, plat, joueur) == true){
							//System.out.println(plat.getCases().get(j).getNomcase());
							return true;
						}
					}	
				}
			}
		}
		return false;
		/*Couleur invJ = inverseCouleur(joueur);
		for(int i = 0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getPiece() == new Roi(invJ, 1)){
				String coup = plat.getCases().get(i).getNomcase();
				for(int j = 0; j<plat.getCases().size(); j++){
					if(verifcoup(plat.getCases().get(j).getNomcase(), coup, plat, joueur) == true){
						return true;
					}
				}
			}
		}
		return false;*/
	}

	public static boolean verifEchecPourJoueur(Plateau plat, Joueur joueur){
		/*for(int i = 0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getPiece() == new Roi(new Couleur(false), 1)){
				String coup = plat.getCases().get(i).getNomcase();
				for(int j = 0; j<plat.getCases().size(); j++){
					verifcoup(plat.getCases().get(i).getNomcase(), coup, plat);
				}
			}
		}*/
		Couleur coulduJ = joueur.getJcouleur();
		Couleur invJ = inverseCouleur(joueur);
		Joueur inv = new Joueur(invJ); 
		for(int i = 0; i<plat.getCases().size(); i++){
			//System.out.println("On rentre dans le for c'est déja ça");
			if(plat.getCases().get(i).getPiece() != null){
				//System.out.println("tu passes dans le if que je viens de créer ?");
				if(plat.getCases().get(i).getPiece().equals(new Roi(coulduJ, 1))){
					//System.out.println("Il a trouver le roi");
					String coup = plat.getCases().get(i).getNomcase();
					//System.out.println("Le deuxieme if est passé");
					for(int j = 0; j<plat.getCases().size(); j++){
						//System.out.println("on rentre dans le for");
						if(verifcoup(plat.getCases().get(j).getNomcase(), coup, plat, inv) == true){
							//System.out.println(plat.getCases().get(j).getNomcase());
							return true;
						}
					}	
				}
			}
			/*else if(plat.getCases().get(i).getPiece() == new Roi(new Couleur(true), 1)){
				String coup = plat.getCases().get(i).getNomcase();
				for(int h = 0; h<plat.getCases().size(); h++){
					if(verifcoup(plat.getCases().get(h).getNomcase(), coup, plat, joueur) == true){
						return true;
					}
				}
			}*/
		}
		return false;
	}

	public static boolean verifCounterEchec(Plateau plat, Joueur joueur/*c'est le joueur qui à mit l'adversaire en echec*/){//a utiliser après un tour
		Partie x = new Partie();
		//Affichage a = new Affichage();
		//Plateau ancienPlat = new Plateau(plat.getCases());
		Plateau ancienPlat = new Plateau(plat.getCases());
		//System.out.println(a.echequier(plat, joueur));
		String choixcase;
		Couleur invC = inverseCouleur(joueur);
		Joueur invJ = new Joueur(invC);
		for(int i = 0; i<plat.getCases().size(); i++){//dans cette boucle on doit vérifier que le joueur est en echec pour chaqu'un de ses coups possibles il faut donc modifier le plateau et lancer la vérif echec pour le joueur, il faut le faire pour toutes les possibilitées de chaque piece.
			if(plat.getCases().get(i).getPiece() != null){
				//System.out.println("2");
				if(plat.getCases().get(i).getPiece().getCouleur().getColor().equals(invC.getColor())){//on regarde si une piece correspond à la couleur du joueur sous echec
					//System.out.println("3");
					choixcase = plat.getCases().get(i).getNomcase();//on prend la case de la piece
					for(int j = 0; j<plat.getCases().size();j++){
						if(verifcoup(choixcase, plat.getCases().get(j).getNomcase(), plat, invJ) == true){//à l'aide du for on regarde toute les possibilités ou la piece peut aller
							//System.out.println("4");
							//si on rentre ici c'est que la piece peut ce déplacer sur une case// il faut maintenant simuler le deplacement voir si il y a encore echec avec verfi echec pour joueur
							plat = x.deplacer(choixcase, plat.getCases().get(j).getNomcase(), plat, invJ);//on simule le déplacement
							//System.out.println(a.echequier(plat, joueur));
							//System.out.println("c'est le verfi echec qui a surement un problème non ?");
							if(verifEchecPourJoueur(plat, invJ) == false){//si y a plus echec on peut counter donc on renvoie true sinon
								//System.out.println("5");
								return true;
							}
							else{
								//System.out.println(a.echequier(ancienPlat, joueur));
								plat = new Plateau(ancienPlat.getCases());//on remet le plateau comme avant
								//System.out.println(a.echequier(ancienPlat, joueur));
							}
						}
					}
				}
			}
		}

		return false; //une fois qu'on a tout défiler on return false, aucun moyen de counter ça
	}


	public static boolean verifMat(Plateau plat, Joueur joueur){
		//Partie x = new Partie();
		if(joueur.getJcouleur().getColor().equals("noir")){
			Couleur inverseJ = new Couleur(true);

			return couleurDuMat(inverseJ, plat, joueur);
		}
		else{
			Couleur inverseJ = new Couleur(false);
			return couleurDuMat(inverseJ, plat, joueur);
		}
		/*for(int i = 0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getPiece() == new Roi(inverseJ2, 1)){
				int numcase = plat.getCases().get(i).getNumcase();
				int unitenumcase = plat.getCases().get(i).getPiece().recupUnite(numcase);
				String nomCaseRoi = plat.getCases().get(i).getNomcase();
				if(unitenumcase>1 && unitenumcase<8 && numcase>20 && numcase<80){
					return verifMidMat(numcase, plat, joueur);
				}
				else if(numcase == 81 || numcase == 88 || numcase == 18 || numcase == 11){
					return verifCoinMat(numcase, plat, joueur);
				}
				else{
					return verifCoteMat(numcase, unitenumcase, plat, joueur);
				}
			}
		}*/
	}


	public static boolean couleurDuMat(Couleur inverseJ, Plateau plat, Joueur joueur){
		for(int i = 0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getPiece() != null){
				if(plat.getCases().get(i).getPiece().equals(new Roi(inverseJ, 1))){
					int numcase = plat.getCases().get(i).getNumcase();
					int unitenumcase = Piece.recupUnite(numcase);
					//String nomCaseRoi = plat.getCases().get(i).getNomcase();
					if(unitenumcase>1 && unitenumcase<8 && numcase>20 && numcase<80){
						return verifMidMat(numcase, plat, joueur);
					}
					else if(numcase == 81 || numcase == 88 || numcase == 18 || numcase == 11){
						return verifCoinMat(numcase, plat, joueur);
					}
					else{
						return verifCoteMat(numcase, unitenumcase, plat, joueur);
					}
				}
			}
		}
		return false;
	}


	public static boolean verifPat(Plateau plat, Joueur joueur/*joueur qui à fait le coup*/){
		//System.out.println(joueur.getJcouleur().getColor());
		String choixcase;
		int j = 0;
		boolean constate = true;
		Couleur inverseJ = inverseCouleur(joueur);//on prend la couleur opposé du joueur qui à joué
		joueur = new Joueur(inverseJ);
		for(int i = 0; i<plat.getCases().size() && constate != false; i++){
			//System.out.println(plat.getCases().get(i).getPiece() != null && !plat.getCases().get(i).getPiece().equals(new Roi(inverseJ, 1)) && inverseJ.getColor().equals(plat.getCases().get(i).getPiece().getCouleur().getColor()));
			if(plat.getCases().get(i).getPiece() != null && inverseJ.getColor().equals(plat.getCases().get(i).getPiece().getCouleur().getColor()) && !plat.getCases().get(i).getPiece().equals(new Roi(inverseJ, 1))){
				//System.out.println("2");
				choixcase = plat.getCases().get(i).getNomcase();//on prend la case de la piece qui est suremement bloqué
				//System.out.println(choixcase + " ==== c'est choix case");
				constate = constate && plat.getCases().get(i).getPiece().bloque(choixcase, plat, joueur);//on regarde si la piece est bloqué true si oui || false si non
				j++;
				//System.out.println(constate + " ==== c'est constate");
			}
		}
		if(j != 0){
			return constate;
		}
		else{
			int l = 0;
			for(int k = 0; k<plat.getCases().size(); k++){
				if(plat.getCases().get(k).getPiece() != null && inverseJ.getColor().equals(plat.getCases().get(k).getPiece().getCouleur().getColor())){
					l++;
				}
			}
			if(l != 0){
				return false;
			}
			else{
				return true;
			}
		}
	}


	public static Couleur inverseCouleur(Joueur joueur){
		if(joueur.getJcouleur().getColor() == "noir" ){
			Couleur inverseJ = new Couleur(true);
			return inverseJ;
		}
		else{
			Couleur inverseJ = new Couleur(false);
			return inverseJ;
		}
	}



	public static int verifCaseDangereuse(String casevictime, Plateau plat, Joueur joueur){
		Couleur invJ = inverseCouleur(joueur);
		for(int i = 0; i<plat.getCases().size(); i++){
			if(verifcoup(plat.getCases().get(i).getNomcase(), casevictime, plat, joueur) == true){
				return 1;
			}
			else if(plat.getCases().get(i).getPiece() != null){
				if(plat.getCases().get(i).getNomcase().equals(casevictime) && plat.getCases().get(i).getPiece().getCouleur().getColor().equals(invJ.getColor())){
					return 1;
				}
				else if(plat.getCases().get(i).getPiece().getCouleur().getColor().equals(joueur.getJcouleur().getColor())){
					for(int j = 0; j<plat.getCases().size(); j++){
						if(plat.getCases().get(j).getPiece() != null){
							if(plat.getCases().get(j).getPiece().canMove(plat.getCases().get(j).getNomcase(), plat.getCases().get(i).getNomcase(), plat) == true){
								return 1;
							}
						}
					}
				}
			}


		}
		return 0;
	}

	public static boolean verifMidMat(int numcase, Plateau plat, Joueur joueur){
		int compteur = 0;

		int coup1 = numcase + 1;
		int coup2 = numcase + 11;
		int coup3 = numcase + 10;
		int coup4 = numcase + 9;
		int coup5 = numcase - 1;
		int coup6 = numcase - 11;
		int coup7 = numcase - 10;
		int coup8 = numcase - 9;

		String nomcoup1 = Piece.recupNomcase(coup1, plat);
		String nomcoup2 = Piece.recupNomcase(coup2, plat);
		String nomcoup3 = Piece.recupNomcase(coup3, plat);
		String nomcoup4 = Piece.recupNomcase(coup4, plat);
		String nomcoup5 = Piece.recupNomcase(coup5, plat);
		String nomcoup6 = Piece.recupNomcase(coup6, plat);
		String nomcoup7 = Piece.recupNomcase(coup7, plat);
		String nomcoup8 = Piece.recupNomcase(coup8, plat);

		compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
		compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
		compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);
		compteur = compteur + verifCaseDangereuse(nomcoup4, plat, joueur);
		compteur = compteur + verifCaseDangereuse(nomcoup5, plat, joueur);
		compteur = compteur + verifCaseDangereuse(nomcoup6, plat, joueur);
		compteur = compteur + verifCaseDangereuse(nomcoup7, plat, joueur);
		compteur = compteur + verifCaseDangereuse(nomcoup8, plat, joueur);

		if(compteur == 8){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean verifCoinMat(int numcase, Plateau plat, Joueur joueur){
		if(numcase == 81){
			int compteur = 0;

			int coup1 = numcase - 10;
			int coup2 = numcase - 9;
			int coup3 = numcase + 1;


			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);


			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);

			if(compteur == 3){
				return true;
			}
			else{
				return false;
			}

		}
		else if(numcase == 88){
			int compteur = 0;

			int coup1 = numcase - 10;
			int coup2 = numcase - 11;
			int coup3 = numcase - 1;


			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);


			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);

			if(compteur == 3){
				return true;
			}
			else{
				return false;
			}

		}
		else if(numcase == 18){
			int compteur = 0;

			int coup1 = numcase + 10;
			int coup2 = numcase + 9;
			int coup3 = numcase - 1;


			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);


			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);

			if(compteur == 3){
				return true;
			}
			else{
				return false;
			}

		}
		else{
			int compteur = 0;

			int coup1 = numcase + 10;
			int coup2 = numcase + 11;
			int coup3 = numcase + 1;


			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);


			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);

			if(compteur == 3){
				return true;
			}
			else{
				return false;
			}
		}
	}

	public static boolean verifCoteMat(int numcase, int unitenumcase, Plateau plat, Joueur joueur){
		//Piece x = new Piece(joueur.getJcouleur(), 1);
		if(numcase>80){
			int compteur = 0;

			int coup1 = numcase + 1;
			int coup2 = numcase - 9;
			int coup3 = numcase - 10;
			int coup4 = numcase - 11;
			int coup5 = numcase - 1;

			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);
			String nomcoup4 = Piece.recupNomcase(coup4, plat);
			String nomcoup5 = Piece.recupNomcase(coup5, plat);

			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup4, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup5, plat, joueur);

			if(compteur == 5){
				return true;
			}
			else{
				return false;
			}

		}
		else if(numcase<20){
			int compteur = 0;

			int coup1 = numcase + 1;
			int coup2 = numcase + 9;
			int coup3 = numcase + 10;
			int coup4 = numcase + 11;
			int coup5 = numcase - 1;

			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);
			String nomcoup4 = Piece.recupNomcase(coup4, plat);
			String nomcoup5 = Piece.recupNomcase(coup5, plat);

			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup4, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup5, plat, joueur);

			if(compteur == 5){
				return true;
			}
			else{
				return false;
			}

		}
		else if(unitenumcase == 8){
			int compteur = 0;

			int coup1 = numcase + 10;
			int coup2 = numcase + 9;
			int coup3 = numcase - 1;
			int coup4 = numcase - 11;
			int coup5 = numcase - 10;

			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);
			String nomcoup4 = Piece.recupNomcase(coup4, plat);
			String nomcoup5 = Piece.recupNomcase(coup5, plat);

			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			//System.out.println("Ici le compteur1 est à : ====================================  " + compteur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			//System.out.println("Ici le compteur2 est à : ====================================  " + compteur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);
			//System.out.println("Ici le compteur3 est à : ====================================  " + compteur);
			compteur = compteur + verifCaseDangereuse(nomcoup4, plat, joueur);
			//System.out.println("Ici le compteur4 est à : ====================================  " + compteur);
			compteur = compteur + verifCaseDangereuse(nomcoup5, plat, joueur);
			//System.out.println("Ici le compteur5 est à : ====================================  " + compteur);

			if(compteur == 5){
				return true;
			}
			else{
				return false;
			}

		}
		else{
			int compteur = 0;

			int coup1 = numcase + 10;
			int coup2 = numcase - 9;
			int coup3 = numcase + 1;
			int coup4 = numcase + 11;
			int coup5 = numcase - 10;

			String nomcoup1 = Piece.recupNomcase(coup1, plat);
			String nomcoup2 = Piece.recupNomcase(coup2, plat);
			String nomcoup3 = Piece.recupNomcase(coup3, plat);
			String nomcoup4 = Piece.recupNomcase(coup4, plat);
			String nomcoup5 = Piece.recupNomcase(coup5, plat);

			compteur = compteur + verifCaseDangereuse(nomcoup1, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup2, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup3, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup4, plat, joueur);
			compteur = compteur + verifCaseDangereuse(nomcoup5, plat, joueur);

			if(compteur == 5){
				return true;
			}
			else{
				return false;
			}

		}
	}

	public static boolean verifCase(Plateau plat, String choixcase){
		for(int i = 0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getNomcase().equals(choixcase)){
				return true;
			}
		}
		return false;
	}

	public static Piece verifPionTrans(Plateau plat, Joueur joueur){
		int a = 0;
		if(joueur.getJcouleur().getColor().equals("noir")){
			a = 1;
		}
		else{
			a = 8;
		}
		for(int i = 0; i<plat.getCases().size(); i++){
			if(plat.getCases().get(i).getPiece() != null){
				if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 1)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
				else if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 2)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
				else if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 3)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
				else if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 4)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
				else if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 5)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
				else if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 6)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
				else if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 7)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
				else if(plat.getCases().get(i).getPiece().equals(new Pion(joueur.getJcouleur(), 8)) && Piece.recupUnite(plat.getCases().get(i).getNumcase()) == a){
					return plat.getCases().get(i).getPiece();
				}
			}
		}
		return null;
	}
}