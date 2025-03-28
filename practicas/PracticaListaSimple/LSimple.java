package PracticaListaSimple;

public abstract class LSimple {
	protected NodoS p;
	LSimple()
	{
		p=null;
	}
	boolean esVacia()
	{
		if(p==null) return true;
		else return false;
	}
	abstract void adiPrimero(Object da);
	abstract void adiFin(Object da);
	abstract Object eliPrimero();
	abstract Object eliFin();
	abstract void mostrar();
	abstract int nElem();
	
}
