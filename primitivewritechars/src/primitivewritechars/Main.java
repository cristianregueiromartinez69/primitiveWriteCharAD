
package primitivewritechars;

import java.io.File;

/**
 * Clase mani donde ejecutamos el programa
 * @author Cristian
 * @version 1.0
 */
public class Main {

    
    public static void main(String[] args) {
        
        MetodosCadenas metodosC = new MetodosCadenas();
        File myFile;
        
        metodosC.writeText("o tempo está xélido", myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/primitiveWriteChar/text5.dat"));
        metodosC.readSentence("o tempo está xélido", myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/primitiveWriteChar/text5.dat"));
    }
    
}
