package toyproducts.models;

import toyproducts.Toy;

public class AsianHelicopterToy implements Toy {
    Integer serialNumber;
    String type;

    public AsianHelicopterToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public void label() {
    }

    public void pack() {
    }
    
}
