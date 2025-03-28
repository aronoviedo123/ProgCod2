package ArbolBinarioNormal;

public class ej3 {

	public static void main(String[] args) {
		// dado un ABNormal mostrar los niveles donde existen mas datos
		ABNormal a=new ABNormal();
		a.leer();
		a.m_Nivel();
		
		//ejericio 3
		NodoAr x,xi,xd;
		Object ele;
		int mn=0,cn;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		x=a.getRaiz();
		ni.adicionar((Object)x);
		while(!ni.esVacia()) 
		{
			cn=0;
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				cn=cn+1;
				xi=x.getSi();
				xd=x.getSd();
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);	
			}
			if(cn>mn)
			{
				mn=cn;
			}
			ni.vaciar(su);
		}
		System.out.println("\nMaximo de nodos en los niveles: "+mn);
		x=a.getRaiz();
		int nuni=0;
		ni.adicionar((Object)x);
		while(!ni.esVacia()) 
		{
			cn=0;
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				cn=cn+1;
				xi=x.getSi();
				xd=x.getSd();
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);	
			}
			ni.vaciar(su);
			nuni++;
			if(cn==mn)
			{
				System.out.println("\nNivel con mas elementos: "+nuni);
			}
		}
		

	}

}
