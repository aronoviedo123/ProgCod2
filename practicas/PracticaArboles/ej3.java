package PracticaArboles;

public class ej3 {

	public static void main(String[] args) {
		//dato un ABB se pide veridficar si es un arbol binario completo
		//mostrar el mensaje
		ABB a=new ABB();
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
		int sw=0;
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
					if((xi.getSi()==null)&&(xi.getSd()==null))
					{
						sw=1;
					}
				}
				if(xd!=null)
				{
					if((xd.getSi()==null)&&(xd.getSd()==null))
					{
						sw=1;
					}
				}
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);
				
			}
			ni.vaciar(su);
		}
		if(sw==0)
		{
			System.out.println("\nES UN ARBOL BINARIO COMPLETO");
		}
		else
		{
			System.out.println("\nNOO ES UN ARBOL BINARIO COMPLETO");
		}
	}

}
