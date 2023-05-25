
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class MascotasP {
	static ArrayList<MascotasP> listaMascotas;
	static HashMap<String, MascotasP> mapaMascotas;

	public static void main(String[] args) {
		mapaMascotas = new HashMap<>();
	
		MascotasP mascota1 = new MascotasP();
		mascota1.numID=11059;
		mascota1.nombre="Bruno";
		mascota1.especie="Gato";
		mascota1.edad=7;
		mapaMascotas.put(mascota1.nombre, mascota1);
		
		MascotasP mascota2 = new MascotasP();
		mascota2.numID=11320;
		mascota2.nombre="Princesa";
		mascota2.especie="Perro";
		mascota2.edad=4;
		mapaMascotas.put(mascota2.nombre, mascota2);
	
		MascotasP mascota3 = new MascotasP();
		mascota3.numID=4433;
		mascota3.nombre="Michin";
		mascota3.especie="Gato";
		mascota3.edad=7;
		mapaMascotas.put(mascota3.nombre, mascota3);
		
		
		
		
		for (MascotasP mascota : mapaMascotas.values()) {
			System.out.println("Identificacion: " + mascota.numID);
			System.out.println("Nombre: " + mascota.nombre);
			System.out.println("Especie: " + mascota.especie);
			System.out.println("Edad: " + mascota.edad);
			System.out.println(mascota.nombre +mascota.Caminar());
			System.out.println("---------------------------");
			}


	}
	
	
	
	int numID, edad;
	String nombre, especie, mensaje;

	public MascotasP () {}
	

	public void mostrarInfo () {
		System.out.println("Identificacion: "+ numID);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Especie: "+ especie);
		System.out.println("Edad: "+ edad);
	}
	
	public void Comunicarse () {
	if (especie.equalsIgnoreCase("perro")) {
		System.out.println("¡Guau guau!");
		} else if (especie.equalsIgnoreCase("gato")) {
		System.out.println("¡Miau miau!");
		} else {
		System.out.println("La mascota no hace sonidos conocidos.");
		}
	}

	public String Caminar() {
		mensaje="Caminando";
		return mensaje;
	}
	
	


}

	

