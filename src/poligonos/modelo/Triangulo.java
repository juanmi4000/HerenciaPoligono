package poligonos.modelo;

import java.util.ArrayList;
import java.util.List;

public class Triangulo extends Poligono {
	public Triangulo(Punto centro, float lado) {
		super(centro, lado);
	}

	@Override
	public List<Punto> getVertices() {
		List<Punto> verticesTriangulo = new ArrayList<>();
		float ap = (float) ((Math.sqrt(3) / 6)) * getLado();
		float radio = (float) (getLado() / Math.sqrt(3));
		verticesTriangulo.add(new Punto(getCentro().getX() - (getLado() / 2), getCentro().getY() - ap));
		verticesTriangulo.add(new Punto(getCentro().getX(), getCentro().getY() + radio));
		verticesTriangulo.add(new Punto(getCentro().getX() + (getLado() / 2), getCentro().getY() - ap));
		return verticesTriangulo;

	}

	@Override
	public float getArea() {
		return (float) ((Math.sqrt(3) / 4) * Math.pow(getLado(), 2));

	}

	@Override
	public float getPerimetro() {
		return 3 * getLado();
	}

}
