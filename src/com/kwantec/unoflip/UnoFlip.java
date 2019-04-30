/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwantec.unoflip;

import java.awt.Canvas;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author rodrigo
 */
public class UnoFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            JFrame frame = new JFrame();
            frame.add(new UnoFlipGUI());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(20,20, 600,400);
            frame.setVisible(true);
            
            /*
            stack.remove(0);
            //System.out.println(turno.getCarta().toString());
            turno.setCartaNormal(mano.get(0));
            //System.out.println(mano.get(0).toString());
            Jugador jugador=new Jugador();
            turno.setJugador(jugador);
            turno.setStatus("ON");
            System.out.println("Escribe el num de la carta que vas a poner de tu mano:");
            Scanner scan = new Scanner(System.in);
            jugador.setNumero(scan.nextInt());
            System.out.println("Escribe tu direccion ip:");
            jugador.setIp(scan.nextLine());
            jugador.setEnTurno(true);
            */

        } catch (Exception ex) {
            Logger.getLogger(UnoFlip.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
