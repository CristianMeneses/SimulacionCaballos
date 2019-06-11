/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Cristian
 */
public class Caballo {

    public void metas(Graphics g) {
        ImageIcon meta = new ImageIcon(new ImageIcon(getClass()
                .getResource("/imagenes/meta.jpg")).getImage());
        g.drawImage(meta.getImage(), 1200, 10, null);
        g.drawImage(meta.getImage(), 1200, 95, null);
        g.drawImage(meta.getImage(), 1200, 180, null);
        g.drawImage(meta.getImage(), 1200, 265, null);
        g.drawImage(meta.getImage(), 1200, 350, null);
        g.drawImage(meta.getImage(), 1200, 435, null);
        g.drawImage(meta.getImage(), 1200, 520, null);
        g.drawImage(meta.getImage(), 1200, 605, null);
        g.drawImage(meta.getImage(), 1200, 690, null);
        g.drawImage(meta.getImage(), 1200, 775, null);
    }

    public void dibujar(Graphics g, int x, int y) {
        int i = 0, j = 1, ran;
        Random r;
        while (i < x - 190) {
        ImageIcon caballo1 = new ImageIcon(new ImageIcon(getClass()
                .getResource("/imagenes/" + j + ".jpg")).getImage());
        g.drawImage(caballo1.getImage(), i, y, null);
        if (j < 12) {
            j++;
        } else {
            j = 1;
        }
        r = new Random();
        ran = r.nextInt(10);
        i += ran;
        }
    }
}
