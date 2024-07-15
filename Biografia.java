import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia extends JFrame {
    private JButton fotoHobbieButton;
    private JPanel Panel_Biografia;
    private JButton SALIRButton;

    public Biografia (){
        super("BIOGRAFIA");
        setContentPane(Panel_Biografia);

        fotoHobbieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hobbies ventana_hobbies = new Hobbies();
                ventana_hobbies.iniciar();
                dispose();
            }
        });
        SALIRButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Login ventana_login = new Login();
                ventana_login.iniciar();
                dispose();
            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(700,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
