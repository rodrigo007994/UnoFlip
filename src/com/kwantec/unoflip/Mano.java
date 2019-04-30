/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwantec.unoflip;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author rodrigo
 */
public class Mano extends ArrayList<Carta>{
    JPanel panel;
    Mano(JPanel frame){
        this.panel=frame;
    }
    
    public Stack getSevenStack(Stack stack, Turno turno){
    for(int c=0;c<7;c++){
        this.add(stack.get(0));
        this.panel.add(new UnoflipJPanelCardGraphics(stack.get(0),turno));
        stack.remove(0);
    }
    return stack;
    }
}
