package defaultPackage;

public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish() {
		super(0);

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {

		this.name=n;		
	}

	@Override
	public void play() {
		System.out.println("Los peces juegan con otros peces");
		
	}

	@Override
	public void eat() {
		System.out.println("Los peces comen algas.");
		
	}
	
	public void walk() {
		super.walk();
		System.out.println("Los peces no tienen patas, asi que claramente no caminan, nadan");
		
	}

}
