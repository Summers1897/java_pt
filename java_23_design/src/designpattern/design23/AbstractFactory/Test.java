package designpattern.design23.AbstractFactory;
public class Test {
	public static void main(String[] args) {
		IAniminalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		blackCat.eat();
		IDog blackDog = blackAnimalFactory.createDog();
		blackDog.eat();
	}
}
