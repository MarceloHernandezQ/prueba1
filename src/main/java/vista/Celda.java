package vista;

import java.awt.Color;
import javax.swing.JButton;

public class Celda extends JButton {
	private int energia;
	private boolean solido;
	private boolean ocupado;

	public Celda() {
	this.energia = 0;
        this.solido = false;
        this.ocupado = false;
        this.setToolTipText("hdhjdfh");
        this.setText("hola");
        
        this.setEnabled(false);
        
	}

	public int getEnergia() {
		return this.energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public boolean getSolido() {
		return this.solido;
	}

	public void setSolido(boolean solido) {
		this.solido = solido;
	}

	public boolean getOcupado() {
		return this.ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}