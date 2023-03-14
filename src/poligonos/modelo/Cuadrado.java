package poligonos.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cuadrado extends Poligono {
	public Cuadrado(Punto centro, float lado) {
		super(centro, lado);
	}

	@Override
	public List<Punto> getVertices() {
		List<Punto> verticesCuadradro = new ArrayList<>();
		verticesCuadradro.add(new Punto(getCentro().getX() - (getLado() / 2), getCentro().getY() - (getLado() / 2)));
		verticesCuadradro.add(new Punto(getCentro().getX() - (getLado() / 2), getCentro().getY() + (getLado() / 2)));
		verticesCuadradro.add(new Punto(getCentro().getX() + (getLado() / 2), getCentro().getY() + (getLado() / 2)));
		verticesCuadradro.add( new Punto(getCentro().getX() + (getLado() / 2), getCentro().getY() - (getLado() / 2)));
		return verticesCuadradro;
	}
	
	@Override
	public float getArea() {
		return (float) Math.pow(getLado(), 2);
	}

	@Override
	public float getPerimetro() {
		return 4 * getLado();
	}

}
