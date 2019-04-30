
package com.kwantec.unoflip;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author rodrigo
 */
public class UnoflipJPanelCardGraphics extends JPanel{
    public String color;
    public int numero;
    public String tipo;
    UnoflipJPanelCardGraphics(Carta carta, Turno turno){
        if(carta.isFlip()==false){
        this.color=carta.getColor();
        this.numero=carta.getNumero();
        this.tipo=carta.getTipo();
        }else{
        this.color=carta.getfColor();
        this.numero=carta.getfNumero();
        this.tipo=carta.getfTipo();
        }
        JButton button = new JButton("Select");
        button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(turno.setCartaConValidacion(carta)){
            setVisible(false);
        }
        
    }
});
        button.setVisible(true);
        this.add(button);
    }

  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D)g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    switch(this.getColor()) 
        { 
            case "NEGRO": 
                g2.setColor(Color.BLACK);
                break; 
            case "AZUL": 
                g2.setColor(Color.BLUE);
                break; 
            case "VERDE": 
                g2.setColor(Color.GREEN);
                break; 
            case "AMARILLO": 
                g2.setColor(Color.YELLOW);
                break; 
            case "ROJO": 
                g2.setColor(Color.RED);
                break;
            case "TURQUESA": 
                g2.setColor(Color.CYAN);
                break; 
            case "NARANJA": 
                g2.setColor(Color.ORANGE);
                break; 
            case "ROSADO": 
                g2.setColor(Color.PINK);
                break;
            case "MORADO": 
                g2.setColor(Color.MAGENTA);
                break; 
            default: 
                g2.setColor(Color.BLACK);
        }
    g2.fillRect(4, 50, 130, 160);
    g2.setColor(Color.WHITE);
    if(this.getNumero()==0){
    g2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 25));
    
    switch(this.getTipo()) 
        { 
            case "COMODIN": 
                g2.drawString("COMODIN", 10, 90); 
                break; 
            case "FLIP": 
                g2.drawString("FLIP", 10, 90); 
                break; 
            case "REVERSA": 
                g2.drawString("REVERSA", 10, 90); 
                break; 
            case "SALTAUNO": 
                g2.drawString("SALTA", 10, 90); 
                break; 
            case "TOMAUNO": 
                g2.drawString("TOMA UNO", 10, 90); 
                break;
            
        }
    }else{
        g2.setFont(new Font("Serif", Font.PLAIN, 60));
        g2.drawString(Integer.toString(this.getNumero()), 40, 120); 
    }
    
    
  }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    
}
