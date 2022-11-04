package Plant;

public abstract class Planta extends Entidad{

	protected int vida;
	protected int costo;
	
	public Planta(int x, int y, int anchoRec, int largoRec) {
		super(x, y, anchoRec, largoRec);
	}
	
	public void morir() {
		vida = 0;
	};
	
	public int getCosto() {
		return costo;
	}
}
