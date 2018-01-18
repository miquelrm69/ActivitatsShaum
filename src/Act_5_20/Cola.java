/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_5_20;

/**
 *
 * @author miquel
 */
public class Cola extends ColeccionSimple {
    
    public Cola() {
        
    }
    
    public void anadir(Object obj) {
        getLista().addLast(obj);
    }
}
