public class Case{
    private String nomcase;
    private int numcase;
    private Piece piece;

    public Case(String newnomcase, int newnumcase){
    	this.nomcase = newnomcase;
        this.numcase = newnumcase;
    }

    public Case(String newnomcase, int newnumcase, Piece newpiece){
        this.nomcase = newnomcase;
        this.numcase = newnumcase;
        this.piece = newpiece;
    }

    /*public String toString(){
    	return this.nomcase + "|||" + this.numcase + "|||" + this.piece;
    }*/

    public String toString(){
    	return "" + this.piece;
    }

    public Piece getPiece(){
    	return this.piece;
    }

    public int getNumcase(){
    	return this.numcase;
    }

    public String getNomcase(){
    	return this.nomcase;
    }

    public void setPiece(Piece newpiece){
    	this.piece = newpiece;
    }
}