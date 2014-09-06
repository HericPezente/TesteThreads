/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.exemplos.barradeprogresso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Klaus Boeing
 */
public class BarraDeProgresso implements Runnable{

    private Thread thread;

    public BarraDeProgresso(Thread thread) {
        this.thread = thread;
    }
    
    @Override
    public void run() {
        while (thread.isAlive()){
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(BarraDeProgresso.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print("|");
        }
        
        System.out.println();
    }
    
}
