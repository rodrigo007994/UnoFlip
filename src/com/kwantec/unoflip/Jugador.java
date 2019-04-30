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
public class Jugador {
    public String nombre;
    public int numero;
    public int puerto;
    public String ip;
    public boolean enTurno;

    Jugador(){
        nombre="Rodrigo Villanueva Ceballos";
        numero=1;
        puerto=8086;
        ip="localhost";
    }
    /**
     * @return the puerto
     */
    public int getPuerto() {
        return puerto;
    }

    /**
     * @param puerto the puerto to set
     */
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the enTurno
     */
    public boolean isEnTurno() {
        return enTurno;
    }

    /**
     * @param enTurno the enTurno to set
     */
    public void setEnTurno(boolean enTurno) {
        this.enTurno = enTurno;
    }
    
}
