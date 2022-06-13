public class Box {
	int length;
	int width;
	int heigth;
	public Box(int length, int width, int heigth) {
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getHeigth() {
		return heigth;
	}
	
	public int getVolume() {
		return length*width*heigth;
	}
}
