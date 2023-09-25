import java.util.ArrayList;

public class Plateau {
    private ArrayList<Case> cases;

    public Plateau(){
    	this.cases = new ArrayList<Case>();
    	/*this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));

    	this.cases.add(new Case("-1", -1));*/
    	this.cases.add(new Case("A8", 18));
    	this.cases.add(new Case("B8", 28));
    	this.cases.add(new Case("C8", 38));
    	this.cases.add(new Case("D8", 48));
    	this.cases.add(new Case("E8", 58));
    	this.cases.add(new Case("F8", 68));
    	this.cases.add(new Case("G8", 78));
    	this.cases.add(new Case("H8", 88));
    	//this.cases.add(new Case("-1", -1));

    	//this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("A7", 17));
    	this.cases.add(new Case("B7", 27));
    	this.cases.add(new Case("C7", 37));
    	this.cases.add(new Case("D7", 47));
    	this.cases.add(new Case("E7", 57));
    	this.cases.add(new Case("F7", 67));
    	this.cases.add(new Case("G7", 77));
    	this.cases.add(new Case("H7", 87));
    	//this.cases.add(new Case("-1", -1));

    	//this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("A6", 16));
    	this.cases.add(new Case("B6", 26));
    	this.cases.add(new Case("C6", 36));
    	this.cases.add(new Case("D6", 46));
    	this.cases.add(new Case("E6", 56));
    	this.cases.add(new Case("F6", 66));
    	this.cases.add(new Case("G6", 76));
    	this.cases.add(new Case("H6", 86));
    	//this.cases.add(new Case("-1", -1));

    	//this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("A5", 15));
    	this.cases.add(new Case("B5", 25));
    	this.cases.add(new Case("C5", 35));
    	this.cases.add(new Case("D5", 45));
    	this.cases.add(new Case("E5", 55));
    	this.cases.add(new Case("F5", 65));
    	this.cases.add(new Case("G5", 75));
    	this.cases.add(new Case("H5", 85));
    	//this.cases.add(new Case("-1", -1));

    	//this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("A4", 14));
    	this.cases.add(new Case("B4", 24));
    	this.cases.add(new Case("C4", 34));
    	this.cases.add(new Case("D4", 44));
    	this.cases.add(new Case("E4", 54));
    	this.cases.add(new Case("F4", 64));
    	this.cases.add(new Case("G4", 74));
    	this.cases.add(new Case("H4", 84));
    	//this.cases.add(new Case("-1", -1));

    	//this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("A3", 13));
    	this.cases.add(new Case("B3", 23));
    	this.cases.add(new Case("C3", 33));
    	this.cases.add(new Case("D3", 43));
    	this.cases.add(new Case("E3", 53));
    	this.cases.add(new Case("F3", 63));
    	this.cases.add(new Case("G3", 73));
    	this.cases.add(new Case("H3", 83));
    	//this.cases.add(new Case("-1", -1));

    	//this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("A2", 12));
    	this.cases.add(new Case("B2", 22));
    	this.cases.add(new Case("C2", 32));
    	this.cases.add(new Case("D2", 42));
    	this.cases.add(new Case("E2", 52));
    	this.cases.add(new Case("F2", 62));
    	this.cases.add(new Case("G2", 72));
    	this.cases.add(new Case("H2", 82));
    	//this.cases.add(new Case("-1", -1));

    	//this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("A1", 11));
    	this.cases.add(new Case("B1", 21));
    	this.cases.add(new Case("C1", 31));
    	this.cases.add(new Case("D1", 41));
    	this.cases.add(new Case("E1", 51));
    	this.cases.add(new Case("F1", 61));
    	this.cases.add(new Case("G1", 71));
    	this.cases.add(new Case("H1", 81));
    	//this.cases.add(new Case("-1", -1));

    	/*this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));
    	this.cases.add(new Case("-1", -1));*/
    }

