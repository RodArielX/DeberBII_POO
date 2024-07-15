import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbies extends JFrame {

    private JPanel Panel_Hobbies;
    private JButton salirButton;
    private JLabel imagen;

    public Hobbies(){
        super("HOBBIES");
        setContentPane(Panel_Hobbies);
        ImageIcon icon = new ImageIcon(getClass().getResource("img/controlador.jpg"));
        imagen.setIcon(icon);

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biografia ventana_biografia = new Biografia();
                ventana_biografia.iniciar();
                dispose();
            }
        });

    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(850,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
