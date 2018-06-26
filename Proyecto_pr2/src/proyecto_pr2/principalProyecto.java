
package proyecto_pr2;
import Clases.*;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

public class principalProyecto extends javax.swing.JFrame {
    Usuario actual;
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    Boolean esAdmin = true, esSeleccion = false, esDraft = false, esCrud=false, esReunion=false;
    VistaPrincipal vp = new VistaPrincipal();
    WindowEvent we;
    java.util.Date fecha = new java.util.Date();//captura la fecha del sistema
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    ArrayList <String> guardarCorreosTemp = new ArrayList();
    Alarma alarma;
        
    public principalProyecto() {
        initComponents();
        this.setVisible(false);
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(null);
        jd_login.setVisible(true);
        
        jl_correoContacto.setVisible(false);
        jl_nombreContacto.setVisible(false);
        tf_nombreContacto.setVisible(false);
        tf_correoContacto.setVisible(false);
        jb_agregarContacto.setVisible(false);
    }

    public boolean guardarDraft(){
        if (JOptionPane.showConfirmDialog(this, "Desea guardar el correo existente como draft antes de salir?","Guardar Draft al Salir",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            esDraft=true;
        }else
            redactarCorreo.dispose();
        return esDraft;
    }
    
    public void mostrosJDialogs(JDialog jd){
        jd.pack();
        jd.setModal(true);
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }
    
     public int numRows() throws Exception {
         int number = -1;
        try {
            // Statements allow to issue SQL queries to the database
            String sql = "select count(*) FROM contactos where pertenecienteCorreo='"+actual.getCorreo()+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                number = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return number;
     }
     
     public void activar(){
        
        if(Hora.getText().equals("") || Hora.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Teclee la hora y minutos en los campos correspondientes", "Atención",2);
        }else{
        
        alarma = new Alarma(Estado,Integer.parseInt(Hora.getText()),Integer.parseInt(Hora.getText()));
        alarma.execute();
       
        Estado.setText("Activado: Su alerta se ");
        Estado2.setText("mostrará a las "+Hora.getText()+":"+Hora.getText()+" horas");
        
        //Desactivar.setEnabled(true);
        //Activar.setEnabled(false);
        }
    }
    
    public void desactivar(){
        alarma.desactivar();
        alarma.cancel(true);
       // Desactivar.setEnabled(false);
       // Activar.setEnabled(true);
        Estado.setText("Desactivado");
        Estado2.setText("");
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
        jb_enviarCorreoAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jb_buscarDirectorioCorreo = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tablaDirectorioCorreo = new javax.swing.JTable();
        jcb_directorioCorreo = new javax.swing.JComboBox<>();
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
        moduloChats = new javax.swing.JDialog();
        moduloTareas = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        moduloReuniones = new javax.swing.JDialog();
        jb_enviarReunion = new javax.swing.JButton();
        tf_para = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        tf_asuntoReunion = new javax.swing.JTextField();
        tf_ubicacionReunion = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        Estado = new javax.swing.JLabel();
        Estado2 = new javax.swing.JLabel();
        jb_para = new javax.swing.JButton();
        spinner_inicio = new javax.swing.JSpinner();
        spinner_final = new javax.swing.JSpinner();
        Hora = new javax.swing.JTextField();
        Minuto = new javax.swing.JTextField();
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
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jb_regresarModuAdmin = new javax.swing.JLabel();
        jl_listarDirectorioA = new javax.swing.JLabel();
        jl_listarDirectoriocorreoR = new javax.swing.JLabel();
        jl_listarDirectorioCorreoE = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_showCorreoCuerpo = new javax.swing.JList<>();
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
        jl_sentMail = new javax.swing.JLabel();
        jl_draft = new javax.swing.JLabel();
        jl_showSpam = new javax.swing.JLabel();
        jl_trash = new javax.swing.JLabel();
        jl_agregarContactos = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        panelUniverso = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        panelShowInbox = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
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
        jl_showContacts = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jb_enviarCorreo = new javax.swing.JButton();
        jb_saveDraft = new javax.swing.JButton();
        jb_discardDraft = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tf_asunto = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaCorreo1 = new javax.swing.JTextArea();
        cb_correosContactos = new javax.swing.JComboBox<>();
        showInbox = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInbox = new javax.swing.JTable();
        jb_eliminarCorreo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_corroe = new javax.swing.JMenuItem();
        jmi_asunto = new javax.swing.JMenuItem();
        jmi_fecha = new javax.swing.JMenuItem();
        showChats = new javax.swing.JDialog();
        showSentMail = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaSentMail = new javax.swing.JTable();
        showDrafts = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaDrafts = new javax.swing.JTable();
        jb_enviarDraftComoCorreo = new javax.swing.JButton();
        showSpam = new javax.swing.JDialog();
        jScrollPane17 = new javax.swing.JScrollPane();
        tablaSpam = new javax.swing.JTable();
        showContacts = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();
        jb_enabledBottonContacto = new javax.swing.JButton();
        jb_moverContactoaContactoFav = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jl_nombreContacto = new javax.swing.JLabel();
        tf_correoContacto = new javax.swing.JTextField();
        jl_correoContacto = new javax.swing.JLabel();
        jb_agregarContacto = new javax.swing.JButton();
        tf_nombreContacto = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jb_crearGrupo = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaMisGrupos = new javax.swing.JTable();
        jb_verInfoGrupo = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaContactosFavoritos = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jb_modificarGrupo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        showTask = new javax.swing.JDialog();
        showTrash = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaTrash = new javax.swing.JTable();
        jb_borrarTrash = new javax.swing.JButton();
        jd_crearGrupo = new javax.swing.JDialog();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaContactosFavoritos1 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaSeleccionados = new javax.swing.JTable();
        jl_esconder = new javax.swing.JLabel();
        tf_nombreGrupo = new javax.swing.JTextField();
        jb_crearGrupoVerdadero = new javax.swing.JButton();
        jl_cambiar = new javax.swing.JLabel();
        jb_agregarParticipante1 = new javax.swing.JButton();
        jd_verInfoGrupo = new javax.swing.JDialog();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablaParticipantes = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jl_nombreGrupo = new javax.swing.JLabel();
        moduloCRUDGrupos = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jb_modificarNombreGrupo = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jb_eliminarGrupo = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tablaParticipantes1 = new javax.swing.JTable();
        jl_nombreGrupoCRUD = new javax.swing.JLabel();
        jb_eliminarParticipante = new javax.swing.JButton();
        jb_agregarParticipant = new javax.swing.JButton();
        jl_cuenta = new javax.swing.JLabel();
        jl_correo = new javax.swing.JLabel();
        jl_reunion = new javax.swing.JLabel();
        jl_tarea = new javax.swing.JLabel();
        jl_chat = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

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

        moduloAdmin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        moduloAdmin.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                moduloAdminWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                moduloAdminWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jb_enviarCorreoAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\PROGRA 2 PROJECTS\\Fotos proyecto\\Foto peque\\enviar correo.png")); // NOI18N
        jb_enviarCorreoAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enviarCorreoAdminMouseClicked(evt);
            }
        });

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
                        .addComponent(jb_enviarCorreoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jb_buscarDirectorioCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_enviarCorreoAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                "Nombre", "Direccion Electronica"
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
                                .addGap(18, 18, 18)
                                .addComponent(jcb_directorioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(moduloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(moduloAdminLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jcb_directorioCorreo)))
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
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        moduloCRUDCorreosLayout.setVerticalGroup(
            moduloCRUDCorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloCRUDCorreosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

        jLabel32.setText("Asunto");

        jLabel51.setText("Inicio");

        jLabel52.setText("Vencimiento:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel53.setText("Estado:");

        jLabel55.setText("Prioridad:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel56.setText("% completado:");

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1.setText("Aviso");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel57.setText("Propietario:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane15.setViewportView(jTextArea1);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout moduloTareasLayout = new javax.swing.GroupLayout(moduloTareas.getContentPane());
        moduloTareas.getContentPane().setLayout(moduloTareasLayout);
        moduloTareasLayout.setHorizontalGroup(
            moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloTareasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(moduloTareasLayout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(293, Short.MAX_VALUE))
                    .addGroup(moduloTareasLayout.createSequentialGroup()
                        .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(moduloTareasLayout.createSequentialGroup()
                                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(moduloTareasLayout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextField1)))
                            .addComponent(jSeparator1))
                        .addGap(20, 20, 20))
                    .addGroup(moduloTareasLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(moduloTareasLayout.createSequentialGroup()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        moduloTareasLayout.setVerticalGroup(
            moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloTareasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(moduloTareasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moduloTareasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(moduloTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        moduloReuniones.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                moduloReunionesWindowOpened(evt);
            }
        });

        jb_enviarReunion.setText("Enviar");
        jb_enviarReunion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enviarReunionMouseClicked(evt);
            }
        });

        tf_para.setEditable(false);

        jLabel59.setText("Asunto");

        jLabel60.setText("Ubicacion");

        jLabel61.setText("Inicio");

        jLabel62.setText("Finalizacion");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane16.setViewportView(jTextArea2);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Estado.setText("Estado");

        Estado2.setText("Estado2");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Estado2)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Estado)
                .addGap(35, 35, 35)
                .addComponent(Estado2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_para.setText("Para:");
        jb_para.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_paraMouseClicked(evt);
            }
        });

        spinner_inicio.setModel(new javax.swing.SpinnerDateModel());

        spinner_final.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1532554200000L), null, null, java.util.Calendar.DAY_OF_MONTH));

        Hora.setText("jTextField2");

        Minuto.setText("jTextField2");

        javax.swing.GroupLayout moduloReunionesLayout = new javax.swing.GroupLayout(moduloReuniones.getContentPane());
        moduloReuniones.getContentPane().setLayout(moduloReunionesLayout);
        moduloReunionesLayout.setHorizontalGroup(
            moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloReunionesLayout.createSequentialGroup()
                .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(moduloReunionesLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinner_inicio)
                            .addComponent(spinner_final))
                        .addGap(50, 50, 50)
                        .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(Minuto)))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(moduloReunionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_enviarReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(moduloReunionesLayout.createSequentialGroup()
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_ubicacionReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(moduloReunionesLayout.createSequentialGroup()
                                    .addComponent(jb_para)
                                    .addGap(11, 11, 11)
                                    .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_para)
                                        .addComponent(tf_asuntoReunion, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        moduloReunionesLayout.setVerticalGroup(
            moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloReunionesLayout.createSequentialGroup()
                .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(moduloReunionesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jb_enviarReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(moduloReunionesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_para, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_para))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_asuntoReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ubicacionReunion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(moduloReunionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinner_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Minuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel27.setText("Asunto:");

        jLabel28.setText("To:");

        jLabel29.setText("From:");

        jLabel30.setText("Correo:");

        jb_regresarModuAdmin.setText("Regresar");
        jb_regresarModuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresarModuAdminMouseClicked(evt);
            }
        });

        jl_listarDirectorioA.setText("jj");

        jl_listarDirectoriocorreoR.setText("jLabel34");

        jl_listarDirectorioCorreoE.setText("jLabel35");

        jl_showCorreoCuerpo.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(jl_showCorreoCuerpo);

        javax.swing.GroupLayout jd_listarDirectorioAdminLayout = new javax.swing.GroupLayout(jd_listarDirectorioAdmin.getContentPane());
        jd_listarDirectorioAdmin.getContentPane().setLayout(jd_listarDirectorioAdminLayout);
        jd_listarDirectorioAdminLayout.setHorizontalGroup(
            jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listarDirectorioAdminLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_regresarModuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                        .addGroup(jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
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
                                        .addComponent(jl_listarDirectorioCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_listarDirectorioAdminLayout.setVerticalGroup(
            jd_listarDirectorioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarDirectorioAdminLayout.createSequentialGroup()
                .addComponent(jb_regresarModuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
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
                .addGap(27, 27, 27)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
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
        jl_verInbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_verInboxMouseClicked(evt);
            }
        });

        jLabel33.setText("Chats");

        jl_sentMail.setText("Sent Mail");
        jl_sentMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_sentMailMouseClicked(evt);
            }
        });

        jl_draft.setText("Drafts");
        jl_draft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_draftMouseClicked(evt);
            }
        });

        jl_showSpam.setText("Spam");
        jl_showSpam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_showSpamMouseClicked(evt);
            }
        });

        jl_trash.setText("Trash");
        jl_trash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_trashMouseClicked(evt);
            }
        });

        jl_agregarContactos.setText("Contacks");
        jl_agregarContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_agregarContactosMouseClicked(evt);
            }
        });

        jLabel39.setText("Task");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_verInbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jl_sentMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jl_draft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jl_showSpam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jl_trash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jl_agregarContactos, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
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
                .addComponent(jl_sentMail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_draft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_showSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_trash, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_agregarContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelUniverso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel40.setText("Inbox");

        panelShowInbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelShowInboxLayout = new javax.swing.GroupLayout(panelShowInbox);
        panelShowInbox.setLayout(panelShowInboxLayout);
        panelShowInboxLayout.setHorizontalGroup(
            panelShowInboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        panelShowInboxLayout.setVerticalGroup(
            panelShowInboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelUniversoLayout = new javax.swing.GroupLayout(panelUniverso);
        panelUniverso.setLayout(panelUniversoLayout);
        panelUniversoLayout.setHorizontalGroup(
            panelUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addComponent(panelShowInbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUniversoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        panelUniversoLayout.setVerticalGroup(
            panelUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUniversoLayout.createSequentialGroup()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelShowInbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUniversoLayout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
                .addComponent(panelUniverso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(panelUniverso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        redactarCorreo.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        redactarCorreo.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                redactarCorreoWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                redactarCorreoWindowOpened(evt);
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

        jl_showContacts.setText("Contacts");
        jl_showContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_showContactsMouseClicked(evt);
            }
        });

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
            .addComponent(jl_showContacts, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
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
                .addComponent(jl_showContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jb_enviarCorreo.setText("Send");
        jb_enviarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enviarCorreoMouseClicked(evt);
            }
        });

        jb_saveDraft.setText("Save Now");
        jb_saveDraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_saveDraftMouseClicked(evt);
            }
        });

        jb_discardDraft.setText("Discard");
        jb_discardDraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_discardDraftMouseClicked(evt);
            }
        });

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
                                .addComponent(jb_enviarCorreo)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel50)))
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jb_saveDraft)
                                .addGap(18, 18, 18)
                                .addComponent(jb_discardDraft))
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
                    .addComponent(jb_enviarCorreo)
                    .addComponent(jb_saveDraft)
                    .addComponent(jb_discardDraft))
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

        showInbox.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                showInboxWindowOpened(evt);
            }
        });

        tablaInbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Asunto", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInboxMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaInbox);

        jb_eliminarCorreo.setText("Eliminar Correo");
        jb_eliminarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarCorreoMouseClicked(evt);
            }
        });

        jMenu1.setText("SPAM");

        jmi_corroe.setText("Correo");
        jmi_corroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_corroeActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_corroe);

        jmi_asunto.setText("Asunto");
        jmi_asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_asuntoActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_asunto);

        jmi_fecha.setText("Fecha");
        jmi_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_fechaActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_fecha);

        jMenuBar1.add(jMenu1);

        showInbox.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout showInboxLayout = new javax.swing.GroupLayout(showInbox.getContentPane());
        showInbox.getContentPane().setLayout(showInboxLayout);
        showInboxLayout.setHorizontalGroup(
            showInboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showInboxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_eliminarCorreo)
                .addGap(173, 173, 173))
            .addGroup(showInboxLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        showInboxLayout.setVerticalGroup(
            showInboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showInboxLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jb_eliminarCorreo)
                .addContainerGap())
        );

        javax.swing.GroupLayout showChatsLayout = new javax.swing.GroupLayout(showChats.getContentPane());
        showChats.getContentPane().setLayout(showChatsLayout);
        showChatsLayout.setHorizontalGroup(
            showChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        showChatsLayout.setVerticalGroup(
            showChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        showSentMail.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                showSentMailWindowOpened(evt);
            }
        });

        tablaSentMail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Asunto"
            }
        ));
        jScrollPane3.setViewportView(tablaSentMail);

        javax.swing.GroupLayout showSentMailLayout = new javax.swing.GroupLayout(showSentMail.getContentPane());
        showSentMail.getContentPane().setLayout(showSentMailLayout);
        showSentMailLayout.setHorizontalGroup(
            showSentMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showSentMailLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        showSentMailLayout.setVerticalGroup(
            showSentMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showSentMailLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        showDrafts.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                showDraftsWindowOpened(evt);
            }
        });

        tablaDrafts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asunto", "To", "From"
            }
        ));
        jScrollPane8.setViewportView(tablaDrafts);

        jb_enviarDraftComoCorreo.setText("Enivar Correo");
        jb_enviarDraftComoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enviarDraftComoCorreoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout showDraftsLayout = new javax.swing.GroupLayout(showDrafts.getContentPane());
        showDrafts.getContentPane().setLayout(showDraftsLayout);
        showDraftsLayout.setHorizontalGroup(
            showDraftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDraftsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showDraftsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_enviarDraftComoCorreo)
                .addGap(84, 84, 84))
        );
        showDraftsLayout.setVerticalGroup(
            showDraftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDraftsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jb_enviarDraftComoCorreo)
                .addGap(25, 25, 25))
        );

        showSpam.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                showSpamWindowOpened(evt);
            }
        });

        tablaSpam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo", "Asunto", "Fecha"
            }
        ));
        jScrollPane17.setViewportView(tablaSpam);

        javax.swing.GroupLayout showSpamLayout = new javax.swing.GroupLayout(showSpam.getContentPane());
        showSpam.getContentPane().setLayout(showSpamLayout);
        showSpamLayout.setHorizontalGroup(
            showSpamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showSpamLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        showSpamLayout.setVerticalGroup(
            showSpamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showSpamLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        showContacts.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                showContactsWindowOpened(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel7.setText("TODOS TUS CONTACTOS");

        tablaContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Correo"
            }
        ));
        jScrollPane5.setViewportView(tablaContactos);

        jb_enabledBottonContacto.setText("Agregar Contacto Nuevo");
        jb_enabledBottonContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_enabledBottonContactoMouseClicked(evt);
            }
        });

        jb_moverContactoaContactoFav.setText("Mover a Contactos Favoritos");
        jb_moverContactoaContactoFav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_moverContactoaContactoFavMouseClicked(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_nombreContacto.setText("Nombre Completo");

        jl_correoContacto.setText("Correo");

        jb_agregarContacto.setText("Agregar");
        jb_agregarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarContactoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jl_correoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_correoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jl_nombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jb_agregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_agregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_correoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jb_enabledBottonContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jb_moverContactoaContactoFav)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jb_moverContactoaContactoFav, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jb_enabledBottonContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(265, 265, 265))
        );

        jTabbedPane1.addTab("Todos tus Contactos", jPanel7);

        jb_crearGrupo.setText("Crear Nuevo Grupo");
        jb_crearGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearGrupoMouseClicked(evt);
            }
        });

        tablaMisGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mis Grupos"
            }
        ));
        jScrollPane9.setViewportView(tablaMisGrupos);

        jb_verInfoGrupo.setText("Ver info del Grupo");
        jb_verInfoGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_verInfoGrupoMouseClicked(evt);
            }
        });

        tablaContactosFavoritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Correo"
            }
        ));
        jScrollPane10.setViewportView(tablaContactosFavoritos);

        jLabel34.setText("Contactos Favoritos");

        jb_modificarGrupo.setText("Modificar Grupo");
        jb_modificarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarGrupoMouseClicked(evt);
            }
        });

        jButton5.setText("Eliminar Grupo");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_verInfoGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jb_modificarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_crearGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_verInfoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_crearGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_modificarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Contactos Favoritos", jPanel8);

        javax.swing.GroupLayout showContactsLayout = new javax.swing.GroupLayout(showContacts.getContentPane());
        showContacts.getContentPane().setLayout(showContactsLayout);
        showContactsLayout.setHorizontalGroup(
            showContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showContactsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        showContactsLayout.setVerticalGroup(
            showContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showContactsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout showTaskLayout = new javax.swing.GroupLayout(showTask.getContentPane());
        showTask.getContentPane().setLayout(showTaskLayout);
        showTaskLayout.setHorizontalGroup(
            showTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        showTaskLayout.setVerticalGroup(
            showTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        showTrash.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                showTrashWindowOpened(evt);
            }
        });

        tablaTrash.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nmbre", "Correo"
            }
        ));
        jScrollPane7.setViewportView(tablaTrash);

        jb_borrarTrash.setText("Borrar Definitivamente");
        jb_borrarTrash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarTrashMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout showTrashLayout = new javax.swing.GroupLayout(showTrash.getContentPane());
        showTrash.getContentPane().setLayout(showTrashLayout);
        showTrashLayout.setHorizontalGroup(
            showTrashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showTrashLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showTrashLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_borrarTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        showTrashLayout.setVerticalGroup(
            showTrashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showTrashLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jb_borrarTrash)
                .addGap(36, 36, 36))
        );

        jd_crearGrupo.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jd_crearGrupoWindowOpened(evt);
            }
        });

        tablaContactosFavoritos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Correo", "Seleccionados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaContactosFavoritos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContactosFavoritos1MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tablaContactosFavoritos1);

        tablaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccionados"
            }
        ));
        jScrollPane12.setViewportView(tablaSeleccionados);

        jl_esconder.setText("Ingrese nombre del Grupo");

        jb_crearGrupoVerdadero.setText("Crear Grupo");
        jb_crearGrupoVerdadero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearGrupoVerdaderoMouseClicked(evt);
            }
        });

        jl_cambiar.setText("Lista de tus Contactos Favoritos:");

        jb_agregarParticipante1.setText("Agregar Participante");
        jb_agregarParticipante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarParticipante1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearGrupoLayout = new javax.swing.GroupLayout(jd_crearGrupo.getContentPane());
        jd_crearGrupo.getContentPane().setLayout(jd_crearGrupoLayout);
        jd_crearGrupoLayout.setHorizontalGroup(
            jd_crearGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearGrupoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jd_crearGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_esconder, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearGrupoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_agregarParticipante1)
                .addGap(39, 39, 39)
                .addComponent(jb_crearGrupoVerdadero)
                .addGap(40, 40, 40))
        );
        jd_crearGrupoLayout.setVerticalGroup(
            jd_crearGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearGrupoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jd_crearGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jd_crearGrupoLayout.createSequentialGroup()
                        .addComponent(jl_esconder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jd_crearGrupoLayout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_crearGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_crearGrupoVerdadero)
                            .addComponent(jb_agregarParticipante1))
                        .addGap(33, 33, 33))))
        );

        jLabel37.setText("Participantes:");

        tablaParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo"
            }
        ));
        jScrollPane13.setViewportView(tablaParticipantes);

        jLabel38.setText("Nombre Grupo:");

        jl_nombreGrupo.setText("jLabel48");

        javax.swing.GroupLayout jd_verInfoGrupoLayout = new javax.swing.GroupLayout(jd_verInfoGrupo.getContentPane());
        jd_verInfoGrupo.getContentPane().setLayout(jd_verInfoGrupoLayout);
        jd_verInfoGrupoLayout.setHorizontalGroup(
            jd_verInfoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verInfoGrupoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jd_verInfoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_verInfoGrupoLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(404, 404, 404)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jd_verInfoGrupoLayout.createSequentialGroup()
                .addGroup(jd_verInfoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_verInfoGrupoLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jl_nombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_verInfoGrupoLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_verInfoGrupoLayout.setVerticalGroup(
            jd_verInfoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verInfoGrupoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_nombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        moduloCRUDGrupos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                moduloCRUDGruposWindowOpened(evt);
            }
        });

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setText("Mi Grupo");

        jb_modificarNombreGrupo.setText("Modificar Grupo");
        jb_modificarNombreGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarNombreGrupoMouseClicked(evt);
            }
        });

        jLabel54.setText("Participantes:");

        jb_eliminarGrupo.setText("Eliminar Grupo");
        jb_eliminarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarGrupoMouseClicked(evt);
            }
        });

        tablaParticipantes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo"
            }
        ));
        jScrollPane14.setViewportView(tablaParticipantes1);

        jl_nombreGrupoCRUD.setText("jLabel51");

        jb_eliminarParticipante.setText("Eliminar Participante");

        jb_agregarParticipant.setText("Agregar Participante");
        jb_agregarParticipant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarParticipantMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jb_agregarParticipant, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jb_eliminarParticipante)
                .addGap(40, 40, 40)
                .addComponent(jb_modificarNombreGrupo)
                .addGap(35, 35, 35)
                .addComponent(jb_eliminarGrupo)
                .addGap(39, 39, 39))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_nombreGrupoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jl_nombreGrupoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_modificarNombreGrupo)
                    .addComponent(jb_eliminarGrupo)
                    .addComponent(jb_eliminarParticipante)
                    .addComponent(jb_agregarParticipant))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout moduloCRUDGruposLayout = new javax.swing.GroupLayout(moduloCRUDGrupos.getContentPane());
        moduloCRUDGrupos.getContentPane().setLayout(moduloCRUDGruposLayout);
        moduloCRUDGruposLayout.setHorizontalGroup(
            moduloCRUDGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloCRUDGruposLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        moduloCRUDGruposLayout.setVerticalGroup(
            moduloCRUDGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloCRUDGruposLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_cuenta.setText("Ver Cuenta");
        jl_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cuentaMouseClicked(evt);
            }
        });

        jl_correo.setText("Ver correo");
        jl_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_correoMouseClicked(evt);
            }
        });

        jl_reunion.setText("Reuniones");
        jl_reunion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_reunionMouseClicked(evt);
            }
        });

        jl_tarea.setText("Tareas");

        jl_chat.setText("Chats");

        jLabel19.setText("Bienvenido de nuevo! ");

        jLabel26.setText("Contactos");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

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
                            .addComponent(jl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_reunion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_tarea, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_reunion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jl_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_loginMouseClicked
        // TODO add your handling code here:
        
        //que le de click a registrarse 
        mostrosJDialogs(jd_regristrar);
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
                        esAdmin = false;
                        this.setVisible(true);
                    } else if (user.equals("admin") && pass.equals("1")) {
                        esAdmin = true;
                        this.setVisible(true);
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
        this.setVisible(false);
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
            this.setVisible(false);
            mostrosJDialogs(moduloAdmin);
        } else if(!esAdmin) {
            this.setVisible(false);
            mostrosJDialogs(moduloLecturaCorreo);
        }
    }//GEN-LAST:event_jl_correoMouseClicked

    private void jb_correoCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_correoCRUDMouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(jd_modificarAccountCorreo);
    }//GEN-LAST:event_jb_correoCRUDMouseClicked

    private void jb_modificarCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarCorreoMouseClicked
        //Usuario modifica su propio 
        try {
        Statement st = null; 
        st=cn.createStatement();
            if (!tf_modificarN.getText().equals("")) {
                jl_nombreCRUD.setText(tf_modificarN.getText());
                st.executeUpdate("update usuario set nombre='"+tf_modificarN.getText()+"' WHERE correo='"+jl_correoCRUD.getText()+"'");
                
            }
            if (!tf_modificarA.getText().equals("")) {
                jl_apellidoCRUD.setText(tf_modificarA.getText());
                st.executeUpdate("update usuario set apellido='"+tf_modificarA.getText()+"'WHERE correo='"+jl_correoCRUD.getText()+"'" );
                
            }
            if (!tf_modificarC.getText().equals("")) {
                 jl_correoCRUD.setText(tf_modificarC.getText());
                 st.executeUpdate("update usuario set correo='"+tf_modificarC.getText()+"'WHERE correo='"+jl_correoCRUD.getText()+"'");
                 
            }
            if (!tf_modificarContra.getText().equals("")) {
                jl_contraCRUD.setText(tf_modificarContra.getText());
                st.executeUpdate("update usuario set contra='"+tf_modificarContra.getText()+"'WHERE correo='"+jl_correoCRUD.getText()+"'");
                
            } 
       JOptionPane.showMessageDialog(null, "Se ha modificado su cuenta correctamente.");
                
                    
            jd_modificarAccountCorreo.dispose();
    } catch (Exception e) {
        System.out.print(e.getMessage());
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "No se puede modificar su cuenta, intentelo mas tarde.");
    }    
    }//GEN-LAST:event_jb_modificarCorreoMouseClicked

    private void jb_correoEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_correoEliminarMouseClicked
        // Usuario elimina su correo
        int resp = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar su cuenta?"
                + "Se borraran todos sus datos, contactos, correos y demas.","Confirm",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.OK_OPTION){
            try {
                Statement st = null;
                st = cn.createStatement();
                st.executeUpdate("DELETE from Usuario Where correo='" + actual.getCorreo() + "'");
                System.exit(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jb_correoEliminarMouseClicked

    private void jb_buscarDirectorioCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_buscarDirectorioCorreoMouseClicked
        // TODO add your handling code here:
      if (jcb_directorioCorreo.getSelectedIndex()>=0){ //que salga de el combo box
          
            //INFO DE UN CORREO EN ESPECIFICO
            String nombreBuscar = jcb_directorioCorreo.getSelectedItem().toString();
            String sql = "SELECT * from correo WHERE correoEmisor='"+nombreBuscar+"'";
            String correoEmisor,correoReceptor,asunto,cuerpo;
            
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos []= new String [4];
                
                while (rs.next()){
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                }
                correoReceptor = datos[0];
                asunto = datos[1];
                cuerpo = datos[2];
                correoEmisor = datos[3];
                
                jl_listarDirectorioA.setText(asunto);
                jl_listarDirectorioCorreoE.setText(correoEmisor);
                jl_listarDirectoriocorreoR.setText(correoReceptor);
                DefaultListModel m2 = (DefaultListModel) jl_showCorreoCuerpo.getModel();
                m2.addElement(cuerpo);
                jl_showCorreoCuerpo.setModel(m2);
                if (jl_listarDirectorioA.getText() != null) {
                    mostrosJDialogs(jd_listarDirectorioAdmin);
                }else
                    JOptionPane.showMessageDialog(null,"No tiene correo.");
                
            }   catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error.");
                Logger.getLogger(principalProyecto.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            jt_tablaDirectorioCorreo.clearSelection();
        }
        
    }//GEN-LAST:event_jb_buscarDirectorioCorreoMouseClicked

    private void jb_regresarModuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresarModuAdminMouseClicked
        // TODO add your handling code here:
        if (esAdmin) {
            jd_listarDirectorioAdmin.dispose();
            mostrosJDialogs(moduloAdmin);
        }else{
            jd_listarDirectorioAdmin.dispose();
            mostrosJDialogs(moduloLecturaCorreo);
        }
    }//GEN-LAST:event_jb_regresarModuAdminMouseClicked

    private void jb_enviarNuevoCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviarNuevoCorreoMouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(redactarCorreo);
        //llenar combobox de los contactos
        
        /*
        quieroque se guarden solamente los contactos del usuario. 
        puedo hacer una validacion.. 
        pertenenciente = actual.getCorreo()
        y que escoja los correos de los que su pertenetiente es el actual
        */
        
        
    }//GEN-LAST:event_jb_enviarNuevoCorreoMouseClicked

    private void jb_enviarCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviarCorreoMouseClicked
        // TODO add your handling code here:
        String correoEmisor = actual.getCorreo().toString();
        String nombreEmisor = actual.getNombre().toString();
        String correoReceptor = cb_correosContactos.getSelectedItem().toString();
        String sql ="select * from spam where pertenecienteCorreo='"+correoReceptor+"'";
        String correoBloqueado="";
        String datos [] = new String [2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
            }
            correoBloqueado=datos[0]; 
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "correoEmisor: "+correoEmisor+
                "\ncorreoBloqueado: "+correoBloqueado
        +"\ncorreoReceptor: "+correoReceptor);
        
        if (!correoBloqueado.equals(correoEmisor)) {
            String asunto = tf_asunto.getText();
            String cuerpo = textAreaCorreo1.getText();
            if (!textAreaCorreo1.equals("") && cb_correosContactos.getSelectedIndex() >= 0) { //como lo va enviar?

                /*
            lo que hice es que en la tabla correos se guarden TODOS los correos enviados con sus atributos.
            si quiero todos los correos enviados por alguien pongo select * from correos where correoEmisor = tal.
            o select * from correos where correoReceptor = tal x para saber sus correos recibidos. 
                 */
                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO correo(correoReceptor,asunto,cuerpo,correoEmisor,nombreEmisor,tipo,fecha) VALUES(?,?,?,?,?,?,?)");
                    pst.setString(1, correoReceptor);
                    pst.setString(2, asunto);
                    pst.setString(3, cuerpo);
                    pst.setString(4, correoEmisor);
                    pst.setString(5, nombreEmisor);
                    pst.setString(6, "No leido");
                    pst.setString(7, df.format(fecha));
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Envio exitoso");
                    redactarCorreo.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al enviar");
                    e.printStackTrace();
                }

            } else if (cb_correosContactos.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar correo destinatarios para enviar correo.");
            }
        } else if (correoEmisor.equals(correoBloqueado)) { //entonces lo manda a spam.
            JOptionPane.showMessageDialog(null, "SPAAAAAAAM");
            String asunto = tf_asunto.getText();
            String cuerpo = textAreaCorreo1.getText();
            if (!textAreaCorreo1.equals("") && cb_correosContactos.getSelectedIndex() >= 0) { //como lo va enviar?

                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO spam(correoBloqueado,pertenecienteCorreo,asunto,cuerpo,tipo,fecha,nombreBloqueado) VALUES(?,?,?,?,?,?,?)");
                    pst.setString(1, correoEmisor);
                    pst.setString(2, correoReceptor);
                    pst.setString(3, asunto);
                    pst.setString(4, cuerpo);
                    pst.setString(5, "No leido");
                    pst.setString(6, df.format(fecha));
                    pst.setString(7, nombreEmisor);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Envio exitoso");
                    redactarCorreo.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al enviar");
                    e.printStackTrace();
                }

            } else if (cb_correosContactos.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar correo destinatarios para enviar correo.");
            }
        }//else if(){
            //lo de asunto y despues fecha
        //}
        
        
        
    }//GEN-LAST:event_jb_enviarCorreoMouseClicked

    private void jb_crudCorreo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crudCorreo1MouseClicked
        // TODO add your handling code here:
        //va modificar correos
        //que le aparezca todo en los jlabels.
        if (actual.getCorreo() != null) {
             jl_nombreCRUD.setText(actual.getNombre());
            jl_apellidoCRUD.setText(actual.getApellido());
            jl_correoCRUD.setText(actual.getCorreo().toString());
            jl_contraCRUD.setText(actual.getPass());
            mostrosJDialogs(moduloCRUDCorreos);
        }else
            JOptionPane.showMessageDialog(this, "ya borro su cuenta.");
        
    }//GEN-LAST:event_jb_crudCorreo1MouseClicked

    private void redactarCorreoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_redactarCorreoWindowClosing
        // TODO add your handling code here:
        String correoEmisor = actual.getCorreo().toString();
        String correoReceptor="";
        String asunto = tf_asunto.getText();
        String cuerpo = textAreaCorreo1.getText();
        String nombreEmisor = actual.getNombre().toString();
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
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO draft(correoEmisor,correoReceptor,asunto,cuerpo,nombreEmisor,tipo) VALUES(?,?,?,?,?,?)");
                    pst.setString(1, correoEmisor);
                    pst.setString(2, correoReceptor);
                    pst.setString(3, asunto);
                    pst.setString(4, cuerpo);
                    pst.setString(5, nombreEmisor);
                    pst.setString(6, "No leido");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Draft guardado exitosamente");
                    redactarCorreo.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al guardar draft");
                    e.printStackTrace();
                } 
        }
    }//GEN-LAST:event_redactarCorreoWindowClosing

    private void jb_saveDraftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_saveDraftMouseClicked
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
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) cb_correosContactos.getModel();
        String sql = "SELECT correo FROM contactos where pertenecienteCorreo='"+actual.getCorreo()+"' ";
        try {
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          
          while (rs.next()) {
                m.addElement(rs.getString(1));
            } 
          cb_correosContactos.setModel(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tf_asunto.setText("");
        textAreaCorreo1.setText("");
    }//GEN-LAST:event_jb_saveDraftMouseClicked

    private void jb_discardDraftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_discardDraftMouseClicked
        // TODO add your handling code here:
        redactarCorreo.setVisible(false);
        DefaultComboBoxModel m = (DefaultComboBoxModel) cb_correosContactos.getModel();
        String sql = "SELECT correo FROM contactos where pertenecienteCorreo='"+actual.getCorreo()+"' ";
        try {
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          
          while (rs.next()) {
                m.addElement(rs.getString(1));
            } 
          cb_correosContactos.setModel(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tf_asunto.setText("");
        textAreaCorreo1.setText("");
    }//GEN-LAST:event_jb_discardDraftMouseClicked

    private void jb_enabledBottonContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enabledBottonContactoMouseClicked
        // TODO add your handling code here:
        jl_correoContacto.setVisible(true);
        jl_nombreContacto.setVisible(true);
        tf_nombreContacto.setVisible(true);
        tf_correoContacto.setVisible(true);
        jb_agregarContacto.setVisible(true);
    }//GEN-LAST:event_jb_enabledBottonContactoMouseClicked

    private void jb_agregarContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarContactoMouseClicked
        // TODO add your handling code here:
        if (!tf_nombreContacto.equals("") && !tf_correoContacto.equals("")) {
            
            try {
                PreparedStatement pst = cn.prepareStatement("INSERT INTO contactos(nombreCompleto,correo,pertenecienteCorreo) VALUES(?,?,?)");
                pst.setString(1, tf_nombreContacto.getText());
                pst.setString(2, tf_correoContacto.getText());
                pst.setString(3, actual.getCorreo().toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro exitoso");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al agregar");
                e.printStackTrace();
            }
        }else 
            JOptionPane.showMessageDialog(this, "Llene los campos para agregar nuevo contacto.");
        
        tablaContactos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre ", "Correo"
                }
        ));

        DefaultTableModel m = (DefaultTableModel) tablaContactos.getModel();
        String sql = "select * from contactos";
        String datos[] = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                m.addRow(datos);
            }
            tablaContactos.setModel(m);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jb_agregarContactoMouseClicked

    private void jl_showContactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_showContactsMouseClicked
        // mouse click desde redactarCorreo
        moduloLecturaCorreo.dispose();
        mostrosJDialogs(showContacts);
    }//GEN-LAST:event_jl_showContactsMouseClicked

    private void jb_enviarCorreoAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviarCorreoAdminMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jb_enviarCorreoAdminMouseClicked

    private void jl_agregarContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_agregarContactosMouseClicked
        // agrego contactos desde lecturaCorreos 
        //this.setVisible(false);
        moduloLecturaCorreo.dispose();
        jb_agregarContacto.setVisible(true);
        mostrosJDialogs(showContacts);
    }//GEN-LAST:event_jl_agregarContactosMouseClicked

    private void redactarCorreoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_redactarCorreoWindowOpened
        // TODO add your handling code here:
        int i=0;
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) cb_correosContactos.getModel();
        String sql = "SELECT correo FROM contactos where pertenecienteCorreo='"+actual.getCorreo()+"' ";
        try {
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          
          while (rs.next()) {
                m.addElement(rs.getString(1));
            } 
          cb_correosContactos.setModel(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_redactarCorreoWindowOpened

    private void moduloAdminWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_moduloAdminWindowOpened
        // quiero que cargue el combo box con todos los usuarios y en la tabla igual con todos los usuarios.
        DefaultComboBoxModel m = (DefaultComboBoxModel) jcb_directorioCorreo.getModel();
        String sql = "SELECT * FROM usuario";
        try {
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          
          while (rs.next()) {
                m.addElement(rs.getString(5));
            } 
          jcb_directorioCorreo.setModel(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //llenar la tabla
        DefaultTableModel m2 = (DefaultTableModel) jt_tablaDirectorioCorreo.getModel();
        String sql2 = "SELECT nombre,correo FROM usuario";

        String[] datos = new String[2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            while (rs.next()) {
                datos[0] = rs.getString(1);

                datos[1] = rs.getString(2);
                m2.addRow(datos);
            }
            jt_tablaDirectorioCorreo.setModel(m2);
        } catch (SQLException ex) {
        }
        
    }//GEN-LAST:event_moduloAdminWindowOpened

    private void jl_verInboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_verInboxMouseClicked
        //llenar la table de todos los correos de la persona
        //osea bandeja de entrada
        mostrosJDialogs(showInbox);
    }//GEN-LAST:event_jl_verInboxMouseClicked

    private void showInboxWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_showInboxWindowOpened
        // TODO add your handling code here:
         DefaultTableModel m = (DefaultTableModel) tablaInbox.getModel();
        String sql = "select * from correo where correoReceptor='"+actual.getCorreo()+"'";
        String datos [] = new String[3];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(5);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(6);
                m.addRow(datos);
            }
            tablaInbox.setModel(m);   
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_showInboxWindowOpened

    
    
    private void tablaInboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInboxMouseClicked
        if (evt.getClickCount()> 1) {
            int row = tablaInbox.getSelectedRow();
            row++;
            String sql = "SELECT * from correo WHERE id='"+row+"'";
            String correoEmisor,correoReceptor,asunto,cuerpo;
            
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos []= new String [4];
                
                while (rs.next()){
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                }
                correoReceptor = datos[0];
                asunto = datos[1];
                cuerpo = datos[2];
                correoEmisor = datos[3];
                
                jl_listarDirectorioA.setText(asunto);
                jl_listarDirectorioCorreoE.setText(correoEmisor);
                jl_listarDirectoriocorreoR.setText(correoReceptor);
                DefaultListModel m2 = (DefaultListModel) jl_showCorreoCuerpo.getModel();
                m2.addElement(cuerpo);
                jl_showCorreoCuerpo.setModel(m2);
                if (jl_listarDirectorioA.getText() != null) {
                    mostrosJDialogs(jd_listarDirectorioAdmin);
                }else
                    JOptionPane.showMessageDialog(null,"No tiene correo.");
        }   catch (SQLException ex) {
                Logger.getLogger(principalProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
            row--;
            
            String sql2 = "update correo set tipo='leido' where id='"+row+"'";
            try {
                PreparedStatement pst = cn.prepareStatement("update correo set tipo='leido' where id='"+row+"'");
                pst.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            DefaultTableModel m = (DefaultTableModel) tablaInbox.getModel();
            String sql3 = "select tipo from correo where id='"+row+"'";
            String datos[] = new String[1];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql3);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    m.setValueAt(datos[0], row, 2);
                }
                tablaInbox.setModel(m);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }       
    }//GEN-LAST:event_tablaInboxMouseClicked

    private void moduloAdminWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_moduloAdminWindowClosing
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_moduloAdminWindowClosing

    private void jl_sentMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_sentMailMouseClicked
        //directorio de todos los emails enviados. 
        mostrosJDialogs(showSentMail);
    }//GEN-LAST:event_jl_sentMailMouseClicked

    private void showSentMailWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_showSentMailWindowOpened
        // TODO add your handling code here:
         DefaultTableModel m = (DefaultTableModel) tablaSentMail.getModel();
        String sql = "select * from correo where correoEmisor='"+actual.getCorreo()+"'";
        String datos [] = new String[2];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(5);
                datos[1]=rs.getString(2);
                m.addRow(datos);
            }
            tablaSentMail.setModel(m);   
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_showSentMailWindowOpened

    private void jb_eliminarCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarCorreoMouseClicked
        //mandarlo un correo a la bandeja de trash
        String correoReceptor="", asunto="",cuerpo="",correoEmisor="",nombreEmisor="",tipo="",id="";
        int row = tablaInbox.getSelectedRow();
        row++;
        
        String sql = "select * from correo where id='"+row+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos [] = new String [7];
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
            }
            correoReceptor=datos[0];
            asunto=datos[1];
            cuerpo=datos[2];
            correoEmisor=datos[3];
            nombreEmisor=datos[4];
            tipo=datos[5];
            id=datos[6];
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM correo WHERE id='"+row+"'");
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO trash(correoReceptor,asunto,cuerpo,correoEmisor,nombreEmisor,tipo,id) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1,correoReceptor);
            pst.setString(2,asunto);
            pst.setString(3, cuerpo);
            pst.setString(4, correoEmisor);
            pst.setString(5, nombreEmisor);
            pst.setString(6, tipo);
            pst.setString(7, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha movido a trash.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jb_eliminarCorreoMouseClicked

    private void jl_trashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_trashMouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(showTrash);
    }//GEN-LAST:event_jl_trashMouseClicked

    private void jb_borrarTrashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarTrashMouseClicked
        // TODO add your handling code here:
        int row = tablaTrash.getSelectedRow();
        row++;
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM trash WHERE id='"+row+"'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se borro exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        row--;
        DefaultTableModel m = (DefaultTableModel) tablaTrash.getModel();
        m.removeRow(row);
        tablaTrash.setModel(m);
    }//GEN-LAST:event_jb_borrarTrashMouseClicked

    private void showTrashWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_showTrashWindowOpened
        // TODO add your handling code here:
        DefaultTableModel m = (DefaultTableModel) tablaTrash.getModel();
        String sql = "select * from trash";
        String datos [] = new String[2];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(5);
                datos[1]=rs.getString(2);
                m.addRow(datos);
            }
            tablaTrash.setModel(m);  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }   
    }//GEN-LAST:event_showTrashWindowOpened

    private void jl_draftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_draftMouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(showDrafts);
    }//GEN-LAST:event_jl_draftMouseClicked

    private void showDraftsWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_showDraftsWindowOpened
        // TODO add your handling code here:
        DefaultTableModel m = (DefaultTableModel) tablaDrafts.getModel();
        String sql = "select * from draft";
        String datos [] = new String[4];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(3);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(1);
                m.addRow(datos);
            }
            tablaDrafts.setModel(m);  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_showDraftsWindowOpened

    private void jb_enviarDraftComoCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviarDraftComoCorreoMouseClicked
        // TODO add your handling code here:
        String correoReceptor="", asunto="",cuerpo="",correoEmisor="",nombreEmisor="",tipo="",id="",fecha="";
        int row = tablaDrafts.getSelectedRow();
        row++;
        //primero guardo los datos del draft, luego envio el draft como correo y despues lo borro de draft 
        String sql="select * from draft where id='"+row+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos [] = new String [7];
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
            }
            correoReceptor=datos[0];
            asunto=datos[1];
            cuerpo=datos[2];
            correoEmisor=datos[3];
            nombreEmisor=datos[4];
            tipo=datos[5];
            fecha=datos[6];
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO correo(correoReceptor,asunto,cuerpo,correoEmisor,nombreEmisor,tipo,fecha) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, correoReceptor);
            pst.setString(2, asunto);
            pst.setString(3, cuerpo);
            pst.setString(4, correoEmisor);
            pst.setString(5, nombreEmisor);
            pst.setString(6, "No leido");
            pst.setString(7, fecha);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Envio exitoso");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al enviar");
            ex.printStackTrace();
        }
            
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM draft WHERE id='"+row+"'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se envio correo exitosamente.");
        } catch (HeadlessException | SQLException ee) {
            ee.printStackTrace();
        }
        
        row--;
        DefaultTableModel m = (DefaultTableModel) tablaDrafts.getModel();
        m.removeRow(row);
        tablaDrafts.setModel(m);
    }//GEN-LAST:event_jb_enviarDraftComoCorreoMouseClicked

    private void jmi_asuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_asuntoActionPerformed
        // TODO add your handling code here:
        String asuntoSpam = JOptionPane.showInputDialog("Ingresa el asunto de correo que desees para "
                + "no recibir correos de este tipo.");
        int resp = JOptionPane.showConfirmDialog(this, "Todos los correos recibidos con el asunto "+asuntoSpam
                + " se enviaran a la carpeta spam.","Confirm",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.OK_OPTION){
            //move el correo de tabla correo a tabla spam.
            //primero guardar los datos del correo, luego enviarlos a spam y borrarlos del correo.
            //luego ver que podemos hacer para que cuando caiga algo de esta direccion se vaya a spaam.
            String sql = "select * from correo where asunto='"+asuntoSpam+"' and correoReceptor='"+actual.getCorreo()+"'";
            String correoReceptor="",correoEmisor="",asunto="",cuerpo="",nombreEmisor="",tipo="",fecha="";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos[] = new String[7];
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(8);
                }
                correoReceptor = datos[0];
                asunto = datos[1];
                cuerpo = datos[2];
                correoEmisor = datos[3];
                nombreEmisor = datos[4];
                tipo = datos[5];
                fecha = datos[6];
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            //si bloqueo a alguien es pq el me envia cosas.. el es mi emisor y yo el receptor.
            
            try {
                PreparedStatement pst = cn.prepareStatement("INSERT INTO spam(correoBloqueado,pertenecienteCorreo,asunto,cuerpo,tipo,fecha,nombreBloqueado) VALUES(?,?,?,?,?,?,?)");
                pst.setString(1, correoEmisor);
                pst.setString(2, correoReceptor);
                pst.setString(3, asunto);
                pst.setString(4, cuerpo);
                pst.setString(5, tipo);
                pst.setString(6, fecha);
                pst.setString(7, nombreEmisor);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Envio exitoso");
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al enviar");
                ex.printStackTrace();
            }

            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM correo WHERE asunto='" +asuntoSpam+"' and correoReceptor='"+actual.getCorreo()+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se envio correo exitosamente.");
            } catch (HeadlessException | SQLException ee) {
                ee.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jmi_asuntoActionPerformed

    private void jmi_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_fechaActionPerformed
        // TODO add your handling code here:
        String fechaSpam = JOptionPane.showInputDialog("Ingresa la fecha en formato (yyyy-mm-dd) para no recibir "
                + "correos de ese dia.");
        int resp = JOptionPane.showConfirmDialog(this, "Todos los correos recibidos en la fecha "+fechaSpam
                + " se enviaran a la carpeta spam.","Confirm",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.OK_OPTION){
            //move el correo de tabla correo a tabla spam.
            //primero guardar los datos del correo, luego enviarlos a spam y borrarlos del correo.
            //luego ver que podemos hacer para que cuando caiga algo de esta direccion se vaya a spaam.
            String sql = "select * from correo where fecha='"+fechaSpam+"' and correoReceptor='"+actual.getCorreo()+"'";
            String correoReceptor="",correoEmisor="",asunto="",cuerpo="",nombreEmisor="",tipo="",fecha="";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos[] = new String[7];
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(8);
                }
                correoReceptor = datos[0];
                asunto = datos[1];
                cuerpo = datos[2];
                correoEmisor = datos[3];
                nombreEmisor = datos[4];
                tipo = datos[5];
                fecha = datos[6];
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            //si bloqueo a alguien es pq el me envia cosas.. el es mi emisor y yo el receptor.
            
            try {
                PreparedStatement pst = cn.prepareStatement("INSERT INTO spam(correoBloqueado,pertenecienteCorreo,asunto,cuerpo,tipo,fecha,nombreBloqueado) VALUES(?,?,?,?,?,?,?)");
                pst.setString(1, correoEmisor);
                pst.setString(2, correoReceptor);
                pst.setString(3, asunto);
                pst.setString(4, cuerpo);
                pst.setString(5, tipo);
                pst.setString(6, fecha);
                pst.setString(7, nombreEmisor);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Envio exitoso");
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al enviar");
                ex.printStackTrace();
            }

            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM correo WHERE fecha='" +fechaSpam+"' and correoReceptor='"+actual.getCorreo()+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se borro correo exitosamente.");
            } catch (HeadlessException | SQLException ee) {
                ee.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jmi_fechaActionPerformed

    private void jmi_corroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_corroeActionPerformed
        // TODO add your handling code here:
        String correoSpam = JOptionPane.showInputDialog("Ingresa la direccion de correo que desees para "
                + "no recibir correos de esta persona");
        int resp = JOptionPane.showConfirmDialog(this, "Todos los correos recibidos por la direccion "+correoSpam
                + " se enviaran a la carpeta spam.","Confirm",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.OK_OPTION){
            //move el correo de tabla correo a tabla spam.
            //primero guardar los datos del correo, luego enviarlos a spam y borrarlos del correo.
            //luego ver que podemos hacer para que cuando caiga algo de esta direccion se vaya a spaam.
            String sql = "select * from correo where correoEmisor='"+correoSpam+"' and correoReceptor='"+actual.getCorreo()+"'";
            String correoReceptor="",correoEmisor="",asunto="",cuerpo="",nombreEmisor="",tipo="",fecha="";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos[] = new String[7];
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(8);
                }
                correoReceptor = datos[0];
                asunto = datos[1];
                cuerpo = datos[2];
                correoEmisor = datos[3];
                nombreEmisor = datos[4];
                tipo = datos[5];
                fecha = datos[6];
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            //si bloqueo a alguien es pq el me envia cosas.. el es mi emisor y yo el receptor.
            
            try {
                PreparedStatement pst = cn.prepareStatement("INSERT INTO spam(correoBloqueado,pertenecienteCorreo,asunto,cuerpo,tipo,fecha,nombreBloqueado) VALUES(?,?,?,?,?,?,?)");
                pst.setString(1, correoEmisor);
                pst.setString(2, correoReceptor);
                pst.setString(3, asunto);
                pst.setString(4, cuerpo);
                pst.setString(5, tipo);
                pst.setString(6, fecha);
                pst.setString(7, nombreEmisor);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Envio exitoso");
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al enviar");
                ex.printStackTrace();
            }

            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM correo WHERE correoEmisor='" +correoSpam+"' and correoReceptor='"+actual.getCorreo()+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se envio correo exitosamente.");
            } catch (HeadlessException | SQLException ee) {
                ee.printStackTrace();
            }
        
        }
        
       /* row--;
        DefaultTableModel m = (DefaultTableModel) tablaDrafts.getModel();
        m.removeRow(row);
        tablaDrafts.setModel(m);*/
    }//GEN-LAST:event_jmi_corroeActionPerformed

    private void jl_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cuentaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jl_cuentaMouseClicked

    private void jb_moverContactoaContactoFavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_moverContactoaContactoFavMouseClicked
        //verificar que el contacto no este en la lista. 
        boolean yaExiste=false;
        String nombreComparar="";
        int row = tablaContactos.getSelectedRow();
            row++;
            String sql = "Select nombreCompleto from contactos where id='" + row + "'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nombreComparar = rs.getString(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
         sql = "select nombreCompleto from contactosFavoritos";
         try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    if (nombreComparar.equals(rs.getString(1))) {
                        yaExiste=true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        if (tablaContactos.getSelectedRow()>=0 && yaExiste==false) {
            row++;
            String nombreCompleto = "", correo = "", pertenecienteCorreo = "";
            sql = "Select * from contactos where id='" + row + "'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos[] = new String[3];
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                }
                nombreCompleto = datos[0];
                correo = datos[1];
                pertenecienteCorreo = datos[2];
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                PreparedStatement pst = cn.prepareStatement("INSERT INTO contactosFavoritos(nombreCompleto,correo,pertenecienteCorreo) VALUES(?,?,?)");
                pst.setString(1, nombreCompleto);
                pst.setString(2, correo);
                pst.setString(3, pertenecienteCorreo);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Envio exitoso");
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al enviar");
                ex.printStackTrace();
            }

            DefaultTableModel m = (DefaultTableModel) tablaContactosFavoritos.getModel();
            String sql2 = "select * from contactosFavoritos";
            String datos[] = new String[3];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql2);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    m.addRow(datos);
                }
                tablaContactosFavoritos.setModel(m);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else if (tablaContactos.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar un contacto para agregarlo a contactos favoritos.");
        }else if (yaExiste){
            JOptionPane.showMessageDialog(null,"Ya existe este contacto en tu lista de favoritos.");
        }
        
    }//GEN-LAST:event_jb_moverContactoaContactoFavMouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(showContacts);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex()==1) {
            tablaContactosFavoritos.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Nombre ", "Correo"
                    }
            ));
            
            
            DefaultTableModel m = (DefaultTableModel) tablaContactosFavoritos.getModel();
            String sql = "select * from contactosFavoritos";
            String datos[] = new String[3];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    m.addRow(datos);
                }
                tablaContactosFavoritos.setModel(m);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
         
         
         DefaultTableModel m2 = (DefaultTableModel) tablaMisGrupos.getModel();
         String sql2 = "select nombredelGrupo from nombreGrupos";
         String datos2[] = new String[1];
         try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql2);
                while (rs.next()) {
                    datos2[0] = rs.getString(1);
                    m2.addRow(datos2);
                }
                tablaMisGrupos.setModel(m2);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void showContactsWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_showContactsWindowOpened
        // TODO add your handling code here:
        DefaultTableModel m = (DefaultTableModel) tablaContactos.getModel();
            String sql = "select * from contactos";
            String datos[] = new String[3];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    m.addRow(datos);
                }
                tablaContactos.setModel(m);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_showContactsWindowOpened

    private void jb_crearGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearGrupoMouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(jd_crearGrupo);
    }//GEN-LAST:event_jb_crearGrupoMouseClicked

    private void jd_crearGrupoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_crearGrupoWindowOpened
        // TODO add your handling code here:
        if (esCrud==false) {
            jb_agregarParticipante1.setVisible(false);
            DefaultTableModel m = (DefaultTableModel) tablaContactosFavoritos1.getModel();
            String sql = "select * from contactosFavoritos";
            String datos[] = new String[3];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    m.addRow(datos);
                }
                tablaContactosFavoritos1.setModel(m);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            for (int i = 0; i < tablaContactosFavoritos1.getRowCount(); i++) {
            tablaContactosFavoritos1.setValueAt(false, i, 2);
            }
        }else if (esCrud){  
            ArrayList<String> temp = new ArrayList();
            String nombreGrupo = jl_nombreGrupoCRUD.getText();
            String sql = "select * from gruposContactosFavoritos where nombreGrupo='" + nombreGrupo + "'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp.add(rs.getString(3));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            DefaultTableModel m = (DefaultTableModel) tablaContactosFavoritos1.getModel();
            sql = "select * from contactosFavoritos";
            String datos[] = new String[3];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    if (!temp.contains(rs.getString(2))) {
                        datos[0] = rs.getString(1);
                        datos[1] = rs.getString(2);
                        m.addRow(datos);
                    }
                }
                tablaContactosFavoritos1.setModel(m);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            jb_agregarParticipante1.setVisible(true);
            for (int i = 0; i < tablaContactosFavoritos1.getRowCount(); i++) {
                tablaContactosFavoritos1.setValueAt(false, i, 2);
            }
        }else if(esReunion){
            jl_esconder.setText("Ingrese nombre para la reunion:");
            jl_cambiar.setText("Lista de Contactos");
            jb_agregarParticipante1.setVisible(false);
            
            ArrayList<String> temp = new ArrayList();
            String nombreReunion = jl_nombreGrupoCRUD.getText();
            String sql = "select * from grupoReuniones where nombreReunion='" + nombreReunion + "'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp.add(rs.getString(3));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
             DefaultTableModel m = (DefaultTableModel) tablaContactosFavoritos1.getModel();
            sql = "select * from contactos where pertenecienteCorreo='"+actual.getCorreo()+"'";
            String datos[] = new String[3];
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    if (!temp.contains(rs.getString(3))) {
                        datos[0] = rs.getString(2);
                        datos[1] = rs.getString(3);
                        m.addRow(datos);
                    }
                }
                tablaContactosFavoritos1.setModel(m);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            jb_agregarParticipante1.setVisible(true);
            for (int i = 0; i < tablaContactosFavoritos1.getRowCount(); i++) {
                tablaContactosFavoritos1.setValueAt(false, i, 2);
            }
        }


    }//GEN-LAST:event_jd_crearGrupoWindowOpened

    private void tablaContactosFavoritos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContactosFavoritos1MouseClicked
        // TODO add your handling code here:
        tablaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Seleccionados"
                }
        ));

        DefaultTableModel m = (DefaultTableModel) tablaSeleccionados.getModel();
        ArrayList<Integer> temp = new ArrayList();
        String row[] = new String[1];
        boolean valor = false;
        for (int i = 0; i < tablaContactosFavoritos1.getRowCount(); i++) {
            valor = (Boolean) tablaContactosFavoritos1.getValueAt(i, 2);
            if (valor && !temp.contains(i)) {
                temp.add(i);
                row[0] = String.valueOf(tablaContactosFavoritos1.getValueAt(i, 0));
                m.addRow(row);

            }
        }
    }//GEN-LAST:event_tablaContactosFavoritos1MouseClicked

    private void jb_crearGrupoVerdaderoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearGrupoVerdaderoMouseClicked
        // TODO add your handling code here:
        //para cada row en tablaSeleccionada vamos a guardarlo a la base de datos en la tabla gruposContactosFavrotios.
        String nombreGrupo,nombreReunion, nombrePersona, correoPersona;
        
        if (!tf_nombreGrupo.equals("")) {
            if (esReunion) {
                if (!tf_nombreGrupo.equals("") && esReunion) {
                    JOptionPane.showMessageDialog(null, "entro a reunion");
                    for (int i = 0; i < tablaSeleccionados.getRowCount(); i++) {
                        nombrePersona = String.valueOf(tablaSeleccionados.getValueAt(i, 0));
                        String sql = "select correo from contactos where nombreCompleto='" + nombrePersona + "'";

                        try {
                            Statement st = cn.createStatement();
                            ResultSet rs = st.executeQuery(sql);
                            while (rs.next()) {
                                guardarCorreosTemp.add(rs.getString(1));
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }

                    try {
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO nombreReunion(nombredelaReunion) VALUES(?)");
                        pst.setString(1, tf_nombreGrupo.getText());
                        pst.executeUpdate();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al agregar");
                        e.printStackTrace();
                    }
                    DefaultTableModel m = (DefaultTableModel) tablaMisGrupos.getModel();
                    String datos[] = new String[1];
                    for (int i = 0; i < tablaSeleccionados.getRowCount(); i++) {
                        try {
                            PreparedStatement pst = cn.prepareStatement("INSERT INTO infoPersonasReunion(nombreReunion,nombrePersona,correoPersona) VALUES(?,?,?)");
                            pst.setString(1, tf_nombreGrupo.getText());
                            pst.setString(2, String.valueOf(tablaSeleccionados.getValueAt(i, 0)));
                            pst.setString(3, guardarCorreosTemp.get(i));
                            pst.executeUpdate();
                            datos[0] = tf_nombreGrupo.getText();
                            m.addRow(datos);
                            JOptionPane.showMessageDialog(null, "Registro exitoso");

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error al agregar");
                            e.printStackTrace();
                        }
                    }
                    tf_para.setText(tf_nombreGrupo.getText());
                    tablaMisGrupos.setModel(m);
                    tf_nombreGrupo.setText("");
                    tablaContactosFavoritos1.clearSelection();
                    tablaSeleccionados.clearSelection();
                }
            }
            if (esReunion==false){
                for (int i = 0; i < tablaSeleccionados.getRowCount(); i++) {
                    nombrePersona = String.valueOf(tablaSeleccionados.getValueAt(i, 0));
                    String sql = "select correo from contactosFavoritos where nombreCompleto='" + nombrePersona + "'";

                    try {
                        Statement st = cn.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            guardarCorreosTemp.add(rs.getString(1));
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }

                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO nombreGrupos(nombredelGrupo) VALUES(?)");
                    pst.setString(1, tf_nombreGrupo.getText());
                    pst.executeUpdate();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al agregar");
                    e.printStackTrace();
                }
                DefaultTableModel m = (DefaultTableModel) tablaMisGrupos.getModel();
                String datos[] = new String[1];
                for (int i = 0; i < tablaSeleccionados.getRowCount(); i++) {
                    try {
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO gruposContactosFavoritos(nombreGrupo,nombrePersona,correoPersona) VALUES(?,?,?)");
                        pst.setString(1, tf_nombreGrupo.getText());
                        pst.setString(2, String.valueOf(tablaSeleccionados.getValueAt(i, 0)));
                        pst.setString(3, guardarCorreosTemp.get(i));
                        pst.executeUpdate();
                        datos[0] = tf_nombreGrupo.getText();
                        m.addRow(datos);
                        JOptionPane.showMessageDialog(null, "Registro exitoso");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al agregar");
                        e.printStackTrace();
                    }
                }
                tablaMisGrupos.setModel(m);
                tf_nombreGrupo.setText("");
                tablaContactosFavoritos1.clearSelection();
                tablaSeleccionados.clearSelection();
            }
            
        }else
            JOptionPane.showMessageDialog(null, "Tiene que ingresar nombre del grupo para crear su grupo.");
     
        
        
    }//GEN-LAST:event_jb_crearGrupoVerdaderoMouseClicked

    private void jb_verInfoGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_verInfoGrupoMouseClicked
        // TODO add your handling code here:
        String nombreGrupo="";
        int row =tablaMisGrupos.getSelectedRow();
        if (row>=0) {
            row++;
            String sql = "select nombredelGrupo from nombreGrupos where id='"+row+"'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                   nombreGrupo = rs.getString(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            jl_nombreGrupo.setText(nombreGrupo);
            
            DefaultTableModel m = (DefaultTableModel) tablaParticipantes.getModel();
            sql = "select * from gruposContactosFavoritos where nombreGrupo='"+nombreGrupo+"'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos [] = new String[2];
                while (rs.next()) {
                   datos[0] = rs.getString(2);
                   datos[1] = rs.getString(3);
                }
             m.addRow(datos);
             tablaParticipantes.setModel(m);
            } catch (Exception e) {
                e.printStackTrace();
            }
            mostrosJDialogs(jd_verInfoGrupo);
        }else
            JOptionPane.showMessageDialog(null, "Seleccione fila para ver informacion del grupo.");
    }//GEN-LAST:event_jb_verInfoGrupoMouseClicked

    private void jb_modificarNombreGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarNombreGrupoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_modificarNombreGrupoMouseClicked

    private void jb_eliminarGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarGrupoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_eliminarGrupoMouseClicked

    private void jb_modificarGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarGrupoMouseClicked
        // TODO add your handling code here:
         String nombreGrupo="";
        int row =tablaMisGrupos.getSelectedRow();
        if (row>=0) {
            mostrosJDialogs(moduloCRUDGrupos);
        }else
            JOptionPane.showMessageDialog(null, "Seleccione fila para ver informacion del grupo.");
    }//GEN-LAST:event_jb_modificarGrupoMouseClicked

    private void jb_agregarParticipantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarParticipantMouseClicked
        // TODO add your handling code here:
        jl_esconder.setVisible(false);
        jl_nombreGrupo.setVisible(false);
        jb_crearGrupoVerdadero.setVisible(false);
        jb_agregarParticipante1.setVisible(true);
        mostrosJDialogs(jd_crearGrupo);
    }//GEN-LAST:event_jb_agregarParticipantMouseClicked

    private void jb_agregarParticipante1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarParticipante1MouseClicked
        // TODO add your handling code here:
        
        /*
        voy a seleccionar todos los correos de las personas que estan en el grupo.
        guardarlas en un arraylist.
        despues recorrer la tabla de contactos y solo agregar 
        a esa tabla los contactos que no esten en el arraylist.
        despues hacer metodo para agregar esos contactos en seleccionados
        y los seleccionados agregarlos a la tabla como particpantes.
        */
        
            
            String nombrePersona="";
            for (int i = 0; i < tablaSeleccionados.getRowCount(); i++) {
                nombrePersona = String.valueOf(tablaSeleccionados.getValueAt(i, 0));
                String sql = "select correo from contactosFavoritos where nombreCompleto='" + nombrePersona + "'";

                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        guardarCorreosTemp.add(rs.getString(1));
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            String nombreGrupo = jl_nombreGrupoCRUD.getText();
           DefaultTableModel m = (DefaultTableModel) tablaParticipantes1.getModel();
           String datos[] = new String[2];
            for (int i = 0; i < tablaSeleccionados.getRowCount(); i++) {
                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO gruposContactosFavoritos(nombreGrupo,nombrePersona,correoPersona) VALUES(?,?,?)");
                    pst.setString(1, nombreGrupo);
                    pst.setString(2, String.valueOf(tablaSeleccionados.getValueAt(i, 0)));
                    pst.setString(3, guardarCorreosTemp.get(i));
                    datos[0]=String.valueOf(tablaSeleccionados.getValueAt(i, 0));
                    datos[1]=guardarCorreosTemp.get(i);
                    m.addRow(datos);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro exitoso");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al agregar");
                    e.printStackTrace();
                }

            }
            tablaParticipantes1.setModel(m);
            
         
    }//GEN-LAST:event_jb_agregarParticipante1MouseClicked

    private void moduloCRUDGruposWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_moduloCRUDGruposWindowOpened
        // TODO add your handling code here:
        String nombreGrupo="";
        int row =tablaMisGrupos.getSelectedRow();
        if (row>=0) {
            tablaParticipantes1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Nombre", "Correo"
                    }
            ));
            esCrud=true;
            row++;
            String sql = "select nombredelGrupo from nombreGrupos where id='"+row+"'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                   nombreGrupo = rs.getString(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            jl_nombreGrupoCRUD.setText(nombreGrupo);
            
            DefaultTableModel m = (DefaultTableModel) tablaParticipantes1.getModel();
            sql = "select * from gruposContactosFavoritos where nombreGrupo='"+nombreGrupo+"'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String datos [] = new String[2];
                while (rs.next()) {
                   datos[0] = rs.getString(2);
                   datos[1] = rs.getString(3);
                }
             m.addRow(datos);
             tablaParticipantes1.setModel(m);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_moduloCRUDGruposWindowOpened

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if (tablaMisGrupos.getSelectedRow()>=0) {
            int row = tablaMisGrupos.getSelectedRow();
            String nombreGrupo = String.valueOf(tablaMisGrupos.getValueAt(row,0));
            int resp = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar el grupo seleccionado?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.OK_OPTION) {
                try {
                    DefaultTableModel m = (DefaultTableModel) tablaMisGrupos.getModel();
                    Statement st = null;
                    st = cn.createStatement();
                    st.executeUpdate("DELETE from gruposContactosFavoritos Where nombreGrupo='" + nombreGrupo + "'");
                    st.executeUpdate("DELETE from nombreGrupos Where nombredelGrupo='" + nombreGrupo + "'");
                    m.removeRow(row);
                    tablaMisGrupos.setModel(m);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else
            JOptionPane.showMessageDialog(null, "seleccione una fila de la mis grupos para poder eliminar alguno.");
    }//GEN-LAST:event_jButton5MouseClicked

    private void jl_showSpamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_showSpamMouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(showSpam);
    }//GEN-LAST:event_jl_showSpamMouseClicked

    private void showSpamWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_showSpamWindowOpened
        // TODO add your handling code here:
        String sql = "select * from spam where pertenecienteCorreo='"+actual.getCorreo()+"'";
        String datos [] = new String [4];
        DefaultTableModel m = (DefaultTableModel) tablaSpam.getModel();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(8);
                datos[1] = rs.getString(1);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(7);
                m.addRow(datos);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        tablaSpam.setModel(m);
    }//GEN-LAST:event_showSpamWindowOpened

    private void jl_reunionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_reunionMouseClicked
        // TODO add your handling code here:
        mostrosJDialogs(moduloReuniones);
    }//GEN-LAST:event_jl_reunionMouseClicked

    private void jb_paraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_paraMouseClicked
        //set la tabla false
        esReunion=true;
        mostrosJDialogs(jd_crearGrupo);
        
    }//GEN-LAST:event_jb_paraMouseClicked

    private void moduloReunionesWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_moduloReunionesWindowOpened
        // TODO add your handling code here:
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        SpinnerDateModel model = new SpinnerDateModel();
        model.setValue(calendar.getTime());

       // JSpinner spinner = new JSpinner(model);
    }//GEN-LAST:event_moduloReunionesWindowOpened

    private void jb_enviarReunionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_enviarReunionMouseClicked
        // TODO add your handling code here:
        String nombreReunion = tf_para.getText();
        String asunto = tf_asuntoReunion.getText();
        String ubicacion = tf_ubicacionReunion.getText();
        //java.util.Date  inicioFecha0 = (Date) spinner_inicio.getValue();
        //java.sql.Date inicioFecha = new java.sql.Date(inicioFecha0.getTime());
        //java.util.Date utilStartDate = jDateChooserStart.getDate();
        //java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        //java.util.Date finFecha0 = (Date) spinner_final.getValue();
        //java.sql.Date finFecha = new java.sql.Date(finFecha0.getTime());
        //new java.sql.Date(((Date)spinner_final.getValue()))
        
        String hora = Hora.getText();
        String minuto = Minuto.getText();
