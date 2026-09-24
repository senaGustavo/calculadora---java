package View;

import Business.Adicao;
import Business.Subtracao;
import Business.Multiplicacao;
import Business.Divisao;
import Business.Calculo;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private void calcular(Calculo calculo) {
        calculo.calcular();                     // chama o método da interface
        lblResultado.setText("Resultado: " + calculo.getResultado());
    }
    private float pegarValor1() {
        return Float.parseFloat(txtValor1.getText());
    }

    private float pegarValor2() {
        return Float.parseFloat(txtValor2.getText());
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

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular(new Adicao(pegarValor1(), pegarValor2()));
            }
        });

        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular(new Subtracao(pegarValor1(), pegarValor2()));
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular(new Multiplicacao(pegarValor1(), pegarValor2()));
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float v2 = pegarValor2();
                if (v2 == 0) {
                    lblResultado.setText("Resultado: Erro - divisão por zero!");
                    return;
                }
                calcular(new Divisao(pegarValor1(), v2));
            }
        });


        form.setVisible(true);
    }
}