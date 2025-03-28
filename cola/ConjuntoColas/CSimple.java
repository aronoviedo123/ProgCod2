package ConjuntoColas;

public abstract class CSimple {
	protected int ini,fin,max;
	protected  Object v[]=new Object[100];
	CSimple(int ca)
	{
		ini=0;
		fin=0;
		max=ca;
	}
	abstract boolean esLlena();
	abstract boolean esVacia();
	abstract void adicionar(Object ele);
	abstract Object eliminar();
	abstract void mostrar();
	abstract int nElem();
}
