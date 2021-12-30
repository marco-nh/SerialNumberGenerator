package kata6;

import java.util.Scanner;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AsianCarToy;
import factories.SerialNumberGenerator;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AsianCarToyFactory;
import business.ToyBusiness;
import factories.ToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproducts.Toy;

public class Kata6 {

    public static void main(String[] args) {
        String str = "";
        Scanner obj = new Scanner(System.in);
        
        Map<String,ToyFactory> toyFactories = new HashMap<String,ToyFactory>();
        
        ToyBusiness creador = new ToyBusiness(toyFactories);
        System.out.println("Programa: Escribe asianhelicopter, americanhelicopter, asiancar o americancar, despues, escribe asian o american, este guardara en la factoria de cada region si se ha creado un coche o un helicoptero");
        
        creador.add("americancar", new AmericanCarToyFactory());
        creador.add("asiancar", new AsianCarToyFactory());
        creador.add("americanhelicopter", new AmericanHelicopterToyFactory());
        creador.add("asianhelicopter", new AsianHelicopterToyFactory());
        
        while(true){
            
            str = obj.nextLine();
            
            if (str.contentEquals("exit")){
                break;
            } else if (str.contentEquals("asianhelicopter") || str.contentEquals("americanhelicopter") || str.contentEquals("asiancar") || str.contentEquals("americancar")){

                //creador.produceToy(str);
                creador.produceToy(str);
                for (String key : creador.getToyFactory().keySet()) {
                    System.out.println("Key => " + key + " Id => " + creador.getToyFactory().get(key).getSerieNumber());
                }
            } else{
                System.out.println("Command unknown!");
            }
        }
        
    }
    
}
