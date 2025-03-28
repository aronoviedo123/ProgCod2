package PracticaArboles;

public class ejercicioExamen {

	public static void main(String[] args) {
		ABB a=new ABB();
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		x=a.getRaiz();
		ni.adicionar(x);
		int c=0;
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				xi=x.getSi();
				xd=x.getSd();
				if(xi==null)
				{
					if(xd!=null)
					{
						x.setDato(xd.getDato());
						x.setSd(null);
					}
				}
				else
				{
					if(xd==null)
					{
						x.setDato(xi.getDato());
						x.setSi(null);
					}
				}
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);
				
			}
			ni.vaciar(su);
		}
		System.out.println("\nRESULTADO:");
		a.m_Nivel();

	}

}