//        Date fechaCreacion = (Date) jCalendar1.getDate();
        //df.format(fecha)
        
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO grupoReuniones(nombreReunion,asunto,ubicacion,inicioFecha,finFecha,hora,minuto,fechaCreacion) VALUES(?,?,?,?,?,?,?,?)");
            pst.setString(1, tf_para.getText());
            pst.setString(2, tf_asuntoReunion.getText());
            pst.setString(3,tf_ubicacionReunion.getText());
            pst.setDate(4,  df.format(new java.sql.Date(((Date)spinner_inicio.getValue()))));
            pst.setDate(5, df.format( new java.sql.Date(((Date)spinner_final.getValue()))) );
            pst.setString(6, Hora.getText());
            pst.setString(7, Minuto.getText());
            pst.setDate(8, new java.sql.Date(((Date)jCalendar1.getDate())));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
               
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al agregar");
             e.printStackTrace();
        } 
        
    }//GEN-LAST:event_jb_enviarReunionMouseClicked

  
  
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
            java.util.logging.Logger.getLogger(principalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalProyecto().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Estado;
    private javax.swing.JLabel Estado2;
    private javax.swing.JTextField Hora;
    private javax.swing.JTextField Minuto;
    private javax.swing.JComboBox<String> cb_correosContactos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb_agregarContacto;
    private javax.swing.JButton jb_agregarParticipant;
    private javax.swing.JButton jb_agregarParticipante1;
    private javax.swing.JButton jb_borrarTrash;
    private javax.swing.JButton jb_buscarDirectorioCorreo;
    private javax.swing.JButton jb_cancelModificarCorreo;
    private javax.swing.JButton jb_correoCRUD;
    private javax.swing.JButton jb_correoEliminar;
    private javax.swing.JButton jb_crearGrupo;
    private javax.swing.JButton jb_crearGrupoVerdadero;
    private javax.swing.JButton jb_crudCorreo1;
    private javax.swing.JButton jb_discardDraft;
    private javax.swing.JButton jb_eliminarCorreo;
    private javax.swing.JButton jb_eliminarGrupo;
    private javax.swing.JButton jb_eliminarParticipante;
    private javax.swing.JButton jb_enabledBottonContacto;
    private javax.swing.JButton jb_enviarCorreo;
    private javax.swing.JButton jb_enviarCorreoAdmin;
    private javax.swing.JButton jb_enviarDraftComoCorreo;
    private javax.swing.JButton jb_enviarNuevoCorreo;
    private javax.swing.JButton jb_enviarReunion;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_modificarCorreo;
    private javax.swing.JButton jb_modificarGrupo;
    private javax.swing.JButton jb_modificarNombreGrupo;
    private javax.swing.JButton jb_moverContactoaContactoFav;
    private javax.swing.JButton jb_para;
    private javax.swing.JLabel jb_regresarModuAdmin;
    private javax.swing.JButton jb_regristrar;
    private javax.swing.JButton jb_saveDraft;
    private javax.swing.JButton jb_verInfoGrupo;
    private javax.swing.JComboBox<String> jcb_directorioCorreo;
    private javax.swing.JDialog jd_bienvenido;
    private javax.swing.JDialog jd_crearGrupo;
    private javax.swing.JDialog jd_listarDirectorioAdmin;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_modificarAccountCorreo;
    private javax.swing.JDialog jd_regristrar;
    private javax.swing.JDialog jd_verInfoGrupo;
    private javax.swing.JLabel jl_agregarContactos;
    private javax.swing.JLabel jl_apellidoCRUD;
    private javax.swing.JLabel jl_cambiar;
    private javax.swing.JLabel jl_chat;
    private javax.swing.JLabel jl_contraCRUD;
    private javax.swing.JLabel jl_correo;
    private javax.swing.JLabel jl_correoCRUD;
    private javax.swing.JLabel jl_correoContacto;
    private javax.swing.JLabel jl_cuenta;
    private javax.swing.JLabel jl_draft;
    private javax.swing.JLabel jl_esconder;
    private javax.swing.JLabel jl_listarDirectorioA;
    private javax.swing.JLabel jl_listarDirectorioCorreoE;
    private javax.swing.JLabel jl_listarDirectoriocorreoR;
    private javax.swing.JLabel jl_login;
    private javax.swing.JLabel jl_nombreCRUD;
    private javax.swing.JLabel jl_nombreContacto;
    private javax.swing.JLabel jl_nombreGrupo;
    private javax.swing.JLabel jl_nombreGrupoCRUD;
    private javax.swing.JLabel jl_reunion;
    private javax.swing.JLabel jl_sentMail;
    private javax.swing.JLabel jl_showContacts;
    private javax.swing.JList<String> jl_showCorreoCuerpo;
    private javax.swing.JLabel jl_showSpam;
    private javax.swing.JLabel jl_tarea;
    private javax.swing.JLabel jl_trash;
    private javax.swing.JLabel jl_verInbox;
    private javax.swing.JMenuItem jmi_asunto;
    private javax.swing.JMenuItem jmi_borrarCorreo;
    private javax.swing.JMenuItem jmi_corroe;
    private javax.swing.JMenuItem jmi_crearCorreo;
    private javax.swing.JMenuItem jmi_fecha;
    private javax.swing.JMenuItem jmi_modificarCorreo;
    private javax.swing.JTable jt_tablaDirectorioCorreo;
    private javax.swing.JDialog moduloAdmin;
    private javax.swing.JDialog moduloBandejas;
    private javax.swing.JDialog moduloCRUDCorreos;
    private javax.swing.JDialog moduloCRUDGrupos;
    private javax.swing.JDialog moduloChats;
    private javax.swing.JDialog moduloLecturaCorreo;
    private javax.swing.JDialog moduloReuniones;
    private javax.swing.JDialog moduloTareas;
    private javax.swing.JPanel panelShowInbox;
    private javax.swing.JPanel panelUniverso;
    private javax.swing.JPopupMenu pop_correosModificarBorrarCrear;
    private javax.swing.JDialog redactarCorreo;
    private javax.swing.JDialog showChats;
    private javax.swing.JDialog showContacts;
    private javax.swing.JDialog showDrafts;
    private javax.swing.JDialog showInbox;
    private javax.swing.JDialog showSentMail;
    private javax.swing.JDialog showSpam;
    private javax.swing.JDialog showTask;
    private javax.swing.JDialog showTrash;
    private javax.swing.JSpinner spinner_final;
    private javax.swing.JSpinner spinner_inicio;
    private javax.swing.JTable tablaContactos;
    private javax.swing.JTable tablaContactosFavoritos;
    private javax.swing.JTable tablaContactosFavoritos1;
    private javax.swing.JTable tablaDrafts;
    private javax.swing.JTable tablaInbox;
    private javax.swing.JTable tablaMisGrupos;
    private javax.swing.JTable tablaParticipantes;
    private javax.swing.JTable tablaParticipantes1;
    private javax.swing.JTable tablaSeleccionados;
    private javax.swing.JTable tablaSentMail;
    private javax.swing.JTable tablaSpam;
    private javax.swing.JTable tablaTrash;
    private javax.swing.JTextArea textAreaCorreo1;
    private javax.swing.JTextField tf_apellido1;
    private javax.swing.JTextField tf_asunto;
    private javax.swing.JTextField tf_asuntoReunion;
    private javax.swing.JTextField tf_contra1;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_correoContacto;
    private javax.swing.JTextField tf_modificarA;
    private javax.swing.JTextField tf_modificarC;
    private javax.swing.JTextField tf_modificarContra;
    private javax.swing.JTextField tf_modificarN;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_nombreContacto;
    private javax.swing.JTextField tf_nombreGrupo;
    private javax.swing.JTextField tf_para;
    private javax.swing.JPasswordField tf_pass;
    private javax.swing.JTextField tf_pregunta;
    private javax.swing.JTextField tf_respuesta;
    private javax.swing.JTextField tf_ubicacionReunion;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_user1;
    // End of variables declaration//GEN-END:variables
}
