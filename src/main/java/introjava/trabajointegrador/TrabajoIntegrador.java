/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package introjava.trabajointegrador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DanMat
 */
public class TrabajoIntegrador {

    public static void main(String[] args) throws FileNotFoundException {

        List<Ronda> a = new ArrayList();
        List<Persona> b = new ArrayList();

        File f = new File("H:\\Archivos\\resultados.csv");
        File g = new File("H:\\Archivos\\pronostico.csv");
        Lector n = new Lector();
        LPronostico t = new LPronostico();
        a = n.LectorRonda(f);

        b = t.Lpron(g);


        List<Persona> perlist = new ArrayList();

        total l = new total();

        perlist = l.totalpuntos(a, b);
        for (Persona person : perlist) {
            System.out.println(person);
        }

    }

}
