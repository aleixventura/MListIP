/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movistarlistip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 *
 * @author Aleix
 */
public class MovistarListIP {

    static ArrayList<Canal> canals;

    GrupCanal[] gc = {new GrupCanal("Familiar"), new GrupCanal("Autonomics"), new GrupCanal("Series"), new GrupCanal("Cine"),
        new GrupCanal("Esports"), new GrupCanal("Futbol")};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        canals = new ArrayList<>();
        Finestra f = new Finestra(canals);
        // TODO code application logic here
    }

    public MovistarListIP() {
    }

    public static void actualitzarcanals() throws MalformedURLException, IOException {
        String url = "https://github.com/aleixventura/MListIP/blob/master/src/movistarlistip/canals.json";
        String name = "canals.json";
        //String name = "canals.txt";
        //String name = "canals.xml";
        File file = new File(name);
        URLConnection conn = new URL(url).openConnection();
        conn.connect();
        System.out.println("\nempezando descarga: \n");
        System.out.println(">> URL: " + url);
        System.out.println(">> Nombre: " + name);
        System.out.println(">> tamaño: " + conn.getContentLength() + " bytes");
        InputStream in = conn.getInputStream();
        OutputStream out = new FileOutputStream(file);
        int b = 0;
        while (b != -1) {
            b = in.read();
            if (b != -1) {
                out.write(b);
            }
        }
        out.close();
        in.close();

    }
}
