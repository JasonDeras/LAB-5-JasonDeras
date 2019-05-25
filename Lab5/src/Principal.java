
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

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
        jd_Crear_Maestros = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        bt_Crear_Maestro = new javax.swing.JButton();
        tf_Nombre_Maestro = new javax.swing.JTextField();
        tf_Salario = new javax.swing.JTextField();
        tf_Edad_Maestro = new javax.swing.JTextField();
        tf_Apellido_Maestro = new javax.swing.JTextField();
        tf_Clases = new javax.swing.JTextField();
        pp_Arbol = new javax.swing.JPopupMenu();
        jmi_Eliminar = new javax.swing.JMenuItem();
        jmi_Modificar = new javax.swing.JMenuItem();
        jd_Modificar_Estudiante = new javax.swing.JDialog();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_Nombre_Estudainte1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_Apellido_Estudainte1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf_Numero_Cuenta_Estudiante1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        rb_Masculino1 = new javax.swing.JRadioButton();
        rb_Femenino1 = new javax.swing.JRadioButton();
        bt_Modificar_Estudiante = new javax.swing.JButton();
        pp_Lista_Clases = new javax.swing.JPopupMenu();
        jmi_Modificar_Clase = new javax.swing.JMenuItem();
        jmi_Eliminar_Clase = new javax.swing.JMenuItem();
        jd_Moficar_Clase = new javax.swing.JDialog();
        jLabel37 = new javax.swing.JLabel();
        tf_Nombre_Clase1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tf_Seccion1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tf_Edificio1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        tf_Salon1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        rb_Si1 = new javax.swing.JRadioButton();
        rb_No1 = new javax.swing.JRadioButton();
        bt_Crear_Clase1 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jd_Modificar_Maestros = new javax.swing.JDialog();
        jLabel43 = new javax.swing.JLabel();
        tf_Nombre_Maestro1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        tf_Apellido_Maestro1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        tf_Salario1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        tf_Edad_Maestro1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        tf_Clases1 = new javax.swing.JTextField();
        bt_Modificar_Maestros = new javax.swing.JButton();
        pp_Lista_Maestros = new javax.swing.JPopupMenu();
        jmi_Modificar_Maestro = new javax.swing.JMenuItem();
        jmi_Eliminar_Maestro = new javax.swing.JMenuItem();
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
        jmb_Opciones = new javax.swing.JMenuBar();
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

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Creacion de Maestros");

        jLabel26.setText("Nombre");

        jLabel27.setText("Edad");

        jLabel28.setText("Apellido");

        jLabel29.setText("Salario");

        jLabel30.setText("Clase que imparte");

        bt_Crear_Maestro.setText("Crear");
        bt_Crear_Maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_MaestroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Crear_MaestrosLayout = new javax.swing.GroupLayout(jd_Crear_Maestros.getContentPane());
        jd_Crear_Maestros.getContentPane().setLayout(jd_Crear_MaestrosLayout);
        jd_Crear_MaestrosLayout.setHorizontalGroup(
            jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_Nombre_Maestro))
                            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Apellido_Maestro))
                            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                                .addComponent(bt_Crear_Maestro)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Salario))
                            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Edad_Maestro))))
                    .addComponent(jLabel25))
                .addGap(145, 145, 145))
            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(tf_Clases, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
        jd_Crear_MaestrosLayout.setVerticalGroup(
            jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_MaestrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_Nombre_Maestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_Apellido_Maestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_Edad_Maestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(55, 55, 55)
                .addComponent(bt_Crear_Maestro)
                .addContainerGap())
            .addGroup(jd_Crear_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_Crear_MaestrosLayout.createSequentialGroup()
                    .addContainerGap(202, Short.MAX_VALUE)
                    .addComponent(tf_Clases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(89, 89, 89)))
        );

        jmi_Eliminar.setText("Eliminar");
        pp_Arbol.add(jmi_Eliminar);

        jmi_Modificar.setText("Modificar");
        jmi_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ModificarActionPerformed(evt);
            }
        });
        pp_Arbol.add(jmi_Modificar);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setText("Modificacion de Estudaintes");

        jLabel32.setText("Nombre");

        jLabel33.setText("Apellido");

        jLabel34.setText("Numero de Cuenta");

        jLabel35.setText("Edad");

        jLabel36.setText("Genero");

        bg_Genero.add(rb_Masculino1);
        rb_Masculino1.setSelected(true);
        rb_Masculino1.setText("M");

        bg_Genero.add(rb_Femenino1);
        rb_Femenino1.setText("F");

        bt_Modificar_Estudiante.setText("Modificar");
        bt_Modificar_Estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_EstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Modificar_EstudianteLayout = new javax.swing.GroupLayout(jd_Modificar_Estudiante.getContentPane());
        jd_Modificar_Estudiante.getContentPane().setLayout(jd_Modificar_EstudianteLayout);
        jd_Modificar_EstudianteLayout.setHorizontalGroup(
            jd_Modificar_EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_EstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Modificar_EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Modificar_EstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Numero_Cuenta_Estudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31)
                    .addGroup(jd_Modificar_EstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Apellido_Estudainte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Modificar_EstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Nombre_Estudainte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Modificar_EstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Masculino1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Femenino1))
                    .addComponent(jLabel35)
                    .addComponent(bt_Modificar_Estudiante))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jd_Modificar_EstudianteLayout.setVerticalGroup(
            jd_Modificar_EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_EstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_Nombre_Estudainte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_Apellido_Estudainte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tf_Numero_Cuenta_Estudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel35)
                .addGap(25, 25, 25)
                .addGroup(jd_Modificar_EstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(rb_Masculino1)
                    .addComponent(rb_Femenino1))
                .addGap(18, 18, 18)
                .addComponent(bt_Modificar_Estudiante)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jmi_Modificar_Clase.setText("Menus");
        jmi_Modificar_Clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_ClaseActionPerformed(evt);
            }
        });
        pp_Lista_Clases.add(jmi_Modificar_Clase);

        jmi_Eliminar_Clase.setText("Eliminar");
        jmi_Eliminar_Clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_ClaseActionPerformed(evt);
            }
        });
        pp_Lista_Clases.add(jmi_Eliminar_Clase);

        jLabel37.setText("Nombre");

        jLabel38.setText("Seccion");

        jLabel39.setText("Edificio");

        jLabel40.setText("Salon");

        jLabel41.setText("Con aire");

        bg_Aire.add(rb_Si1);
        rb_Si1.setText("Si");

        bg_Aire.add(rb_No1);
        rb_No1.setText("No");

        bt_Crear_Clase1.setText("Modificar");
        bt_Crear_Clase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_Clase1ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel42.setText("Modificar de Clases");

        javax.swing.GroupLayout jd_Moficar_ClaseLayout = new javax.swing.GroupLayout(jd_Moficar_Clase.getContentPane());
        jd_Moficar_Clase.getContentPane().setLayout(jd_Moficar_ClaseLayout);
        jd_Moficar_ClaseLayout.setHorizontalGroup(
            jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Moficar_ClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(bt_Crear_Clase1)
                    .addGroup(jd_Moficar_ClaseLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Si1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_No1))
                    .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Moficar_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel40)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Salon1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Moficar_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addGap(20, 20, 20)
                            .addComponent(tf_Edificio1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Moficar_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Nombre_Clase1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_Moficar_ClaseLayout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Seccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jd_Moficar_ClaseLayout.setVerticalGroup(
            jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Moficar_ClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(tf_Nombre_Clase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tf_Seccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tf_Edificio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(tf_Salon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_Moficar_ClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(rb_Si1)
                    .addComponent(rb_No1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(bt_Crear_Clase1)
                .addGap(25, 25, 25))
        );

        jLabel43.setText("Nombre");

        jLabel44.setText("Apellido");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setText("Creacion de Maestros");

        jLabel46.setText("Salario");

        jLabel47.setText("Edad");

        jLabel48.setText("Clase que imparte");

        bt_Modificar_Maestros.setText("Modificar");
        bt_Modificar_Maestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Modificar_MaestrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Modificar_MaestrosLayout = new javax.swing.GroupLayout(jd_Modificar_Maestros.getContentPane());
        jd_Modificar_Maestros.getContentPane().setLayout(jd_Modificar_MaestrosLayout);
        jd_Modificar_MaestrosLayout.setHorizontalGroup(
            jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                        .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel47))
                                .addGap(18, 18, 18)
                                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Salario1)
                                    .addComponent(tf_Edad_Maestro1)))
                            .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel45)
                                .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                                    .addComponent(jLabel43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_Nombre_Maestro1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_Apellido_Maestro1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                                    .addComponent(jLabel48)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_Clases1))))
                        .addGap(373, 373, 373))
                    .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                        .addComponent(bt_Modificar_Maestros)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jd_Modificar_MaestrosLayout.setVerticalGroup(
            jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Modificar_MaestrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(23, 23, 23)
                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tf_Nombre_Maestro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(tf_Apellido_Maestro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(tf_Salario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(tf_Edad_Maestro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Modificar_MaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Clases1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(bt_Modificar_Maestros)
                .addContainerGap())
        );

        jmi_Modificar_Maestro.setText("Modificar Maestro");
        jmi_Modificar_Maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Modificar_MaestroActionPerformed(evt);
            }
        });
        pp_Lista_Maestros.add(jmi_Modificar_Maestro);

        jmi_Eliminar_Maestro.setText("Eliminar");
        jmi_Eliminar_Maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Eliminar_MaestroActionPerformed(evt);
            }
        });
        pp_Lista_Maestros.add(jmi_Eliminar_Maestro);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("Estudiantes");

        jLabel11.setText("Carreras");

        jLabel12.setText("Clases");

        jLabel13.setText("Maestros");

        jl_Estudiantes.setModel(new DefaultListModel());
        jl_Estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_EstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_Estudiantes);

        jl_Clases.setModel(new DefaultListModel());
        jl_Clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_ClasesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_Clases);

        jl_Mestros.setModel(new DefaultListModel());
        jl_Mestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_MestrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jl_Mestros);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carreras");
        jt_Clases.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ClasesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jt_Clases);

        jm_Estudiantes.setText("Estudaintes");
        jm_Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_EstudiantesActionPerformed(evt);
            }
        });
        jmb_Opciones.add(jm_Estudiantes);

        jm_Carrera.setText("Carrera");
        jm_Carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_CarreraActionPerformed(evt);
            }
        });
        jmb_Opciones.add(jm_Carrera);

        jm_Maestros.setText("Maestros");
        jm_Maestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_MaestrosActionPerformed(evt);
            }
        });
        jmb_Opciones.add(jm_Maestros);

        jm_Clases.setText("Clases");
        jm_Clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_ClasesActionPerformed(evt);
            }
        });
        jmb_Opciones.add(jm_Clases);

        setJMenuBar(jmb_Opciones);

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
        } else if (tf_Nombre_Carrera.getText().equalsIgnoreCase("nutricion y terapia fisica")) {
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

    private void jm_MaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_MaestrosActionPerformed
        // TODO add your handling code here:
        jd_Crear_Maestros.setModal(true);
        jd_Crear_Maestros.pack();
        jd_Crear_Maestros.setLocationRelativeTo(this);
        jd_Crear_Maestros.setVisible(true);
    }//GEN-LAST:event_jm_MaestrosActionPerformed

    private void bt_Crear_MaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_MaestroActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Mestros.getModel();
        double salario = 0;
        int edad = 0;
        int letras = 0;
        int letras1 = 0;
        String aux1 = tf_Salario.getText();
        String aux2 = tf_Edad_Maestro.getText();

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
            JOptionPane.showMessageDialog(jd_Crear_Maestros, "Solo se aceptan numero de salario");
            bt_Crear_Maestro.setEnabled(false);
        } else {
            bt_Crear_Maestro.setEnabled(true);
            salario = Double.parseDouble(tf_Salario.getText());
        }
        if (letras1 > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Maestros, "Solo se aceptan numero de edad");
            bt_Crear_Maestro.setEnabled(false);
        } else {
            bt_Crear_Maestro.setEnabled(true);
            edad = Integer.parseInt(tf_Edad.getText());
            modelo.addElement(new Maestro(tf_Nombre_Maestro.getText(), tf_Apellido_Maestro.getText(), salario, edad));
            m = new Maestro(tf_Nombre_Maestro.getText(), tf_Apellido_Maestro.getText(), salario, edad);
            m.getClases().add(tf_Clases.getText());
            jl_Mestros.setModel(modelo);
            tf_Edad_Maestro.setText("");
            tf_Salario.setText("");
            tf_Edad.setText("");
            tf_Clases.setText("");
        }
    }//GEN-LAST:event_bt_Crear_MaestroActionPerformed

    private void jl_EstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_EstudiantesMouseClicked
        // TODO add your handling code here:
        try {
            if (evt.isMetaDown()) {

                if (jl_Estudiantes.getSelectedIndex() >= 0) {
                    DefaultTreeModel modeloARBOL = (DefaultTreeModel) jt_Clases.getModel();
                    DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
                    //obtener El estudainte a guardar
                    DefaultListModel modeloLISTA = (DefaultListModel) jl_Estudiantes.getModel();
                    String facultad = "", nombre = c.getNombre();
                    double costo_mensual = c.getCosto_mensual();
                    String jefe = c.getJefe();

                    String nombrea;
                    String cuenta;
                    String apellido;
                    int edad;
                    String genero;
                    String carrera;

                    nombrea = ((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getNombre();
                    cuenta = ((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCuenta();
                    apellido = ((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getApellido();
                    edad = ((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getEdad();
                    genero = ((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getGenero();
                    carrera = ((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera();

                    if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("finanzas")) {
                        facultad = "Licenciaturas";

                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("derecho")) {
                        facultad = "Licenciaturas";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("administracion de empresas")) {
                        facultad = "Licenciaturas";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("diseño grafico")) {
                        facultad = "Licenciaturas";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("mercadotecnia")) {
                        facultad = "Licenciaturas";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("sistemas computacionales")) {
                        facultad = "Ingenierias";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("industrial y de sistemas")) {
                        facultad = "Ingenierias";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("mecatronica")) {
                        facultad = "Ingenierias";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("biomedica")) {
                        facultad = "Ingenierias";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("energia")) {
                        facultad = "Ingenierias";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("medicina y cirugia")) {
                        facultad = "Ciencias y salud";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("odontologia")) {
                        facultad = "Ciencias y salud";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("nutricion y terapia fisica")) {
                        facultad = "Ciencias y salud";
                    } else if (((Estudiante) modeloLISTA.get(jl_Estudiantes.getSelectedIndex())).getCarrera().equalsIgnoreCase("ocupacional")) {
                        facultad = "Ciencias y salud";
                    }

                    int centinela = -1;
                    for (int i = 0; i < raiz.getChildCount(); i++) {
                        if (raiz.getChildAt(i).toString().equals(facultad)) {
                            DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Carrera(nombre, facultad, costo_mensual, jefe));
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                            centinela = 1;
                        } //fin if
                    } //fin for  

                    if (centinela == -1) {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(facultad);
                        DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Carrera(nombre, facultad, costo_mensual, jefe));
                        DefaultMutableTreeNode s = new DefaultMutableTreeNode(new Estudiante(nombrea, cuenta, apellido, edad, genero, carrera));
                        p.add(s);
                        n.add(p);
                        raiz.add(n);
                    }  // fin if          
                    modeloARBOL.reload();

                } else {
                    JOptionPane.showMessageDialog(this,
                            "No hay un estudiante seleccionado");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }

    }//GEN-LAST:event_jl_EstudiantesMouseClicked

    private void jt_ClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ClasesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row = jt_Clases.getClosestRowForLocation(
                    evt.getX(), evt.getY());
            jt_Clases.setSelectionRow(row);
            Object v1 = jt_Clases.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Estudiante) {
                persona_seleccionada = (Estudiante) nodo_seleccionado.
                        getUserObject();
                pp_Arbol.show(evt.getComponent(),
                        evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_ClasesMouseClicked

    private void bt_Modificar_EstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_EstudianteActionPerformed
        // TODO add your handling code here:
        if (rb_Masculino1.isSelected()) {
            c1 = new Estudiante(tf_Nombre_Estudainte1.getText(), tf_Numero_Cuenta_Estudiante1.getText(), tf_Apellido_Estudainte1.getText(), 0, "", "");
        } else {
            c1 = new Estudiante(tf_Nombre_Estudainte1.getText(), tf_Numero_Cuenta_Estudiante1.getText(), tf_Apellido_Estudainte1.getText(), 0, "", "");
        }
    }//GEN-LAST:event_bt_Modificar_EstudianteActionPerformed

    private void jmi_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ModificarActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Estudiante.setModal(true);
        jd_Modificar_Estudiante.pack();
        jd_Modificar_Estudiante.setLocationRelativeTo(this);
        jd_Modificar_Estudiante.setVisible(true);
    }//GEN-LAST:event_jmi_ModificarActionPerformed

    private void jl_ClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_ClasesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pp_Lista_Clases.show(evt.getComponent(), getX(), getY());
        }
    }//GEN-LAST:event_jl_ClasesMouseClicked

    private void bt_Crear_Clase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_Clase1ActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Clases.getModel();
        int edificio = 0;
        int seccion = 0;
        int letras = 0;
        int letras1 = 0;
        String aux1 = tf_Seccion1.getText();
        String aux2 = tf_Edificio1.getText();
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
            JOptionPane.showMessageDialog(jd_Moficar_Clase, "No se aceptan letras en la seccion de la clase");
            bt_Crear_Clase.setEnabled(false);
        } else {
            bt_Crear_Clase.setEnabled(true);
            seccion = Integer.parseInt(tf_Seccion1.getText());
        }
        if (letras1 > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Clase, "No se aceptan letras en el numero de edificio");
            bt_Crear_Clase.setEnabled(false);
        } else {
            bt_Crear_Clase.setEnabled(true);
            edificio = Integer.parseInt(tf_Edificio1.getText());
        }

        if (rb_Si.isSelected()) {
            aire = "Si";
            modelo.remove(jl_Clases.getSelectedIndex());
            modelo.addElement(new Clase(tf_Nombre_Clase1.getText(), seccion, edificio, tf_Salon1.getText(), "Si"));
            jl_Clases.setModel(modelo);
            tf_Edificio1.setText("");
            tf_Seccion1.setText("");
            tf_Salon1.setText("");
            rb_Si.setSelected(false);
            rb_No.setSelected(false);
        } else if (rb_No.isSelected()) {
            aire = "No";
            modelo.remove(jl_Clases.getSelectedIndex());
            modelo.addElement(new Clase(tf_Nombre_Clase1.getText(), seccion, edificio, tf_Salon1.getText(), "No"));
            jl_Clases.setModel(modelo);
            tf_Edificio1.setText("");
            tf_Seccion1.setText("");
            tf_Salon1.setText("");
            rb_Si.setSelected(false);
            rb_No.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(jd_Crear_Clase, "Debe de seleccionar si o no para el aire");
            bt_Crear_Clase1.setEnabled(false);
        }
    }//GEN-LAST:event_bt_Crear_Clase1ActionPerformed

    private void jmi_Modificar_ClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_ClaseActionPerformed
        // TODO add your handling code here:
        jd_Moficar_Clase.setModal(true);
        jd_Moficar_Clase.pack();
        jd_Moficar_Clase.setLocationRelativeTo(this);
        jd_Moficar_Clase.setVisible(true);
    }//GEN-LAST:event_jmi_Modificar_ClaseActionPerformed

    private void jmi_Eliminar_ClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_ClaseActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Clases.getModel();
        modelo.remove(jl_Clases.getSelectedIndex());
    }//GEN-LAST:event_jmi_Eliminar_ClaseActionPerformed

    private void bt_Modificar_MaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Modificar_MaestrosActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Mestros.getModel();
        double salario = 0;
        int edad = 0;
        int letras = 0;
        int letras1 = 0;
        String aux1 = tf_Salario.getText();
        String aux2 = tf_Edad_Maestro.getText();

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
            JOptionPane.showMessageDialog(jd_Crear_Maestros, "Solo se aceptan numero de salario");
            bt_Crear_Maestro.setEnabled(false);
        } else {
            bt_Crear_Maestro.setEnabled(true);
            salario = Double.parseDouble(tf_Salario1.getText());
        }
        if (letras1 > 0) {
            JOptionPane.showMessageDialog(jd_Crear_Maestros, "Solo se aceptan numero de edad");
            bt_Crear_Maestro.setEnabled(false);
        } else {
            bt_Crear_Maestro.setEnabled(true);
            edad = Integer.parseInt(tf_Edad_Maestro1.getText());
            modelo.remove(jl_Mestros.getSelectedIndex());
            modelo.addElement(new Maestro(tf_Nombre_Maestro1.getText(), tf_Apellido_Maestro1.getText(), salario, edad));
            m = new Maestro(tf_Nombre_Maestro1.getText(), tf_Apellido_Maestro1.getText(), salario, edad);
            m.getClases().add(tf_Clases1.getText());
            jl_Mestros.setModel(modelo);
            tf_Edad_Maestro1.setText("");
            tf_Salario1.setText("");
            tf_Edad_Maestro1.setText("");
            tf_Clases1.setText("");
        }
    }//GEN-LAST:event_bt_Modificar_MaestrosActionPerformed

    private void jl_MestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_MestrosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            pp_Lista_Maestros.show(evt.getComponent(), getX(), getY());
        }
    }//GEN-LAST:event_jl_MestrosMouseClicked

    private void jmi_Modificar_MaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Modificar_MaestroActionPerformed
        // TODO add your handling code here:
        jd_Modificar_Maestros.setModal(true);
        jd_Modificar_Maestros.pack();
        jd_Modificar_Maestros.setLocationRelativeTo(this);
        jd_Modificar_Maestros.setVisible(true);
    }//GEN-LAST:event_jmi_Modificar_MaestroActionPerformed

    private void jmi_Eliminar_MaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Eliminar_MaestroActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_Mestros.getModel();
        modelo.remove(jl_Mestros.getSelectedIndex());
    }//GEN-LAST:event_jmi_Eliminar_MaestroActionPerformed

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
    private javax.swing.JButton bt_Crear_Clase1;
    private javax.swing.JButton bt_Crear_Estudiante;
    private javax.swing.JButton bt_Crear_Maestro;
    private javax.swing.JButton bt_Modificar_Estudiante;
    private javax.swing.JButton bt_Modificar_Maestros;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_Crear_Carrera;
    private javax.swing.JDialog jd_Crear_Clase;
    private javax.swing.JDialog jd_Crear_Estudiantes;
    private javax.swing.JDialog jd_Crear_Maestros;
    private javax.swing.JDialog jd_Modificar_Estudiante;
    private javax.swing.JDialog jd_Modificar_Maestros;
    private javax.swing.JDialog jd_Moficar_Clase;
    private javax.swing.JList<String> jl_Clases;
    private javax.swing.JList<String> jl_Estudiantes;
    private javax.swing.JList<String> jl_Mestros;
    private javax.swing.JMenu jm_Carrera;
    private javax.swing.JMenu jm_Clases;
    private javax.swing.JMenu jm_Estudiantes;
    private javax.swing.JMenu jm_Maestros;
    private javax.swing.JMenuBar jmb_Opciones;
    private javax.swing.JMenuItem jmi_Eliminar;
    private javax.swing.JMenuItem jmi_Eliminar_Clase;
    private javax.swing.JMenuItem jmi_Eliminar_Maestro;
    private javax.swing.JMenuItem jmi_Modificar;
    private javax.swing.JMenuItem jmi_Modificar_Clase;
    private javax.swing.JMenuItem jmi_Modificar_Maestro;
    private javax.swing.JTree jt_Clases;
    private javax.swing.JPopupMenu pp_Arbol;
    private javax.swing.JPopupMenu pp_Lista_Clases;
    private javax.swing.JPopupMenu pp_Lista_Maestros;
    private javax.swing.JRadioButton rb_Adminsitracion;
    private javax.swing.JRadioButton rb_Biomedica;
    private javax.swing.JRadioButton rb_Derecho;
    private javax.swing.JRadioButton rb_DiseñoGrafico;
    private javax.swing.JRadioButton rb_Energia;
    private javax.swing.JRadioButton rb_Femenino;
    private javax.swing.JRadioButton rb_Femenino1;
    private javax.swing.JRadioButton rb_Finanzas;
    private javax.swing.JRadioButton rb_IndustrialydeSistemas;
    private javax.swing.JRadioButton rb_Masculino;
    private javax.swing.JRadioButton rb_Masculino1;
    private javax.swing.JRadioButton rb_Mecatronica;
    private javax.swing.JRadioButton rb_MedicinayCirugia;
    private javax.swing.JRadioButton rb_Mercadotecnia;
    private javax.swing.JRadioButton rb_No;
    private javax.swing.JRadioButton rb_No1;
    private javax.swing.JRadioButton rb_NurticionyTerapiaFisica;
    private javax.swing.JRadioButton rb_Ocupacional;
    private javax.swing.JRadioButton rb_Odontologia;
    private javax.swing.JRadioButton rb_Si;
    private javax.swing.JRadioButton rb_Si1;
    private javax.swing.JRadioButton rb_SistemasComputacionales;
    private javax.swing.JTextField tf_Apellido_Estudainte;
    private javax.swing.JTextField tf_Apellido_Estudainte1;
    private javax.swing.JTextField tf_Apellido_Maestro;
    private javax.swing.JTextField tf_Apellido_Maestro1;
    private javax.swing.JTextField tf_Clases;
    private javax.swing.JTextField tf_Clases1;
    private javax.swing.JTextField tf_Costo_Mensual;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_Edad_Maestro;
    private javax.swing.JTextField tf_Edad_Maestro1;
    private javax.swing.JTextField tf_Edificio;
    private javax.swing.JTextField tf_Edificio1;
    private javax.swing.JTextField tf_JefedeCarrera;
    private javax.swing.JTextField tf_Nombre_Carrera;
    private javax.swing.JTextField tf_Nombre_Clase;
    private javax.swing.JTextField tf_Nombre_Clase1;
    private javax.swing.JTextField tf_Nombre_Estudainte;
    private javax.swing.JTextField tf_Nombre_Estudainte1;
    private javax.swing.JTextField tf_Nombre_Maestro;
    private javax.swing.JTextField tf_Nombre_Maestro1;
    private javax.swing.JTextField tf_Numero_Cuenta_Estudiante;
    private javax.swing.JTextField tf_Numero_Cuenta_Estudiante1;
    private javax.swing.JTextField tf_Salario;
    private javax.swing.JTextField tf_Salario1;
    private javax.swing.JTextField tf_Salon;
    private javax.swing.JTextField tf_Salon1;
    private javax.swing.JTextField tf_Seccion;
    private javax.swing.JTextField tf_Seccion1;
    // End of variables declaration//GEN-END:variables
    Carrera c;
    Maestro m;
    Estudiante c1;
    DefaultMutableTreeNode nodo_seleccionado;
    Estudiante persona_seleccionada;
}
