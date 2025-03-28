package Pilas;

import java.util.Scanner;

public class Cuaderno {
	private String cod,mar;
	private int nh;
	private float pre;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese codigo");
		cod=lee.next();
		System.out.println("Ingrese marca");
		mar=lee.next();
		System.out.println("Ingrese nro de hojas");
		nh=lee.nextInt();
		System.out.println("Ingrese precio");
		pre=lee.nextFloat();
	}
	void mostrar()
	{
		System.out.println("Codigo: "+cod);
		System.out.println("Marca: "+mar);
		System.out.println("Nro de Hojas: "+nh);
		System.out.println("Precio: "+pre);
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	public int getNh() {
		return nh;
	}
	public void setNh(int nh) {
		this.nh = nh;
	}
	public float getPre() {
		return pre;
	}
	public void setPre(float pre) {
		this.pre = pre;
	}
	
	
}
