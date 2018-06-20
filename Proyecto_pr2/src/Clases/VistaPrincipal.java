/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.TextArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private boolean esDraft;

    public VistaPrincipal() {
    }
    
    
    
    public void VistaPrincipal(Connection cn, String correoEmisor, String correoReceptor,String asunto,String cuerpo){
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent evt){
            if (guardarDraft()) {
                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO draft(correoEmisor,correoReceptor,asunto,cuerpo) VALUES(?,?,?,?)");
                    pst.setString(1, correoEmisor);
                    pst.setString(2, correoReceptor);
                    pst.setString(3, asunto);
                    pst.setString(4, cuerpo);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Envio exitoso");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al enviar");
                }
            }else
                System.exit(0);
        }
        }); 
    }
    
    public boolean guardarDraft(){
        if (JOptionPane.showConfirmDialog(this, "Desea guardar el correo existente como draft antes de salir?","Guardar Draft al Salir",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            esDraft=true;
        }
        return esDraft;
    }
}
