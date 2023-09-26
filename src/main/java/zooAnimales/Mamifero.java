package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	public static ArrayList<Mamifero> listado;
	public static int caballos = 0;
	public static int leones = 0;
	public boolean pelaje;
	public int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero() {
	}
	
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public static ArrayList<Mamifero> getListado(){
		return Mamifero.listado;
	}
	
	public void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}
	public int getCaballos(){
		return Mamifero.caballos;
	}
	
	public void setLeones(int leones) {
		Mamifero.leones = leones;
	}
	public int getLeones(){
		return Mamifero.leones;
	}
	
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getPatas(){
		return this.patas;
	}
	
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public boolean isPelaje(){
		return this.pelaje;
	}
	
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		Mamifero.caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones++;
		return leon;
	}
	
	
	
	
	
	
	
	
}
