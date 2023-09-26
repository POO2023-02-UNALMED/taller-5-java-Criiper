package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	
	private	static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);

	}
	
	public Pez() {
		listado.add(this);
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public static ArrayList<Pez> getListado(){
		return Pez.listado;
	}
	

	public void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}
	public int getSalmones(){
		return Pez.salmones;
	}
	

	public void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}
	public int getBacalaos(){
		return Pez.bacalaos;
	}
	

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public int getCantidadAletas(){
		return this.cantidadAletas;
	}


	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas(){
		return this.colorEscamas;
	}



	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
		salmones ++;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez (nombre, edad, "oceano", genero, "gris", 6);
		bacalaos ++;
		return bacalao;
	}	
}
