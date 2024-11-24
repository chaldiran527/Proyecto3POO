/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.Normalizer;
/**
 *
 * @author jessi
 */
public class Gestor {
    
    private ArrayList<Residuo> residuos = new ArrayList<>();
    private int cantidadResiduos;

    public Gestor() {
        cantidadResiduos = 1;
    }
    
    
    public void agregarResiduo(Residuo residuo) {
        cantidadResiduos++;
        residuos.add(residuo);
    }
    
    public void insertarResiduo (String nombre, String descripcion, String esBiodegradable, String tipoResiduo, String categoria, String caracteristica){
        int codigo = cantidadResiduos;
        
        try{
            if (nombre == null || descripcion == null || esBiodegradable == null || tipoResiduo == null || categoria == null || caracteristica == null) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }

            nombre = nombre.trim().toLowerCase();
            nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

            String nombreBuscar = Normalizer.normalize(nombre, Normalizer.Form.NFD);
            nombreBuscar = nombreBuscar.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

            if (buscarNombreRepetido(nombreBuscar)) {
                throw new MantenimientoException(ErroresMantenimiento.RESIDUO_EXISTE);
            }
            
            boolean biodegradable;
            if (esBiodegradable == "SI")
                biodegradable = true;
            
            else
                biodegradable = false;
            
            
            
            if (tipoResiduo == "Reciclable"){
                switch(categoria){
                    case "Plastico":
                        Plastico plastico = new Plastico(caracteristica, codigo, nombre, descripcion, biodegradable);
                        agregarResiduo(plastico);
                        break;
                        
                    case "Vidrio":
                         Vidrio vidrio = new Vidrio(caracteristica, codigo, nombre, descripcion, biodegradable);
                         agregarResiduo(vidrio);
                         break;
                         
                    case "Aluminio":
                        boolean esLata;
                        if (caracteristica == "SI")
                            esLata = true;

                        else
                            esLata = false;
                        
                         Aluminio aluminio = new Aluminio(esLata, codigo, nombre, descripcion, biodegradable);
                         agregarResiduo(aluminio);
                         break;
                         
                    case "CoProcesables":
                         CoProcesables coprocesable = new CoProcesables(caracteristica, codigo, nombre, descripcion, biodegradable);
                         agregarResiduo(coprocesable);
                         break;
                }
            }
                
            else{
                switch(categoria){
                    case "Organica":
                        boolean esCompostable;
                        if (caracteristica == "SI")
                            esCompostable = true;

                        else
                            esCompostable = false;

                        Organica organica = new Organica(esCompostable, codigo, nombre, descripcion, biodegradable);
                        agregarResiduo(organica);
                        break;
                        
                    case "Sanitaria":
                         Sanitaria sanitaria = new Sanitaria(caracteristica, codigo, nombre, descripcion, biodegradable);
                         agregarResiduo(sanitaria);
                         break;
                         
                    case "Toxica":
                         Toxica toxica = new Toxica(caracteristica, codigo, nombre, descripcion, biodegradable);
                         agregarResiduo(toxica);
                         break;
                         
                    case "Electronica":
                         Electronica electronica = new Electronica(caracteristica, codigo, nombre, descripcion, biodegradable);
                         agregarResiduo(electronica);
                         break;

                    case "Escombro":
                         boolean esReutilizable;
                        if (caracteristica == "SI")
                            esReutilizable = true;

                        else
                            esReutilizable = false;

                         Escombros escombro = new Escombros(esReutilizable, codigo, nombre, descripcion, biodegradable);
                         agregarResiduo(escombro);
                         break;
                }
            }
            JOptionPane.showMessageDialog(null, "Residuo insertado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch (MantenimientoException e){
            JOptionPane.showMessageDialog(null, "Error al insertar el residuo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    
    
    public void modificarResiduo (){
        
        
        try{
            
            String codigo = JOptionPane.showInputDialog(null, "Introduce el código del residuo a modificar:", "Modificación Residuo", JOptionPane.QUESTION_MESSAGE);
            
            if (codigo == null) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            
            Residuo residuo = buscarResiduoPorCod(codigo);
            
            if (residuo == null)
                throw new MantenimientoException(ErroresMantenimiento.RESIDUO_NO_EXISTE);
            
            String [] opciones = {"Descripción", "Estado de biodegradable"};
            int modificar = JOptionPane.showOptionDialog(null, "Seleccione que desea modificar", "Modificar Datos", JOptionPane.DEFAULT_OPTION, 
                              JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch(modificar){
                case 0:
                    String descripcion = JOptionPane.showInputDialog(null, "Ingrese la nueva descripción del residuo", "Modificar Residuo", JOptionPane.QUESTION_MESSAGE);
                    
                    if (descripcion == null) 
                        return;
                    
                    else if (descripcion.trim().isEmpty())
                        throw new MantenimientoException(ErroresMantenimiento.DATO_ESPECIFICO_VACIO); 
                    
                    residuo.descripcion = descripcion;
                    
                    break;
                    
                case 1:
                    int esBiodegradable = JOptionPane.showConfirmDialog(null, "¿Desea colocar el residuo como biodegradable?", "Modificar Residuo", JOptionPane.YES_NO_OPTION);
                    
                    if (esBiodegradable == JOptionPane.YES_OPTION)
                        residuo.biodegradable = true;
                    
                    else if (esBiodegradable == JOptionPane.NO_OPTION)
                        residuo.biodegradable = false;
                    
                    else if (esBiodegradable == JOptionPane.CLOSED_OPTION)
                        return;
                    
                    break;
            }
            
            JOptionPane.showMessageDialog(null, "Residuo modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch (MantenimientoException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el residuo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    public boolean eliminarResiduo(String codigo) {
        return residuos.removeIf(residuo -> residuo.getCodigo().equals(codigo));
    }
    
    public ArrayList<Residuo> listarResiduos() {
        return residuos;
    }
    
    
    
    public Residuo buscarResiduoPorCod(String codigo) {
        for (Residuo residuo : residuos) {
            if (residuo.getCodigo().equals(codigo)) {
                return residuo;
            }
        }
        return null;
    }
    
    
    
    
    public boolean buscarNombreRepetido(String nombreResiduo) {
        for (Residuo residuo : residuos) {
            String nombreLista = Normalizer.normalize(residuo.getNombre(), Normalizer.Form.NFD);
            nombreLista = nombreLista.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
            
            if (nombreLista.equals(nombreResiduo)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    public ArrayList<Reciclable> filtrarReciclables() {
    ArrayList<Reciclable> reciclables = new ArrayList<>();
    for (Residuo residuo : residuos) {
        if (residuo instanceof Reciclable) {
            reciclables.add((Reciclable) residuo);
        }
    }
    return reciclables;
    }
    
    
    
    
    public void mostrarResiduos() {
        for (Residuo residuo : residuos) {
            
            System.out.println(residuo.toString() + "\n");
        }
    }
}

