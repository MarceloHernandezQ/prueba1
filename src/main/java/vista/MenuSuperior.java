/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Marcelo
 */
public class MenuSuperior extends JMenuBar {
    
    private JMenu menuArchivo;
     public JMenuItem archivoItemGuardar;
     public JMenuItem archivoItemSalir ;
    

    public MenuSuperior() {
        this.inicializadorComponente();
    }
    
    
    private void inicializadorComponente (){
        
        this.menuArchivo = new JMenu("Archivo");
        this.archivoItemGuardar = new JMenuItem("ho");
        this.archivoItemSalir = new JMenuItem("hkhf");
        
        
        this.menuArchivo.add(archivoItemGuardar);
        this.menuArchivo.add(archivoItemSalir);
        
        this.add(this.menuArchivo);
    }
}
