package busquedaHash;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class TestHash {
    public static void main(String[] args) {
        TablaHash hash=new TablaHash(8);
        String[] elementos={"99" ,"91","53", "20", "89", "12", "97", "36"};
        
        /**String datos="99 91 53 20 89 12 97 36";
        String [] elementos=datos.split("");
        String[] elementos=new String[8];
        System.out.println("Elementos="+hash);
        **/
        
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar();
        String clave;
        do{
            clave =JOptionPane.showInputDialog("Clave a buscar");
            String salida=hash.buscarClave(clave);
            System.out.println(salida);
        }while(clave.charAt(0)!='0');
    }
    
    
    public static void generarvalores(String[] elementos) {
        for(int i=0;i<8;i++)
        {
            elementos[i]=""+(int)(Math.random()*100+1);
        }
        System.out.print("Elemento: ");
        for(String e: elementos)
        {
            System.out.print(""+e);
        }
        System.out.println("");
    }
}
