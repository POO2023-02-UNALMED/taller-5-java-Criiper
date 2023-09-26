package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	public static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	public String colorEscamas;
	public int largoColas;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoColas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoColas = largoColas;
		listado.add(this);

	}
	
	public Reptil() {}
	
	public static int cantidadReptiles() {
		return listado.size();
	}

	public String movimiento() {
		return "reptar";
	}
	
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	public static ArrayList<Reptil> getListado(){
		return Reptil.listado;
	}
	

	public void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}
	public int getIguanas(){
		return Reptil.iguanas;
	}
	

	public void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}
	public int getSerpientes(){
		return Reptil.serpientes;
	}
	

	public void setLargoCola(int largoColas) {
		this.largoColas = largoColas;
	}
	public int getLargoCola(){
		return this.largoColas;
	}


	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas(){
		return this.colorEscamas;
	}



	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil (nombre, edad, "humedal", genero, "verde", 3);
		iguanas ++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil (nombre, edad, "jungla", genero, "blanco", 1);
		serpientes ++;
		return serpiente;
	}
}

