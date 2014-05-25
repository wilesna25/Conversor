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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rptrs
 */
public class Estaciones {

    private String ruta;

    public Estaciones() {
    }

    public static void main(String[] args) {
        Estaciones e = new Estaciones();
        String ruta = "C:\\Users\\Rptrs\\Documents\\Estaciones_para_convertir - copia.txt";
        e.convertirEstaciones(ruta, "prueba");
//        e.prueba("  ALF2 452.37N 7520.51W4816  0.70     ");
//        System.out.println(e.convertirUnidades("452.37"));
    }

    /*
     * CompletarEspaciosIzquierda()
     * Método encargado de ajustar el tamaño de
     * cadenas agregando ceros a la izquierda a la cadena
     * hasta que quede del mismo tamañao de la longitud final
     */
    public String completarEspaciosIzquierda(String cadena, int lon_fin) {
        String aux = "";
        for (int i = cadena.length(); i < lon_fin; i++) {
            aux += ' ';
        }
        return aux + cadena;
    }

    public void convertirEstaciones(String ruta, String nombre_archivo) {
        FileWriter out = null;
        File file = null;
        FileReader reader = null;
        BufferedReader bf = null;
        int cont_sta = 0;
        String r = "estaciones_convertidas";
        try {
            file = new File(ruta);
            reader = new FileReader(file);
            bf = new BufferedReader(reader);
            out = new FileWriter(nombre_archivo + ".sta");
            String line = "";
            String[] aux_line;
            String new_line = "";
            while ((line = bf.readLine()) != null) {
                if ((line.length() == 82 || line.length() == 63) && !line.contains("RESET")) {
                    aux_line = line.trim().replace("    ", "").split(" ");
                    if (aux_line.length == 5) {
                        String nom_esta = aux_line[0];
                        String dir_a = completarEspaciosIzquierda(convertirUnidades(aux_line[1].trim().substring(0, aux_line[1].length() - 1)), 8);
                        String dir_b = completarEspaciosIzquierda(convertirUnidades(aux_line[2].trim().substring(0, 7)), 8);
                        String klm = convertToKlm(Double.parseDouble(aux_line[2].trim().substring(8, 12)));
                        new_line = (cont_sta + " " + nom_esta + " " + dir_a + " " + dir_b + " " + klm).replace(",", ".");
                        out.write(new_line);
                        out.write(System.getProperty("line.separator"));
                        cont_sta++;
                    }
                }
            }
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     * convertToKlm()
     * Convierte a kilometros el double recibido
     */
    public String convertToKlm(double num) {
        DecimalFormat df = new DecimalFormat("0.00");
        double klm = num / 1000;
        return df.format(klm);
    }

    /*
     * convertirUnidades()
     * Convierte los grados y minutos
     */
    public String convertirUnidades(String aux) {
        DecimalFormat df = new DecimalFormat("0.0000");
        double unidad = 0;
        try {
            int index_p = aux.indexOf(".");
            double min = Double.parseDouble(aux.substring(index_p - 2, index_p + 3)) / 60;
            System.out.println("min = " + min);
            double hra = Double.parseDouble(aux.substring(0, index_p - 2));
            unidad = hra + min;
        } catch (Exception e) {
            System.out.println("Error al convertir " + aux);
        }
        return df.format(unidad);
    }

    /*
     *separarDatos()
     * SEpara las unidades a convertir de minutos 
     * y las unidades a convertir a kilometros
     */
    public void separarDatos() {
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
