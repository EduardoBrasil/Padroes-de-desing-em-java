package factory;

class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		// obtem o objeto vindo de circulo e invoca o metodo draw.
		Shape shape1 = ShapeFactory.getShape("CIRCLE");
		// chama metodo de desenho do circulo
		shape1.draw();

		// obtem o objeto vindo de quadrado e invoca o metodo draw.
		Shape shape2 = ShapeFactory.getShape("SQUARE");
		// chama metodo de desenho do circulo
		shape2.draw();

		// obtem o objeto vindo de quadrado e invoca o metodo draw.
		Shape shape3 = ShapeFactory.getShape("RECTANGLE");
		// chama metodo de desenho do circulo
		shape3.draw();

	}
}