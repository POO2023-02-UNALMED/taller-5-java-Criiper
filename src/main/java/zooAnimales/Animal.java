package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal(String nombre, int edad, String habitat, String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public Animal() {
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getnombre(){
		return this.nombre;
	}
	

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad(){
		return this.edad;
	} 
	

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getHabitat(){
		return this.habitat;
	} 
	

	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero(){
		return this.genero;
	} 

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	public ArrayList<Zona> getZona(){
		return this.zona;
	} 
	
	
	
	public int getTotalAnimales() {
		return this.totalAnimales;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo(){
		return	"Mamiferos: " + Mamifero.cantidadMamiferos() + "\\nAves: " + Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios() + "\n" + getTotalAnimales() + " es el numero de animales por cada subclase.";
				
	}
	
	public String toString() {
		if(this.zona.size() != 0) {
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + this.zona.get(0) + ", en el " + this.zona.get(0).getZoo();
		}
		else {
		return	"Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;	
		}
	}	
}	
