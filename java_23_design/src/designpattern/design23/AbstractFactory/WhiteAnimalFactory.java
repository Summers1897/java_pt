package designpattern.design23.AbstractFactory;
public class WhiteAnimalFactory implements IAniminalFactory {
	public ICat createCat() {

		return new WhiteCat();
	}
	public IDog createDog() {

		return new WhiteDog();
	}
}