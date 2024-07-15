import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton iniciarSesionButton;
    private JPanel Panel_Login;

    public Login(){
        super("Inicio de Sesion");
        setContentPane(Panel_Login);


        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = "arielx16";
                String usuarioIngresado = textField1.getText();
                textField1.setText("");
                String password = "123456";
                String contraIngresada = textField2.getText();
                textField2.setText("");


                if (contraIngresada.equals(password) && usuarioIngresado.equals(usuario)){
                    Biografia ventana_biografia = new Biografia();
                    ventana_biografia.iniciar();
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null,"INTENTA OTRA VEZ","ERROR DE LOGIN", JOptionPane.ERROR_MESSAGE);
                    textField2.setText("");
                }

            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




