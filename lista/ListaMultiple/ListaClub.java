package ListaMultiple;
import java.util.Scanner;
public class ListaClub {
	private NodoClub p; 
	ListaClub() 
	{ 
	 p=null; 
	} 
	 
	boolean esVacia() 
	{ 
	if (p==null) return true; 
	else return false; 
	} 
	 
	NodoClub getCabecera() 
	{return p;} 
	 
	void setCabecera(NodoClub y) 
	{p=y;} 
	 
	void adiClub() 
	{ 
	 NodoClub z,u; 
	 String nc,fe; 
	 Scanner lee=new Scanner(System.in); 
	 System.out.println("Nombre del Club"); 
	 nc=(lee.next()).toUpperCase(); 
	 if (buscar(nc)==null){ 
	                       z=new NodoClub(); 
	                       System.out.println("Anio de Fundacion"); 
	                       fe=lee.next(); 
	                       z.setNom(nc); 
	                       z.setAf(fe); 
	                       if (esVacia()) p=z; 
	                       else { 
	                         u=p; 
	                         while(u.getSig()!=null) 
	                          u=u.getSig(); 
	                         u.setSig(z); 
	                        } 
	                       } 
	else System.out.println("El club deportivo "+nc+" ya esta registrado"); 
	} 
	 
	NodoClub buscar(String cl) 
	{ 
	  NodoClub x,res=null;String nc; 
	  x=p; 
	  while(x!=null) 
	  { 
	    nc=x.getNom(); 
	    if (nc.equals(cl)){ 
	                       res=x;
	                       break; 
	                      } 
	else x=x.getSig(); 
	  } 
	return res; 
	} 
	 
	void adiClubJugador(String nc,String cai) 
	{ 
	 NodoClub nclu; 
	 nclu=buscar(nc); 
	 if (nclu!=null){ 
	                 NodoClub x; 
	                 Lista<Jugador> lij; 
	                 Jugador ju; 
	                 lij=nclu.getLiju(); 
	                   System.out.println("Datos complementarios del jugador"); 
	                 ju=new Jugador();ju.lee2(); 
	                 ju.setCi(cai); 
	                 lij.adiFin(ju); 
	                 } 
	else System.out.println("No existe el club"+nc); 
	} 
	 
	void adiClubDirigente(String nc,String nd) 
	{ 
	 NodoClub nclu; 
	 nclu=buscar(nc); 
	 if (nclu!=null)
	 { 
	           NodoClub x; 
	           Lista<Dirigente> lid; 
	           Dirigente di;  
	           lid=nclu.getLidi(); 
	           System.out.println("Datos complementarios del dirigente"); 
	           di=new Dirigente();di.lee2(); 
	           di.setNom(nd); 
	           lid.adiFin(di); 
	  } 
	else System.out.println("No existe el club"+nc); 
	} 
	 
	void mostrar() 
	{  
	  NodoClub x; 
	  Lista<Jugador> a;Lista<Dirigente> b; 
	  x=p; 
	  while (x!=null) 
	  { 
	   System.out.println("Club "+x.getNom()+"\t AnioFundacion "+x.getAf()); 
	   a=x.getLiju(); 
	   System.out.println("Lista de Jugadores");a.mostrarLisJugador(); 
	   b=x.getLidi(); 
	   System.out.println("Lista de Dirigentes");b.mostrarDirigente(); 
	   x=x.getSig(); 
	  } 
	} 
	int numClub() 
	{ 
		NodoClub x;int cont=0; 
		if (!esVacia()){ 
			x=p;cont=1; 
			while (x.getSig()!=null) 
			{ 
				x=x.getSig(); 
				cont++; 
			} 
		} 
	return cont; 
	} 
	void edadProJugadores() 
	{ 
		double ep=0,se=0,s;int i,n,nj=0; 
		NodoClub x=p; 
		Jugador ju; 
		Lista<Jugador> lj; NodoD<Jugador> y; 
		while (x!=null) 
		{ 
			lj=x.getLiju(); n=lj.nElem(); 
			y=lj.getCabecera();s=0; 
		for(i=1;i<=n;i++) 
		{ 
			ju=y.getDato(); 
			s+=ju.getEdad(); 
			y=y.getSig(); 
		} 
		if (n>0)System.out.println("Edad promedio en "+x.getNom()+" es "+(s/n)); 
		else System.out.println("No hay jugadores en "+x.getNom()); 
			nj+=n;//nj=nj+n 
			se+=s;//se=se+s 
			x=x.getSig(); 
		} 
		if (nj>0) System.out.println("Edad promedio de los jugadores "+se/nj); 
		else System.out.println("Clubes sin jugadores"); 
	} 
	void clubMasDirigentes() 
	{ 
		int nd=0,n,may=0;NodoClub x,madi; 
		x=p; 
		Lista<Dirigente> ld; 
		NodoD<Dirigente>y; 
		while (x!=null) 
		{ 
			ld=x.getLidi(); 
			n=ld.nElem(); 
			if (n>may) may=n; 
			x=x.getSig(); 
		} 
		System.out.println("El (los) Club(es) que tiene()n mas dirigentes es (son)"); 
		x=p; 
		while (x!=null) 
		{
			ld=x.getLidi(); 
			 n=ld.nElem(); 
			 if (n==may) System.out.println(x.getNom()); 
			 x=x.getSig(); 
		} 
		
	} 	 
	public static void main(String[] args) { 
		ListaClub c=new ListaClub(); 
		Scanner lee=new Scanner(System.in); 
		String ci,clu,res="s",nom; 
		do 
		{ 
		c.adiClub(); 
		System.out.println("Otro club? <Si=s><No=Otra tecla>"); 
		res=(lee.next()).toLowerCase(); 
		}while (res.equals("s")); 
		System.out.println("Ingresando Jugadores y Dirigentes en Clubes"); 
		do 
		{ 
			System.out.println("Club?"); 
			clu=(lee.next()).toUpperCase();       
			System.out.print("Desea ingresar un jugador en "+clu+"?"); 
			System.out.println("<Si=s><No cualquier tecla"); 
			res=(lee.next()).toLowerCase(); 
			while (res.equals("s")) 
			{ 
				System.out.println("Carnet Identidad ?"); 
				ci=lee.next(); 
				c.adiClubJugador(clu,ci); 
				System.out.print("Desea ingresar otro jugador en "+clu+"?"); 
				System.out.println("<Si=s><No cualquier tecla"); 
				res=(lee.next()).toLowerCase(); 
			} 
			  	System.out.print("Desea ingresar un dirigente en "+clu+"?"); 
			  	System.out.println("<Si=s><No cualquier tecla"); 
			  	res=(lee.next()).toLowerCase(); 
		while (res.equals("s")) 
		{ 
			System.out.println("Nombre"); 
			nom=lee.next(); 
			c.adiClubDirigente(clu,nom); 
			System.out.print("Desea ingresar otro dirigente en "+clu+"?"); 
			System.out.println("<Si=s><No cualquier tecla"); 
			res=(lee.next()).toLowerCase(); 
		} 
			System.out.println("Otro club? <Si=s><No=otra tecla>"); 
			res=(lee.next()).toLowerCase(); 
		}while (res.equals("s")); 
		
		c.mostrar(); 
		System.out.println("Numero de clubes"+c.numClub()); 
		c.edadProJugadores(); 
		c.clubMasDirigentes(); 
	} 	 
}
