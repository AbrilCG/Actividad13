/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg13;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *@author LyrisseC
 */
interface AnonClass{
    public void anonMethod();
}
interface lambdaClass{
    public void lambdaMethod();
    String lista();
}
public class Actividad13 {
    public static void main(String[] args) {
        String lista[] = {"Alfredo","Nahomi","Iker","Ytzel","Patricia","Jorge","Adriana","Gisela","Rene","Esther"};
        System.out.println(Arrays.toString(lista));
        String[] sort = sort(lista);
    }

    private static String[] sort(String[] lista) {
        System.out.println("------------------------------------");
        AnonClass anon;
        anon = new AnonClass() {
            public void anonMethod() {
                System.out.println("Clase Anonima");
                System.out.println("------------------------------------");
                System.out.println("Orden alfabetico");
                Arrays.sort(lista);
                for(String l : lista)
                    System.out.println(l);
                System.out.println("-------------------------------------");
                System.out.println("Ordenado por longitud");
                Arrays.sort(lista, Collections.reverseOrder());
                Arrays.sort(lista, 0, 9);
                for (String o : lista)
                    System.out.println(o);
                
                System.out.println("------------------------------------");
                System.out.println("Clase Lambda");
                System.out.println("------------------------------------");
                System.out.println("Ordenado por longitud" + Comparator.comparing((String lista) -> lista.length()));
            }
        };
                anon.anonMethod();
            return lista;    
    }
}



        
        
        
        
        
        
        
       
        


