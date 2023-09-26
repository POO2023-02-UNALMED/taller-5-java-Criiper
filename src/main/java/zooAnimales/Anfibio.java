package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);

	}
	
	
	public Anfibio() {
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public static ArrayList<Anfibio> getListado(){
		return Anfibio.listado;
	}
	

	public void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}
	public int getRanas(){
		return Anfibio.ranas;
	}
	

	public void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}
	public int getSalamandras(){
		return Anfibio.salamandras;
	}
	

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public String getColorPiel(){
		return this.colorPiel;
	}


	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public boolean isVenenoso(){
		return this.venenoso;
	}



	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio (nombre, edad, "selva", genero, "rojo", true);
		ranas ++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras ++;
		return salamandra;
	}	}
