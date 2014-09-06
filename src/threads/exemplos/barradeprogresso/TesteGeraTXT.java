/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.exemplos.barradeprogresso;

/**
 *
 * @author Klaus Boeing
 */
public class TesteGeraTXT {

    public static void main(String[] args) throws InterruptedException {
        Thread threadGeraTXT = new Thread(new GeraTXT());
        Thread threadBarraProgesso = new Thread(new BarraDeProgresso(threadGeraTXT));
        
        threadGeraTXT.start();
        threadBarraProgesso.start();
        
        threadGeraTXT.join();
        threadBarraProgesso.join();
    }
    
}
