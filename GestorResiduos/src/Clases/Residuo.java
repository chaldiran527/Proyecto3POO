/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */

public abstract class Residuo {
    
    protected int codigo;
    protected String nombre;
    protected String descripcion;
    protected String tiempoDescomposicion;
    protected String recomendaciones;
    protected String impactoAmbiental;

    public Residuo() {
    }

    public Residuo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        this.codigo = codigo;
    }

    public Residuo(int codigo, String nombre, String descripcion, String tiempoDescomposicion, String recomendaciones, String impactoAmbiental) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempoDescomposicion = tiempoDescomposicion;
        this.recomendaciones = recomendaciones;
        this.impactoAmbiental = impactoAmbiental;
    }

    public String getCodigo() {
        return String.valueOf(codigo);
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempoDescomposicion() {
        return tiempoDescomposicion;
    }

    public void setTiempoDescomposicion(String tiempoDescomposicion) {
        this.tiempoDescomposicion = tiempoDescomposicion;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getImpactoAmbiental() {
        return impactoAmbiental;
    }

    public void setImpactoAmbiental(String impactoAmbiental) {
        this.impactoAmbiental = impactoAmbiental;
    }

    @Override
    public String toString() {
        return "Residuo{" + 
                "codigo=" + codigo + "\n" +
                ", nombre=" + nombre + "\n" +
                ", descripcion=" + descripcion + "\n" +
                ", tiempoDescomposicion=" + tiempoDescomposicion + "\n" +
                ", recomendaciones=" + recomendaciones + "\n" +
                ", impactoAmbiental=" + impactoAmbiental + '}';
    }
}

