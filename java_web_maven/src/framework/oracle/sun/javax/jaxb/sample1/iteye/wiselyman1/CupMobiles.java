package framework.oracle.sun.javax.jaxb.sample1.iteye.wiselyman1;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class CupMobiles {
	private CupMobile cupMobile;
	private String msgResponseCode;
	public CupMobile getCupMobile() {
		return cupMobile;
	}
	public void setCupMobile(CupMobile cupMobile) {
		this.cupMobile = cupMobile;
	}
	public String getMsgResponseCode() {
		return msgResponseCode;
	}
	public void setMsgResponseCode(String msgResponseCode) {
		this.msgResponseCode = msgResponseCode;
	}
}
