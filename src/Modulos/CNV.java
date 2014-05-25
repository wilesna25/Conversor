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
//        CNV lector = new CNV();
        DecimalFormat df = new DecimalFormat("0.00");
        double aux = 4.816;
        System.out.println("aux " + df.format(aux));
//        String aux_line = "7520.51W4816";
//        System.out.println("aux_line.substring(0, aux_line.length())" + aux_line.substring(8, 12));
//        String ruta = "/root/Desktop/ConversorPrueba/src/Formatos/prueba.ipn";
//        String ruta = "C:\\Users\\Rptrs\\Desktop\\ConversorPrueba\\src\\Formatos\\prueba.ipn";
//        lector.leerIPN(ruta);
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
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() == 102) { // Fila que contiene información general 
                    if (!aux_sta.equals("")) {
                        System.out.println("aux_sta = " + aux_sta);
                        escribirCNV(aux_sta, nombre_archivo);
                        aux_sta = "";
                    }
                    aux = line.replace("   ", "  ").replace("  ", " ").split(" ");
                    aammdd = aux[0];//+ "" + aux[0].substring(1)+""+aux[0].substring(2) +"" +aux[0].substring(3)+""+
                    hhmm = aux[1];
                    ssss = aux[2];
                    lag = aux[4];
                    log = aux[5].substring(3, 9);
                    pro = aux[6];
                    mag = aux[7];
                    num = aux[8];
                    rms = aux[11];
                    ipn += aammdd + " " + hhmm + " " + ssss + " " + err + " "
                            + lag + " " + erlag + " " + log + " " + errlo + " " + pro
                            + " " + num + " " + mag + " " + rms + System.getProperty("line.separator");
                    escribirCNV(ipn, nombre_archivo);
                    System.out.println("ipn = " + ipn);
                    ipn = "";
                } else if (line.length() == 77) {
                    aux = line.replace("       ", " ").replace("                                 ", " ").split(" ");
                    sta_nom = estaciones.indexOf(aux[0].substring(0, 4).trim()) + "";
                    sta_ss = aux[2];
                    aux_sta += sta_nom + " " + sta_ss + " 1 0" + System.getProperty("line.separator");
//                    System.out.println("aux_sta = " + aux_sta);
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
//                System.out.println(aux_line[1]);
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
                aux_sta = text.split("\n");
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
