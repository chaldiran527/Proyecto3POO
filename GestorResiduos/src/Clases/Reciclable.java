/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */
public class Reciclable extends Residuo {
    
    protected String beneficios;

    public Reciclable() {
    }

    public Reciclable(String beneficios, int codigo, String nombre, String descripcion, String tiempoDescomposicion, String recomendaciones, String impactoAmbiental) {
        super(codigo, nombre, descripcion, tiempoDescomposicion, recomendaciones, impactoAmbiental);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "Reciclable{" + super.toString() + "\n" +
                "beneficios=" + beneficios + '}';
    }
    
    
    
    
}
