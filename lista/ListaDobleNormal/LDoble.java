package ListaDobleNormal;

public abstract class LDoble {
	protected NodoD p;
	LDoble()
	{
		p=null;
	}
	boolean esVacia()
	{
		if(p==null) return true;
		else return false;
	}
	abstract void adiFin(Object da);
	abstract void adiPrimero(Object da);
	abstract Object eliPrimero();
	abstract Object eliFin();
	abstract void mostrar();
	abstract int nElem();
}
