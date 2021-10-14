package cards2;

/** @author sak5680 */

public class IDCard extends Card{
    protected String idNumber;
    
    public IDCard(String n, String id){
        super(n);
        idNumber = id;
    }
    
    public String getIDNumber(){
        return idNumber;
    }
    
    public String format(){
        return super.format() + ", ID: " + idNumber;
    }
}
