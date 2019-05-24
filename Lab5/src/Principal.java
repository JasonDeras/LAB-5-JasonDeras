
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
        bt_Crear_Estudiante = new javax.swing.JButton();
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
        jd_Crear_Carrera = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_Nombre_Carrera = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_Costo_Mensual = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_JefedeCarrera = new javax.swing.JTextField();
        bt_Crear_Carrera = new javax.swing.JButton();
        jd_Crear_Clase = new javax.swing.JDialog();
        bt_Crear_Clase = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        tf_Edificio = new javax.swing.JTextField();
        tf_Seccion = new javax.swing.JTextField();
        tf_Nombre_Clase = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_Salon = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        rb_Si = new javax.swing.JRadioButton();
        rb_No = new javax.swing.JRadioButton();
        bg_Aire = new javax.swing.ButtonGroup();
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
        jm_Carrera = new javax.swing.JMenu();
        jm_Maestros = new javax.swing.JMenu();
        jm_Clases = new javax.swing.JMenu();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Creacion de Estudaintes");

        jLabel5.setText("Nombre");

        jLabel6.setText("Apellido");

        bt_Crear_Estudiante.setText("Crear");
        bt_Crear_Estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_EstudianteActionPerformed(evt);
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
                    .addComponent(bt_Crear_Estudiante)
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
                .addComponent(bt_Crear_Estudiante)
                .addGap(39, 39, 39))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Creacion de Carreras");

        jLabel16.setText("Nombre");

        jLabel17.setText("Costo Mensual");

        jLabel18.setText("Jefe de Carrera");

        bt_Crear_Carrera.setText("Crear");
        bt_Crear_Carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_CarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Crear_CarreraLayout = new javax.swing.GroupLayout(jd_Crear_Carrera.getContentPane());
        jd_Crear_Carrera.getContentPane().setLayout(jd_Crear_CarreraLayout);
        jd_Crear_CarreraLayout.setHorizontalGroup(
            jd_Crear_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_CarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jd_Crear_CarreraLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Nombre_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_CarreraLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_JefedeCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Crear_CarreraLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Costo_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_Crear_Carrera))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jd_Crear_CarreraLayout.setVerticalGroup(
            jd_Crear_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_CarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_Nombre_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_Costo_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jd_Crear_CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_JefedeCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(bt_Crear_Carrera)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        bt_Crear_Clase.setText("Crear");
        bt_Crear_Clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_ClaseActionPerformed(evt);
            }
        });

        jLabel19.setText("Edificio");

        jLabel20.setText("Nombre");

        jLabel21.setText("Seccion");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("Creacion de Clases");

        jLabel23.setText("Salon");

        jLabel24.setText("Con aire");

        bg_Aire.add(rb_Si);
        rb_Si.setText("Si");

        bg_Aire.add(rb_No);
        rb_No.setText("No");

        javax.swing.GroupLayout jd_Crear_ClaseLayout = new javax.swing.GroupLayout(jd_Crear_Clase.getContentPane());
        jd_Crear_Clase.getContentPane().setLayout(jd_Crear_ClaseLayout);
        jd_Crear_ClaseLayout.setHorizontalGroup(
            jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_ClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(bt_Crear_Clase)
                    .addGroup(jd_Crear_ClaseLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_No))
                    .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Crear_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Salon))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Crear_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(20, 20, 20)
                            .addComponent(tf_Edificio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Crear_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Nombre_Clase))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Crear_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jd_Crear_ClaseLayout.setVerticalGroup(
            jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_ClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_Nombre_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_Seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_Edificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_Salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_Crear_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(rb_Si)
                    .addComponent(rb_No))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(bt_Crear_Clase)
                .addGap(25, 25, 25))
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
        jt_Clases.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jt_Clases);

        jm_Estudiantes.setText("Estudaintes");
        jm_Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_EstudiantesActionPerformed(evt);
            }
        });
        jMenuBar1.add(jm_Estudiantes);

        jm_Carrera.setText("Carrera");
        jm_Carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_CarreraActionPerformed(evt);
            }
        });
        jMenuBar1.add(jm_Carrera);

        jm_Maestros.setText("Maestros");
        jMenuBar1.add(jm_Maestros);

        jm_Clases.setText("Clases");
        jm_Clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_ClasesActionPerformed(evt);
            }
        });
        jMenuBar1.add(jm_Clases);

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

    private void bt_Crear_EstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_EstudianteActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Estudiantes.getModel();
        String carrera = "";
        String genero = "";
        String cuenta = "";
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
            bt_Crear_Estudiante.setEnabled(false);
            letras = 0;
        } else {
            bt_Crear_Estudiante.setEnabled(true);
            cuenta = tf_Numero_Cuenta_Estudiante.getText();
        }//If auxiliar de las cuentas
        int edad = 0;

        for (int i = 0; i < aux2.length(); i++) {
            if (Character.isDigit(aux2.charAt(i))) {

            } else {
                letras2++;
            }//If de las letras en la edad
        }
        if (letras2 > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Estudiantes, "No se aceptan letras en la edad ingerese de nuevo la edad");
            bt_Crear_Estudiante.setEnabled(false);
            letras = 0;
        } else {
            bt_Crear_Estudiante.setEnabled(true);
            edad = Integer.parseInt(tf_Edad.getText());
        }//Fin del if auxiliar de las lestras en la edad

        //Agregando a la lista
        modelo.addElement(new Estudiante(tf_Nombre_Estudainte.getText(), cuenta, tf_Apellido_Estudainte.getText(), edad, genero, carrera));

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


    }//GEN-LAST:event_bt_Crear_EstudianteActionPerformed

    private void bt_Crear_CarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_CarreraActionPerformed
        // TODO add your handling code here:
        String facultad = "";
        String nombre = "";
        String aux = tf_Costo_Mensual.getText();
        int letras = 0;
        double cost = 0;

        for (int i = 0; i < aux.length(); i++) {
            if (Character.isDigit(aux.charAt(i))) {

            } else {
                letras++;
            }//If de las letras en la edad
        }

        if (letras > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Carrera, "Solo se aceotan costos mensual");
            bt_Crear_Carrera.setEnabled(false);
        } else {
            bt_Crear_Carrera.setEnabled(false);
            cost = Double.parseDouble(tf_Costo_Mensual.getText());
        }

        if (tf_Nombre_Carrera.getText().equalsIgnoreCase("Finanzas")) {
            facultad = "Licenciaturas";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("Derecho")) {
            facultad = "Licenciaturas";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("Administracion de empresas")) {
            facultad = "Licenciaturas";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("diseño grafico")) {
            facultad = "Licenciaturas";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("mercadotecnia")) {
            facultad = "Licenciaturas";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("sistemas computacionales")) {
            facultad = "Ingenierias";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("industrial y de sistemas")) {
            facultad = "Ingenierias";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("mecatronica")) {
            facultad = "Ingenierias";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("biomedica")) {
            facultad = "Ingenierias";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("energia")) {
            facultad = "Ingenierias";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("medicina y cirugia")) {
            facultad = "Ciencias y salud";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("odontologia")) {
            facultad = "Ciencias y salud";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("nutriion y terapia fisica")) {
            facultad = "Ciencias y salud";
            nombre = tf_Nombre_Carrera.getText();
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("ocupacional")) {
            facultad = "Ciencias y salud";
            nombre = tf_Nombre_Carrera.getText();
        } else {
            JOptionPane.showMessageDialog(jd_Crear_Carrera, "El nombre de la carrera no es valido");
        }
        c = new Carrera(nombre, facultad, cost, tf_JefedeCarrera.getText());
        tf_Nombre_Carrera.setText("");
        tf_JefedeCarrera.setText("");
        tf_Costo_Mensual.setText("");

    }//GEN-LAST:event_bt_Crear_CarreraActionPerformed

    private void jm_CarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_CarreraActionPerformed
        // TODO add your handling code here:
        jd_Crear_Carrera.setModal(true);
        jd_Crear_Carrera.pack();
        jd_Crear_Carrera.setLocationRelativeTo(this);
        jd_Crear_Carrera.setVisible(true);
    }//GEN-LAST:event_jm_CarreraActionPerformed

    private void jm_EstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_EstudiantesActionPerformed
        // TODO add your handling code here:
        jd_Crear_Estudiantes.setModal(true);
        jd_Crear_Estudiantes.pack();
        jd_Crear_Estudiantes.setLocationRelativeTo(this);
        jd_Crear_Estudiantes.setVisible(true);
    }//GEN-LAST:event_jm_EstudiantesActionPerformed

    private void bt_Crear_ClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_ClaseActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Clases.getModel();
        int edificio = 0;
        int seccion = 0;
        int letras = 0;
        int letras1 = 0;
        String aux1 = tf_Seccion.getText();
        String aux2 = tf_Edificio.getText();
        String aire = "";

        for (int i = 0; i < aux1.length(); i++) {
            if (Character.isDigit(aux1.charAt(i))) {

            } else {
                letras++;
            }
        }
        for (int i = 0; i < aux2.length(); i++) {
            if (Character.isDigit(aux2.charAt(i))) {

            } else {
                letras1++;
            }
        }
        if (letras > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Clase, "No se aceptan letras en la seccion de la clase");
            bt_Crear_Clase.setEnabled(false);
        } else {
            bt_Crear_Clase.setEnabled(true);
            seccion = Integer.parseInt(tf_Seccion.getText());
        }
        if (letras1 > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Clase, "No se aceptan letras en el numero de edificio");
            bt_Crear_Clase.setEnabled(false);
        } else {
            bt_Crear_Clase.setEnabled(true);
            edificio = Integer.parseInt(tf_Edificio.getText());
        }

        if (rb_Si.isSelected()) {
            aire = "Si";
            modelo.addElement(new Clase(tf_Nombre_Clase.getText(), seccion, edificio, tf_Salon.getText(), "Si"));
            jl_Clases.setModel(modelo);
            tf_Edificio.setText("");
            tf_Seccion.setText("");
            tf_Salon.setText("");
            rb_Si.setSelected(false);
            rb_No.setSelected(false);
        } else if (rb_No.isSelected()) {
            aire = "No";
            modelo.addElement(new Clase(tf_Nombre_Clase.getText(), seccion, edificio, tf_Salon.getText(), "No"));
            jl_Clases.setModel(modelo);
            tf_Edificio.setText("");
            tf_Seccion.setText("");
            tf_Salon.setText("");
            rb_Si.setSelected(false);
            rb_No.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(jd_Crear_Clase, "Debe de seleccionar si o no para el aire");
            bt_Crear_Estudiante.setEnabled(false);
        }

    }//GEN-LAST:event_bt_Crear_ClaseActionPerformed

    private void jm_ClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_ClasesActionPerformed
        // TODO add your handling code here:
        jd_Crear_Clase.setModal(true);
        jd_Crear_Clase.pack();
        jd_Crear_Clase.setLocationRelativeTo(this);
        jd_Crear_Clase.setVisible(true);
    }//GEN-LAST:event_jm_ClasesActionPerformed

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
    private javax.swing.ButtonGroup bg_Aire;
    private javax.swing.ButtonGroup bg_Carrera;
    private javax.swing.ButtonGroup bg_Genero;
    private javax.swing.JButton bt_Crear_Carrera;
    private javax.swing.JButton bt_Crear_Clase;
    private javax.swing.JButton bt_Crear_Estudiante;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_Crear_Carrera;
    private javax.swing.JDialog jd_Crear_Clase;
    private javax.swing.JDialog jd_Crear_Estudiantes;
    private javax.swing.JList<String> jl_Clases;
    private javax.swing.JList<String> jl_Estudiantes;
    private javax.swing.JList<String> jl_Mestros;
    private javax.swing.JMenu jm_Carrera;
    private javax.swing.JMenu jm_Clases;
    private javax.swing.JMenu jm_Estudiantes;
    private javax.swing.JMenu jm_Maestros;
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
    private javax.swing.JRadioButton rb_No;
    private javax.swing.JRadioButton rb_NurticionyTerapiaFisica;
    private javax.swing.JRadioButton rb_Ocupacional;
    private javax.swing.JRadioButton rb_Odontologia;
    private javax.swing.JRadioButton rb_Si;
    private javax.swing.JRadioButton rb_SistemasComputacionales;
    private javax.swing.JTextField tf_Apellido_Estudainte;
    private javax.swing.JTextField tf_Costo_Mensual;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_Edificio;
    private javax.swing.JTextField tf_JefedeCarrera;
    private javax.swing.JTextField tf_Nombre_Carrera;
    private javax.swing.JTextField tf_Nombre_Clase;
    private javax.swing.JTextField tf_Nombre_Estudainte;
    private javax.swing.JTextField tf_Numero_Cuenta_Estudiante;
    private javax.swing.JTextField tf_Salon;
    private javax.swing.JTextField tf_Seccion;
    // End of variables declaration//GEN-END:variables
Carrera c;
}