	public Plateau(ArrayList<Case> ncases){
		this.cases = new ArrayList<Case>();
		for(int i = 0; i<ncases.size(); i++){
			this.cases.add(new Case(ncases.get(i).getNomcase(), ncases.get(i).getNumcase(), ncases.get(i).getPiece()));
		}
	}

    public ArrayList<Case> addPlat(Case addcase){
    	this.cases.add(addcase);
    	return this.cases;
    }

    public String toString(){
    	String s = "";
    	for(int i = 0; i<this.cases.size(); i++){
    		s = s + this.cases.get(i) + "\n";
    	}
    	return s;
    }

    /*public String toString(){
    	String s = "";
    	for(int i=0; i<this.cases.size(); i++){
    		if(this.cases.get(i).getPiece()==null && this.cases.get(i).getNumcase()<81){
    			s = s + "    " + "   |   ";
    		}
    		else if(this.cases.get(i).getPiece()==null && this.cases.get(i).getNumcase()>=81){
    			s = s + "    " + "\n------------------------------------------------------------------------------------------\n   ";
    		}
    		else if(this.cases.get(i).getNumcase()%2 == 0 && this.cases.get(i).getNumcase()<81){
    			s = s + this.cases.get(i)+ "    |    ";
    		}
    		else if(this.cases.get(i).getNumcase()%2 == 1 && this.cases.get(i).getNumcase()<81){
    			s = s + this.cases.get(i)+ "    |    ";
    		}
    		else{
    			s = s + this.cases.get(i) + "\n------------------------------------------------------------------------------------------\n   ";
    		}
    	}
    	return s;
    }*/

