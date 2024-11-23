/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author jessi
 */
public class Gestor {
    
    private ArrayList<Residuo> residuos = new ArrayList<>();
    
    public void agregarResiduo(Residuo residuo) {
        residuos.add(residuo);
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
    
    public ArrayList<Reciclable> filtrarReciclables() {
    ArrayList<Reciclable> reciclables = new ArrayList<>();
    for (Residuo residuo : residuos) {
        if (residuo instanceof Reciclable) {
            reciclables.add((Reciclable) residuo);
        }
    }
    return reciclables;
    }
    
}

