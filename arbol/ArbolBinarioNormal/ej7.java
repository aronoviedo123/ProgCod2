package ArbolBinarioNormal;

public class ej7 {

	public static void main(String[] args) {
		//dado un ABNormal eliminar las hojas
		ABNormal a=new ABNormal();
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		x=a.getRaiz();
		if((x.getSi()==null)&&(x.getSd()==null))
		{
			a.setRaiz(null);
		}
		else
		{
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
						if((xi.getSi()==null)&&(xi.getSd()==null))
						{
							x.setSi(null);
							xi=null;
						}
					}
					if(xd!=null)
					{
						if((xd.getSi()==null)&&(xd.getSd()==null))
						{
							x.setSd(null);
							xd=null;
						}
					}
					if(xi!=null) su.adicionar((Object)xi);
					if(xd!=null) su.adicionar((Object)xd);
					
				}
				ni.vaciar(su);
			}
		}
		System.out.println("\nRESULTADO:");
		a.m_Nivel();

	}

}
