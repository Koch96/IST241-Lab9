
package BillfoldTester;


//@author sak5680

public class BillfoldTester {

    public static void main(String[] args) {
        DriverLicense d = new DriverLicense("John Doe", "08-097654", 2007);
        CallingCard c = new CallingCard("Omega Card", "301233985945", 1030);
        
        Billfold b = new Billfold();
        
        b.addCard(d);
        b.addCard(c);
        
        System.out.println(b.formatCards());
        // Check with expected statement below ---
        System.out.println("Expected: [Name: John Doe, Card number: 08-097654, "
                + "Expiration year: 2007 | "
                + "Name: Omega Card, Card Number: 30123398594, Pin: 1030]");
        
    }

}
