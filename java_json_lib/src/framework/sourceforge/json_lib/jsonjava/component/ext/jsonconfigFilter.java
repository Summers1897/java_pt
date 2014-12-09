package framework.sourceforge.json_lib.jsonjava.component.ext;
import net.sf.json.util.PropertyFilter;
public class jsonconfigFilter implements PropertyFilter {
	@Override
	public boolean apply(Object source, String name, Object value) {
		if (value == null) {
			// 空值不返回
			return true;
		}
		return false;
	}
}
