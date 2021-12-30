
package business;


import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.Map;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class ToyBusiness {
    Map<String,ToyFactory> toyFactories;
    
    public ToyBusiness(Map<String, ToyFactory> toyFactories) {
        this.toyFactories = toyFactories;
    }
    
    public Toy produceToy(String name){
        Toy toy;
        if (!toyFactories.isEmpty()){
            ToyFactory toyfactory = toyFactories.get(name);
            toy = toyfactory.produceToy();
            toy.pack();
            toy.label();
            toyFactories.put(name, toyfactory);
        } else{
            System.out.println("fallo");
            return new AmericanCarToy(1,"a");
        }
        return toy;
    };
    
    public void add(String name, ToyFactory f){
        toyFactories.put(name, f);
    }
    //Comprobacion, no esta en el UML
    public Map<String,ToyFactory> getToyFactory() {
        return toyFactories;
    }
    
}
