/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.exemplos.contatador;

/**
 *
 * @author Klaus Boeing
 */
public class Contador implements Runnable{

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }
    }
}
