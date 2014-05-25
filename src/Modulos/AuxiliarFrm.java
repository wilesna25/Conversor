/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wilmer Andrés Escobar Naranjo
 */
public class AuxiliarFrm {


    /**
     * ejecutarTomo() Encargado de compilar el tomo.f,
     *
     * @Retorna 1 en caso de éxito, sinó ocurrió un error en la ejecución
     */
    
    
    public int ejectuarTomo() {
        int flag = 1;
        try {
            String[] com_tom = {"g77", "-o", "tomo", "tomo.f"}; //Comando de apagado en windows
            String exe_tomo = "tomo.exe";
            Runtime.getRuntime().exec(com_tom);
            Runtime.getRuntime().exec(exe_tomo);
        } catch (IOException ex) {
            flag = 0;
            Logger.getLogger(AuxiliarFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
}
