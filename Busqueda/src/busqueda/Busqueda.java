package busqueda;
public class Busqueda extends Hash 
{
    public static void main(String[] args) 
    {
        try
        {
            int i, n, resp;
            int m = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Bienvenido al sistema" + 
                    "\n" + "¿De que tamaño sera la tabla?: "));
            Hash[] h = new Hash[m];
            for (i=0; i<m; i++)
            {
                h[i] = new Hash();
                h[i].Estado =0;
            }
            do
            {
                resp = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Selecciona una opcion: " + "\n" + 
                        "Agregar datos: 1" + "\n" + "Buscar alumno: 2" + "\n" + "Eliminar alumno: 3" + "\n" + "Salir: 4"));
                switch (resp)
                {
                    case 1:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Agrega el numero de control "
                                + "del alumno: "));
                        Hash.insertarHash(h,m,n);
                        break;
                    case 2:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("¿Cual es el numero de control "
                                + "del alumno?: "));
                        i =Hash.buscarHash(h,m,n);
                        if (i == -1)
                        {
                            javax.swing.JOptionPane.showMessageDialog(null, "No existe, intentelo nuevamente");
                        } else 
                        {
                            javax.swing.JOptionPane.showMessageDialog(null,"Alumno y promedio: " + "\n" + "Nombre: " + 
                                    h[i].Nombre + "\n" + "Promedio:" + h[i].Promedio);
                        }
                        break;
                    case 3:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("¿A que numero se eliminara?: "));
                        i = Hash.eliminarHash(h,m,n);
                        if (i== -1){
                            javax.swing.JOptionPane.showMessageDialog(null, "No existe, intentelo nuevamente");
                        } else 
                        {
                            javax.swing.JOptionPane.showMessageDialog(null,"LISTO");
                        }
                        break;
                    case 4:
                        System.exit(0);
                    default:
                }
            }while (resp != 4);
        } catch (NumberFormatException nfe){
            javax.swing.JOptionPane.showMessageDialog(null, "Finalizado");
        } catch (OutOfMemoryError ome){
            javax.swing.JOptionPane.showMessageDialog(null, "Sin espacio");
        }
    }
}
