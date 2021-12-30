
package factories.regionalfactories;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproducts.models.AsianHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory {
    Integer serialNumber;

    public AmericanHelicopterToyFactory() {
        this.serialNumber = 0;
    }
    public Toy createToy(Integer serialNumber){
       Toy toy = new AsianHelicopterToy(serialNumber, "asianhelicopter");
       this.serialNumber = serialNumber;
       return toy;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serialNumber;
    }
}
