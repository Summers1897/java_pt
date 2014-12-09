package designpattern.design23.structure.adapter;
public class Adapter implements Target {
	private final Adaptee adaptee;
	public Adapter(Adaptee adaptee2) {

		this.adaptee = adaptee2;
	}
	public void adapteeMethod() {

		adaptee.adapteeMethod();
	}
	public void adapterMethod() {

		System.out.println("adapterMethod");
	}
}
