import java.util.*;

public class Affichage{

	public Affichage() {}

	/*public Couleur couleurJoueur1(){
		Scanner input = new Scanner(System.in);
		String couleurJoueur = "2";
		while(!couleurJoueur.equals("1") && !couleurJoueur.equals("0")){
			System.out.println("Le Joueur 1 choisit sa couleur 0 pour blanc, 1 pour noir");
			couleurJoueur = input.nextLine();
		}
		if(couleurJoueur.equals("1")){
			Couleur coulJoueur1 = new Couleur(false);
			return coulJoueur1;
		}
		else{
			Couleur coulJoueur1 = new Couleur(true);
			return coulJoueur1;
		}
	}*/

	public static int debutPartie(){
		Scanner input = new Scanner(System.in);
		String numPartie = "2";
		while(!numPartie.equals("1") && !numPartie.equals("0")){
			System.out.println("choisisez entre commencer une nouvelle partie 0 ou charger une ancienne partie 1");
			numPartie = input.nextLine();
		}
		if(numPartie.equals("0")){
			//input.close();
			return 0;
		}
		else{
			//input.close();
			return 1;
		}

	}

	public static String echequier(Plateau platt, Joueur joueurJoueur){
		String abcd = "           A       B       C       D       E       F       G       H            \n";
		String s = "\n" + abcd + "        ---------------------------------------------------------------\n";
		int w= 0; 
		int l = 8; 
		for(int i=0; i<8; i++){
			s = s + "   " + l + "   ";
			for(int j=0; j<8; j++){
				if(platt.getCases().get(w).getPiece() != null){
					s = s + "|   " + platt.getCases().get(w).getPiece() + "   ";
				}
				else{
					s = s + "|       ";
				}
				w = w+1;
			}
			s = s + "|   " + l + "    ";
			s = s + "\n        ---------------------------------------------------------------\n";
			l = l-1;
		}
		s = s + abcd +"\n\nau tour du jouers : " + joueurJoueur.getJcouleur().getColor();
		return s;
	}

	/*public void letourdeJ(Joueur joueur){
		System.out.println("C'est au tour du joueur : " + joueur.getJcouleur().getColor());
	}*/

	public static void winner(Joueur joueur){
		System.out.println("Le gagnant est le joueur : " + joueur.getJcouleur().getColor());
	}

	public static void affPat(){
		System.out.println("Il n'y a pas gagnant, c'est PAT soit égalité.");
	}

	public static String save(){
		String nom;
		Scanner input = new Scanner(System.in);
		System.out.println("Donnez le nom de votre sauvegarde :");
		nom = input.nextLine();
		//input.close();
		return nom;
	}

	public static String demanderCharg(){
		String nom;
		Scanner input = new Scanner(System.in);
		System.out.println("Donnez le nom de la sauvegarde que vous voulez charger :");
		nom = input.nextLine();
		//input.close();
		return nom;
	}


	public static String demandercaseo(Plateau plat){
		Scanner input = new Scanner(System.in);
		String choixcase = "";
		boolean v = false;
		while(v == false && !choixcase.equals("save")){ // ce for est pas sur faudra peut etre revoir le || ou le && si ça marche pas.
			System.out.println("Quelle est la case de la piece que vous voulez deplacer ?");
			System.out.println("(Si vous voulez arreter la partie et la sauvegarder, tapez <<save>>.)");
			choixcase = input.nextLine();
			v = Verif.verifCase(plat, choixcase);
		}
		//input.close();
		return choixcase;
	}

	public static String demandercased(Plateau plat){
		Scanner input = new Scanner(System.in);
		String choixcase = "";
		boolean v = false;
		while(v == false){
			System.out.println("Sur quelle case voulez vous placer la pièce ?");
			choixcase = input.nextLine();
			v = Verif.verifCase(plat, choixcase);
		}
		//input.close();
		return choixcase;
	}

	public static String choixTransPion(Piece pionTrans){
		String choix = "";
		System.out.println("------------------------------------");
		System.out.println("||Cavalier || Fou || Tour || Reine||");
		System.out.println("------------------------------------");
		System.out.println("||    1    ||  2  ||   3  ||   4  ||");
		System.out.println("------------------------------------");
		Scanner input = new Scanner(System.in);
		while(!choix.equals("1") && !choix.equals("2") && !choix.equals("3") && !choix.equals("4")){
			System.out.println("En quoi voulez vous transformer votre pion ? (donnez un chiffre)");
			choix = input.nextLine();
		}
		if(pionTrans.getCouleur().getColor() == "noir"){
			if(choix.equals("1")){
				//input.close();
				return "Cn";
			}
			else if(choix.equals("2")){
				//input.close();
				return "Fn";
			}
			else if(choix.equals("3")){
				//input.close();
				return "Tn";
			}
			else{
				//input.close();
				return "ReineN";
			}
		}
		else{
			if(choix.equals("1")){
				//input.close();
				return "Cb";
			}
			else if(choix.equals("2")){
				//input.close();
				return "Fb";
			}
			else if(choix.equals("3")){
				//input.close();
				return "Tb";
			}
			else{
				//input.close();
				return "ReineB";
			}
		}

	}
}