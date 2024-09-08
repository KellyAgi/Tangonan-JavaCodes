public class Invoice {
  public static void main(String[] args) {
  // My Store name
  	String StoreName;
    StoreName = "\"Kelly\'s Store\"";
    	System.out.println(StoreName);
   //Address of the store.
   	String City;
    City=", Baguio, City ";
     String Campus;
     Campus=", Philippine Military Academy";
      String Barangay;
      Barangay="Fort del Pilar";
      //This will dislay the full address of the store.
      	System.out.println(Barangay + Campus + City);
        
        	System.out.println("________________________________________");
        //Item Lists
        	System.out.println("\n Item\t\tQuantity\t Price");
        	System.out.println("________________________________________");
            System.out.println("Samsung\t\t   10\t\t $1,299");
            System.out.println("Xiaomi\t\t   10\t\t $999");
            System.out.println("OnePlus\t\t   10\t\t $899");
            System.out.println("Realme\t\t   10\t\t $499");
            System.out.println("Infinix\t\t   10\t\t $299");
        	System.out.println("Oppo\t\t   10\t\t $599");
            System.out.println("POCO\t\t   10\t\t $199");
            System.out.println("Techno\t\t   10\t\t $249");
            System.out.println("Redmagic\t   10\t\t $799");
            System.out.println("ROG\t\t   10\t\t $699");
            System.out.println("________________________________________");
         //Total amount of items
            System.out.print("Total:\t\t   100\t\t$654,000");
         //Additional Notes
    	    System.out.print("\n  Thank You for shopping at our Store!");
    
  }
}
