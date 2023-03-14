package poligonos.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Poligono implements Desplazable, Trazable {

	private float lado;
	private List<Punto> trayectoria;
	private Punto centro;

	protected Poligono(Punto centro, float lado) {
		this.centro = centro;
		this.lado = lado;
		trayectoria = new ArrayList<>();
	}

	public float getLado() {
		return lado;
	}

	public void desplazar(float incrementoX, float incrementoY) {
		trayectoria.add(new Punto(centro));
		centro.desplazar(incrementoX, incrementoY);
	}

	public Punto getCentro() {
		return centro;
	}

	public List<Punto> getTrayectoria() {
		return trayectoria;
	}

	@Override
	public String toString() {
		return String.format("Lado: %.2f, Área: %.2f, Perímetro: %.2f, Vértices: %s", lado, getArea(), getPerimetro(),
				getVertices());
	}

	public abstract List<Punto> getVertices();

	public abstract float getArea();

	public abstract float getPerimetro();

}
