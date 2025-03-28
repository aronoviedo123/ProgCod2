package Arboles;

public class ej6 {

	public static void main(String[] args) {
		//Dado un  ABNormal cambiar los pares que tengan 2 hijos de modo que estos sean los
		//inmediatos pares al padre
		ABNormal a=new ABNormal();
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
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
				if((xi!=null)&&(xd!=null))
				{
					if((int)x.getDato()%2==0)
					{
						xi.setDato((int)x.getDato()+2);
						xd.setDato((int)x.getDato()+4);
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
