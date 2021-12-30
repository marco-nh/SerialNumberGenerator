
package toyproducts.models;

import toyproducts.Toy;

public class AmericanHelicopterToy implements Toy {
    Integer serialNumber;
    String type;

    public AmericanHelicopterToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }
    
    public void pack(){
        
    }
    public void label(){
        
    }
    
}
