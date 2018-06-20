
package proyecto_pr2;
import Clases.*;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class prinicpalProyecto extends javax.swing.JFrame {
Usuario actual;
Conectar cc=new Conectar();
Connection cn =cc.conexion();
Boolean esAdmin=false, esSeleccion=false, esDraft=false;
VistaPrincipal vp= new VistaPrincipal();
WindowEvent we;
    public prinicpalProyecto() {
        initComponents();
        this.setVisible(false);
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(null);
        jd_login.setVisible(true);
    }

    public boolean guardarDraft(){
        if (JOptionPane.showConfirmDialog(this, "Desea guardar el correo existente como draft antes de salir?","Guardar Draft al Salir",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            esDraft=true;
        }else
            redactarCorreo.dispose();
        return esDraft;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JPasswordField();
        tf_user = new javax.swing.JTextField();
        jb_login = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jl_login = new javax.swing.JLabel();
        jd_bienvenido = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        moduloAdmin = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jb_buscarDirectorioCorreo = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_directorioCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tablaDirectorioCorreo = new javax.swing.JTable();
        moduloBandejas = new javax.swing.JDialog();
        moduloCRUDCorreos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jb_correoCRUD = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jb_correoEliminar = new javax.swing.JButton();
        jl_nombreCRUD = new javax.swing.JLabel();
        jl_apellidoCRUD = new javax.swing.JLabel();
        jl_correoCRUD = new javax.swing.JLabel();
        jl_contraCRUD = new javax.swing.JLabel();
        moduloLecturaCorreos = new javax.swing.JDialog();
        moduloChats = new javax.swing.JDialog();
        moduloTareas = new javax.swing.JDialog();
        moduloReuniones = new javax.swing.JDialog();
        pop_correosModificarBorrarCrear = new javax.swing.JPopupMenu();
        jmi_crearCorreo = new javax.swing.JMenuItem();
        jmi_modificarCorreo = new javax.swing.JMenuItem();
        jmi_borrarCorreo = new javax.swing.JMenuItem();
        jd_regristrar = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_user1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_contra1 = new javax.swing.JTextField();
        jb_regristrar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        tf_apellido1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_pregunta = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_respuesta = new javax.swing.JTextField();
        jd_modificarAccountCorreo = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_modificarN = new javax.swing.JTextField();
        tf_modificarA = new javax.swing.JTextField();
        tf_modificarC = new javax.swing.JTextField();
        tf_modificarContra = new javax.swing.JTextField();
        jb_modificarCorreo = new javax.swing.JButton();
        jb_cancelModificarCorreo = new javax.swing.JButton();
        jd_listarDirectorioAdmin = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaCorreo = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jb_regresarModuAdmin = new javax.swing.JLabel();
        jl_listarDirectorioN = new javax.swing.JLabel();
        jl_listarDirectorioA = new javax.swing.JLabel();
        jl_listarDirectoriocorreoR = new javax.swing.JLabel();
        jl_listarDirectorioCorreoE = new javax.swing.JLabel();
        moduloLecturaCorreo = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jb_enviarNuevoCorreo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jb_crudCorreo1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jl_verInbox = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTodo = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        redactarCorreo = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tf_asunto = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaCorreo1 = new javax.swing.JTextArea();
        cb_correosContactos = new javax.swing.JComboBox<>();
        jl_cuenta = new javax.swing.JLabel();
        jl_correo = new javax.swing.JLabel();
        jl_reunion = new javax.swing.JLabel();
        jl_tarea = new javax.swing.JLabel();
        jl_chat = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel5.setText("Ingrese usuario:");

        jLabel6.setText("Contrasena:");

        jb_login.setText("Iniciar Sesion");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        jLabel15.setText("No tienes cuenta? ");

        jl_login.setText("Registrate aqui!");
        jl_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_login)
                    .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_loginLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addGap(45, 45, 45)
                            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jd_loginLayout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jb_login)
                .addGap(55, 55, 55)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel4.setText("Bienvenido");

        javax.swing.GroupLayout jd_bienvenidoLayout = new javax.swing.GroupLayout(jd_bienvenido.getContentPane());
        jd_bienvenido.getContentPane().setLayout(jd_bienvenidoLayout);
        jd_bienvenidoLayout.setHorizontalGroup(
            jd_bienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bienvenidoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jd_bienvenidoLayout.setVerticalGroup(
            jd_bienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bienvenidoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\PROGRA 2 PROJECTS\\Fotos proyecto\\Foto peque\\enviar correo.png")); // NOI18N

        jLabel1.setText("Enviar Correo");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/nuevo grupo.png"))); // NOI18N

        jLabel2.setText("Nuevo grupo");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/propiedades (1).png"))); // NOI18N

        jb_buscarDirectorioCorreo.setText("Buscar");
        jb_buscarDirectorioCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_buscarDirectorioCorreoMouseClicked(evt);
            }
        });

        jLabel31.setText("Propiedades");

        jButton4.setText("Crear Correo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_buscarDirectorioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jb_buscarDirectorioCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText("Escriba el nombre o seleccionelo de la lista: ");

        jt_tablaDirectorioCorreo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion Electronica", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jt_tablaDirectorioCorreo);

        javax.swing.GroupLayout moduloAdminLayout = new javax.swing.GroupLayout(moduloAdmin.getContentPane());
        moduloAdmin.getContentPane().setLayout(moduloAdminLayout);
        moduloAdminLayout.setHorizontalGroup(
            moduloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloAdminLayout.createSequentialGroup()
                .addGroup(moduloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(moduloAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(moduloAdminLayout.createSequentialGroup()
                        .addGroup(moduloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(moduloAdminLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_directorioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(moduloAdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        moduloAdminLayout.setVerticalGroup(
            moduloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloAdminLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(moduloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_directorioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout moduloBandejasLayout = new javax.swing.GroupLayout(moduloBandejas.getContentPane());
        moduloBandejas.getContentPane().setLayout(moduloBandejasLayout);
        moduloBandejasLayout.setHorizontalGroup(
            moduloBandejasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        moduloBandejasLayout.setVerticalGroup(
            moduloBandejasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("My account");

        jLabel9.setText("Nombre");

        jLabel10.setText("Apellido");

        jb_correoCRUD.setText("Modificar Account");
        jb_correoCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_correoCRUDMouseClicked(evt);
            }
        });

        jLabel11.setText("Correo: ");

        jLabel12.setText("Contrasena:");

        jb_correoEliminar.setText("Eliminar Account");
        jb_correoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_correoEliminarMouseClicked(evt);
            }
        });

        jl_nombreCRUD.setBackground(new java.awt.Color(102, 102, 102));
        jl_nombreCRUD.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombreCRUD.setText("jLabel26");

        jl_apellidoCRUD.setBackground(new java.awt.Color(102, 102, 102));
        jl_apellidoCRUD.setForeground(new java.awt.Color(255, 255, 255));
        jl_apellidoCRUD.setText("jLabel26");

        jl_correoCRUD.setBackground(new java.awt.Color(102, 102, 102));
        jl_correoCRUD.setForeground(new java.awt.Color(255, 255, 255));
        jl_correoCRUD.setText("jLabel27");

        jl_contraCRUD.setBackground(new java.awt.Color(102, 102, 102));
        jl_contraCRUD.setForeground(new java.awt.Color(255, 255, 255));
        jl_contraCRUD.setText("jLabel28");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombreCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_apellidoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_correoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_contraCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_correoCRUD)
                .addGap(18, 18, 18)
                .addComponent(jb_correoEliminar)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nombreCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_apellidoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_correoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_contraCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_correoCRUD)
                    .addComponent(jb_correoEliminar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout moduloCRUDCorreosLayout = new javax.swing.GroupLayout(moduloCRUDCorreos.getContentPane());
        moduloCRUDCorreos.getContentPane().setLayout(moduloCRUDCorreosLayout);
        moduloCRUDCorreosLayout.setHorizontalGroup(
            moduloCRUDCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloCRUDCorreosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        moduloCRUDCorreosLayout.setVerticalGroup(
            moduloCRUDCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloCRUDCorreosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout moduloLecturaCorreosLayout = new javax.swing.GroupLayout(moduloLecturaCorreos.getContentPane());
        moduloLecturaCorreos.getContentPane().setLayout(moduloLecturaCorreosLayout);
        moduloLecturaCorreosLayout.setHorizontalGroup(
            moduloLecturaCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        moduloLecturaCorreosLayout.setVerticalGroup(
            moduloLecturaCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout moduloChatsLayout = new javax.swing.GroupLayout(moduloChats.getContentPane());
        moduloChats.getContentPane().setLayout(moduloChatsLayout);
        moduloChatsLayout.setHorizontalGroup(
            moduloChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        moduloChatsLayout.setVerticalGroup(
            moduloChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout moduloTareasLayout = new javax.swing.GroupLayout(moduloTareas.getContentPane());
        moduloTareas.getContentPane().setLayout(moduloTareasLayout);
        moduloTareasLayout.setHorizontalGroup(
            moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        moduloTareasLayout.setVerticalGroup(
            moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout moduloReunionesLayout = new javax.swing.GroupLayout(moduloReuniones.getContentPane());
        moduloReuniones.getContentPane().setLayout(moduloReunionesLayout);
        moduloReunionesLayout.setHorizontalGroup(
            moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        moduloReunionesLayout.setVerticalGroup(
            moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jmi_crearCorreo.setText("jMenuItem1");
        pop_correosModificarBorrarCrear.add(jmi_crearCorreo);

        jmi_modificarCorreo.setText("jMenuItem1");
        pop_correosModificarBorrarCrear.add(jmi_modificarCorreo);

        jmi_borrarCorreo.setText("jMenuItem2");
        pop_correosModificarBorrarCrear.add(jmi_borrarCorreo);

        jLabel17.setText("Nombre:");

        jLabel18.setText("Usuario:");

        jLabel20.setText("Contrasena:");

        jb_regristrar.setText("Registrar");
        jb_regristrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regristrarMouseClicked(evt);
            }
        });

        jLabel21.setText("Apellido");

        jLabel22.setText("Correo: ");

        jLabel23.setText("Pregunta de Seguridad");

        jLabel24.setText("Respuesta:");

        javax.swing.GroupLayout jd_regristrarLayout = new javax.swing.GroupLayout(jd_regristrar.getContentPane());
        jd_regristrar.getContentPane().setLayout(jd_regristrarLayout);
        jd_regristrarLayout.setHorizontalGroup(
            jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_regristrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_regristrar)
                .addGap(109, 109, 109))
            .addGroup(jd_regristrarLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_regristrarLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(tf_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_regristrarLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_regristrarLayout.createSequentialGroup()
                        .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(tf_apellido1)))
                    .addGroup(jd_regristrarLayout.createSequentialGroup()
                        .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_contra1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jd_regristrarLayout.setVerticalGroup(
            jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_regristrarLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_regristrarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(tf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_user1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_contra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_regristrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jb_regristrar)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLabel13.setText("Nombre");

        jLabel14.setText("Apellido");

        jLabel16.setText("Correo");

        jLabel25.setText("Contrasena");

        jb_modificarCorreo.setText("Ok");
        jb_modificarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarCorreoMouseClicked(evt);
            }
        });

        jb_cancelModificarCorreo.setText("Cancel");

        javax.swing.GroupLayout jd_modificarAccountCorreoLayout = new javax.swing.GroupLayout(jd_modificarAccountCorreo.getContentPane());
        jd_modificarAccountCorreo.getContentPane().setLayout(jd_modificarAccountCorreoLayout);
        jd_modificarAccountCorreoLayout.setHorizontalGroup(
            jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarAccountCorreoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarAccountCorreoLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_modificarN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarAccountCorreoLayout.createSequentialGroup()
                        .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarAccountCorreoLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(43, 43, 43))
                                .addGroup(jd_modificarAccountCorreoLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(47, 47, 47)))
                            .addGroup(jd_modificarAccountCorreoLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(24, 24, 24)))
                        .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_modificarA, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(tf_modificarC)
                            .addComponent(tf_modificarContra))))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarAccountCorreoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_modificarCorreo)
                .addGap(28, 28, 28)
                .addComponent(jb_cancelModificarCorreo)
                .addGap(40, 40, 40))
        );
        jd_modificarAccountCorreoLayout.setVerticalGroup(
            jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarAccountCorreoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_modificarN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_modificarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_modificarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_modificarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jd_modificarAccountCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_modificarCorreo)
                    .addComponent(jb_cancelModificarCorreo))
                .addContainerGap())
        );

        jLabel26.setText("Nombre");

        jLabel27.setText("Asunto:");

        jLabel28.setText("To:");

        jLabel29.setText("From:");

        textAreaCorreo.setColumns(20);
        textAreaCorreo.setRows(5);
        jScrollPane2.setViewportView(textAreaCorreo);

        jLabel30.setText("Correo:");

        jb_regresarModuAdmin.setText("Regresar");
        jb_regresarModuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresarModuAdminMouseClicked(evt);
            }
        });

        jl_listarDirectorioN.setText("jLabel32");

        jl_listarDirectorioA.setText("jj");

        jl_listarDirectoriocorreoR.setText("jLabel34");

        jl_listarDirectorioCorreoE.setText("jLabel35");

        javax.swing.GroupLayout jd_listarDirectorioAdminLayout = new javax.swing.GroupLayout(jd_listarDirectorioAdmin.getContentPane());
        jd_listarDirectorioAdmin.getContentPane().setLayout(jd_listarDirectorioAdminLayout);
        jd_listarDirectorioAdminLayout.setHorizontalGroup(
            jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_listarDirectorioN, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_regresarModuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                        .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jl_listarDirectoriocorreoR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_listarDirectorioA, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                                .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addGap(18, 18, 18)
                                .addComponent(jl_listarDirectorioCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listarDirectorioAdminLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jd_listarDirectorioAdminLayout.setVerticalGroup(
            jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_regresarModuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_listarDirectorioN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_listarDirectorioA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_listarDirectoriocorreoR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_listarDirectorioCorreoE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jb_enviarNuevoCorreo.setText("Nuevo correo");
        jb_enviarNuevoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enviarNuevoCorreoMouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton6.setText("Eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton7.setText("Responder");

        jButton8.setText("Responder a todos");

        jb_crudCorreo1.setText("setting icon para CRUD correo");
        jb_crudCorreo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crudCorreo1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jb_enviarNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_crudCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jb_enviarNuevoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jb_crudCorreo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_verInbox.setText("Inbox");
        jl_verInbox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jl_verInboxMouseMoved(evt);
            }
        });

        jLabel33.setText("Chats");

        jLabel34.setText("Sent Mail");

        jLabel35.setText("Drafts");

        jLabel36.setText("Spam");

        jLabel37.setText("Trash");

        jLabel38.setText("Contacks");

        jLabel39.setText("Task");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_verInbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jl_verInbox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel40.setText("Inbox");

        listTodo.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listTodo);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton9.setText("Reenviar");

        javax.swing.GroupLayout moduloLecturaCorreoLayout = new javax.swing.GroupLayout(moduloLecturaCorreo.getContentPane());
        moduloLecturaCorreo.getContentPane().setLayout(moduloLecturaCorreoLayout);
        moduloLecturaCorreoLayout.setHorizontalGroup(
            moduloLecturaCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloLecturaCorreoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(moduloLecturaCorreoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        moduloLecturaCorreoLayout.setVerticalGroup(
            moduloLecturaCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloLecturaCorreoLayout.createSequentialGroup()
                .addGroup(moduloLecturaCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(moduloLecturaCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        redactarCorreo.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        redactarCorreo.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                redactarCorreoWindowClosing(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel42.setText("Inbox");

        jLabel43.setText("Chats");

        jLabel44.setText("Sent Mail");

        jLabel45.setText("Drafts");

        jLabel46.setText("Spam");

        jLabel47.setText("Trash");

        jLabel48.setText("Contacks");

        jLabel49.setText("Task");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setText("Send");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton10.setText("Save Now");

        jButton11.setText("Discard");

        jLabel50.setText("To:");

        jLabel41.setText("Subject:");

        textAreaCorreo1.setColumns(20);
        textAreaCorreo1.setRows(5);
        jScrollPane4.setViewportView(textAreaCorreo1);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton5)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel50)))
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11))
                            .addComponent(tf_asunto)
                            .addComponent(cb_correosContactos, 0, 340, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(27, 27, 27)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(cb_correosContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout redactarCorreoLayout = new javax.swing.GroupLayout(redactarCorreo.getContentPane());
        redactarCorreo.getContentPane().setLayout(redactarCorreoLayout);
        redactarCorreoLayout.setHorizontalGroup(
            redactarCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redactarCorreoLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        redactarCorreoLayout.setVerticalGroup(
            redactarCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_cuenta.setText("Ver Cuenta");

        jl_correo.setText("Ver correo");
        jl_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_correoMouseClicked(evt);
            }
        });

        jl_reunion.setText("Reunion");

        jl_tarea.setText("Tareas");

        jl_chat.setText("Chats");

        jLabel19.setText("Bienvenido de nuevo! ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jl_reunion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_tarea, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jl_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jl_reunion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jl_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_loginMouseClicked
        // TODO add your handling code here:
        
        //que le de click a registrarse 
        jd_regristrar.pack();
        jd_regristrar.setModal(true);
        jd_regristrar.setLocationRelativeTo(null);
        jd_regristrar.setVisible(true);
        
        
    }//GEN-LAST:event_jl_loginMouseClicked

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        // ya esta registrado y entra a la paltaforma.
       jd_login.setVisible(false);
       this.setLocationRelativeTo(null);
       String user = tf_user.getText();
       String pass = tf_pass.getText();
       String s = "SELECT * FROM usuario WHERE usuario='"+user+"' AND contra='"+pass+"'";
       String nombre="",apellido="",correo="",pregunta="",respuesta="";
        String datos []= new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(s);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
            }
            nombre = datos[0];
            apellido = datos[1];
            user = datos[2];
            pass = datos[3];
            correo = datos[4];
            pregunta = datos[5];
            respuesta = datos[6];
        } catch (Exception e) {
        }
           
        try{
            if (!user.equals("") && !pass.equals("")) {
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(s);

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Bienvenido!");
                        actual = new Usuario(nombre, apellido, user, pass, new Correo(correo), pregunta, respuesta);
                    } else if (user.equals("admin") && pass.equals("1")) {
                        esAdmin = true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Acceso denegado.");
                        jd_login.setVisible(true);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
                }

            } else 
                JOptionPane.showMessageDialog(this, "Debe llenar los campos para ingresar.");
        }catch(Exception e){
        }
    }//GEN-LAST:event_jb_loginMouseClicked

    private void jb_regristrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regristrarMouseClicked
        // TODO add your handling code here:
        //SE REGISTRRRRRRRRRRRA.   
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO Usuario(nombre,apellido,usuario,contra,correo,preguntaSeguridad,respuestaSeguridad) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, tf_nombre1.getText());
            pst.setString(2, tf_apellido1.getText());
            pst.setString(3,tf_user1.getText());
            pst.setString(4, tf_contra1.getText());
            pst.setString(5, tf_correo.getText());
            pst.setString(6, tf_pregunta.getText());
            pst.setString(7, tf_respuesta.getText());
            //listaUsuarios.add(new Usuario(tf_nombre1.getText(), tf_apellido1.getText(), tf_user1.getText(), tf_contra1.getText(), new Correo(tf_correo.getText()), tf_pregunta.getText(), tf_respuesta.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
               
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al agregar");
             e.printStackTrace();
        }  
        jd_regristrar.setVisible(false);
    }//GEN-LAST:event_jb_regristrarMouseClicked

    private void jl_correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_correoMouseClicked
        // ENTRA AL CORREO
        if (esAdmin) {
            moduloAdmin.setModal(true);
            moduloAdmin.pack();
            moduloAdmin.setLocationRelativeTo(this);
            moduloAdmin.setVisible(true);

            DefaultTableModel m = (DefaultTableModel) jt_tablaDirectorioCorreo.getModel();
            String sql = "SELECT nombre,correo FROM correo";

            String[] datos = new String[2];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);

                    datos[1] = rs.getString(2);
                    m.addRow(datos);
                }
                jt_tablaDirectorioCorreo.setModel(m);
                esSeleccion = true;
            } catch (SQLException ex) {
            }
            
            //o la información de algún correo en específico.
            
        } else if(esAdmin==false) {
            moduloLecturaCorreo.setModal(true);
            moduloLecturaCorreo.pack();
            moduloLecturaCorreo.setLocationRelativeTo(this);
            moduloLecturaCorreo.setVisible(true);
            
        }
    }//GEN-LAST:event_jl_correoMouseClicked

    private void jb_correoCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_correoCRUDMouseClicked
        // TODO add your handling code here:
        jd_modificarAccountCorreo.setModal(true);
        jd_modificarAccountCorreo.pack();
        jd_modificarAccountCorreo.setLocationRelativeTo(this);
        jd_modificarAccountCorreo.setVisible(true);
        
    }//GEN-LAST:event_jb_correoCRUDMouseClicked

    private void jb_modificarCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarCorreoMouseClicked
        //Usuario modifica su propio 
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE Usuario SET nombre='"+tf_modificarN.getText()+"',apellido='"+tf_modificarA.getText()+"',correo='"+tf_modificarC.getText()+"',pass='"+tf_modificarContra.getText()+"' WHERE correo='"+jl_correoCRUD.getText()+"'");
        jl_nombreCRUD.setText(tf_modificarN.getText());
        jl_apellidoCRUD.setText(tf_modificarA.getText());
        jl_correoCRUD.setText(tf_modificarC.getText());
        jl_contraCRUD.setText(tf_modificarContra.getText());
        jd_modificarAccountCorreo.dispose();
        pst.executeUpdate();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }    
    }//GEN-LAST:event_jb_modificarCorreoMouseClicked

    private void jb_correoEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_correoEliminarMouseClicked
        // Usuario elimina su correo
        int resp = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar su cuenta?","Confirm",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.OK_OPTION){
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE from Usuario Where correo='" + tf_modificarC.getText() + "'");
                actual.deleteCorreo();
                pst.executeUpdate();

            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
    }//GEN-LAST:event_jb_correoEliminarMouseClicked

    private void jb_buscarDirectorioCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_buscarDirectorioCorreoMouseClicked
        // TODO add your handling code here:
        if (esSeleccion) {//que salga la info de lo que tiene seleccionado en la tabla
           
        } else { //que salga de el text field
            jd_listarDirectorioAdmin.setVisible(true);
            String nombre = "SELECT nombre from correo WHERE nombre='"+tf_directorioCorreo+"'";
            String asunto = "SELECT asunto from correo WHERE nombre='"+tf_directorioCorreo+"'";
            String to = "SELECT correoReceptor from correo WHERE nombre='"+tf_directorioCorreo+"'";
            String from = "SELECT correoEmisor from correo WHERE nombre='"+tf_directorioCorreo+"'";
            String cuerpo = "SELECT cuerpo from correo WHERE nombre='"+tf_directorioCorreo+"'";
            
            jl_listarDirectorioN.setText(nombre);
            jl_listarDirectorioA.setText(asunto);
            jl_listarDirectorioCorreoE.setText(from);
            jl_listarDirectoriocorreoR.setText(to);
            textAreaCorreo.setText(cuerpo);
        }
        
        
    }//GEN-LAST:event_jb_buscarDirectorioCorreoMouseClicked

    private void jb_regresarModuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresarModuAdminMouseClicked
        // TODO add your handling code here:
        jd_listarDirectorioAdmin.setVisible(false);
    }//GEN-LAST:event_jb_regresarModuAdminMouseClicked

    private void jb_enviarNuevoCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviarNuevoCorreoMouseClicked
        // TODO add your handling code here:
        redactarCorreo.setModal(true);
        redactarCorreo.pack();
        redactarCorreo.setLocationRelativeTo(this);
        redactarCorreo.setVisible(true);
        
        //llenar combobox de los amigos
        DefaultComboBoxModel m = (DefaultComboBoxModel)cb_correosContactos.getModel();
        String sql = "SELECT correo FROM contactos";
        
    }//GEN-LAST:event_jb_enviarNuevoCorreoMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        String correoEmisor = actual.getCorreo().toString();
        String correoReceptor = cb_correosContactos.getSelectedItem().toString();
        String asunto = tf_asunto.getText();
        String cuerpo = textAreaCorreo1.getText();
        if (!textAreaCorreo1.equals("")&& cb_correosContactos.getSelectedIndex()>=0) { //como lo va enviar?
            
            /*
            lo que hice es que en la tabla correos se guarden TODOS los correos enviados con sus atributos.
            si quiero todos los correos enviados por alguien pongo select * from correos where correoEmisor = tal.
            o select * from correos where correoReceptor = tal x para saber sus correos recibidos. 
            */
            try {
                PreparedStatement pst = cn.prepareStatement("INSERT INTO correo(correoEmisor,correoReceptor,asunto,cuerpo) VALUES(?,?,?,?)");
                pst.setString(1, correoEmisor);
                pst.setString(2, correoReceptor);
                pst.setString(3, asunto);
                pst.setString(4, cuerpo);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Envio exitoso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al enviar");
            }  
            
        } else if (cb_correosContactos.getSelectedIndex()<0)  {
            JOptionPane.showMessageDialog(this, "Debe seleccionar correo destinatarios para enviar correo.");
        }
        
        
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jb_crudCorreo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crudCorreo1MouseClicked
        // TODO add your handling code here:
        //va modificar correos
        //que le aparezca todo en los jlabels.
        if (actual.getCorreo() != null) {
             jl_nombreCRUD.setText(actual.getNombre());
            jl_apellidoCRUD.setText(actual.getApellido());
            jl_correoCRUD.setText(actual.getCorreo().toString());
            jl_contraCRUD.setText(actual.getPass());
        }else
            JOptionPane.showMessageDialog(this, "ya borro su cuenta.");
        
        moduloCRUDCorreos.setModal(true);
        moduloCRUDCorreos.pack();
        moduloCRUDCorreos.setLocationRelativeTo(this);
        moduloCRUDCorreos.setVisible(true);
    }//GEN-LAST:event_jb_crudCorreo1MouseClicked

    private void redactarCorreoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_redactarCorreoWindowClosing
        // TODO add your handling code here:
        String correoEmisor = actual.getCorreo().toString();
        String correoReceptor="";
        String asunto = tf_asunto.getText();
        String cuerpo = textAreaCorreo1.getText();
        if (cb_correosContactos.getSelectedIndex()<0) {
            correoReceptor="nulo";
        }else if(asunto.equals("")){
            asunto="nulo";
        }else if(cuerpo.equals("")){
            cuerpo="nulo";
        }else if(cb_correosContactos.getSelectedIndex()>=0){
            correoReceptor = cb_correosContactos.getSelectedItem().toString();
        }
        if (guardarDraft()) {
                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO draft(correoEmisor,correoReceptor,asunto,cuerpo) VALUES(?,?,?,?)");
                    pst.setString(1, correoEmisor);
                    pst.setString(2, correoReceptor);
                    pst.setString(3, asunto);
                    pst.setString(4, cuerpo);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Draft guardado exitosamente");
                    redactarCorreo.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al guardar draft");
                    e.printStackTrace();
                } 
        } 
    }//GEN-LAST:event_redactarCorreoWindowClosing

    private void jl_verInboxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_verInboxMouseMoved
        // PENSAR COMO PUERCAS VAS A ESCRIBIR DE MANERA BONITA EL DISPLAY DE LOS INBOX. 
        /*
            pARA show los inbox solo decimos select * from correo where correoRecibido in (usuarios = actual.getCorreo) algo asi bai
        */
        
        DefaultListModel m = (DefaultListModel) listTodo.getModel();
        
        
        
    }//GEN-LAST:event_jl_verInboxMouseMoved

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prinicpalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prinicpalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prinicpalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prinicpalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prinicpalProyecto().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_correosContactos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_buscarDirectorioCorreo;
    private javax.swing.JButton jb_cancelModificarCorreo;
    private javax.swing.JButton jb_correoCRUD;
    private javax.swing.JButton jb_correoEliminar;
    private javax.swing.JButton jb_crudCorreo1;
    private javax.swing.JButton jb_enviarNuevoCorreo;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_modificarCorreo;
    private javax.swing.JLabel jb_regresarModuAdmin;
    private javax.swing.JButton jb_regristrar;
    private javax.swing.JDialog jd_bienvenido;
    private javax.swing.JDialog jd_listarDirectorioAdmin;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_modificarAccountCorreo;
    private javax.swing.JDialog jd_regristrar;
    private javax.swing.JLabel jl_apellidoCRUD;
    private javax.swing.JLabel jl_chat;
    private javax.swing.JLabel jl_contraCRUD;
    private javax.swing.JLabel jl_correo;
    private javax.swing.JLabel jl_correoCRUD;
    private javax.swing.JLabel jl_cuenta;
    private javax.swing.JLabel jl_listarDirectorioA;
    private javax.swing.JLabel jl_listarDirectorioCorreoE;
    private javax.swing.JLabel jl_listarDirectorioN;
    private javax.swing.JLabel jl_listarDirectoriocorreoR;
    private javax.swing.JLabel jl_login;
    private javax.swing.JLabel jl_nombreCRUD;
    private javax.swing.JLabel jl_reunion;
    private javax.swing.JLabel jl_tarea;
    private javax.swing.JLabel jl_verInbox;
    private javax.swing.JMenuItem jmi_borrarCorreo;
    private javax.swing.JMenuItem jmi_crearCorreo;
    private javax.swing.JMenuItem jmi_modificarCorreo;
    private javax.swing.JTable jt_tablaDirectorioCorreo;
    private javax.swing.JList<String> listTodo;
    private javax.swing.JDialog moduloAdmin;
    private javax.swing.JDialog moduloBandejas;
    private javax.swing.JDialog moduloCRUDCorreos;
    private javax.swing.JDialog moduloChats;
    private javax.swing.JDialog moduloLecturaCorreo;
    private javax.swing.JDialog moduloLecturaCorreos;
    private javax.swing.JDialog moduloReuniones;
    private javax.swing.JDialog moduloTareas;
    private javax.swing.JPopupMenu pop_correosModificarBorrarCrear;
    private javax.swing.JDialog redactarCorreo;
    private javax.swing.JTextArea textAreaCorreo;
    private javax.swing.JTextArea textAreaCorreo1;
    private javax.swing.JTextField tf_apellido1;
    private javax.swing.JTextField tf_asunto;
    private javax.swing.JTextField tf_contra1;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_directorioCorreo;
    private javax.swing.JTextField tf_modificarA;
    private javax.swing.JTextField tf_modificarC;
    private javax.swing.JTextField tf_modificarContra;
    private javax.swing.JTextField tf_modificarN;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JPasswordField tf_pass;
    private javax.swing.JTextField tf_pregunta;
    private javax.swing.JTextField tf_respuesta;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_user1;
    // End of variables declaration//GEN-END:variables
}
