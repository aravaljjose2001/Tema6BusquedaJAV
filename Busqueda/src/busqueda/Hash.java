package busqueda;
public class Hash 
{
    String Nombre;
    int Estado;
    int Dato;
    int Ncontrol;
    int Promedio;
    static int funcion(int n, int m){
        return ((n+1)% m);
    }
    static void insertarHash(Hash[] h, int m, int n){
        boolean i = false;
        int j = funcion(n, m);
        do {
            if (h[j].Estado== 0 || h[j].Estado == 1){
                h[j].Dato = n;
                h[j].Estado = 2;
                h[j].Nombre = javax.swing.JOptionPane.showInputDialog("Introduce el nombre del alumno: ");
                h[j].Promedio= Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Introduce el promedio: "));
                i = true;
            }else{
                j++;
            }
        }while (j<m && !i);
        if (i){
            javax.swing.JOptionPane.showMessageDialog(null, "Agregado");
        }else {
            javax.swing.JOptionPane.showMessageDialog(null, "Sin espacio, intentalo nuevamente");
        }
    }
    static int buscarHash(Hash[] h, int m, int n){
        int j=funcion(n,m);
        while (j<m){
            if (h[j].Estado == 0){
                return -1;
            } else if (h[j].Dato == n){
                if (h[j].Estado == 1){
                    return -1;
                } else {
                    return j;
                }
            }else{
                j++;
            }
        }
        return -1;
    }
    static int eliminarHash(Hash[] h, int m, int n){
      int i = buscarHash(h,m,n);
      if (i==-1){
          return -1;
      } else {
          h[i].Estado = 1;
          return 1;
      }
    }
}
