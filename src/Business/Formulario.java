package Business;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario {

    private JFrame form;
    private JLabel lblValor1, lblValor2, lblResultado;
    private JTextField txtValor1, txtValor2;
    private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        form = new JFrame("Calculadora com Swing");
        form.setBounds(600, 250, 500, 300);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLayout(null);
        Container painelDeConteudo = form.getContentPane();


        form.setVisible(true);
    }
}