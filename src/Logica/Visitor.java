package Logica;

public interface Visitor {
	
	public void visit(Visitor v);
	public abstract void accept(Visitor v);
}
