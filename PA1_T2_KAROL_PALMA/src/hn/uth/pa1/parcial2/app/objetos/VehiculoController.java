/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial2.app.objetos;

import hn.uth.pa1.parcial2.app.repositorio.VehiculoRepo;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author karol
 */
public class VehiculoController {
   public static Object [][] convertirLista(List<Vehiculo> lista){
        int tamanioLista=lista.size();
        
        Object [][] tablaRetorno = new Object[tamanioLista][9];
        
        for (int i = 0; i < tamanioLista; i++) {
            tablaRetorno[i][0]=lista.get(i).getPlaca();
            tablaRetorno[i][1]=lista.get(i).getModelo();
            tablaRetorno[i][2]=lista.get(i).getMarca();
            tablaRetorno[i][3]=lista.get(i).getAnio();
            tablaRetorno[i][4]=lista.get(i).getMotor();
            tablaRetorno[i][5]=lista.get(i).getPrecio();
            tablaRetorno[i][6]=lista.get(i).getNombre();
            tablaRetorno[i][7]=lista.get(i).getDescripcion();
            tablaRetorno[i][8]=lista.get(i).getImagen();
        }
        return tablaRetorno;
    }
}
