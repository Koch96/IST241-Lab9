package BillfoldTester;

/** @author sak5680 */
public class DriverLicense extends IDCard{
    private int expYear;
    
    public DriverLicense(String n, String id, int year){
        super(n, id); // The superclass is IDCard
        expYear = year;
    }
    
    public String format(){
        return super.format() + ", Expiration year: " + expYear;
    }
}
