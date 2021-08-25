package defaultPackage;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Fish d = new Fish(); 
		 Cat c = new Cat("Fluffy"); 
		 Animal a = new Fish(); 
		 Animal e = new Spider(); 
		 Pet p = new Cat();

		// llamada a metodos//
		 d.eat();
		 d.play();
		 d.setName("Dory");
		 d.getName();
		 d.walk();
		 c.eat();
		 c.getName();
		 c.play();
		 c.walk();
		 // uso de polimorfismo// 
		d.play();
		p.play();
		c.play();
		// Uso de super
		 d.walk();
		 c.walk();
		 a.walk();
		 e.walk();

		
	}

}
