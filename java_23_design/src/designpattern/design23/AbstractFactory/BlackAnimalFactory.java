package designpattern.design23.AbstractFactory;
public class BlackAnimalFactory implements IAniminalFactory {
	public ICat createCat() {

		return new BlackCat();
	}
	public IDog createDog() {

		return new BlackDog();
	}
}