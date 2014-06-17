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
public class Model1p {

    FileWriter out;
    File file;
    FileReader reader;
    BufferedReader bf;
    FileWriter writer;

    public static void main(String[] args) {
        Model1p model = new Model1p();
//        model.obtenerNodos("0", "100", "10");
        System.out.println(model.obtenerNodos("0.2", "33.2", "1.3"));
    }

    /*
     crearModel1p()
     Recibe por parámetro la ruta de el archivo estaciones
     que tomará como base, además, de las posiciones
     de los nodos y su incremento.
     */
    public void crearModel1p(String rut_sta, String xi, String xf, String xin, String yi, String yf, String yin, String zi, String zf, String zin) throws IOException {
        try {
            file = new File(rut_sta);
            reader = new FileReader(file);
            bf = new BufferedReader(reader);
            writer = new FileWriter("model1p");
            String linea = "";
            String[] aux;
            while ((linea = bf.readLine()) != null) {
                aux = linea.trim().replace("  ", " ").split(" ");
                if (aux.length == 5) {
                    String x = completarEspaciosIzquierda(completarCerosDecimales(aux[2], 5), 9);
                    String y = completarEspaciosIzquierda(completarCerosDecimales(aux[3], 5), 9);
                    String z = completarEspaciosIzquierda(completarCerosDecimales(aux[4], 5), 9);
                    writer.write(x + " " + y + " " + z);
                    writer.write(System.getProperty("line.separator"));
                }
            }
            linea = (numeroNodos(yi, yf, yin) + " " + numeroNodos(xi, xf, xin) + " " + numeroNodos(zi, zf, zin)).replace(".000", "").replace(".0", "");
            int numNodos = numeroNodos(xi, xf, xin);
            int numVeces =  numeroNodos(zi, zf, zin);
            writer.write(linea);
            writer.write(System.getProperty("line.separator"));
            writer.write(obtenerNodos(yi, yf, yin));
            writer.write(obtenerNodos(xi, xf, xin));
            writer.write(obtenerNodos(zi, zf, zin));
            writer.write(agregarCoordenadasVacias(numNodos,numVeces));
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Model1p.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
     agregarCoordenadasVacias()
     Éste método completa tantas coordenadas en 0.000
     como indique el parámetro, manteniendo el formato
     */

    public String agregarCoordenadasVacias(int numEsta,int numVece) {
        String cad = "";
        int cont = 0;
        boolean flag = false;
        for (int i = 0; i < numVece; i++) {
            for (int j = 0; j < numEsta; j++) {
                cad += "0.000  ";
                cont++;
                flag = false;
                if (cont == 9) {
                    cad += System.getProperty("line.separator");
                    cont = 0;
                    flag = true;
                }
            }
            if (flag == false) {
                cad += System.getProperty("line.separator");
                cont = 0;
            }
        }

        return cad;
    }
    /*
     completarconCerosDecimales()
     completa con ceros a la derecho la cadena que recibe 
     hasta que quede con el tamaño enviado por parámetro,
     retorna la cadena
     */

    public String completarCerosDecimales(String cad, int tamaño) {
        if (cad.contains(".")) {
            String[] aux = cad.split(".");
            int index = cad.indexOf(".");
            for (int i = (cad.length() - index); i < tamaño + 1; i++) {
                cad += "0";
            }
        } else {
            cad += ".";
            for (int i = 0; i < 3; i++) {
                cad += "0";
            }
        }
        return cad;
    }

    /*
     obtenerNodo()
     Obtiene todos los nodos que existen entre los rangos dados
     y su incremento, organiza los nodos de acuerdo al formato
     del archivo model1p
     */
    public String obtenerNodos(String ran_in, String ran_fin, String inc) {
        boolean flag = false;
        DecimalFormat df = new DecimalFormat("0.000");
        String cad = "";
        double inicio = Double.parseDouble(ran_in);
        double fin = Double.parseDouble(ran_fin);
        double incremento = Double.parseDouble(inc);
        int cont = 1;
        cad += completarEspaciosIzquierda(df.format(Double.parseDouble(completarCerosDecimales(inicio - (incremento * 5) + "", 3))) + "", 7);
        for (Double i = inicio; i < fin; i += incremento) {
            cad += completarEspaciosIzquierda(df.format(Double.parseDouble(completarCerosDecimales(i + "", 3))) + "", 7);
            cont++;
            flag = false;
            if (cont == 9) {
                cad += System.getProperty("line.separator");
                cont = 0;
                flag = true;
            }
        }
        cad += completarEspaciosIzquierda(df.format(fin + (incremento * 5)) + "", 7);
        cont++;
        cad += System.getProperty("line.separator");
        return cad.replace(",", ".");
    }

    /*
     * numeroNodos()
     * Cacula el numero de nodos que se existen entre
     * dos ditancias dado un incremento.
     */
    public int numeroNodos(String dis_ini, String dis_fin, String inc) {
        int nodos = 0;
        for (float i = Float.parseFloat(dis_ini); i < Float.parseFloat(dis_fin); i += Float.parseFloat(inc)) {
            nodos++;
        }
        return nodos + 2; //Los 2 son los de desfase al inicio y al final
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
}
