package _p147_TercerExamenParcial;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame implements ActionListener {
    // Lista de jugadores
    ArrayList<Jugador> jugadores;

    // Componentes de la interfaz de usuario
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    /**
     * Constructor de la aplicación.
     */
    public App() {
        super("Datos de Jugadores de Fútbol");

        // Inicializar la lista de jugadores
        jugadores = Util.inicializarDatos();

        // Configurar la interfaz de usuario
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Configurar el menú Archivo
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);

        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);

        smnGuardar = new JMenuItem("Guardar");
        smnGuardar.addActionListener(this);
        mnuArchivo.add(smnGuardar);

        mnuArchivo.add(new JSeparator());

        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        mnuArchivo.add(smnSalir);

        // Configurar el menú Ayuda
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);

        smnAcercade = new JMenuItem("Acerca de ..");
        smnAcercade.addActionListener(this);
        mnuAyuda.add(smnAcercade);

        // Configurar el diálogo Acerca de
        jdlAcercaDe = new JDialog(this, "Acerca de ..");
        jdlAcercaDe.setSize(300, 250);
        jdlAcercaDe.setLocationRelativeTo(null);

        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Brayan Alejandro Luna Ibarra</html>",
                JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1));

        // Configurar el panel de la tabla
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);

        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);

        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(
                new String[] { "Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario" });
        table.setModel(modelo);

        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });
        // Configurar el panel de datos
        pnlDatos = new JPanel();
        add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 2, 5, 5)); // Cambiado a GridLayout y agregado espacio entre componentes

        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);

        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);

        lblSexo = new JLabel("Sexo");
        lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);

        lblEstadoCivil = new JLabel("Estado Civil");
        lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);

        lblDescripcion = new JLabel("Descripción");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);

        lblSalario = new JLabel("Salario");
        lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);

        // Configurar el panel de botones
        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);

        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);

        add(pnlBotones);

        // Configuración de la ventana principal
        setBounds(10, 10, 550, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Cargar datos iniciales y desactivar campos
        cargarDatos();
        activarCampos(false);
    }

    /**
     * Método que se llama cuando ocurre un evento de acción.
     *
     * @param e El evento de acción.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[] { "dat" }));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    jugadores = Util.desSerializarDatos(arch.getName());
                    cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[] { "dat" }));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    Util.serializarDatos(arch.getName(), jugadores);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " + arch.getName(), "Correcto",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    /**
     * Carga los datos de los jugadores en la tabla.
     */
    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        while (dm.getRowCount() > 0)
            dm.removeRow(0);
        Object[] obj = new Object[6];
        for (int i = 0; i < jugadores.size(); i++) {
            obj[0] = jugadores.get(i).getNombre();
            obj[1] = jugadores.get(i).getEdad();
            obj[2] = jugadores.get(i).getSexo();
            obj[3] = jugadores.get(i).getEstadoCivil();
            obj[4] = jugadores.get(i).getDescripcion();
            obj[5] = jugadores.get(i).getSalario();
            modelo.addRow(obj);
        }
    }

    /**
     * Muestra los datos de un jugador en los campos de texto.
     *
     * @param ren Índice de la fila seleccionada en la tabla.
     */
    public void mostrarDatos(int ren) {
        txtNombre.setText(jugadores.get(ren).getNombre());
        txtEdad.setText(Integer.toString((jugadores.get(ren).getEdad())));
        txtSexo.setText(Character.toString((jugadores.get(ren).getSexo())));
        txtEstadoCivil.setText(jugadores.get(ren).getEstadoCivil());
        txtDescripcion.setText(jugadores.get(ren).getDescripcion());
        txtSalario.setText(Double.toString(jugadores.get(ren).getSalario()));
    }

    /**
     * Activa o desactiva los campos de entrada de datos.
     *
     * @param actdes true para activar, false para desactivar.
     */
    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                cp.setEnabled(actdes);
    }

    /**
     * Limpia los campos de entrada de datos.
     */
    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                ((JTextField) cp).setText("");
    }

    /**
     * Guarda los datos de un nuevo jugador.
     */
    public void guardarCampos() {
        Jugador jugador = new Jugador();
        jugador.setNombre(txtNombre.getText());
        jugador.setEdad(Integer.parseInt(txtEdad.getText()));
        jugador.setSexo(txtSexo.getText().charAt(0));
        jugador.setEstadoCivil(txtEstadoCivil.getText());
        jugador.setDescripcion(txtDescripcion.getText());
        jugador.setSalario(Double.parseDouble(txtSalario.getText()));
        jugadores.add(jugador);
        cargarDatos();
    }

    /**
     * Método principal que inicia la aplicación.
     */
    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
    }
}
