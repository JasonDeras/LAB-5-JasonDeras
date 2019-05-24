
import javax.swing.*;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Crear_Estudiantes = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_Nombre_Estudainte = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bt_Agregar_Gerente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_Apellido_Estudainte = new javax.swing.JTextField();
        tf_Numero_Cuenta_Estudiante = new javax.swing.JTextField();
        tf_Edad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rb_Masculino = new javax.swing.JRadioButton();
        rb_Femenino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rb_DiseñoGrafico = new javax.swing.JRadioButton();
        rb_Adminsitracion = new javax.swing.JRadioButton();
        rb_Finanzas = new javax.swing.JRadioButton();
        rb_Energia = new javax.swing.JRadioButton();
        rb_Biomedica = new javax.swing.JRadioButton();
        rb_Mecatronica = new javax.swing.JRadioButton();
        rb_IndustrialydeSistemas = new javax.swing.JRadioButton();
        rb_SistemasComputacionales = new javax.swing.JRadioButton();
        rb_Ocupacional = new javax.swing.JRadioButton();
        rb_NurticionyTerapiaFisica = new javax.swing.JRadioButton();
        rb_Odontologia = new javax.swing.JRadioButton();
        rb_MedicinayCirugia = new javax.swing.JRadioButton();
        rb_Mercadotecnia = new javax.swing.JRadioButton();
        rb_Derecho = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        bg_Genero = new javax.swing.ButtonGroup();
        bg_Carrera = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_Estudiantes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_Clases = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_Mestros = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_Clases = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Estudiantes = new javax.swing.JMenu();
        jmi_Crear_Estudiantes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Creacion de Estudaintes");

        jLabel5.setText("Nombre");

        jLabel6.setText("Apellido");

        bt_Agregar_Gerente.setText("Crear");
        bt_Agregar_Gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Agregar_GerenteActionPerformed(evt);
            }
        });

        jLabel7.setText("Numero de Cuenta");

        jLabel8.setText("Edad");

        jLabel1.setText("Genero");

        bg_Genero.add(rb_Masculino);
        rb_Masculino.setSelected(true);
        rb_Masculino.setText("M");

        bg_Genero.add(rb_Femenino);
        rb_Femenino.setText("F");

        jLabel2.setText("Licenciaturas");

        jLabel3.setText("Ingenierias");

        jLabel9.setText("Ciencias de la salud");

        bg_Carrera.add(rb_DiseñoGrafico);
        rb_DiseñoGrafico.setText("Diseño Grafico");

        bg_Carrera.add(rb_Adminsitracion);
        rb_Adminsitracion.setText("Administracion de Empresas");

        bg_Carrera.add(rb_Finanzas);
        rb_Finanzas.setText("Finanzas");

        bg_Carrera.add(rb_Energia);
        rb_Energia.setText("Energia");

        bg_Carrera.add(rb_Biomedica);
        rb_Biomedica.setText("Biomedica");

        bg_Carrera.add(rb_Mecatronica);
        rb_Mecatronica.setText("Mecatronica");

        bg_Carrera.add(rb_IndustrialydeSistemas);
        rb_IndustrialydeSistemas.setText("Industrial y de Sistemas");

        bg_Carrera.add(rb_SistemasComputacionales);
        rb_SistemasComputacionales.setText("Sistemas Computacionales");

        bg_Carrera.add(rb_Ocupacional);
        rb_Ocupacional.setText("Ocupacional");

        bg_Carrera.add(rb_NurticionyTerapiaFisica);
        rb_NurticionyTerapiaFisica.setText("Nutricion y Terapia Fisica");

        bg_Carrera.add(rb_Odontologia);
        rb_Odontologia.setText("Odontologia");

        bg_Carrera.add(rb_MedicinayCirugia);
        rb_MedicinayCirugia.setText("Medicina y Cirugia");

        bg_Carrera.add(rb_Mercadotecnia);
        rb_Mercadotecnia.setText("Mercadotecnia");

        bg_Carrera.add(rb_Derecho);
        rb_Derecho.setText("Derecho");

        jLabel14.setText("Solo Podra escoger una carrera");

        javax.swing.GroupLayout jd_Crear_EstudiantesLayout = new javax.swing.GroupLayout(jd_Crear_Estudiantes.getContentPane());
        jd_Crear_Estudiantes.getContentPane().setLayout(jd_Crear_EstudiantesLayout);
        jd_Crear_EstudiantesLayout.setHorizontalGroup(
            jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Numero_Cuenta_Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(bt_Agregar_Gerente)
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Apellido_Estudainte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Nombre_Estudainte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Femenino))
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rb_SistemasComputacionales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_IndustrialydeSistemas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Mecatronica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Biomedica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Energia))
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(rb_MedicinayCirugia)
                        .addGap(8, 8, 8)
                        .addComponent(rb_Odontologia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_NurticionyTerapiaFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Ocupacional))
                    .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Finanzas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Adminsitracion)
                        .addGap(18, 18, 18)
                        .addComponent(rb_DiseñoGrafico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Mercadotecnia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Derecho))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_Crear_EstudiantesLayout.setVerticalGroup(
            jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_EstudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Nombre_Estudainte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_Apellido_Estudainte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_Numero_Cuenta_Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rb_Masculino)
                    .addComponent(rb_Femenino))
                .addGap(11, 11, 11)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(rb_Finanzas)
                        .addComponent(rb_Adminsitracion))
                    .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_DiseñoGrafico)
                        .addComponent(rb_Mercadotecnia)
                        .addComponent(rb_Derecho)))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_SistemasComputacionales)
                    .addComponent(rb_IndustrialydeSistemas)
                    .addComponent(rb_Mecatronica)
                    .addComponent(rb_Biomedica)
                    .addComponent(rb_Energia))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rb_MedicinayCirugia)
                    .addComponent(rb_Odontologia)
                    .addComponent(rb_NurticionyTerapiaFisica)
                    .addComponent(rb_Ocupacional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(bt_Agregar_Gerente)
                .addGap(39, 39, 39))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("Estudiantes");

        jLabel11.setText("Carreras");

        jLabel12.setText("Clases");

        jLabel13.setText("Maestros");

        jl_Estudiantes.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_Estudiantes);

        jl_Clases.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_Clases);

        jl_Mestros.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_Mestros);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carreras");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Licenciaturas");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Finanzas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Derecho");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Administracion de Empresas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Diseño Grafico");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mercadotecnia");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ingenierias");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sistemas Computacionales");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Industrial y de Sistemas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mecatronica");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Biomedica");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Energia");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cisencias y Salud");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Medicina y Cirugia");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Odontologia");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Nutricion y Terapia Fisica");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ocupacional");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jt_Clases.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jt_Clases);

        jm_Estudiantes.setText("Estudaintes");

        jmi_Crear_Estudiantes.setText("Crear");
        jmi_Crear_Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Crear_EstudiantesActionPerformed(evt);
            }
        });
        jm_Estudiantes.add(jmi_Crear_Estudiantes);

        jMenuBar1.add(jm_Estudiantes);

        jMenu2.setText("Carrera");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Maestros");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Clases");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_Crear_EstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Crear_EstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_Crear_EstudiantesActionPerformed

    private void bt_Agregar_GerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Agregar_GerenteActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Estudiantes.getModel();
        String carrera="";
        String genero="";
        String cuenta="";
        int letras = 0, letras2 = 0;
        String aux = tf_Numero_Cuenta_Estudiante.getText();
        String aux2 = tf_Edad.getText();
        if (rb_Masculino.isSelected()) {
            genero = "M";
        } else if (rb_Femenino.isSelected()) {
            genero = "F";
        }//If del genero

        if (rb_Adminsitracion.isSelected()) {
            carrera = "Administracion";
        } else if (rb_Biomedica.isSelected()) {
            carrera = "Biomedica";
        } else if (rb_Derecho.isSelected()) {
            carrera = "Derecho";
        } else if (rb_DiseñoGrafico.isSelected()) {
            carrera = "Diseño Grafico";
        } else if (rb_Energia.isSelected()) {
            carrera = "Energia";
        } else if (rb_Finanzas.isSelected()) {
            carrera = "Finanzas";
        } else if (rb_IndustrialydeSistemas.isSelected()) {
            carrera = "Industrial y de Sistemas";
        } else if (rb_Mecatronica.isSelected()) {
            carrera = "Mecatronica";
        } else if (rb_MedicinayCirugia.isSelected()) {
            carrera = "Medicina y Cirugia";
        } else if (rb_Mercadotecnia.isSelected()) {
            carrera = "Mercadotecnia";
        } else if (rb_NurticionyTerapiaFisica.isSelected()) {
            carrera = "Nutricion y Terapia Fisica";
        } else if (rb_Ocupacional.isSelected()) {
            carrera = "Ocupacional";
        } else if (rb_Odontologia.isSelected()) {
            carrera = "Odontologia";
        } else if (rb_SistemasComputacionales.isSelected()) {
            carrera = "Sistemas Computacionales";
        } else {
            JOptionPane.showMessageDialog(jd_Crear_Estudiantes, "Debe de escoger una carrera");
        }//If de la carrera
        for (int i = 0; i < aux.length(); i++) {
            if (Character.isDigit(aux.charAt(i))) {
                
            } else {
                letras++;
            }//If que valida si hay letras en el numero
        }//For que recorre la cadena de numero de cuentas

        if (letras > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Estudiantes, "No se aceptan letras en el numero de cuenta ingerese de nuevo la cuenta");
            bt_Agregar_Gerente.setEnabled(false);
            letras = 0;
        } else {
            bt_Agregar_Gerente.setEnabled(true);
            cuenta = tf_Numero_Cuenta_Estudiante.getText();
        }//If auxiliar de las cuentas
        int edad=0;
        
        for (int i = 0; i < aux2.length(); i++) {
            if (Character.isDigit(aux2.charAt(i))) {
                
            } else {
                letras2++;
            }//If de las letras en la edad
        }
        if (letras2 > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Estudiantes, "No se aceptan letras en la edad ingerese de nuevo la edad");
            bt_Agregar_Gerente.setEnabled(false);
            letras = 0;
        } else {
            bt_Agregar_Gerente.setEnabled(true);
            edad = Integer.parseInt(tf_Edad.getText());
        }//Fin del if auxiliar de las lestras en la edad

        //Agregando a la lista
        
         modelo.addElement(new Estudiante(tf_Nombre_Estudainte.getText(), cuenta, tf_Apellido_Estudainte.getText(), edad, genero,carrera));
        
        //Reseteando los valores
        rb_Adminsitracion.setSelected(false);
        rb_Biomedica.setSelected(false);
        rb_Derecho.setSelected(false);
        rb_DiseñoGrafico.setSelected(false);
        rb_Energia.setSelected(false);
        rb_Femenino.setSelected(false);
        rb_Finanzas.setSelected(false);
        rb_IndustrialydeSistemas.setSelected(false);
        rb_Masculino.setSelected(true);
        rb_Mecatronica.setSelected(false);
        rb_MedicinayCirugia.setSelected(false);
        rb_Mercadotecnia.setSelected(false);
        rb_NurticionyTerapiaFisica.setSelected(false);
        rb_Ocupacional.setSelected(false);
        rb_Odontologia.setSelected(false);
        rb_SistemasComputacionales.setSelected(false);
        tf_Apellido_Estudainte.setText("");
        tf_Edad.setText("");
        tf_Nombre_Estudainte.setText("");
        tf_Numero_Cuenta_Estudiante.setText("");
        
        
        
        jl_Estudiantes.setModel(modelo);
        

    }//GEN-LAST:event_bt_Agregar_GerenteActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_Carrera;
    private javax.swing.ButtonGroup bg_Genero;
    private javax.swing.JButton bt_Agregar_Gerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_Crear_Estudiantes;
    private javax.swing.JList<String> jl_Clases;
    private javax.swing.JList<String> jl_Estudiantes;
    private javax.swing.JList<String> jl_Mestros;
    private javax.swing.JMenu jm_Estudiantes;
    private javax.swing.JMenuItem jmi_Crear_Estudiantes;
    private javax.swing.JTree jt_Clases;
    private javax.swing.JRadioButton rb_Adminsitracion;
    private javax.swing.JRadioButton rb_Biomedica;
    private javax.swing.JRadioButton rb_Derecho;
    private javax.swing.JRadioButton rb_DiseñoGrafico;
    private javax.swing.JRadioButton rb_Energia;
    private javax.swing.JRadioButton rb_Femenino;
    private javax.swing.JRadioButton rb_Finanzas;
    private javax.swing.JRadioButton rb_IndustrialydeSistemas;
    private javax.swing.JRadioButton rb_Masculino;
    private javax.swing.JRadioButton rb_Mecatronica;
    private javax.swing.JRadioButton rb_MedicinayCirugia;
    private javax.swing.JRadioButton rb_Mercadotecnia;
    private javax.swing.JRadioButton rb_NurticionyTerapiaFisica;
    private javax.swing.JRadioButton rb_Ocupacional;
    private javax.swing.JRadioButton rb_Odontologia;
    private javax.swing.JRadioButton rb_SistemasComputacionales;
    private javax.swing.JTextField tf_Apellido_Estudainte;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_Nombre_Estudainte;
    private javax.swing.JTextField tf_Numero_Cuenta_Estudiante;
    // End of variables declaration//GEN-END:variables
}
