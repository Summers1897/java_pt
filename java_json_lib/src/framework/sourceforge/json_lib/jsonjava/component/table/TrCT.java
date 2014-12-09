package framework.sourceforge.json_lib.jsonjava.component.table;
import java.util.List;
public class TrCT {
	private String id;
	private String name;
	private List<TdCT> tds;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TdCT> getTds() {
		return tds;
	}
	public void setTds(List<TdCT> tds) {
		this.tds = tds;
	}
}
