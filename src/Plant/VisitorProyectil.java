package Plant;
import Zombie.*;

public interface VisitorProyectil {
	
	public void visit(ClassicZombie z);
	
	public void accept(VisitorProyectil v);

	public void visit(ProyectilClasico proyectilClasico);
	
	public void visit(ProyectilCongelante proyectilCongelante);
	
}
