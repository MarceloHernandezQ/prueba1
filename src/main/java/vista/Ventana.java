package vista;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

public class Ventana extends JFrame implements ActionListener {

    public Tablero tablero;
    public PanelLateral panel;
    public MenuSuperior menuSuperior;

    public Ventana() {

        this.iniciarComponentess();
    }

    public void iniciarComponentess() {
        this.tablero = new Tablero(5, 5);
        this.add(this.tablero, BorderLayout.CENTER);
        
        
//        this.menuSuperior = new MenuSuperior();
//
//        this.panelLateral.btnCargarEnergia.addActionListener(this);
//        this.panelLateral.btnGenerarBloque.addActionListener(this);
//        this.panelLateral.posRobot1.addActionListener(this);
//        this.panelLateral.posRobot2.addActionListener(this);
//
//        this.menuSuperior.archivoItemSalir.addActionListener(this);
//        this.menuSuperior.archivoItemReiniciar.addActionListener(this);

        this.menuSuperior = new MenuSuperior();

       this.panel.btnGenerarBloque.addActionListener(this);
       this.panel.btnCargarEnergia.addActionListener(this);
        this.panel.posRobot1.addActionListener(this);
        this.panel.postRobot2.addActionListener(this);
          
        this.add(this.menuSuperior , BorderLayout.NORTH);
        this.panel = new PanelLateral();
        this.add(this.panel,BorderLayout.EAST);
        this.add(this.tablero , BorderLayout.CENTER);
       

        this.setSize(700, 400);
        this.setLocation(150, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Robot");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.panel.btnGenerarBloque == e.getSource()) {
            this.tablero.generalBloques();
        } else if (this.panel.btnCargarEnergia == e.getSource()) {
            this.tablero.cargarEnergia();

        }
       

    }
}
