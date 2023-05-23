import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    private JLabel lblNumero, lblRadice, lblQuadrato;
    private JTextField txtNumero, txtRadice, txtQuadrato;
    private JButton btnCalcola;

    public Main() {
        super("Calcolo radice e calcolo del quadrato");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        lblNumero = new JLabel("Numero");
        lblRadice = new JLabel("Radice quadrata");
        lblQuadrato = new JLabel("Quadrato");
        txtNumero = new JTextField();
        txtRadice = new JTextField();
        txtRadice.setEditable(false);
        txtQuadrato = new JTextField();
        txtQuadrato.setEditable(false);
        btnCalcola = new JButton("Calcola");

        add(lblNumero);
        add(txtNumero);
        add(lblRadice);
        add(txtRadice);
        add(lblQuadrato);
        add(txtQuadrato);
        add(btnCalcola);

        btnCalcola.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int numero = Integer.parseInt(txtNumero.getText());
        txtRadice.setText("" + Math.sqrt(numero));
        txtQuadrato.setText("" + Math.pow(numero, 2));
    }

    public static void main(String[] args) {
        new Main();
    }
}