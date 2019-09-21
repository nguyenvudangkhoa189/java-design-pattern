package billpugh;

public class BillPughSingletonTest {

    private static void billPughSingletonTest() {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        
        System.out.println("Done");
    }
    
    public static void main(String[] args) {
        billPughSingletonTest();
    }
}
