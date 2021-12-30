package toyproducts.models;

import toyproducts.Toy;

public class AsianCarToy implements Toy {
    Integer serialNumber;
    String type;

    public AsianCarToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    @Override
    public void label() {
    }

    @Override
    public void pack() {
    }
    
}
