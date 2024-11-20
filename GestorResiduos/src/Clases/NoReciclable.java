/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */
public class NoReciclable extends Residuo {
    
    protected boolean peligroso;

    public NoReciclable() {
    }

    public NoReciclable(boolean peligroso, int codigo, String nombre, String descripcion, String tiempoDescomposicion, String recomendaciones, String impactoAmbiental) {
        super(codigo, nombre, descripcion, tiempoDescomposicion, recomendaciones, impactoAmbiental);
        this.peligroso = peligroso;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }

    @Override
    public String toString() {
        return "NoReciclable{" + super.toString() + "\n" +
               "peligroso=" + peligroso + '}';
    }
    
    
}
