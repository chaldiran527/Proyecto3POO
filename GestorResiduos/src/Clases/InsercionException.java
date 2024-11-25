/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */
public class InsercionException extends Exception {
    
    private ErroresInsercion codException;

    public InsercionException(ErroresInsercion codException) {
        this.codException = codException;
    }
    
    @Override
    public String getMessage(){
        String mensaje="";
        switch (codException){
            case DATO_VACIO : 
                mensaje = "Algunos datos no se colocaron. Se deben completar todos los datos."; 
                break;
            case RESIDUO_EXISTE : 
                mensaje = "Este residuo ya existe."; 
                break;
        }
        return mensaje;
    }
}
