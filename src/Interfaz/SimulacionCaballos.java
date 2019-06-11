/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Caballo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Cristian
 */
public class SimulacionCaballos extends javax.swing.JFrame {
    Caballo caballo = new Caballo();
    public SimulacionCaballos() {

        initComponents();
        setBounds(0, 0, 1350, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Simulación Caballos");
        setResizable(true);
        setAlwaysOnTop(true);
        setVisible(true);
        
        caballo.metas(Panel.getGraphics());
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 10);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 95);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 180);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 265);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 350);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 435);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 520);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 605);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 690);
        caballo.dibujar(Panel.getGraphics(), Panel.getWidth(), 775);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.WHITE);
        g.drawLine(0, 37 , 1400 , 37);
        g.drawLine(0, 39 , 1400 , 39);
        g.drawLine(0, 122 , 1400 , 122);
        g.drawLine(0, 124 , 1400 , 124);
        g.drawLine(0, 207 , 1400 , 207);
        g.drawLine(0, 209 , 1400 , 209);
        g.drawLine(0, 292 , 1400 , 292);
        g.drawLine(0, 294 , 1400 , 294);
        g.drawLine(0, 377 , 1400 , 377);
        g.drawLine(0, 379 , 1400 , 379);
        g.drawLine(0, 462 , 1400 , 462);
        g.drawLine(0, 464 , 1400 , 464);
        g.drawLine(0, 547 , 1400 , 547);
        g.drawLine(0, 549 , 1400 , 549);
        g.drawLine(0, 632 , 1400 , 632);
        g.drawLine(0, 634 , 1400 , 634);
        g.drawLine(0, 717 , 1400 , 717);
        g.drawLine(0, 719 , 1400 , 719);
        g.drawLine(0, 802 , 1400 , 802);
        g.drawLine(0, 804 , 1400 , 804);
        g.drawLine(0, 887 , 1400 , 887);
        g.drawLine(0, 889 , 1400 , 889);
        g.drawLine(1205, 0 , 1205 , 1000);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
