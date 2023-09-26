package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private  Zoologico zoo;
	private static ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	} 

	public void setAnimales(ArrayList<Animal> animales) {
		Zona.animales = animales;
	}
	public ArrayList<Animal> getAnimales(){
		return animales;
	} 
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;		
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}

