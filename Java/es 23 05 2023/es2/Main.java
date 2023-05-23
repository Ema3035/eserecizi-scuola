
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton incrementa;
    private JButton decrementa;
    private int valore;

    public Main() {
        super("Incrementa/Decrementa");
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        textField = new JTextField(10);
        incrementa = new JButton("Incrementa");
        decrementa = new JButton("Decrementa");
        add(textField);
        add(incrementa);
        add(decrementa);
        incrementa.addActionListener(this);
        decrementa.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementa) {
            valore = Integer.parseInt(textField.getText());
            valore++;
            textField.setText(String.valueOf(valore));
        } else if (e.getSource() == decrementa) {
            valore = Integer.parseInt(textField.getText());
            valore--;
            textField.setText(String.valueOf(valore));
        }
    }
}