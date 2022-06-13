public class ColorBox extends Box {
	String color;
	
	public ColorBox(int length, int width, int heigth, String color) {
		super(length, width, heigth);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
}
