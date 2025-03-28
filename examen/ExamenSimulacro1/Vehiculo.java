package ExamenSimulacro1;

import java.util.Scanner;

public class Vehiculo {
	private String placa;
	private float importe;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la Placa:");
		placa=lee.next();
		System.out.println("Ingrese el Importe");
		importe=lee.nextFloat();
	}
	void mostrar()
	{
		System.out.println("Placa: "+placa);
		System.out.println("Importe: "+importe);
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
}
