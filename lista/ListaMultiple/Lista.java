package ListaMultiple;

public class Lista<T> {
	private NodoD<T>p; 
	Lista() 
	{p=null;} 
	boolean esVacia() 
	{ 
		if(p==null)return true; 
		else return false; 
	} 
	void adiFin(T da) 
	{ 
		NodoD<T> x,z; 
		z=new NodoD<T>(); 
		z.setDato(da); 
		if (p==null) p=z; 
		else 
		{ 
			x=p; 
			while (x.getSig()!=null) 
				x=x.getSig(); 
			z.setAnt(x); x.setSig(z); 
		} 
	} 
	int nElem() 
	{ 
		NodoD<T> x;int i=0; 
		if (!esVacia()){ 
			i=1;x=p; 
			while(x.getSig()!=null) 
			{ 
				x=x.getSig();i++; 
			} 
		} 
		return i;  
	} 
	NodoD getCabecera() 
	{ 
		return p;} 
	void setCabecera(NodoD q)
	{ 
		p=q; 
	} 
	void mostrarLisJugador() 
	{ 
		NodoD<T> x;Jugador juga; 
		x=p; 
		while (x!=null) 
		{ 
			juga=(Jugador)x.getDato(); 
			juga.mostrar(); 
			x=x.getSig();  
		}   
	} 
	void mostrarDirigente() 
	{ 
		NodoD<T> x;Dirigente di; 
		x=p; 
		while (x!=null) 
		{ 
			di=(Dirigente)x.getDato(); 
			di.mostrar(); 
			x=x.getSig(); 
		}   
	} 
	boolean buscarJugador(String cai) 
	{ 
		NodoD<T> x;Jugador juga; 
		boolean res=false;x=p; 
		while (x!=null) 
		{ 
			juga=(Jugador)x.getDato(); 
			if((juga.getCi()).equals(cai)) {res=true;break;} 
			else x=x.getSig(); 
		}   
		return res; 
	} 
	boolean buscarDirigente(String n) 
	{ 
		NodoD<T> x;Dirigente di; 
		boolean res=false; x=p; 
		while (x!=null) 
		{ 
			di=(Dirigente)x.getDato(); 
			if((di.getNom()).equals(n)) {res=true;break;} 
			else x=x.getSig(); 
		}   
		return res; 
	} 
		
}
