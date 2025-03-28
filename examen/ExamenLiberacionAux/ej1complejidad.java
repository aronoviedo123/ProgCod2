package ExamenLiberacionAux;

public class ej1complejidad {

	public static void main(String[] args) {
		long ti,tf;
		ti=System.currentTimeMillis();
		int n=4;
		String s = "bob";
		 char M[][] = {
				 {'b','v','p','c'},
				 {'a','l','e','b'},
				 {'l','o','t','k'},
				 {'i','c','b','m'}};
		 int i=0, j=0, k=0;
		 while(i<n) {
			 while(j<n){
				if(k<3 && M[j][i]==s.charAt(k)) {
					 k++;
					 break;
				 }
				j++;
			 }
			 i++;
		 }
		 System.out.println(k);
		 tf=System.currentTimeMillis();
		 System.out.println("\nTiempo de ejecucion: "+(tf-ti));
	}

}
