package vista;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLateral extends JPanel {

    public JButton btnGenerarBloque;
    public JButton posRobot1;
    public JButton btnCargarEnergia;
    public JButton postRobot2;

    public PanelLateral() {
        this.inicializarComponente();
    }

    public void inicializarComponente() {

        this.btnGenerarBloque = new JButton("Generar Bloques");
        this.btnCargarEnergia = new JButton("Cargar Energia");
        this.posRobot1 = new JButton("Pos Robot 1");
        this.postRobot2 = new JButton("Pos Robot 2");

        BoxLayout distribucion = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(distribucion);

        this.add(this.btnGenerarBloque);
        this.add(this.btnCargarEnergia);
        this.add(this.posRobot1);
        this.add(this.postRobot2);

    }
}
