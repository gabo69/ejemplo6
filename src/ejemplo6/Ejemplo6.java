/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      
      BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese uns frase : ");
      String frase=a.readLine();
      String []palabra=frase.split(" ");

      for(int i=palabra.length-1;i>=0;i--){
          System.out.print(palabra[i]+" ");
      }
    }  
}
