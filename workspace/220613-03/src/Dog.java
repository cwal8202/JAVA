public class Dog extends Animal {
	boolean bark;

	public Dog(boolean sleep, boolean eat, boolean bark) {
		super(sleep, eat);
		this.bark = bark;
	}

	public boolean isBark() {
		return bark;
	}	
}
