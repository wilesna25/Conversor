/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rptrs
 */
public class DataCP {

    private String ruta;

    public DataCP() {
        ruta = "";
    }

    public String leerDataCP() {
        String line = "";
        String texto = "";
        File file = new File(getRuta());
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                texto += line.trim().replace("   ", " ").replace("  ", " ") + " ";
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataCP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto;
    }

    public void escribirDataCp(String texto) {
        String[] aux;
        String[] aux2;
        FileWriter out = null;
        try {
            out = new FileWriter(getRuta());
            aux = texto.split("/");
            aux2 = aux[0].split(" ");
            out.write(aux2[0] + "   ");
            out.write(aux2[1] + "  ");
            out.write(aux2[2] + " ");
            out.write(aux2[3] + "  ");
            out.write(aux2[4] + "  ");
            out.write(aux2[5] + "  ");
            out.write("\n");
            aux2 = aux[1].split(" ");
            out.write("  " + aux2[0] + "   ");
            out.write(aux2[1] + "  ");
            out.write(aux2[2] + "  ");
            out.write(aux2[3] + "  ");
            out.write(aux2[4] + "  ");
            out.write(aux2[5]);

            out.close();
        } catch (IOException ex) {
            Logger.getLogger(CNV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
