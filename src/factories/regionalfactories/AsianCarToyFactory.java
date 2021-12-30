
package factories.regionalfactories;


import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
import factories.SerialNumberGenerator;
import business.ToyBusiness;
import factories.ToyFactory;

public class AsianCarToyFactory extends ToyFactory{
    Integer serialNumber;

    public AsianCarToyFactory() {
        this.serialNumber = 0;
    }
    public Toy createToy(Integer serialNumber){
       Toy toy = new AsianCarToy(serialNumber, "asiancar");
       this.serialNumber = serialNumber;
       return toy;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serialNumber;
    }
}
