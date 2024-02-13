import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu menuopciones, menucalcular, menuacercade, menucolorfondo;
    private JMenuItem micalculo, mirojo, minegro, mimorado, mielcreador, misalir, minuevo;
    private JLabel labellogo, labelbienvenido, labeltitle, labelnombre, labelpaterno, labelmaterno, labeldepartamento, labelantiguedad, labelresultado, labelfooter;
    private JTextField txtnombretrabajador, txtpaternotrabajador, txtmaternotrabajador;
    private JComboBox combodepartamento, comboantiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombreAdministrador = "";


    public Principal(){
        setLayout(null);
        setTitle("pantalla principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Main ventanaBienvenido = new Main();
        nombreAdministrador = ventanaBienvenido.texto;

        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);

        menuopciones = new JMenu("Opciones");
        menuopciones.setBackground(new Color(255,0,0));
        menuopciones.setFont(new Font("Andale Mono",1,14));
        menuopciones.setForeground(new Color(255,255,255));
        mb.add(menuopciones);

        menucalcular = new JMenu("Calcular");
        menucalcular.setBackground(new Color(255,0,0));
        menucalcular.setFont(new Font("Andale Mono",1,14));
        menucalcular.setForeground(new Color(255,255,255));
        mb.add(menucalcular);

        menuacercade = new JMenu("Acerca de");
        menuacercade.setBackground(new Color(255,0,0));
        menuacercade.setFont(new Font("Andale Mono",1,14));
        menuacercade.setForeground(new Color(255,255,255));
        mb.add(menuacercade);

        menucolorfondo = new JMenu("Color de fondo");
        menucolorfondo.setFont(new Font("Andale Mono",1,14));
        menucolorfondo.setForeground(new Color(255,0,0));
        menuopciones.add(menucolorfondo);

        micalculo = new JMenuItem("Vacaciones");
        micalculo.setFont(new Font("Andale Mono",1,14));
        micalculo.setForeground(new Color(255,0,0));
        menucalcular.add(micalculo);
        micalculo.addActionListener(this);

        mirojo = new JMenuItem("rojo");
        mirojo.setFont(new Font("Andale Mono",1,14));
        mirojo.setForeground(new Color(255,0,0));
        menucolorfondo.add(mirojo);
        mirojo.addActionListener(this);

        minegro = new JMenuItem("Negro");
        minegro.setFont(new Font("Andale Mono",1,14));
        minegro.setForeground(new Color(255,0,0));
        menucolorfondo.add(minegro);
        minegro.addActionListener(this);

        mimorado = new JMenuItem("Morado");
        mimorado.setFont(new Font("Andale Mono",1,14));
        mimorado.setForeground(new Color(255,0,0));
        menucolorfondo.add(mimorado);
        mimorado.addActionListener(this);

        minuevo = new JMenuItem("Nuevo");
        minuevo.setFont(new Font("Andale Mono",1,14));
        minuevo.setForeground(new Color(255,0,0));
        menuopciones.add(minuevo);
        minuevo.addActionListener(this);

        mielcreador = new JMenuItem("El creador");
        mielcreador.setFont(new Font("Andale Mono",1,14));
        mielcreador.setForeground(new Color(255,0,0));
        menuacercade.add(mielcreador);
        mielcreador.addActionListener(this);

        misalir = new JMenuItem("Salir");
        misalir.setFont(new Font("Andale Mono",1,14));
        misalir.setForeground(new Color(255,0,0));
        menuopciones.add(misalir);
        misalir.addActionListener(this);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        labellogo = new JLabel(imagen);
        labellogo.setBounds(5,5,250,100);
        add(labellogo);

        labelbienvenido = new JLabel("Bienvenido " + nombreAdministrador);
        labelbienvenido.setBounds(280,30,300,50);
        labelbienvenido.setFont(new Font("Andale Mono",1,32));
        labelbienvenido.setForeground(new Color(255,255,255));
        add(labelbienvenido);

        labeltitle = new JLabel("Datos de trabajador para calculovacacional");
        labeltitle.setBounds(45,140,900,25);
        labeltitle.setFont(new Font("Andale Mono",0,24));
        labeltitle.setForeground(new Color(255,255,255));
        add(labeltitle);


        labelnombre = new JLabel("Nombre completo :");
        labelnombre.setBounds(25,188,188,25);
        labelnombre.setFont(new Font("Andale Mono",1,12));
        labelnombre.setForeground(new Color(255,255,255));
        add(labelnombre);

        txtnombretrabajador = new JTextField();
        txtnombretrabajador.setBounds(25,213,150,25);
        txtnombretrabajador.setBackground(new java.awt.Color(224,224,224));
        txtnombretrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtnombretrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtnombretrabajador);

        labelpaterno = new JLabel("Apellido paterno");
        labelpaterno.setBounds(25,248,180,25);
        labelpaterno.setFont(new Font("Andale Mono",1,12));
        labelpaterno.setForeground(new Color(255,255,255));
        add(labelpaterno);

        txtpaternotrabajador = new JTextField();
        txtpaternotrabajador.setBounds(25,273,150,25);
        txtpaternotrabajador.setBackground(new java.awt.Color(224,224,224));
        txtpaternotrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtpaternotrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtpaternotrabajador);

        labelmaterno = new JLabel("Apellido materno");
        labelmaterno.setBounds(25,308,180,25);
        labelmaterno.setFont(new Font("Andale Mono",1,12));
        labelmaterno.setForeground(new Color(255,255,255));
        add(labelmaterno);

        txtmaternotrabajador = new JTextField();
        txtmaternotrabajador.setBounds(25,334,150,25);
        txtmaternotrabajador.setBackground(new java.awt.Color(224,224,224));
        txtmaternotrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtmaternotrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtmaternotrabajador);

        labeldepartamento = new JLabel("Seleccione departamento");
        labeldepartamento.setBounds(220,188,180,25);
        labeldepartamento.setFont(new Font("Andale Mono",1,12));
        labeldepartamento.setForeground(new Color(255,255,255));
        add(labeldepartamento);

        combodepartamento = new JComboBox();
        combodepartamento.setBounds(220,213,220,25);
        combodepartamento.setBackground(new java.awt.Color(224,224,224));
        combodepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
        combodepartamento.setForeground(new java.awt.Color(255,0,0));
        add(combodepartamento);
        combodepartamento.addItem("");
        combodepartamento.addItem("Atencion al cliente");
        combodepartamento.addItem("Departamento de logistica");
        combodepartamento.addItem("Departamento de gerencia");

        labelantiguedad = new JLabel("Seleccione antiguedad");
        labelantiguedad.setBounds(220,248,180,25);
        labelantiguedad.setFont(new Font("Andale Mono",1,12));
        labelantiguedad.setForeground(new Color(255,255,255));
        add(labelantiguedad);

        comboantiguedad = new JComboBox();
        comboantiguedad.setBounds(220,273,220,25);
        comboantiguedad.setBackground(new java.awt.Color(224,224,224));
        comboantiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
        comboantiguedad.setForeground(new java.awt.Color(255,0,0));
        add(comboantiguedad);
        comboantiguedad.addItem("");
        comboantiguedad.addItem("1 Año de servicio ");
        comboantiguedad.addItem("2 a 6 años de servicio ");
        comboantiguedad.addItem("7 Años o mas de servicio ");

        labelresultado = new JLabel("Resultado del calculo :");
        labelresultado.setBounds(220,307,180,25);
        labelresultado.setFont(new Font("Andale Mono",1,12));
        labelresultado.setForeground(new Color(255,255,255));
        add(labelresultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224,224,224));
        textarea1.setFont(new Font("Andale Mono",1,11));
        textarea1.setForeground(new Color(255,0,0));
        textarea1.setText("\n   Aqui aparece el resultado");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220,333,385,90);
        add(scrollpane1);


        labelfooter = new JLabel("2020 The Coca-Cola Company todos los derechos reservados");
        labelfooter.setBounds(135,445,500,30);
        labelfooter.setFont(new java.awt.Font("Andale Mono",1,12));
        labelfooter.setForeground(new java.awt.Color(255,255,255));
        add(labelfooter);



    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == micalculo) {

            String nombretrabajador = txtnombretrabajador.getText();
            String AP = txtpaternotrabajador.getText();
            String AM = txtmaternotrabajador.getText();
            String Departamento = combodepartamento.getSelectedItem().toString();
            String Antiguedad = comboantiguedad.getSelectedItem().toString();

            if (nombretrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");

            } else {

                if (Departamento.equals("Atencion al Cliente")) {

                    if (Antiguedad.equals("1 ano de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 6 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 anos de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 14 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 anos o mas de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 20 dias de vacaciones.");
                    }

                }
                if (Departamento.equals("Departamento de Logistica")) {

                    if (Antiguedad.equals("1 ano de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 7 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 anos de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 15 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 anos o mas de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 22 dias de vacaciones.");
                    }
                }
                if (Departamento.equals("Departamento de Gerencia")) {

                    if (Antiguedad.equals("1 ano de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 10 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("2 a 6 anos de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 20 dias de vacaciones.");
                    }
                    if (Antiguedad.equals("7 anos o mas de servicio")) {
                        textarea1.setText("\n   El trabajador " + nombretrabajador + " " + AP + " " + AM +
                                "\n   quien labora en " + Departamento + " con " + Antiguedad +
                                "\n   recibe 30 dias de vacaciones.");
                    }
                }
            }
        }

        if (e.getSource() == mirojo) {
            getContentPane().setBackground(new Color(255,0,0));
            }
        if (e.getSource() == minegro) {
            getContentPane().setBackground(new Color(0,0,0));

        }
        if (e.getSource() == mimorado) {
            getContentPane().setBackground(new Color(51,0,51));

        }
        if (e.getSource() == minuevo) {
            txtnombretrabajador.setText("");
            txtpaternotrabajador.setText("");
            txtmaternotrabajador.setText("");
            combodepartamento.setSelectedIndex(0);
            comboantiguedad.setSelectedIndex(0);
            textarea1.setText("\n   Aqu� aparece el resultado del c�lculo de las vacaciones.");
        }
        if (e.getSource() == misalir) {
            Main bienbenido = new Main();
            bienbenido.setBounds(0,0,500,650);
            bienbenido.setVisible(true);
            bienbenido.setResizable(false);
            bienbenido.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == mielcreador) {
            JOptionPane.showMessageDialog(null,"Desarrollado por Jarol G. V.");
        }
    }
    public static void main(String[] args){
        Principal caja = new Principal();
        caja.setBounds(0,0,740,635);
        caja.setVisible(true);
        caja.setLocationRelativeTo(null);
    }
}