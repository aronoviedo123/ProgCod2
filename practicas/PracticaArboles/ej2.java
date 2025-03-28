package PracticaArboles;

public class ej2 {

	public static void main(String[] args) {
		// Dados dos árboles binarios normales verificar si son equivalentes. 
		ABNormal a=new ABNormal();
		ABNormal b=new ABNormal();
		System.out.println("INGRESE LOS DATOS DEL ARBOL 1:");
		a.leer();
		System.out.println("\nINGRESE LOS DATOS DEL ARBOL 2:");
		b.leer();
		System.out.println("\n--------------------------------------------------------");
		System.out.println("\nARBOL 1:");
		a.m_Nivel();
		System.out.println("\n--------------------------------------------------------");
		System.out.println("\nARBOL 2:");
		b.m_Nivel();
		int sw=0;
		NodoAr xa,xia,xda,xb,xib,xdb;
		Pila nia=new Pila(100);
		Pila sua=new Pila(100);
		Pila nib=new Pila(100);
		Pila sub=new Pila(100);
		xa=a.getRaiz();
		xb=b.getRaiz();
		nia.adicionar(xa);
		nib.adicionar(xb);
		if(sw==0)
		{
			while((!nia.esVacia())&&(!nib.esVacia())) 
			{
				while((!nia.esVacia())&&(!nib.esVacia())) 
				{
					xa=(NodoAr) nia.eliminar();
					xb=(NodoAr) nib.eliminar();
					xia=xa.getSi();
					xib=xb.getSi();
					xda=xa.getSd();
					xdb=xb.getSd();
					if(xa.getDato()!=xb.getDato())
					{
						sw=1;
					}
					if(xia!=null) sua.adicionar((Object)xia);
					if(xib!=null) sub.adicionar((Object)xib);
					if(xda!=null) sua.adicionar((Object)xda);
					if(xdb!=null) sub.adicionar((Object)xdb);
					
				}
				nia.vaciar(sua);
				nib.vaciar(sub);
			}
		}
		else
		{
			System.out.println("\nNO SON ARBOLES EQUIVALENTES");
		}
		if(sw==0)
		{
			System.out.println("\nLOS DOS SON ARBOLES EQUIVALENTES (IGUALES)");
		}
		
	}

}
