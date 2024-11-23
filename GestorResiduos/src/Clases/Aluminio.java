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
public class Aluminio extends Reciclable {
    private boolean esLata;

    public Aluminio() {
    }

    public Aluminio(boolean esLata, String beneficios, int codigo, String nombre, String descripcion, String tiempoDescomposicion, String recomendaciones, String impactoAmbiental) {
        super(beneficios, codigo, nombre, descripcion, tiempoDescomposicion, recomendaciones, impactoAmbiental);
        this.esLata = esLata;
    }

    public boolean isEsLata() {
        return esLata;
    }

    public void setEsLata(boolean esLata) {
        this.esLata = esLata;
    }

    @Override
    public String toString() {
        return "Aluminio{" + super.toString() + "\n" +
               "esLata=" + esLata + '}';
    }
}