    public void initialiser(){
    	Piece Tn1 = creaPiece("Tn",1);
    	Piece Fn1 = creaPiece("Fn",1);
    	Piece Cn1 = creaPiece("Cn",1);
    	Piece RoiN = creaPiece("RoiN",1);
    	Piece ReineN = creaPiece("ReineN",1);
    	Piece Tb1 = creaPiece("Tb",1);
    	Piece Fb1 = creaPiece("Fb",1);
    	Piece Cb1 = creaPiece("Cb",1);
    	Piece RoiB = creaPiece("RoiB",1);
    	Piece ReineB = creaPiece("ReineB",1);


    	Piece Tn2 = creaPiece("Tn",2);
    	Piece Fn2 = creaPiece("Fn",2);
    	Piece Cn2 = creaPiece("Cn",2);
    	Piece Tb2 = creaPiece("Tb",2);
    	Piece Fb2 = creaPiece("Fb",2);
    	Piece Cb2 = creaPiece("Cb",2);


    	Piece Pn1 = creaPiece("Pn",1);
    	Piece Pn2 = creaPiece("Pn",2);
    	Piece Pn3 = creaPiece("Pn",3);
    	Piece Pn4 = creaPiece("Pn",4);
    	Piece Pn5 = creaPiece("Pn",5);
    	Piece Pn6 = creaPiece("Pn",6);
    	Piece Pn7 = creaPiece("Pn",7);
    	Piece Pn8 = creaPiece("Pn",8);


    	Piece Pb1 = creaPiece("Pb",1);
    	Piece Pb2 = creaPiece("Pb",2);
    	Piece Pb3 = creaPiece("Pb",3);
    	Piece Pb4 = creaPiece("Pb",4);
    	Piece Pb5 = creaPiece("Pb",5);
    	Piece Pb6 = creaPiece("Pb",6);
    	Piece Pb7 = creaPiece("Pb",7);
    	Piece Pb8 = creaPiece("Pb",8);

    	ajoutPiece(this.cases.get(0), Tn1);
    	ajoutPiece(this.cases.get(1), Cn1);
    	ajoutPiece(this.cases.get(2), Fn1);
    	ajoutPiece(this.cases.get(3), ReineN);
    	ajoutPiece(this.cases.get(4), RoiN);
    	ajoutPiece(this.cases.get(5), Fn2);
    	ajoutPiece(this.cases.get(6), Cn2);
    	ajoutPiece(this.cases.get(7), Tn2);

    	ajoutPiece(this.cases.get(56), Tb1);
    	ajoutPiece(this.cases.get(57), Cb1);
    	ajoutPiece(this.cases.get(58), Fb1);
    	ajoutPiece(this.cases.get(59), ReineB);
    	ajoutPiece(this.cases.get(60), RoiB);
    	ajoutPiece(this.cases.get(61), Fb2);
    	ajoutPiece(this.cases.get(62), Cb2);
    	ajoutPiece(this.cases.get(63), Tb2);

    	ajoutPiece(this.cases.get(8), Pn1);
    	ajoutPiece(this.cases.get(9), Pn2);
    	ajoutPiece(this.cases.get(10), Pn3);
    	ajoutPiece(this.cases.get(11), Pn4);
    	ajoutPiece(this.cases.get(12), Pn5);
    	ajoutPiece(this.cases.get(13), Pn6);
    	ajoutPiece(this.cases.get(14), Pn7);
    	ajoutPiece(this.cases.get(15), Pn8);
    	ajoutPiece(this.cases.get(55), Pb1);
    	ajoutPiece(this.cases.get(54), Pb2);
    	ajoutPiece(this.cases.get(53), Pb3);
    	ajoutPiece(this.cases.get(52), Pb4);
    	ajoutPiece(this.cases.get(51), Pb5);
    	ajoutPiece(this.cases.get(50), Pb6);
    	ajoutPiece(this.cases.get(49), Pb7);
    	ajoutPiece(this.cases.get(48), Pb8);


    	/*for(int i=0; i<this.cases.size(); i++){
    		if(this.cases.get(i).getNumcase()==18 || this.cases.get(i).getNumcase()==88){
    			ajoutPiece(this.cases.get(i), Tn);
    		}
    		if(this.cases.get(i).getNumcase()==28 || this.cases.get(i).getNumcase()==78){
    			ajoutPiece(this.cases.get(i), Cn);
    		}
    		if(this.cases.get(i).getNumcase()==38 || this.cases.get(i).getNumcase()==68){
    			ajoutPiece(this.cases.get(i), Fn);
    		}
    		if(this.cases.get(i).getNumcase()==48){
    			ajoutPiece(this.cases.get(i), ReineN);
    		}
    		if(this.cases.get(i).getNumcase()==58){
    			ajoutPiece(this.cases.get(i), RoiN);
    		}
    		if(this.cases.get(i).getNumcase()==17 || this.cases.get(i).getNumcase()==27 || this.cases.get(i).getNumcase()==37 || this.cases.get(i).getNumcase()==47 || this.cases.get(i).getNumcase()==57 || this.cases.get(i).getNumcase()==67 || this.cases.get(i).getNumcase()==77 || this.cases.get(i).getNumcase()==87){
    			ajoutPiece(this.cases.get(i), Pn);
    		}
    		if(this.cases.get(i).getNumcase()==11 || this.cases.get(i).getNumcase()==81){
    			ajoutPiece(this.cases.get(i), Tb);
    		}
    		if(this.cases.get(i).getNumcase()==21 || this.cases.get(i).getNumcase()==71){
    			ajoutPiece(this.cases.get(i), Cb);
    		}
    		if(this.cases.get(i).getNumcase()==31 || this.cases.get(i).getNumcase()==61){
    			ajoutPiece(this.cases.get(i), Fb);
    		}
    		if(this.cases.get(i).getNumcase()==41){
    			ajoutPiece(this.cases.get(i), ReineB);
    		}
    		if(this.cases.get(i).getNumcase()==51){
    			ajoutPiece(this.cases.get(i), RoiB);
    		}
    		if(this.cases.get(i).getNumcase()==12 || this.cases.get(i).getNumcase()==22 || this.cases.get(i).getNumcase()==32 || this.cases.get(i).getNumcase()==42 || this.cases.get(i).getNumcase()==52 || this.cases.get(i).getNumcase()==62 || this.cases.get(i).getNumcase()==72 || this.cases.get(i).getNumcase()==82){
    			ajoutPiece(this.cases.get(i), Pb);
    		}
    	}*/
    }

