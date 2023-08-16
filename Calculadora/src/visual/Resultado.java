package visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Resultado extends JFrame {
    private JButton OKButton;
    private JPanel resultadoPanel;
    private JLabel resultadoLabel;
    private Double numero;


    public Resultado(double numero){
        this.numero = numero;
        setContentPane(resultadoPanel);
        setTitle("Conversor de Unidades - Resultado");
        setSize(320,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        resultadoLabel.setText("Tienes " + String.valueOf(numero));

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Continuar continuar = new Continuar();
                continuar.setVisible(true);
                setVisible(false);
            }
        });
    }
}
