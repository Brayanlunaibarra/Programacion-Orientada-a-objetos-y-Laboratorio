import javax.swing.*;
import java.awt.event.*;

public class _p144_Temperaturas extends JFrame implements ActionListener {
    JLabel lblCantidad, lblResultado;
    JTextField txtCantidad;
    JRadioButton rbtnCentigrados, rbtnFarenheit;
    ButtonGroup grupoBotones;
    JButton btnCalcular, btnSalir;

    public _p144_Temperaturas() {
        super("Calcular temperatura :) ");
        setLayout(null);

        lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(10, 20, 200, 30);
        add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(120, 20, 200, 30);
        add(txtCantidad);

        // Crear botones de radio
        rbtnCentigrados = new JRadioButton("Centígrados");
        rbtnCentigrados.setBounds(30, 60, 120, 30);
        add(rbtnCentigrados);

        rbtnFarenheit = new JRadioButton("Farenheit");
        rbtnFarenheit.setBounds(160, 60, 120, 30);
        add(rbtnFarenheit);

        // Crear un grupo para los botones de radio
        grupoBotones = new ButtonGroup();
        grupoBotones.add(rbtnCentigrados);
        grupoBotones.add(rbtnFarenheit);

        lblResultado = new JLabel("[Resultado Aquí]");
        lblResultado.setBounds(90, 110, 200, 30);
        add(lblResultado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 150, 100, 40);
        add(btnCalcular);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 150, 100, 40);
        add(btnSalir);

        // Agregar escuchadores de eventos a los botones y botones de radio
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
        rbtnCentigrados.addActionListener(this);
        rbtnFarenheit.addActionListener(this);
    }

    public float convertirACentigrados(float cantidad) {
        return ((9.0f / 5.0f) * cantidad) + 32;
    }

    public float convertirAFarenheit(float cantidad) {
        return ((5.0f / 9.0f) * (cantidad - 32));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                float cantidad = Float.parseFloat(txtCantidad.getText());

                // Verificar cuál botón de radio está seleccionado
                if (rbtnCentigrados.isSelected()) {
                    float resultado = convertirACentigrados(cantidad);
                    lblResultado.setText(String.format("Resultado en Centígrados: %.2f", resultado));
                } else if (rbtnFarenheit.isSelected()) {
                    float resultado = convertirAFarenheit(cantidad);
                    lblResultado.setText(String.format("Resultado en Farenheit: %.2f", resultado));
                } else {
                    JOptionPane.showMessageDialog(this, "Debes seleccionar Centígrados o Farenheit", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debes escribir un número en la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        _p144_Temperaturas app = new _p144_Temperaturas();
        app.setBounds(10, 10, 400, 250);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
