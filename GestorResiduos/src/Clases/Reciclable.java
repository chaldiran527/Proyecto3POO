/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */

public abstract class Reciclable extends Residuo {

    public Reciclable() {
    }

    public Reciclable(int codigo, String nombre, String descripcion, boolean biodegradable) {
        super(codigo, nombre, descripcion, biodegradable);
    }

    @Override
    public String toString() {
        return "Reciclable{" + super.toString() + '}';
    }
}
