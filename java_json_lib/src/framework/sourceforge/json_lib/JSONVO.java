package framework.sourceforge.json_lib;
import java.util.Date;
import java.util.List;
import java.util.Map;
public class JSONVO {
	private String id;
	private Date date;
	private Long lon;
	private Map<String, JSONVO> map;
	private List<JSONVO> list;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getLon() {
		return lon;
	}
	public void setLon(Long lon) {
		this.lon = lon;
	}
	public Map<String, JSONVO> getMap() {
		return map;
	}
	public void setMap(Map<String, JSONVO> map) {
		this.map = map;
	}
	public List<JSONVO> getList() {
		return list;
	}
	public void setList(List<JSONVO> list) {
		this.list = list;
	}
}
