package abstractFactory;

public class AbstractFactoryDemo {
		public static  void main (String[] args){
	
	//obtem uma forma da fabrica
	AbstractFactory ShapeFactory = FactoryProducer.getFactory("SHAPE");
	
	//cria um objeto do tipo circulo
	Shapes shape1 = ShapeFactory.getShape("CIRCLE");
	//desenha o metodo circulo
	shape1.draw();
	
	Shapes shape2 = ShapeFactory.getShape("SQUARE");
	shape2.draw();
	
	Shapes shape3 = ShapeFactory.getShape("RECTANGLE");
	shape3.draw();
	
	
	//Obtem uma cor da fabrica
	AbstractFactory ColorFactory = FactoryProducer.getFactory("COLOR");
	
	Color color1 = ColorFactory.getColor("RED");
	color1.fill();
		
	Color color2 = ColorFactory.getColor("BLUE");
	color2.fill();
		
	Color color3 = ColorFactory.getColor("GREEN");
	color3.fill();
	
		}
}
