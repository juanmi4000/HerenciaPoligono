package poligonos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import poligonos.modelo.Cuadrado;
import poligonos.modelo.Poligono;
import poligonos.modelo.Punto;
import poligonos.modelo.Triangulo;

public class MainApp {
	private static final float LIMITE_PUNTOS = 100f;
	private static final float LIMITE_LADOS = 10f;
	private static final float LIMITE_INCREMENTOS = 50f;
	private static Random generador = new Random();
	
	public static void main(String[] args) {
		List<Poligono> poligonos = generarPoligonos();
		desplazarPoligonos();
		
	}
	
	private List<Poligono> generarPoligonos(){
		List<Poligono> poligonos = new ArrayList<>();
		poligonos.add(new Triangulo (generarPunto(), generarLado()));
		poligonos.add(new Cuadrado(generarPunto(), generarLado()));
	}
	
	private static final void mostrarPoligonos(List<Poligono> poligonos) {
		for (Poligono poligono : poligonos) {
			if (poligono instanceof Triangulo) {
				System.out.printf("Triangulo -> %s%n", poligono);
			} else if (poligono instanceof Cuadrado) {
				System.out.printf("Cuadrado -> %s%n", poligono);
			}
			System.out.printf("\tTrayectoria -> %s%n", poligono.getTrayectoria());
		}
	}
	
	private static final Punto generarPunto() {
		return new Punto(generador.nextFloat() * LIMITE_PUNTOS - LIMITE_PUNTOS / 2, generador.nextFloat() * LIMITE_PUNTOS - LIMITE_PUNTOS / 2);
	}
	
	private static final Punto generarLado() {
		return new Punto(generador.nextFloat() * LIMITE_LADOS - LIMITE_LADOS / 2, generador.nextFloat() * LIMITE_LADOS - LIMITE_LADOS / 2);
	}
	
}
