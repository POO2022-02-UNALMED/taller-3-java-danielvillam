package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		canal=1;
		precio=500;
		this.estado=estado;
		volumen=1;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal=canal;
	}
	
	public void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	
	public int getNumTV() {
		return TV.numTV;
	}
	
	public void turnOn() {
		estado=false;
	}
	
	public void turnOff() {
		estado=true;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(canal>=1 && canal>120 && estado==true) {
			canal++;
		}
	}
	
	public void canalDown() {
		if(canal<=120 && canal>1 && estado==true) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if(volumen>=0 && canal>7 && estado==true) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if(canal<=7 && canal>0 && estado==true) {
			volumen--;
		}
	}
}
