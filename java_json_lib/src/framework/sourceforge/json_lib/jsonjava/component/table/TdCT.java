package framework.sourceforge.json_lib.jsonjava.component.table;
import framework.sourceforge.json_lib.jsonjava.component.InputCT;
public class TdCT {
	private int type;
	private String id;
	private String name;
	private String rowspan;
	private String colspan;
	private String cssClass;
	private String style;
	private InputCT inputCT;
	private String strText;
	public String getStrText() {
		return strText;
	}
	public void setStrText(String strText) {
		this.strText = strText;
	}
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
	public String getRowspan() {
		return rowspan;
	}
	public void setRowspan(String rowspan) {
		this.rowspan = rowspan;
	}
	public String getColspan() {
		return colspan;
	}
	public void setColspan(String colspan) {
		this.colspan = colspan;
	}
	public String getCssClass() {
		return cssClass;
	}
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public InputCT getInputCT() {
		return inputCT;
	}
	public void setInputCT(InputCT inputCT) {
		this.inputCT = inputCT;
	}
}
