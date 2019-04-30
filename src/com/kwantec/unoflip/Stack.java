/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwantec.unoflip;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rodrigo
 */
public class Stack extends ArrayList<Carta>{
    Stack(){

        for(String color:new Colores()){
            for(String tipo: new Tipos()){
                if(tipo.equals("NORMAL")){
                    for(int c=1;c<=9;c++){
                        this.add(new Carta(color, c, "NORMAL"));   
                    }
                }else{
                    this.add(new Carta(color,0,tipo));
                }
            }
            

        }
        Collections.shuffle(this);
        int h=0;
        for(String color:new ColoresFlip()){
            for(String tipo: new TiposFlip()){
                if(tipo.equals("NORMAL")){
                    for(int c=1;c<=9;c++){
                        this.get(h).setfColor(color);
                        this.get(h).setfNumero(c);
                        this.get(h).setfTipo(tipo);
                        h++;
                    }
                }else{
                    this.get(h).setfColor(color);
                    this.get(h).setfNumero(0);
                    this.get(h).setfTipo(tipo);
                    h++;
                }
            }
            

        }
        Collections.shuffle(this);
        
    }
    
    
    
}
