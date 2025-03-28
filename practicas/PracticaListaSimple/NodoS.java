package PracticaListaSimple;

public class NodoS {
	private Object dato;
	private NodoS sig;
	NodoS()
	{
		sig=null;
	}
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public NodoS getSig() {
		return sig;
	}
	public void setSig(NodoS sig) {
		this.sig = sig;
	}
}
