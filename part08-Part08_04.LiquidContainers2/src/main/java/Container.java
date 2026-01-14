/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicol
 */
public class Container {
    private int containerLiquid;
    public Container (){ 
        this.containerLiquid = 0;
    }
    
    public int contains() {
        return containerLiquid;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            if ((amount + containerLiquid) > 100) {
                containerLiquid = 100;
            } else {
                containerLiquid += amount;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if ((containerLiquid - amount) < 0) {
                containerLiquid = 0;
            } else {
                containerLiquid -= amount;
            }
        }
    }
    
    public String toString() {
        return containerLiquid + "/" + 100;
    }
    
    
    
}
