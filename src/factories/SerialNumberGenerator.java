/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factories;

public class SerialNumberGenerator {
    private static SerialNumberGenerator serialNumberGenerator = null;
    private Integer serialNumber;
    private SerialNumberGenerator() {
        this.serialNumber = 0;
    }
    
    public static SerialNumberGenerator getInstance(){
        if (serialNumberGenerator == null){
            serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
    public Integer next(){
        return ++serialNumber;
    }
}
