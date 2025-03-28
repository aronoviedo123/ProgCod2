package ArbolBinarioNormal;

public class ej1 {
	public static void main(String[] args) {
		//dado un ABNormal mostrar los nodos terminales pares
		ABNormal a=new ABNormal();
		a.leer();
		a.m_Nivel();
		
		//ejericio 1
		NodoAr x,xi,xd;
		int ctp=0;
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
				if((xi==null)&&(xd==null)&&((int)x.getDato()%2==0))
				{
					ctp++;
				}
				else
				{
					if(xi!=null) su.adicionar((Object)xi);
					if(xd!=null) su.adicionar((Object)xd);
				}
				
			}
			ni.vaciar(su);
		}
		System.out.println("la cantidad de nodos terminales pares son: "+ctp);
		
		
	}
}
