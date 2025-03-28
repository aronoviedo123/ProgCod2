package Colas;

import java.util.Scanner;

public class ProceEstudiante {

	public static void main(String[] args) {
		Estudiante es; int n,i;
		CSCircular ce=new CSCircular(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el nro de Estudiantes:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			es=new Estudiante();
			es.leer();
			ce.adicionar((Estudiante)es);
		}
		//mostrando los estudiantes
		for(i=1;i<=n;i++)
		{
			es=(Estudiante)ce.eliminar();
			es.mostrar();
			ce.adicionar((Object)es);
		}
		//nota promedio:
		int noe,pr=0,max=0;
		for(i=1;i<=n;i++)
		{
			es=(Estudiante)ce.eliminar();
			noe=es.getNota();
			pr=pr+noe;
			if(noe>max) max=noe;
			ce.adicionar((Object)es);
		}
		System.out.println("\nNota Promedio = "+pr/n);
		for(i=1;i<=n;i++)
		{
			es=(Estudiante)ce.eliminar();
			if(es.getNota()==max) 
			{
				System.out.println("\nEstudiante con mas nota:");
				es.mostrar();
			}
			ce.adicionar((Object)es);
		}
		System.out.println("\n-PREGUNTAS ADICIONALES: ");
		//a)
		CSCircular a=new CSCircular(100);
		CSCircular r=new CSCircular(100);
		for(i=1;i<=n;i++)
		{
			es=(Estudiante)ce.eliminar();
			if((es.getNota()<51)&&(es.getNota()>10))
			{
				r.adicionar((Object)es);
			}
			if(es.getNota()<=10)
			{
				a.adicionar((Object)es);
			}
			ce.adicionar((Object)es);
		}
		System.out.println("\nCOLA DE REPROBADOS: ");
		for(i=1;i<=r.nElem();i++)
		{
			es=(Estudiante)r.eliminar();
			es.mostrar();
			r.adicionar((Object)es);
		}
		System.out.println("\nCOLA DE ABANDONOS: ");
		for(i=1;i<=a.nElem();i++)
		{
			es=(Estudiante)a.eliminar();
			es.mostrar();
			a.adicionar((Object)es);
		}
		
		//b)
		String est;
		System.out.println("\nINGRESE EL NOMBRE DEL ESTUDIANTE QUE DESEA VER SU NOTA");
		est=lee.next();
		for(i=1;i<=n;i++)
		{
			es=(Estudiante)ce.eliminar();
			if(es.getNom().compareTo(est)==0)
			{
				System.out.println("Nota del estudiante: "+es.getNota());
			}
			ce.adicionar((Object)es);
		}
		
		//c)
		String p;
		int nota2;
		System.out.println("\n¿HAY ERROR EN ALGUNA NOTA?");
		System.out.println("SI ES ASI DIGITE EL NOMBRE DE DICHO ESTUDIANTE: ");
		p=lee.next();
		for(i=1;i<=n;i++)
		{
			es=(Estudiante)ce.eliminar();
			if(es.getNom().compareTo(p)==0)
			{
				System.out.println("Ingrese la nueva nota del estudiante "+es.getNom());
				nota2=lee.nextInt();
				es.setNota(nota2);
				System.out.println("\nEstudiante con nota corregida: ");
				es.mostrar();
			}
			ce.adicionar((Object)es);
		}
	}

}