	/*public void inistialMat(){
		Piece Tn1 = creaPiece("Tn",1);
		Piece Tb3 = creaPiece("Tb",3);
    	Piece Fn1 = creaPiece("Fn",1);
    	Piece Cn1 = creaPiece("Cn",1);
    	Piece RoiN = creaPiece("RoiN",1);
    	Piece ReineN = creaPiece("ReineN",1);
    	Piece Tb1 = creaPiece("Tb",1);
    	Piece Fb1 = creaPiece("Fb",1);
    	Piece Cb1 = creaPiece("Cb",1);
    	Piece RoiB = creaPiece("RoiB",1);
    	Piece ReineB = creaPiece("ReineB",1);


    	Piece Tn2 = creaPiece("Tn",2);
    	Piece Fn2 = creaPiece("Fn",2);
    	Piece Cn2 = creaPiece("Cn",2);
    	Piece Tb2 = creaPiece("Tb",2);
    	Piece Fb2 = creaPiece("Fb",2);
    	Piece Cb2 = creaPiece("Cb",2);


    	Piece Pn1 = creaPiece("Pn",1);
    	Piece Pn2 = creaPiece("Pn",2);
    	Piece Pn3 = creaPiece("Pn",3);
    	Piece Pn4 = creaPiece("Pn",4);
    	Piece Pn5 = creaPiece("Pn",5);
    	Piece Pn6 = creaPiece("Pn",6);
    	Piece Pn7 = creaPiece("Pn",7);
    	Piece Pn8 = creaPiece("Pn",8);


    	Piece Pb1 = creaPiece("Pb",1);
    	Piece Pb2 = creaPiece("Pb",2);
    	Piece Pb3 = creaPiece("Pb",3);
    	Piece Pb4 = creaPiece("Pb",4);
    	Piece Pb5 = creaPiece("Pb",5);
    	Piece Pb6 = creaPiece("Pb",6);
    	Piece Pb7 = creaPiece("Pb",7);
    	Piece Pb8 = creaPiece("Pb",8);

		Piece Cb3 = creaPiece("Cb",3);
		Piece Cb4 = creaPiece("Cb",4);
		Piece Cb5 = creaPiece("Cb",5);

		ajoutPiece(this.cases.get(8), RoiN);
		ajoutPiece(this.cases.get(63), RoiB);
		ajoutPiece(this.cases.get(11), Pb1);
		ajoutPiece(this.cases.get(12), Pb2);

		//me permet de vérifier le Mat
		/*ajoutPiece(this.cases.get(8), RoiN);
		ajoutPiece(this.cases.get(63), RoiB);
		ajoutPiece(this.cases.get(33), Tb1);
		ajoutPiece(this.cases.get(43), Tb2);*/
		
		
		//me permet de vérifier le Pat
		/*ajoutPiece(this.cases.get(0), RoiN);
		ajoutPiece(this.cases.get(26), RoiB);
		ajoutPiece(this.cases.get(25), ReineB);
		ajoutPiece(this.cases.get(63), Pn1);*/


