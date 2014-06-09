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
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rptrs
 */
public class CNV {

    private String ruta;
    private String esta_ref;
    LinkedList<String> estaciones;

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double aux = 4.816;
        System.out.println("dir " + System.getProperty("user.dir"));
    }

    public void leerIPN(String ruta, String nombre_archivo) {
        String aammdd;
        String hhmm;
        String ssss;
        String err = "0.00";
        String lag;
        String erlag = "0.001";
        String log = "";
        String errlo = "0.001";
        String pro;
        String mag;
        String num;
        String rms;
        String ipn = "";
        String sta_nom;
        String sta_ss;
        String aux_sta = "";
        try {
            File file = new File(ruta);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] aux;
            char[] tochar;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() == 102) { // Fila que contiene información general 
                    if (!aux_sta.equals("")) {
                        System.out.println("aux_sta = " + aux_sta);
                        escribirCNV(aux_sta, nombre_archivo);
                        aux_sta = "";
                    }
                    tochar = line.trim().toCharArray();
                    aammdd = tochar[0] + "" + tochar[1] + "" + tochar[2] + "" + tochar[3] + "" + tochar[4] + "" + tochar[5] + "";
                    hhmm = tochar[7] + "" + tochar[8] + "" + tochar[9] + "" + tochar[10] + "";
                    ssss = tochar[12] + "" + tochar[13] + "" + tochar[14] + "" + tochar[15] + "" + tochar[16] + "";
                    lag = tochar[21] + "" + tochar[22] + "" + tochar[23] + "" + tochar[24] + "" + tochar[25] + "";
                    log = tochar[30] + "" + tochar[31] + "" + tochar[32] + "" + tochar[33] + "" + tochar[34] + "" + tochar[35] + "";
                    pro = tochar[39] + "" + tochar[40] + "" + tochar[41] + "" + tochar[42] + "";
                    mag = tochar[46] + "" + tochar[47] + "" + tochar[48] + "" + tochar[49] + "";
                    num = tochar[51] + "" + tochar[52] + "";
                    rms = tochar[63] + "" + tochar[64] + "" + tochar[65] + "" + tochar[66] + "";
                    ipn += aammdd + " " + hhmm + " " + ssss + " " + err + " "
                            + lag + " " + erlag + " " + log + " " + errlo + " " + pro
                            + " " + num + " " + mag + " " + rms + System.getProperty("line.separator");
                    escribirCNV(ipn, nombre_archivo);
                    System.out.println("line = " + line);
                    System.out.println("ipn = " + ipn);
                    ipn = "";
                } else if (line.length() == 77) {
                    aux = line.replace("       ", " ").replace("                                 ", " ").split(" ");
                    sta_nom = estaciones.indexOf(aux[0].substring(0, 4).trim()) + "";
                    sta_ss = aux[2];
                    aux_sta += sta_nom + " " + sta_ss + " 1 0" + System.getProperty("line.separator");
                }
            }
            if (!aux_sta.equals("")) {
                escribirCNV(aux_sta, nombre_archivo);
                aux_sta = "";
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarSta(String ruta) {
        File file = null;
        FileReader reader = null;
        BufferedReader bf = null;
        estaciones = new LinkedList<>();
        try {
            file = new File(getEsta_ref());
            reader = new FileReader(file);
            bf = new BufferedReader(reader);
            String line = "";
            String[] aux_line;
            while ((line = bf.readLine()) != null) {
                aux_line = line.trim().split(" ");
                estaciones.add(aux_line[1]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int numEsta(String estacion) {
        File file = null;
        FileReader reader = null;
        BufferedReader bf = null;
        int num_esta = 999;
        try {
            file = new File(getEsta_ref());
            reader = new FileReader(file);
            bf = new BufferedReader(reader);
            String line = "";
            String[] aux_line;
            boolean encontrado = false;
            while ((line = bf.readLine()) != null && !encontrado) {
                aux_line = line.trim().split(" ");
                if (aux_line[1].trim().equals(estacion)) {
                    encontrado = true;
                    num_esta = Integer.parseInt(aux_line[0].trim());
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return num_esta;
    }

    public void escribirCNV(String text, String nombre_archivo) {
        String[] aux_sta;
        String line_sta = "";
        int cont_sta = 0;
        FileWriter out = null;
        try {
            out = new FileWriter(nombre_archivo + ".cnv", true);
            if (text.length() == 67) {
                out.write(text);
            } else {
                aux_sta = text.split(System.getProperty("line.separator"));
                for (String sta : aux_sta) {
                    cont_sta++;
                    if (line_sta.equals("")) {
                        line_sta = sta;
                    } else {
                        line_sta += "   " + sta;
                    }
                    if (cont_sta == 5) {
                        line_sta += System.getProperty("line.separator");
                        cont_sta = 0;
                        out.write(line_sta);
                        line_sta = "";
                    }
                }
                if (cont_sta != 0) {
                    for (int i = (5 - cont_sta); i > 0; i--) {
                        line_sta += "      0.00 0 0";
                    }
                    out.write(line_sta);
                }
                out.write(System.getProperty("line.separator"));
            }
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

    /**
     * @return the esta_ref
     */
    public String getEsta_ref() {
        return esta_ref;
    }

    /**
     * @param esta_ref the esta_ref to set
     */
    public void setEsta_ref(String esta_ref) {
        this.esta_ref = esta_ref;
    }
}
