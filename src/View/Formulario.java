package View;

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

        // ===== Labels =====
        lblValor1 = new JLabel("Valor 1:");
        lblValor1.setBounds(50, 30, 80, 25);
        form.add(lblValor1);

        lblValor2 = new JLabel("Valor 2:");
        lblValor2.setBounds(50, 70, 80, 25);
        form.add(lblValor2);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 120, 300, 25);
        form.add(lblResultado);

        // ===== TextFields =====
        txtValor1 = new JTextField();
        txtValor1.setBounds(130, 30, 150, 25);
        form.add(txtValor1);

        txtValor2 = new JTextField();
        txtValor2.setBounds(130, 70, 150, 25);
        form.add(txtValor2);

        // ===== Botões =====
        btnSomar = new JButton("+");
        btnSomar.setBounds(50, 180, 70, 30);
        form.add(btnSomar);

        btnSubtrair = new JButton("-");
        btnSubtrair.setBounds(130, 180, 70, 30);
        form.add(btnSubtrair);

        btnMultiplicar = new JButton("×");
        btnMultiplicar.setBounds(210, 180, 70, 30);
        form.add(btnMultiplicar);

        btnDividir = new JButton("÷");
        btnDividir.setBounds(290, 180, 70, 30);
        form.add(btnDividir);

        form.setVisible(true);
    }
}