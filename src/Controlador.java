
import javax.swing.JOptionPane;


public class Controlador {
    
    Persona vector[];
    
    public void setTamanio(int tam){
        if(tam > 0) vector = new Persona[tam];
        
    }
    
    
    public int getTamanio(){
        return vector.length; 
    }
    
    
    public void insertar() {
        Persona persona;
        int i, edad;
        String nombre, apellido;
        for(i=0; i < getTamanio(); i++){
            nombre =  caja("Nombre:");
            apellido = caja("Apellido");
            edad = Integer.parseInt(caja("Edad:"));
            persona = new Persona(nombre, apellido, edad);
            vector[i] = persona;
        }
    }
    
    public String caja(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    
    public void mostrar(){
        int i;
        String info = "Lista\n";
        for(i=0; i<getTamanio();i++ ){
            info +="Nombre: "+vector[i].getNombre()+"\n";
            info +="Apellido: "+vector[i].getApellido()+"\n";
            info +="Edad: "+vector[i].getEdad()+"\n";
        }
        
        JOptionPane.showMessageDialog(null, info);
        
        
    }
    
    public void buscarPorNombre(String nombre){
       int i;
        String info = "Listado por nombre\n";
        for(i=0; i<getTamanio();i++ ){
            if(vector[i].getNombre().equals(nombre)){
               info +="Nombre: "+vector[i].getNombre()+"\n";
               info +="Apellido: "+vector[i].getApellido()+"\n";
               info +="Edad: "+vector[i].getEdad()+"\n"; 
            }
            
        }
        
        JOptionPane.showMessageDialog(null, info); 
    }
    
    
    public void buscarPorPosicion(int posicion){
        String info = "Persona\n";
               info +="Nombre: "+vector[posicion].getNombre()+"\n";
               info +="Apellido: "+vector[posicion].getApellido()+"\n";
               info +="Edad: "+vector[posicion].getEdad()+"\n"; 
           JOptionPane.showMessageDialog(null, info);      
               
    }
    
}
