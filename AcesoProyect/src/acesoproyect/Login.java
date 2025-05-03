
package acesoproyect;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Login {
    private BaseDatosTxt baseDatos;

    public Login(BaseDatosTxt baseDatos) {
        this.baseDatos = baseDatos;
    }
    
    public boolean validarUsuario(String usuario, String contraseña){
        Map<String, String> usuarios = baseDatos.cargarUsuario();
        if(usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)){
            JOptionPane.showMessageDialog(null,"BIENVENIDO!!\n="+ usuario);
          return true;
            
        }else{
            JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA");
            return false;
        }
    }
    
}
