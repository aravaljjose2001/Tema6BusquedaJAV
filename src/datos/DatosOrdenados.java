/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Win10
 */
public class DatosOrdenados {
        private int [] valores; 

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }
    
    public int getSize(){
        return valores.length; 
    }
    
    //Metodos de busqueda 
   public int busquedasecuencial (int clave)
   {
       for(int i=0;i<valores.length && valores[i]<=clave;i++)
       {
           if (clave == valores [i])
           {
               return i;
           }
           System.out.println(""+i);
       }
   return -1;
   }
   
   public int busquedabinaria(int clave)
   {
       int bajo=0;
       int alto=valores.length-1;
       int central=(bajo+alto)/2;
       int i=0;System.out.println("i=");
       
       while (bajo<alto && clave!=valores[central])
       {
           if (clave<valores[central])
           {
               alto=central-1;
           }else {
               bajo=central+1;
           }
           central=(bajo+alto)/2;
           System.out.print (""+i++);
       }
       if (clave==valores[central])
       {
           return central;
       }
       return -1;
   }
   
   public int getMinimo()
   {
       return valores[0];
   
   }
   
   public int getMaximo()
   {
       return valores[valores.length-1];
   }
    
    @Override
    public String toString(){
        String cad = "Datos ordenados: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
    
}
