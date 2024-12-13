import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {

   JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton crearBtm;
    private JLabel cedula;

    //para el boton
    public form1() {
        crearBtm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComunidadEPN miembro1 = new ComunidadEPN();
                miembro1.setCedula(cedulatxt.getText());


            }
        });
    }
}
