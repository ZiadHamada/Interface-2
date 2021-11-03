package program2;

public class Program2 {

    public static void main(String[] args) {
        Mammal m = new Mammal(4, "leaves");
        m.eat();
        m.travel();
        
        System.out.println("Number of legs: " + m.NoOfLegs());
        System.out.println("Favorite food: " + m.FavFood());
    }
    
}
