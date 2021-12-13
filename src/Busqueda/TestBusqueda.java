package Busqueda;
import datos.DatosDesordenados;
import datos.DatosOrdenados;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class TestBusqueda {
    public static void main(String[] args) {
          int n=20;
          int lim=100;
          
          DatosDesordenados dd=new DatosDesordenados(lim,n);
          dd.generarValores();
          System.out.println(" Desordenados= " + dd);
          DatosOrdenados dO= dd.mergeSort();
          System.out.println(" Ordenados= " + dO);
          
          char X;
          
          int min=dO.getMinimo();
          int max=dO.getMaximo();
          
          //datos desordenados 
          System.out.println("Valor minimo"  + min + " Pos= " + dd.busquedasecuencial(min) + "en datos desordenados\n");
          
          //datos ordenados 
          System.out.println("Valor minimo" + min + " Pos= " + dO.busquedasecuencial(min) + "en datos ordenados\n");
          
          //datos desordenaos
          System.out.println("Valor Maximo"  + max + " Pos= " + dd.busquedasecuencial(min) + "en datos desordenados\n");
          
          //datos ordenados 
          System.out.println("Valor Maximo" + max + " Pos= " + dO.busquedasecuencial(min) + "en datos ordenados\n");
          
          
          do{
              X=JOptionPane.showInputDialog("Clave a buscar").charAt(0);
              System.out.println("Clave " + X + "Pos=" + dd.busquedasecuencial(X) + "en datos desordenados\n");
              
              System.out.println("Clave " + X + "Pos=" + dO.busquedasecuencial(X) + "en datos ordenados/secuencial\n");
              
             System.out.println("Clave " + X + "Pos=" + dO.busquedabinaria(X) + "en datos ordenados/binaria\n");
          }while(X!='0');
    }
    
}
