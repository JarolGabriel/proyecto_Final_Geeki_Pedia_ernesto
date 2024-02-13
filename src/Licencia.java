import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1,label2;
    private JCheckBox check1;
    private JButton button1, button2;
    private JScrollPane scrollPane1;
    private  JTextArea textArea1;
    String nombre ="";

    public Licencia(){
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Main ventanaBienbenido = new Main();
        nombre = ventanaBienbenido.texto;

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setText("\n\n          T�RMINOS Y CONDICIONES" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCI�N SIN AUTORIZACI�N DE LA GEEKIPEDIA DE ERNESTO." +
                "\n            B.  PROHIBIDA LA ALTERACI�N DEL C�DIGO FUENTE O DISE�O DE LAS INTERFACES GR�FICAS." +
                "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACI�N RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n          PARA MAYOR INFORMACI�N SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                "\n          ");
        textArea1.setFont(new Font("Andale Mono", 0, 9));
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10,40,575,200);
        add(scrollPane1);

        check1 = new JCheckBox("Yo " + nombre + " Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        button1 = new JButton("Continuar");
        button1.setBounds(10,290,100,30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);


        button2 = new JButton("No Acepto");
        button2.setBounds(120,290,100,30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/coca-cola.png"));
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            Principal caja = new Principal();
            caja.setBounds(0,0,740,635);
            caja.setVisible(true);
            caja.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == button2){
            Main bienbenido = new Main();
            bienbenido.setBounds(0,0,500,650);
            bienbenido.setVisible(true);
            bienbenido.setResizable(false);
            bienbenido.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected() == true){
            button1.setEnabled(true);
            button2.setEnabled(false);
        }else{
            button1.setEnabled(false);
            button2.setEnabled(true);
        }


    }

    public static void main(String[] args) {
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0,0,700,450);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);
    }
}
