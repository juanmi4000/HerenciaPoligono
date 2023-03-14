package poligonos.modelo;

public class Punto implements Desplazable {
	private float x;
	private float y;

	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Punto(Punto punto) {
		x = punto.getX();
		y = punto.getY();
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	@Override
	public void desplazar(float incrementoX, float incrementoY) {
		this.x += incrementoX;
		this.y += incrementoY;
	}

	@Override
	public String toString() {
		return String.format("(%.2f, %.2f)", x, y);
	}

}
