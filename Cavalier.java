public class Cavalier extends Piece {
		
	public Cavalier(Couleur color, int numpiece){
		super(color, numpiece);
	}

	public String toString(){
		if(this.getCouleur().getColor() == "noir"){
			return "\u265E";
		}
	return "\u2658";
	}

	public boolean canMove(String choixcase, String coup, Plateau plat){
		//Partie x = new Partie();
		int casea = recupNumcase(choixcase, plat);
		int caseb = recupNumcase(coup, plat);
		//Piece pchoixcase = x.recupPiece(plat, choixcase);
		//Piece pcoup = x.recupPiece(plat, coup);
		int unitecasea = recupUnite(casea);
		//int unitecaseb = recupUnite(caseb);
		int a = casea -19;
		int b = casea -21;
		int c = casea -8;
		int d = casea -12;
		int e = casea +19;
		int f = casea +21;
		int g = casea +8;
		int h = casea +12;

		if(casea<70 && casea>30 && unitecasea>2 && unitecasea<7 && (a == caseb || b == caseb || c == caseb || d == caseb || e == caseb || f == caseb || g == caseb || h == caseb)){
			return true;
			//return a && b && c && d && e && f && g && h;
		}
		else if(casea<70 && casea>30 && unitecasea>2 && unitecasea == 7 && (a == caseb || b == caseb || d == caseb || e == caseb || f == caseb || g == caseb)){
			return true;
			//return a && b && d && e && f && g;
		}
		else if(casea<70 && casea>30 && unitecasea>2 && unitecasea == 8 && (b == caseb || d == caseb || e == caseb || g == caseb)){
			return true;
			//return b && d && e && g;
		}
		else if(casea<70 && casea>30 && unitecasea<7 && unitecasea == 2 && (a == caseb || b == caseb || c == caseb || e == caseb || f == caseb || h == caseb)){
			return true;
			//return a && b && c && e && f && h;
		}
		else if(casea<70 && casea>30 && unitecasea<7 && unitecasea == 1 && (a == caseb  || c == caseb || f == caseb || h == caseb)){
			return true;
			//return a && c && f && h;
		}
		else if(casea<80 && casea>70 && unitecasea>2 && unitecasea<7 && (a == caseb || b == caseb || c == caseb || d == caseb || g == caseb || h == caseb)){
			return true;
			//return a && b && c && d && g && h;
		}
		else if(casea<87 && casea>80 && unitecasea>2 && unitecasea<7 && (a == caseb || b == caseb || c == caseb || d == caseb)){
			return true;
			//return a && b && c && d;
		}
		else if(casea<30 && casea>20 && unitecasea>2 && unitecasea<7 && (c == caseb || d == caseb || e == caseb || f == caseb || g == caseb || h == caseb)){
			return true;
			//return c && d && e && f && g && h;
		}
		else if(casea<17 && casea>10 && unitecasea>2 && unitecasea<7 && (e == caseb || f == caseb || g == caseb || h == caseb)){
			return true;
			//return e && f && g && h;
		}
		else if(casea == 81 && (a == caseb || c == caseb)){
			return true;
			//return a && c;
		}
		else if(casea == 88 && (b == caseb || d == caseb)){
			return true;
			//return b && d;
		}
		else if(casea == 18 && (e == caseb || g == caseb)){
			return true;
			//return g && e;			
		}
		else if(casea == 11 && (f == caseb || h == caseb)){
			return true;
			//return h && f;
		}
		else if(casea == 72 && (a == caseb || b == caseb || c == caseb || h == caseb)){
			return true;
			//return c && h && a && b;
		}
		else if(casea == 77 && (a == caseb || b == caseb || d == caseb || g == caseb)){
			return true;
			//return a && b && d && g;
		}
		else if(casea == 27 && (d == caseb || e == caseb || f == caseb || g == caseb)){
			return true;
			//return f && e && g && d;
		}
		else if(casea == 22 && (c == caseb || e == caseb || f == caseb || h == caseb)){
			return true;
			//return c && h && f && e;
		}
		else if(casea == 82 && (a == caseb || b == caseb || c == caseb)){
			return true;
			//return a && b && c;
		}
		else if(casea == 87 && (a == caseb || b == caseb || d == caseb)){
			return true;
			//return d && a && b;
		}
		else if(casea == 78 && (b == caseb || d == caseb || g == caseb)){
			return true;
			//return b && d & g;
		}
		else if(casea == 28 && (d == caseb || e == caseb || g == caseb)){
			return true;
			//return d && g && e;
		}
		else if(casea == 17 && (e == caseb || f == caseb || g == caseb)){
			return true;
			//return f && e && g;
		}
		else if(casea == 12 && (e == caseb || f == caseb || h == caseb)){
			return true;
			//return f && e && h;
		}
		else if(casea == 21 && (c == caseb || f == caseb || h == caseb)){
			return true;
			//return c && h && f;
		}
		else if(casea == 71 && (c == caseb || h == caseb || a == caseb)){
			return true;
			//return c && h && a;
		}
		else{
			return false;
		}

		/*if((((casea-19 == caseb && unitecasea<8) || (casea-21 == caseb && unitecasea>1)) && casea>30) || (((casea-8 == caseb && unitecasea<7) || (casea-12 == caseb && unitecasea>2)) && casea>20) || (((casea+19 == caseb && unitecasea>1) || (casea+21 == caseb && unitecasea<8)) && casea<70) || (((casea+8 == caseb && unitecasea>2) || (casea+12 == caseb && unitecasea<7)) && casea<80)){
			return true;
		}
		else{
			System.out.println("jsp quoi faire de tout ça");
			return false;
		}*/
	}

	public boolean bloque(String choixcase, Plateau plat, Joueur joueur){
		int casea = recupNumcase(choixcase, plat);
		int unitecasea = recupUnite(casea);
		boolean a = !Verif.verifcoup(choixcase, recupNomcase(casea-19, plat), plat, joueur);
		boolean b = !Verif.verifcoup(choixcase, recupNomcase(casea-21, plat), plat, joueur);
		boolean c = !Verif.verifcoup(choixcase, recupNomcase(casea-8, plat), plat, joueur);
		boolean d = !Verif.verifcoup(choixcase, recupNomcase(casea-12, plat), plat, joueur);
		boolean e = !Verif.verifcoup(choixcase, recupNomcase(casea+19, plat), plat, joueur);
		boolean f = !Verif.verifcoup(choixcase, recupNomcase(casea+21, plat), plat, joueur);
		boolean g = !Verif.verifcoup(choixcase, recupNomcase(casea+8, plat), plat, joueur);
		boolean h = !Verif.verifcoup(choixcase, recupNomcase(casea+12, plat), plat, joueur);
		if(casea<70 && casea>30 && unitecasea>2 && unitecasea<7){
			return a && b && c && d && e && f && g && h;
		}
		else if(casea<70 && casea>30 && unitecasea>2 && unitecasea == 7){
			return a && b && d && e && f && g;
		}
		else if(casea<70 && casea>30 && unitecasea>2 && unitecasea == 8){
			return b && d && e && g;
		}
		else if(casea<70 && casea>30 && unitecasea<7 && unitecasea == 2){
			return a && b && c && e && f && h;
		}
		else if(casea<70 && casea>30 && unitecasea<7 && unitecasea == 1){
			return a && c && f && h;
		}
		else if(casea<80 && casea>70 && unitecasea>2 && unitecasea<7){
			return a && b && c && d && g && h;
		}
		else if(casea<87 && casea>80 && unitecasea>2 && unitecasea<7){
			return a && b && c && d;
		}
		else if(casea<30 && casea>20 && unitecasea>2 && unitecasea<7){
			return c && d && e && f && g && h;
		}
		else if(casea<17 && casea>10 && unitecasea>2 && unitecasea<7){
			return e && f && g && h;
		}
		else if(casea == 81){
			return a && c;
		}
		else if(casea == 88){
			return b && d;
		}
		else if(casea == 18){
			return g && e;			
		}
		else if(casea == 11){
			return h && f;
		}
		else if(casea == 72){
			return c && h && a && b;
		}
		else if(casea == 77){
			return a && b && d && g;
		}
		else if(casea == 27){
			return f && e && g && d;
		}
		else if(casea == 22){
			return c && h && f && e;
		}
		else if(casea == 82){
			return a && b && c;
		}
		else if(casea == 87){
			return d && a && b;
		}
		else if(casea == 78){
			return b && d & g;
		}
		else if(casea == 28){
			return d && g && e;
		}
		else if(casea == 17){
			return f && e && g;
		}
		else if(casea == 12){
			return f && e && h;
		}
		else if(casea == 21){
			return c && h && f;
		}
		else{
			return c && h && a;
		}	
	}
}