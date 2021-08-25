package defaultPackage;

public class Cat extends Animal implements Pet{

	private String name;

	public Cat(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}
	
	

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public Cat() { 
		this(""); 
		} 





	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String n) {
		this.name=n;
		
	}

	@Override
	public void play() {
		System.out.println("El gato "+name+" juega con una bola de hilo.");
		
	}

	@Override
	public void eat() {

		System.out.println("EL gat come sardinas");
	}

}
