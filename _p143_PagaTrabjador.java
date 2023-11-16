
import javax.swing.*;
import java.awt.event.*;

public class _p143_PagaTrabjador extends JFrame implements ActionListener {
    JLabel lblBase, lblAltura, lblResultado, lblPaga;
    JTextField txtBase, txtAltura, txtPaga;
    JButton btnCalcular, btnSalir;

    public _p143_PagaTrabjador() {
        super("Calcular el sueldo de un trabajador ");
        setLayout(null);
        lblBase = new JLabel("Horas trabajadas :");
        lblBase.setBounds(10, 20, 200, 30);
        add(lblBase);
        txtBase = new JTextField();
        txtBase.setBounds(120, 20, 200, 30);
        add(txtBase);
        lblAltura = new JLabel("Impuestos a calcular :");
        lblAltura.setBounds(10, 50, 200, 30);
        add(lblAltura);
        txtAltura = new JTextField();
        txtAltura.setBounds(120, 50, 200, 30);
        add(txtAltura);
        lblPaga = new JLabel("Paga por hora :");
        lblPaga.setBounds(10, 80, 200, 30);
        add(lblPaga);
        txtPaga = new JTextField();
        txtPaga.setBounds(120, 80, 200, 30);
        add(txtPaga);

        lblResultado = new JLabel(" [Resultado Aqui]");
        lblResultado.setBounds(90, 110, 200, 30);
        add(lblResultado);
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 150, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 150, 100, 40);
        add(btnSalir);
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public float getArea(float base, float altura, float paga) {
        return (base * paga) - ((base * paga) * altura);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                float base = Float.parseFloat(txtBase.getText());
                float altura = Float.parseFloat(txtAltura.getText());
                float paga = Float.parseFloat(txtPaga.getText());
                float area = getArea(base, altura, paga);
                lblResultado.setText(String.format("%.2f", area));

            } catch (Exception E) {
                JOptionPane.showMessageDialog(this,
                        "Debes escribir numeros y ademas no deben de haber espacios vacios camara", "Que paso Amigo",
                        JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();

        }
    }

    public static void main(String[] args) {
        _p143_PagaTrabjador app = new _p143_PagaTrabjador();
        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
