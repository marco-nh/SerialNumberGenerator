
package factories.regionalfactories;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
public class AmericanCarToyFactory extends ToyFactory {
    Integer serialNumber;

    public AmericanCarToyFactory() {
        this.serialNumber = 0;
    }
    public Toy createToy(Integer serialNumber){
       Toy toy = new AmericanCarToy(serialNumber, "americancar");
       this.serialNumber = serialNumber;
       return toy;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serialNumber;
    }
}
