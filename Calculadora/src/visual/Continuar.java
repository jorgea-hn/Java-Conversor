package visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Continuar extends JFrame{
    private JButton SIButton;
    private JButton NOButton;
    private JButton cancelButton;
    private JPanel continuarPanel;

    public Continuar() {
        setContentPane(continuarPanel);
        setTitle("Conversor de Unidades - Continuar");
        setSize(320,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        SIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal principal = new MenuPrincipal();
                principal.setVisible(true);
                setVisible(false);
            }
        });

        NOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Terminado terminado = new Terminado();
                terminado.setVisible(true);
                setVisible(false);
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
