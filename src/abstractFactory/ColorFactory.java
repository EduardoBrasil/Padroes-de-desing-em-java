package abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Shapes getShape(String shapetype) {
		return null;
	}

	@Override
	Color getColor(String Color) {
		if (Color == null) {
			return null;
		}
		
		if(Color.equalsIgnoreCase("RED")){
			return new Red();
		}
		else if(Color.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		else if(Color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		
		return null;
	}

}