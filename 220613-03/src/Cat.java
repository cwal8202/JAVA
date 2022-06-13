public class Cat extends Animal {
	boolean play;

	public Cat(boolean sleep, boolean eat, boolean play) {
		super(sleep, eat);
		this.play = play;
	}

	public boolean isPlay() {
		return play;
	}	
}
