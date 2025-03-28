package PracticaArboles;

public class ej1 {

	public static void main(String[] args) {
		// Dado un árbol binario normal que contiene datos numéricos 
		//construir un árbol binario normal similar de modo que Se dupliquen los datos repetidos 
		ABNormal a=new ABNormal();
		a.leer();
		a.m_Nivel();
		NodoAr x,xi = null,xd = null;
		int sw=0,dato = 0;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		x=a.getRaiz();
		ni.adicionar(x);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				xi=x.getSi();
				xd=x.getSd();
				if(sw==0)
				{
					if(xd!=null)
					{
						if((int)xd.getDato()==(int)x.getDato())
						{
							sw=1;
							dato=(int)x.getDato();
						}
					}
					if(xi!=null)
					{
						if((int)xi.getDato()==(int)x.getDato())
						{
							sw=1;
							dato=(int)x.getDato();
						}
					}
					
				}
				
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);
				
			}
			ni.vaciar(su);
		}
		if(sw==1)
		{
			xd.setDato((Object)dato);
			xi.setDato((Object)dato);
		}
		System.out.println("\nRESULTADO:");
		a.m_Nivel();
	}

}
