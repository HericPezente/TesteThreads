/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.exemplos.barradeprogresso;

import java.io.PrintWriter;

/**
 *
 * @author Klaus Boeing
 */
public class GeraTXT implements Runnable {

    @Override
    public void run() {
        try (PrintWriter writer = new PrintWriter("c:/dev/arquivo.txt")) {
            for (int i = 0; i < 100000000; i++) {
                writer.println(i);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

}
