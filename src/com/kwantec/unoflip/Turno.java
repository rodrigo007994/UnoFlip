/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwantec.unoflip;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rodrigo
 */
public class Turno {
    public Jugador jugador;
    public Carta carta;
    public String status;
    public JPanel panel;
    
    
    
    Turno(JPanel panel){
        this.carta=null;
        this.status="INICIAL";
        this.panel=panel;
        
        
    }

    /**
     * @return the jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the carta
     */
    public Carta getCarta() {
        return carta;
    }

    /**
     * @param carta the carta to set
     */
    public  void setCarta(Carta carta) {
        this.carta = carta;
        this.panel.removeAll();
        this.panel.add(new UnoflipJPanelCardGraphics(carta,this));
        this.panel.revalidate();
        
    }
    public boolean setCartaConValidacion(Carta carta){
        if(carta.isFlip()){
            if(carta.fColor.equals(this.getCarta().color)){
                this.setCarta(carta);
            }else if(carta.fNumero==this.getCarta().numero&&this.getCarta().numero!=0){
                this.setCarta(carta);
            }else if(carta.fTipo.equals(this.getCarta().tipo)&&!this.carta.tipo.equals("NORMAL")){
                this.setCarta(carta);
            }else{
                JOptionPane.showMessageDialog(panel, "Carta no compatible");
                return false;
            }
        }else{
            if(carta.color.equals(this.getCarta().color)){
        this.setCarta(carta);
        }else if(carta.numero==this.getCarta().numero&&this.getCarta().numero!=0){
            this.setCarta(carta);
        }else if(carta.tipo.equals(this.getCarta().tipo)&&!this.carta.tipo.equals("NORMAL")){
            this.setCarta(carta);
        }else if(carta.fTipo.equals(carta)){
            this.setCarta(carta);
        }else {
            JOptionPane.showMessageDialog(panel, "Carta no compatible");
            return false;
        }
        }
    return true;
    }


    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    
    
}
