package factories;


import factories.SerialNumberGenerator;
import factories.regionalfactories.AmericanCarToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
public abstract class ToyFactory {
    SerialNumberGenerator serialNumber = SerialNumberGenerator.getInstance();
    public ToyFactory() {
        serialNumber = SerialNumberGenerator.getInstance();
    }
    public abstract Toy createToy(Integer serialNumber);
    public Toy produceToy(){
        Toy toy = createToy(serialNumber.next());
        toy.label();
        toy.pack();
        return toy;
    }
    //comprobar, no esta en el UML
    public abstract Integer getSerieNumber();
}
