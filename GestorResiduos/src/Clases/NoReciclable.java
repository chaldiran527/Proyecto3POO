/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */

public abstract class NoReciclable extends Residuo {

    public NoReciclable() {
    }

    public NoReciclable(int codigo, String nombre, String descripcion, boolean biodegradable) {
        super(codigo, nombre, descripcion, biodegradable);
    }

    @Override
    public String toString() {
        return "NoReciclable{" + super.toString() + '}';
    }
}

