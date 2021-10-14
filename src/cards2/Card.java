package cards2;

/** @author sak5680 */

public class Card {
    protected String name;
    
    public Card() {
        name = "";
    }
    
    public Card(String n){
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public String format() {
        return "Card holder: " + name;
    }
}
