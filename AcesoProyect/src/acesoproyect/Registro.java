
package acesoproyect;

import java.util.*;
import javax.swing.JOptionPane;


public class Registro {
    
   private BaseDatosTxt baseDatos;
    
    public Registro(BaseDatosTxt baseDatos) {
        this.baseDatos = baseDatos;
    }
   
    public boolean registrarUsuario(String usuario, String contraseña){
        Map<String, String> usuarios = baseDatos.cargarUsuario();
        if(usuarios.containsKey(usuario)){
            JOptionPane.showMessageDialog(null,"EL USUSARIO YA ESTA REGISTRADO!!=" +"\n"  + usuario);
           return false;
           
        }else{
            baseDatos.guardarUsuario(usuario, contraseña);
            JOptionPane.showMessageDialog(null,"USUARIO REGISTRADO EXITOSAMENTE!!=\n" +usuario);
            return true;
        }
        
    }
   
    
}
