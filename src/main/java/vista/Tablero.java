package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Tablero extends JPanel {

    private final int filas;
    private final int columnas;
    public Celda[][] celda;
    double  PORCENTAJE_SOLIDOS  = 0.65; 
    int CANTIDAD_MAX_ENERGIA = 8 ;
    public Tablero(int numColum, int numFila) {

        this.columnas = numColum;
        this.filas = numFila;
        this.inicializadorComponentes();

    }

    private void inicializadorComponentes() {

        this.celda = new Celda[this.filas][this.columnas];
        this.setLayout(new GridLayout(this.filas, this.columnas));
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                this.celda[i][j] = new Celda();
                this.add(this.celda[i][j]);

               
            }
        }
        
    }

    public void cargarEnergia() {
        
        Random azar = new Random();
        
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                
                this.celda[i] [j].setText(""+azar.nextInt(CANTIDAD_MAX_ENERGIA));
               
            }
        }
    }
    
    public void generalBloques() {
        
        Random azar = new Random();
        int cont = 0 ;
         int totalCelda = filas * columnas ;
         int celdasSolidas = (int )(totalCelda * this.PORCENTAJE_SOLIDOS);
         
         while (cont <celdasSolidas){
             
             int x = azar.nextInt(this.filas);
             int y  = azar.nextInt(this.columnas);
             if (!this.celda[x][y].getSolido()){
                 this.celda[x] [y] .setBackground(Color.blue);
             }
             
             
         }
         
     
    }
    
   
            
}
