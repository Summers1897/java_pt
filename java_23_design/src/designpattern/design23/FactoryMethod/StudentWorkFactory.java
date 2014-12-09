package designpattern.design23.FactoryMethod;
public class StudentWorkFactory implements IWorkFactory {
	@Override
	public Work getWork() {

		return new StudentWork();
	}
}
