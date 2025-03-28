package ExamenLiberacionAux;

public class NodoAr {
	Object dato;
	NodoAr si,sd;
	NodoAr()
	{
		si=null;
		sd=null;
	}
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public NodoAr getSi() {
		return si;
	}
	public void setSi(NodoAr si) {
		this.si = si;
	}
	public NodoAr getSd() {
		return sd;
	}
	public void setSd(NodoAr sd) {
		this.sd = sd;
	}
	
}
