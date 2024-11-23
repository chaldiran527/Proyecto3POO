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
public class Plastico extends Reciclable {
    private String tipoPlastico; // Ejemplo: PET, HDPE, PVC, etc.

    public Plastico() {
    }

    public Plastico(String tipoPlastico, String beneficios, int codigo, String nombre, String descripcion, String tiempoDescomposicion, String recomendaciones, String impactoAmbiental) {
        super(beneficios, codigo, nombre, descripcion, tiempoDescomposicion, recomendaciones, impactoAmbiental);
        this.tipoPlastico = tipoPlastico;
    }

    public String getTipoPlastico() {
        return tipoPlastico;
    }

    public void setTipoPlastico(String tipoPlastico) {
        this.tipoPlastico = tipoPlastico;
    }

    @Override
    public String toString() {
        return "Plastico{" + super.toString() + "\n" +
               "tipoPlastico=" + tipoPlastico + '}';
    }
}