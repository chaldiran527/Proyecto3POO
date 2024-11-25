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
        
        gestor.insertarResiduo("AAA", "BBB", "SI", "Reciclable", "Plastico", "CCC");
        gestor.insertarResiduo("DDD", "EEE", "NO", "NoReciclable", "Toxica", "");
        gestor.insertarResiduo("Aaa", "EEE", "NO", "NoReciclable", "Toxica", "");
        gestor.mostrarResiduos();
    }
    
}
