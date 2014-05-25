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
public class Param {

    private String ruta;

    public static void main(String[] args) {
        Param  p = new Param();
        String ruta = "/root/Desktop/ConversorPrueba_1/model1p";
        System.out.println("p.leerModel1p(ruta); = " + p.leerModel1p(ruta));
    }
    public Param() {
        ruta = "param.param";
    }

    public String leerParam() {
        String line = "";
        String[] aux_linea;
        String[] aux_lineab;
        String texto = "";
        File file = new File(getRuta());
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println("line = " + line);
                aux_linea = line.trim().split(",");
                for (int i = 0; i < aux_linea.length; i++) {
                    aux_lineab = aux_linea[i].split("=");
                    texto += aux_lineab[1].replace(")", "") + ",";
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Param.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Param.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto;
    }

    public void escribirParam(String texto) {
        System.out.println("texto "+ texto);
        String[] aux;
        String[] aux2;
        FileWriter out = null;
        System.out.println("getRuta = " + getRuta());
        try {
            out = new FileWriter(getRuta());
            aux = texto.split("/");
            aux2 = aux[0].split(" ");
            out.write("PARAMETER ");
            out.write("(MEQ=" + aux2[0]);
            out.write(",MST=" + aux2[1]);
            out.write(",MAX=" + aux2[2]);
            out.write(",MDT=" + aux2[3] + ")");
            out.write(System.getProperty("line.separator"));
            //Segundo renglón
            aux2 = aux[1].split(" ");
            out.write("PARAMETER ");
            out.write("(MD=" + aux2[0]);
            out.write(",MU=" + aux2[1]);
            out.write(",MG=" + aux2[2] + ")");
            out.write(System.getProperty("line.separator"));
            //Tercer renglón
            aux2 = aux[2].split(" ");
            out.write("PARAMETER ");
            out.write("(MKA=" + aux2[0]);
            out.write(",MKB=" + aux2[1] + ")");
            out.write(System.getProperty("line.separator"));
            //Cuarto renglon
            aux2 = aux[3].trim().split(" ");
            out.write("PARAMETER (MPA="+aux2[0]+",MRA="+aux2[1]+","+"MHA="+aux2[2]+")");
            out.write(System.getProperty("line.separator"));
            out.write("PARAMETER (NP="+aux2[0]+",NR="+aux2[1]+",NH="+aux2[2]+")  ");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(CNV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     leerMode1p()
     Lee el archivo model1p y extrae de ellos el valor de los numeros de los nodos
     */
    public String leerModel1p(String rut_mod) {
        String line = "";
        String[] aux_linea;
        String lin_inf = "";
        File file = new File(rut_mod);
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                aux_linea = line.trim().split(" ");
                if (aux_linea.length == 3) {
                    lin_inf = line;
                    System.out.println("line = " + line);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Param.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Param.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lin_inf;
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