    	/*ajoutPiece(this.cases.get(0), Tn1);
    	ajoutPiece(this.cases.get(18), Cn1);
    	ajoutPiece(this.cases.get(2), Fn1);
    	ajoutPiece(this.cases.get(3), ReineN);
    	ajoutPiece(this.cases.get(4), RoiN);
    	ajoutPiece(this.cases.get(5), Fn2);
    	ajoutPiece(this.cases.get(21), Cn2);
    	ajoutPiece(this.cases.get(7), Tn2);

    	ajoutPiece(this.cases.get(56), Tb1);
    	ajoutPiece(this.cases.get(57), Cb1);
    	ajoutPiece(this.cases.get(58), Fb1);
    	ajoutPiece(this.cases.get(31), ReineB);
    	ajoutPiece(this.cases.get(60), RoiB);
    	ajoutPiece(this.cases.get(34), Fb2);
    	ajoutPiece(this.cases.get(62), Cb2);
    	ajoutPiece(this.cases.get(63), Tb2);

    	ajoutPiece(this.cases.get(8), Pn1);
    	ajoutPiece(this.cases.get(9), Pn2);
    	ajoutPiece(this.cases.get(10), Pn3);
    	ajoutPiece(this.cases.get(11), Pn4);
    	ajoutPiece(this.cases.get(28), Pn5);
    	ajoutPiece(this.cases.get(13), Pn6);
    	ajoutPiece(this.cases.get(14), Pn7);
    	ajoutPiece(this.cases.get(15), Pn8);
    	ajoutPiece(this.cases.get(55), Pb1);
    	ajoutPiece(this.cases.get(54), Pb2);
    	ajoutPiece(this.cases.get(53), Pb3);
    	ajoutPiece(this.cases.get(36), Pb4);
    	ajoutPiece(this.cases.get(51), Pb5);
    	ajoutPiece(this.cases.get(50), Pb6);
    	ajoutPiece(this.cases.get(49), Pb7);
    	ajoutPiece(this.cases.get(48), Pb8);*/
	//}

    public Piece creaPiece(String p, int numpiece){
 		Couleur noir = new Couleur(false);
		Couleur blanc = new Couleur(true);

 		if(p=="Tn"){
 			Piece x = new Tour(noir, numpiece);
 			return x;
 		}
 		else if(p=="Fn"){
 			Piece x = new Fou(noir, numpiece);
 			return x;
 		}
 		else if(p=="Cn"){
 			Piece x = new Cavalier(noir, numpiece);
 			return x;
 		}
 		else if(p=="RoiN"){
 			Piece x = new Roi(noir, numpiece);
 			return x;
 		}
 		else if(p=="ReineN"){
 			Piece x = new Reine(noir, numpiece);
 			return x;
 		}
 		else if(p=="Pn"){
 			Piece x = new Pion(noir, numpiece);
 			return x;
 		}
 		else if(p=="Tb"){
 			Piece x = new Tour(blanc, numpiece);
 			return x;
 		}
 		else if(p=="Fb"){
 			Piece x = new Fou(blanc, numpiece);
 			return x;
 		}
 		else if(p=="Cb"){
 			Piece x = new Cavalier(blanc, numpiece);
 			return x;
 		}
 		else if(p=="RoiB"){
 			Piece x = new Roi(blanc, numpiece);
 			return x;
 		}
 		else if(p=="ReineB"){
 			Piece x = new Reine(blanc, numpiece);
 			return x;
 		}
 		else{
 			Piece x = new Pion(blanc, numpiece);
 			return x;
 		}
    	
    }

	public Piece creaPiecev2(String p, String nupiece, String couleur){
		int numpiece = Integer.parseInt(nupiece);
		Couleur couleurP = null;
		if(couleur.equals("noir")){
			couleurP = new Couleur(false);
		}
		else{
			couleurP = new Couleur(true);
		}
		
		if(p.equals("Tour")){
			Piece x = new Tour(couleurP, numpiece);
			return x;
		}
		else if(p.equals("Fou")){
			Piece x = new Fou(couleurP, numpiece);
			return x;
		}
		else if(p.equals("Cavalier")){
			Piece x = new Cavalier(couleurP, numpiece);
			return x;
		}
		else if(p.equals("Roi")){
			Piece x = new Roi(couleurP, numpiece);
			return x;
		}
		else if(p.equals("Reine")){
			Piece x = new Reine(couleurP, numpiece);
			return x;
		}
		else{
			Piece x = new Pion(couleurP, numpiece);
			return x;
		}
	   
   }

    public void ajoutPiece(Case x, Piece y){
    	x.setPiece(y);
    }

    public ArrayList<Case> getCases(){
    	return this.cases;
    }
}
