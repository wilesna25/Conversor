/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rptrs
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    String rutaArchivo;
    File file;
    FileReader fileReader;
    BufferedReader bufferedReader;

    public static void main(String[] args) {
        // TODO code application logic here
        Archivos archivos = new Archivos();
        String ruta = "C:\\Users\\Rptrs\\Documents\\NetBeansProjects\\Entrega1\\src\\Formatos\\prueba.ipn";
        archivos.crearModel1p(ruta);
    }

    /*
     * Métodos utilizados para el procesamiento 
     * de el archivo model1p. Carcaza.
     */
    public void crearModel1p(String rutaArchivo) {
        try {
            file = new File(rutaArchivo);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            String[] aux_linea;
            int no_linea = 0;
            boolean identificado = false;
            while ((linea = bufferedReader.readLine()) != null && !identificado) {
                aux_linea = linea.split(" ");
                System.out.println("aux_linea.length = " + aux_linea.length);
                no_linea++;
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
