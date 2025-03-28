package ArbolBinarioNormal;

public class PruebaABNormal {

	public static void main(String[] args) {
		ABNormal a=new ABNormal();
		a.leer();
		a.m_Nivel();
		System.out.println("\nEnorden");
		a.m_enordenRe(a.getRaiz());
		System.out.println("\nPreOrden");
		a.m_preordenRe(a.getRaiz());
		System.out.println("\nPosorden");
		a.m_posordenRe(a.getRaiz());
	}

}
