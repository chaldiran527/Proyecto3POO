/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.*;

/**
 *
 * @author Usuario
 */
public class GestorResiduos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        
        gestor.insertarResiduo("AAA", "BBB", null, "Reciclable", "Plastico", "CCC");
        gestor.insertarResiduo("DDD", "EEE", "NO", "NoReciclable", "Toxica", "FFF");
        gestor.insertarResiduo("Aaa", "EEE", "NO", "NoReciclable", "Toxica", "FFF");
        gestor.mostrarResiduos();
        gestor.modificarResiduo();
        gestor.modificarResiduo();
        gestor.mostrarResiduos();
        
        
    }
    
}
