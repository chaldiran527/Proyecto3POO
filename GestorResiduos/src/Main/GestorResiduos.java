/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.*;
import java.util.List;

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
        
        gestor.insertarResiduo("DDD", "EEE", "NO", "NoReciclable", "Organico");
        gestor.insertarResiduo("Aaa", "EEE", "NO", "NoReciclable", "Inorganico");
        //gestor.mostrarResiduos();
        gestor.modificarResiduo();
        gestor.modificarResiduo();
        //gestor.mostrarResiduos();
        gestor.insertarResiduo("rrr", "fff", "SI", "Reciclable", "Peligroso");
        gestor.eliminarResiduo();
        //gestor.mostrarResiduos();
        gestor.eliminarResiduo();
        //gestor.mostrarResiduos();
        List listaResiduos = gestor.cargarArchivoResiduos("residuos.dat");
        if (listaResiduos != null)
            System.out.println("\n\nLista");
            System.out.println(listaResiduos);
    }
    
}
