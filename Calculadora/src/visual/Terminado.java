package visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Terminado  extends JFrame{
    private JButton OKButton;
    private JPanel terminadoPanel;

    public Terminado() {
        setContentPane(terminadoPanel);
        setTitle("Conversor de Unidades - Terminar");
        setSize(320, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
