package visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpcionesMonedas extends JFrame {
    private JComboBox comboBox1;
    private JButton OKButton;
    private JButton cancelButton;
    private JPanel OpcionMonedasPanel;
    private Double numero;


    public OpcionesMonedas(double numero){
        this.numero = numero;
        setContentPane(OpcionMonedasPanel);
        setTitle("Conversor de Unidades - Monedas");
        setSize(320,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);












        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = (String)comboBox1.getSelectedItem();
                Double r=0.0;
                switch (option) {
                    case "De Peso a Dolar":
                         r = numero * 0.00024;
                        break;
                    case "De Peso a Euro":
                        r = numero *0.00022;
                        break;
                    case "De Peso a Libra" :
                        r = numero *0.00019;
                        break;
                    case "De Peso a Yen" :
                        r = numero * 0.036;
                        break;
                    case "De Peso a Won Coreano" :
                        r = numero * 0.33;
                        break;
                    case "De Dolar a Pesos" :
                        r = numero * 4124.19;
                        break;
                    case "De Euro a Pesos" :
                        r = numero * 4491.08;
                        break;
                    case "De Libras a Pesos" :
                        r = numero * 5253.22;
                        break;
                    default:
                        r = 0.0;
                }

                Resultado resultado = new Resultado(r);
                resultado.setVisible(true);
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


    //public static void main(String[] args) {
        //OpcionesMonedas menu = new OpcionesMonedas();
    //}
}
