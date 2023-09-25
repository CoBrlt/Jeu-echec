public class Couleur {
    private String color;

    public Couleur(boolean col){
        if (col == true){
            this.color = "blanc";
        }
        else{
            this.color = "noir";
        }
    }

    public String getColor(){
    	return this.color;
    }

}
