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
public class Juego {
    public boolean sentido;
    public Turno turno;

    /**
     * @return the sentido
     */
    public boolean isSentido() {
        return sentido;
    }

    /**
     * @param sentido the sentido to set
     */
    public void setSentido(boolean sentido) {
        this.sentido = sentido;
    }

    /**
     * @return the turno
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
