package Zombie;
import Plant.*;

public interface VisitorZombie {
	
	public void visit(Planta p );
	
	public void accept(VisitorZombie v);
	
}
