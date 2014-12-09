package designpattern.design23.Builder;
public class ManBuilder implements PersonBuilder {
	Person person;
	public ManBuilder() {

		person = new Man();
	}
	@Override
	public void buildBody() {

		person.setBody("建造男人的身体");
	}
	@Override
	public void buildFoot() {

		person.setFoot("建造男人的脚");
	}
	@Override
	public void buildHead() {

		person.setHead("建造*人的头");
	}
	public Person buildPerson() {

		return person;
	}
}
