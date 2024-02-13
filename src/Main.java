import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1, label2, label3, label4;
    private JButton button1;
    public static String texto = "";

    public Main() {
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));



        label1 = new JLabel(imagen);
        label1.setBounds(25, 15, 300, 150);
        add(label1);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("©2017 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textField1 = new JTextField();
        textField1.setBounds(45, 240, 255, 25);
        textField1.setBackground(new Color(224, 224, 224));
        textField1.setFont(new Font("Andale Mono", 1, 14));
        textField1.setForeground(new Color(255, 0, 0));
        add(textField1);

        button1 = new JButton("Ingresar");
        button1.setBounds(125, 280, 100, 30);
        button1.setBackground(new Color(255, 255, 255));
        button1.setFont(new Font("Andale Mono", 1, 14));
        button1.setForeground(new Color(255,0,0));
        button1.addActionListener(this);
        add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            texto = textField1.getText().trim();
            if (texto.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
            }else {
                Licencia ventanaLicencia = new Licencia();
                ventanaLicencia.setBounds(0,0,700,450);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }


    }

    public static void main(String[] args) {
        Main bienbenido = new Main();
        bienbenido.setBounds(0,0,500,650);
        bienbenido.setVisible(true);
        bienbenido.setResizable(false);
        bienbenido.setLocationRelativeTo(null);
    }
}