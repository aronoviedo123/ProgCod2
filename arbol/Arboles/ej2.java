package Arboles;

public class ej2 {

	public static void main(String[] args) {
		//dado un ABNormal mostrar los nodos 
		ABNormal a=new ABNormal();
		a.leer();
		a.m_Nivel();
		
		//ejericio 2
		NodoAr x,xi,xd;
		Object ele;
		int cn=0,ch=0;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		x=a.getRaiz();
		ni.adicionar(x);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				cn++;
				xi=x.getSi();
				xd=x.getSd();
				if((xi==null)&&(xd==null))
				{
					ch++;	
				}
				else
				{
					if(xi!=null) su.adicionar((Object)xi);
					if(xd!=null) su.adicionar((Object)xd);
				}
				
			}
			ni.vaciar(su);
		}
		if(cn>1)
		{
			System.out.println("la cantidad de nodos internos son: "+(cn-ch-1));
		}
		else
		{
			System.out.println("No hay nodos internos");
		}

	}

}
