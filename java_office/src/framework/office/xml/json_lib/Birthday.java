package framework.office.xml.json_lib;
public class Birthday {
	private String birthday;
	public Birthday() {
	}
	@Override
	public String toString() {
		return this.birthday;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
