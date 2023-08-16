package visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntradaDatosDinero extends JFrame{
    private JTextField textFieldData;
    private JButton cancelButton;
    private JButton OKButton;
    private JPanel EntryPanel;
    private JLabel ErrorLabel;


    public EntradaDatosDinero(){
        setContentPane(EntryPanel);
        setTitle("Conversor de Unidades - Input");
        setSize(320,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String data = textFieldData.getText();
                    double numero = Double.parseDouble(data);
                    OpcionesMonedas opciones = new OpcionesMonedas(numero);
                    opciones.setVisible(true);
                    setVisible(false);
                } catch (NumberFormatException error) {
                    ErrorLabel.setText("El dato no es numérico.");
                }

            }
        });


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


    //public static void main(String[] args) {
        //EntradaDatosDinero entryData = new EntradaDatosDinero();
    //}
}
