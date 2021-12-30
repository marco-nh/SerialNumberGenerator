
package factories.regionalfactories;


import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
import factories.SerialNumberGenerator;
import business.ToyBusiness;
import factories.ToyFactory;

public class AsianHelicopterToyFactory extends ToyFactory{
    Integer serialNumber;

    public AsianHelicopterToyFactory() {
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
