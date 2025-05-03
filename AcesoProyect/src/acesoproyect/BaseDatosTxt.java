
package acesoproyect;

import java.io.*;
import javax.swing.*;
import java.util.*;


public class BaseDatosTxt {

    public BaseDatosTxt(String Archivo) {
        this.Archivo = Archivo;
    }
    private String Archivo;
    
    public void  guardarUsuario(String ususario, String contraseña){
      try (BufferedWriter tire = new BufferedWriter(new FileWriter(Archivo, true))){
          tire.write(ususario + "," + contraseña);
          tire.newLine();
          
      }  catch (IOException e){
         JOptionPane.showMessageDialog(null,"ERROR AL GUARDAR EL USUARIO?=\n" +e.getMessage());
          
      }
    }
    public Map<String, String> cargarUsuario(){
        Map<String, String> usuarios= new HashMap<>();
        try (BufferedReader redar = new BufferedReader(new FileReader(Archivo))){
            String linea;
            while ((linea = redar.readLine()) != null){
                String[] parte = linea.split(",");
                if(parte.length == 2){
                    usuarios.put(parte[0], parte[1]);
                    
                }
            }
        }catch (IOException o){
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS USUARIOS:=\n"+ o.getMessage());
            
        }
        return usuarios;

    }}
