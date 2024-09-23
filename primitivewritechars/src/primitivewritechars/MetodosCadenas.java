package primitivewritechars;

import java.io.*;

/**
 * clase con los metodos para copiar y leer texto en archivos 
 * @author cristian
 * @version 1.0
 */
public class MetodosCadenas {

   /**
    * Metodo para escribir en un archivo de texto 2 veces utilizando metodos de la clase DataOutputStream
    * @param sentence el strign que le pasamos por parámetro
    * @param pathFile el path del archivo
    */
    public void writeText(String sentence, File pathFile) {

        try {
            //instanciamos los objetos y le metemos el path
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(pathFile)));
            
            //bucle for para escribir 2 veces
            for (int i = 0; i < 2; i++) {

                dos.writeChars(sentence);
                System.out.println("Escribiendo la cadena de texto: " + sentence);
                System.out.println("Tamaño del archivo: " + dos.size());
            }
            dos.close();

        } catch (IOException e) {

            System.out.println("No se puede encontrar el archivo");
        }

    }
    
    /**
    * Metodo para leer en un archivo de texto utilizando metodos de la clase DataInputStream
    * @param pathFile el path del archivo
    */
    public void readSentence(String sentence, File pathFile){
        
        try{
            
            //instanciamos los objetos y leemos el archivo
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(pathFile)));
            while(dis.available() > 0){
                
               
                dis.readChar();
                System.out.println("Leyendo el archivo: " + sentence);
                System.out.println("Quedan por leer: " + dis.available() + " bytes");
            }
            dis.close();
            
        }catch(IOException e){
            System.out.println("Archivo no encontrado");
        }
        
        
    }

}
