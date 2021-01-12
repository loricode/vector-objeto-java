
import javax.swing.JOptionPane;


public class MiEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controlador ctl = new Controlador();
        
        int opcion , tamanio;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                      " Menu principal\n"
                    + "1. establecer tamaño al vector\n"
                    + "2. llenar el vector\n"
                    + "3. mostrar la informacion\n"
                    + "4. buscar por nombre\n"
                    + "5. buscar por posicion\n"
                    + "6. salir\n"
                    + "elije una opcion :)"));
            
            switch(opcion){
                 
                case 1:
                     tamanio = Integer.parseInt(
                             JOptionPane.showInputDialog("Asignar tamaño"));
                     ctl.setTamanio(tamanio);
                    break;
                    
                case 2:
                    ctl.insertar();
                    break;
                    
                case 3:
                    ctl.mostrar();
                    break;
                    
                case 4:
                     String nomobre= JOptionPane.showInputDialog("Ingrese un nombre");
                     ctl.buscarPorNombre(nomobre);
                     break;
                     
                case 5:
                    int pos = Integer.parseInt(
                             JOptionPane.showInputDialog("ingrese la posicion"));
                    ctl.buscarPorPosicion(pos);
                    break;
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "chaooooo");
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
                    break;
            }
            
        }while(opcion != 6);
        System.exit(0);
        
    }
    
}
