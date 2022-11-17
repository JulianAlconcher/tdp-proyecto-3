package Zombie;
import Plant.*;

public interface VisitorZombie {
	
	public void visit(Planta p );
	
	public void visit(PlantaMina pm);
	
	public void accept(VisitorZombie v);
	
}
