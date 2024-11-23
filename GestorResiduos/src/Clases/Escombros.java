/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author JOSUE
 */
public class Escombros extends NoReciclable {
    private boolean reutilizable;

    public Escombros() {
    }

    public Escombros(boolean reutilizable, boolean peligroso, int codigo, String nombre, String descripcion, String tiempoDescomposicion, String recomendaciones, String impactoAmbiental) {
        super(peligroso, codigo, nombre, descripcion, tiempoDescomposicion, recomendaciones, impactoAmbiental);
        this.reutilizable = reutilizable;
    }

    public boolean isReutilizable() {
        return reutilizable;
    }

    public void setReutilizable(boolean reutilizable) {
        this.reutilizable = reutilizable;
    }

    @Override
    public String toString() {
        return "Escombros{" + super.toString() + "\n" +
               "reutilizable=" + reutilizable + '}';
    }
}