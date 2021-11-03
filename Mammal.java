package program2;

public class Mammal implements Animal{

    private int numLegs;
    private String food;
    
    public Mammal(int numLegs, String food){
        this.numLegs = numLegs;
        this.food = food;
    }
    
    @Override
    public void eat() {
    }

    @Override
    public void travel() {
    }
    
    public int NoOfLegs(){
        return numLegs;
    }
    public String FavFood(){
        return food;
    }  
}
