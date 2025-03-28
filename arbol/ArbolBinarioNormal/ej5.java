package ArbolBinarioNormal;
public class ej5 {
	
	public static void main(String[] args) {
		//Dado un ABNormal Mostrar aquellos padres que tengan hijos pares.
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
				if(xi!=null)
				{
					if((int)xi.getDato()%2==0)
					{
						if(xd!=null)
						{
							if((int)xd.getDato()%2==0)
							{
								System.out.println("\nEl padre de pares es: "+x.getDato());
							}
						}
						else
						{
							System.out.println("\nEl padre de pares es: "+x.getDato());
						}
					}
				}
				else
				{
					if(xd!=null)
					{
						if((int)xd.getDato()%2==0)
						{
							System.out.println("\nEl padre de pares es: "+x.getDato());
						}
					}
				}
				
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);
				
			}
			ni.vaciar(su);
		}

	}

}
