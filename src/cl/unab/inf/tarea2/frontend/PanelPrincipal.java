package cl.unab.inf.tarea2.frontend;

import javax.swing.*;

public class PanelPrincipal extends JFrame {
    private JPanel contenedor;
    private JPanel botonera;
    private JButton cargarArchivo;
    private JLabel textoConfirmador;
    private JLabel titulo;

    public PanelPrincipal() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.contenedor);
        this.pack();
    }
}
