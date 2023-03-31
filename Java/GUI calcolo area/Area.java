import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Area extends JFrame {
    private JLabel lblBase, lblAltezza, lblTriangolo, lblRettangolo;
    private JTextField txtBase, txtAltezza;
    private JButton btnCalcola;
    private JTextArea txtOutput;

    public Area() {
        super("Area e perimetro");
        setLayout(new FlowLayout());
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblBase = new JLabel("Base:");
        add(lblBase);
        txtBase = new JTextField(10);
        add(txtBase);

        lblAltezza = new JLabel("Altezza:");
        add(lblAltezza);
        txtAltezza = new JTextField(10);
        add(txtAltezza);

        btnCalcola = new JButton("Calcola");
        add(btnCalcola);

        txtOutput = new JTextArea(10, 30);
        txtOutput.setEditable(false);
        add(txtOutput);

        lblTriangolo = new JLabel("Triangolo: ");
        add(lblTriangolo);
        lblRettangolo = new JLabel("Rettangolo: ");
        add(lblRettangolo);

        setVisible(true);

        btnCalcola.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double base = Double.parseDouble(txtBase.getText());
                double altezza = Double.parseDouble(txtAltezza.getText());
    
                // Calcola l'area del triangolo
                double areaTriangolo = (base * altezza) / 2;
                lblTriangolo.setText("Triangolo: " + areaTriangolo);
    
                // Calcola il perimetro del rettangolo
                double perimetroRettangolo = 2 * (base + altezza);
    
                // Calcola l'area del rettangolo
                double areaRettangolo = base * altezza;
                lblRettangolo.setText("Rettangolo: " + perimetroRettangolo + "Rettangolo: " + areaRettangolo);
            }
        });
    }
}