/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/*import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.List;
 import javax.swing.JOptionPane;*/
import java.awt.Color;
import logica.LogicaApellido;
import logica.LogicaColor;
import logica.LogicaFruta;
import logica.LogicaJuego;
import logica.LogicaJugador;
import logica.LogicaNombre;
import logica.LogicaPais;
import clases.Animal;
import logica.LogicaAnimal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class StopCliente extends javax.swing.JFrame {

    LogicaAnimal mianimal = new LogicaAnimal();
    LogicaApellido miapellido = new LogicaApellido();
    LogicaColor micolor = new LogicaColor();
    LogicaFruta mifruta = new LogicaFruta();
    LogicaNombre minombre = new LogicaNombre();
    LogicaPais mipais = new LogicaPais();
    LogicaJuego mijuego = new LogicaJuego();
    LogicaJugador mijugador = new LogicaJugador();
     boolean inicioJuego = true;
     
    
    //AQUI INICIA EL CODIGO DEL CRONOMETRO
    private Timer t;
    private int m, s, cs;
    private ActionListener acciones = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs; 
            if(cs==60){
                cs = 0;
                ++s;
            }
            if(s==60) 
            {
                s = 0;
                ++m;
            }
            if(m==60)
            {
                m = 0;                
            }
            actualizarLabel();
            
              if(m ==1){
            inicioJuego = false;
            JOptionPane.showMessageDialog(btnStop, "EL TIEMPO SE ACABO");
            t.stop();
            m = 0;
            cs = 0;
            s = 0;
            
    }
            
            
        }
        
        
      
    };
    
    
    //AQUI INICIA EL PARO POR TIEMPO Y MANUAL
    
    private void pararJugada(){
        //MODO MANUAL 
        boolean inicioJuego;
        //MODO POR TIEMPO
        
    }
    
    
    
    
    private void actualizarLabel() {
        String tiempo = (m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        txtTiempo.setText(tiempo);
    }
     
    
    //AQUI INICIA LA VERIFICACION DE LA PRIMERA LETRA SIN REPETIR
    boolean error = false;

    char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    int[] esta = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char letra;
    int cont = 0;

    public void generarletra() {
        int azar;
        boolean repite = true; 
        while (repite && cont < 26) {
            azar = (int) (Math.random() * 26);
            System.out.println("El azar es" + azar);
            if (esta[azar] == 0) {
                letra = letras[azar];
                System.out.println("Letra escogida " + letras[azar]);
                esta[azar] = 1;
                cont++;
                repite = false;

            }
            

        }
       
        System.out.println("Sale del ciclo");
    }

    /**
     * Creates new form Stop
     */
    public StopCliente() {
        initComponents();
        setLocationRelativeTo(null);
        t = new Timer(10, acciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jTextFieldFruta = new javax.swing.JTextField();
        jTextFieldAnimal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JlabelLetra = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        jTextFieldNom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("juego stop");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre Del Jugador");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 0, 255));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        jButtonAgregar.setBorderPainted(false);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(106, 106, 106))
        );

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Jugadores Y Puntajes");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Núnero de ronda:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Letra", "Nombre", "Apellido", "Pais", "Color", "Fruta", "Animal", "Puntaje"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextFieldApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldApellidoFocusLost(evt);
            }
        });

        jTextFieldColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldColorFocusLost(evt);
            }
        });

        jTextFieldPais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPaisFocusLost(evt);
            }
        });

        jTextFieldFruta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFrutaFocusLost(evt);
            }
        });

        jTextFieldAnimal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAnimalFocusLost(evt);
            }
        });
        jTextFieldAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnimalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Apellido");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Pais");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Color");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Fruta");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Animal");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Puntaje");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("La Letra es:");

        JlabelLetra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JlabelLetra.setForeground(new java.awt.Color(0, 153, 153));
        JlabelLetra.setText("A");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("TIEMPO:");

        txtTiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 0, 51));
        txtTiempo.setText("00");

        btnStop.setBackground(new java.awt.Color(255, 0, 0));
        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/372raisedhand2_100287.png"))); // NOI18N
        btnStop.setToolTipText("GANE");
        btnStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jTextFieldNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNomFocusLost(evt);
            }
        });
        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTiempo))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(JlabelLetra)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel8)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel9)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel10)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel11)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(52, 52, 52)))
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17)))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtTiempo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JlabelLetra)
                                .addGap(18, 18, 18)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnimalActionPerformed

    }//GEN-LAST:event_jTextFieldAnimalActionPerformed
   
    private void jTextFieldAnimalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAnimalFocusLost
        // en este metodo cuando escrivimos en el jtexfaildAnimal al perder el foco o cambiar de cuadro se activa verificar si la palabar esta en la base de datos
        if(inicioJuego == true){
        if(jTextFieldAnimal.getText().equals("")){
             jTextFieldAnimal.setBackground(Color.red);
            jTextFieldAnimal.setForeground(Color.white);
            error = true;
        }
        else if (jTextFieldAnimal.getText().toUpperCase().charAt(0) != letra) {
            jTextFieldAnimal.setBackground(Color.red);
            jTextFieldAnimal.setForeground(Color.white);
            error = true;
        } else {

            String palabra = jTextFieldAnimal.getText().toUpperCase();
            if (mianimal.VerificarAnimal(palabra)) {
                jTextFieldAnimal.setBackground(new Color(20, 127, 109));
                jTextFieldAnimal.setForeground(Color.white);
                error = false;
            } else {
                jTextFieldAnimal.setBackground(Color.red);
                jTextFieldAnimal.setForeground(Color.white);
                error = true;
            }
        }
        }
    }//GEN-LAST:event_jTextFieldAnimalFocusLost

    private void jTextFieldFrutaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFrutaFocusLost
        // en este metodo cuando escrivimos en el jtexfaildFruta al perder el foco o cambiar de cuadro se activa verificar si la palabar esta en la base de datos
       if(inicioJuego == true){
        if (jTextFieldFruta.getText().toUpperCase().charAt(0) != letra) {
            jTextFieldFruta.setBackground(Color.red);
            jTextFieldFruta.setForeground(Color.white);
            error = true;
        } else {

            String palabra = jTextFieldFruta.getText().toUpperCase();
            if (mifruta.VerificarFruta(palabra)) {
                jTextFieldFruta.setBackground(new Color(20, 127, 109));
                jTextFieldFruta.setForeground(Color.white);
                error = false;
            } else {
                jTextFieldFruta.setBackground(Color.red);
                jTextFieldFruta.setForeground(Color.white);
                error = true;
            }
        }
        }
    }//GEN-LAST:event_jTextFieldFrutaFocusLost

    private void jTextFieldColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldColorFocusLost
        // en este metodo cuando escrivimos en el jtexfaildColor al perder el foco o cambiar de cuadro se activa verificar si la palabar esta en la base de datos
        if(inicioJuego == true){
        if (jTextFieldColor.getText().toUpperCase().charAt(0) != letra) {
            jTextFieldColor.setBackground(Color.red);
            jTextFieldColor.setForeground(Color.white);
            error = true;
        } else {

            String palabra = jTextFieldColor.getText().toUpperCase();
            if (micolor.VerificarColor(palabra)) {
                jTextFieldColor.setBackground(new Color(20, 127, 109));
                jTextFieldColor.setForeground(Color.white);
                error = false;
            } else {
                jTextFieldColor.setBackground(Color.red);
                jTextFieldColor.setForeground(Color.white);
                error = true;
            }
        }
        }
    }//GEN-LAST:event_jTextFieldColorFocusLost

    private void jTextFieldPaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPaisFocusLost
        // en este metodo cuando escrivimos en el jtexfaildPais al perder el foco o cambiar de cuadro se activa verificar si la palabar esta en la base de datos
        if(inicioJuego == true){
        if (jTextFieldPais.getText().toUpperCase().charAt(0) != letra) {
            jTextFieldPais.setBackground(Color.red);
            jTextFieldPais.setForeground(Color.white);
            error = true;
        } else {

            String palabra = jTextFieldPais.getText().toUpperCase();
            if (mipais.VerificarPais(palabra)) {
                jTextFieldPais.setBackground(new Color(20, 127, 109));
                jTextFieldPais.setForeground(Color.white);
                error = false;
            } else {
                jTextFieldPais.setBackground(Color.red);
                jTextFieldPais.setForeground(Color.white);
                error = true;
            }
        }
        }
    }//GEN-LAST:event_jTextFieldPaisFocusLost

    private void jTextFieldApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldApellidoFocusLost
        // en este metodo cuando escrivimos en el jtexfaildApellido al perder el foco o cambiar de cuadro se activa verificar si la palabar esta en la base de datos
        if(inicioJuego == true){
        if (jTextFieldApellido.getText().toUpperCase().charAt(0) != letra) {
            jTextFieldApellido.setBackground(Color.red);
            jTextFieldApellido.setForeground(Color.white);
            error = true;
        } else {

            String palabra = jTextFieldApellido.getText().toUpperCase();
            if (miapellido.VerificarApellido(palabra)) {
                jTextFieldApellido.setBackground(new Color(20, 127, 109));
                jTextFieldApellido.setForeground(Color.white);
                error = false;
            } else {
                jTextFieldApellido.setBackground(Color.red);
                jTextFieldApellido.setForeground(Color.white);
                error = true;
            }
        }
        }
    }//GEN-LAST:event_jTextFieldApellidoFocusLost

    private void jTextFieldNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomFocusLost
        // en este metodo cuando escrivimos en el jtexfaildPais al perder el foco o cambiar de cuadro se activa verificar si la palabar esta en la base de datos
        if(inicioJuego == true){
        if (jTextFieldNom.getText().toUpperCase().charAt(0) != letra) {
            jTextFieldNom.setBackground(Color.red);
            jTextFieldNom.setForeground(Color.white);
            error = true;
        } else {

            String palabra = jTextFieldNom.getText().toUpperCase();
            if (minombre.VerificarNombre(palabra)) {
                jTextFieldNom.setBackground(new Color(20, 127, 109));
                jTextFieldNom.setForeground(Color.white);
                error = false;
            } else {
                jTextFieldNom.setBackground(Color.red);
                jTextFieldNom.setForeground(Color.white);
                error = true;
            }
        }
        }
        
        
    }//GEN-LAST:event_jTextFieldNomFocusLost

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        inicioJuego = false;
        t.stop();
        this.m = 0;
        this.cs = 0;
        this.s = 0;
        JOptionPane.showMessageDialog(this,"TERMINASTE, QUE BIEN MANITO" + "  SI DESEAS OTRA PARTIDA DALE EN ACEPTAR Y EL BOTON AZUL");
        
    }//GEN-LAST:event_btnStopActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StopCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StopCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StopCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StopCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StopCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelLetra;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAnimal;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldFruta;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JLabel txtTiempo;
    // End of variables declaration//GEN-END:variables

}