package visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame{
    private JPanel MenuPanel;
    private JComboBox comboBoxOption;
    private JButton OKButton;
    private JButton cancelButton;


    public MenuPrincipal(){
        setContentPane(MenuPanel);
        setTitle("Conversor de Unidades - Menu");
        setSize(320,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = (String)comboBoxOption.getSelectedItem();
                EntradaDatosDinero entrydata = new EntradaDatosDinero();
                entrydata.setVisible(true);
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

    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
    }
}
