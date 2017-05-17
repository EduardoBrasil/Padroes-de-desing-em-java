package abstractFactory;

public class ShapesFactory extends AbstractFactory {

	@Override
	public Shapes getShape(String typeShape) {
		// verifica se o tipo de forma não veio nula
		if (typeShape == null) {
			return null;
		}
		if (typeShape == "CIRCLE") {
			return new Circle();
		} else if (typeShape == "SQUARE") {
			return new Square();
		} else if (typeShape == "RECTANGLE") {
			return new Rectangle();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
}
