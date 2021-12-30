
package toyproducts.models;

import toyproducts.Toy;

public class AmericanCarToy implements Toy {
    Integer serialNumber;
    String type;

    public AmericanCarToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }
    
    @Override
    public void pack(){
        
    }
    @Override
    public void label(){
        
    }
    
}
