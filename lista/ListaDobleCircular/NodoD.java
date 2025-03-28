package ListaDobleCircular;

public class NodoD {
	private NodoD sig,ant;
	private Object dato;
	NodoD()
	{
		sig=null;
		ant=null;
	}
	public NodoD getSig() {
		return sig;
	}
	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	public NodoD getAnt() {
		return ant;
	}
	public void setAnt(NodoD ant) {
		this.ant = ant;
	}
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	
}
