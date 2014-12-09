package framework.org.apache.commons.json;
import java.util.Date;
public class Birthday {
	private String birthday;
	private Date date;
	public Birthday(String birthday) {
		super();
		this.birthday = birthday;
	}
	// setter、getter
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
