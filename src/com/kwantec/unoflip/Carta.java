/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kwantec.unoflip;

/**
 *
 * @author rodrigo
 */
public class Carta {
    public String color;
    public int numero;
    public String tipo;
    public String fColor;
    public int fNumero;
    public String fTipo;
    public boolean flip;
    
    
    Carta(String color, int numero, String tipo){
        this.color = color;
        this.numero = numero;
        this.tipo = tipo;
        //System.out.println("Nueva Carta con color "+color+", número "+numero+", tipo "+tipo+" y es flip:"+flip);
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

    /**
     * @return the fColor
     */
    public String getfColor() {
        return fColor;
    }

    /**
     * @param fColor the fColor to set
     */
    public void setfColor(String fColor) {
        this.fColor = fColor;
    }

    /**
     * @return the fNumero
     */
    public int getfNumero() {
        return fNumero;
    }

    /**
     * @param fNumero the fNumero to set
     */
    public void setfNumero(int fNumero) {
        this.fNumero = fNumero;
    }

    /**
     * @return the fTipo
     */
    public String getfTipo() {
        return fTipo;
    }

    /**
     * @param fTipo the fTipo to set
     */
    public void setfTipo(String fTipo) {
        this.fTipo = fTipo;
    }

    @Override
    public String toString() {
        return "Carta{" + "color=" + color + ", numero=" + numero + ", tipo=" + tipo + ", fColor=" + fColor + ", fNumero=" + fNumero + ", fTipo=" + fTipo + ", flip=" + flip + '}';
    }



    /**
     * @return the flip
     */
    public boolean isFlip() {
        return flip;
    }

    /**
     * @param flip the flip to set
     */
    public void setFlip(boolean flip) {
        this.flip = flip;
    }

   
    
}
